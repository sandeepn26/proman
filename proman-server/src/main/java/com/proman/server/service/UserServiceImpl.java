package com.proman.server.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.parsing.EmptyReaderEventListener;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proman.server.dao.AbstractDao;
import com.proman.server.model.Roles;
import com.proman.server.model.User;

/**
 * @author sandeep
 *
 */

@Service("userService")
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    AbstractDao<User> userDao;

    /**
    	 * Method to return UserDetails after successful login
    	 *
    	 * @param username
    	 * @return UserDetails object
    	 */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.findById(username);

        if (user == null) {
            throw new UsernameNotFoundException("Invalid username or password");
        }

        return new org.springframework.security.core.userdetails.User(
            username, user.getPassword(), user.getEnabled(),
            true, true, !user.getLocked(), null
        );

    }

    /*private List<GrantedAuthority> getAuthorities(User user) {
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

        for (Roles role : user.getRoleses()) {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }

        return authorities;
    }
*/
    @Transactional(readOnly = false)
    @Override
    public void saveLastLoginDate(String username) {
        User user = userDao.findById(username);
        user.setLastLoginDate(new Date());
        userDao.save(user);

    }

    @Override
    public List<User> getUser(String username) {
        return userDao.findByCriteria("username", username);
    }

    @Override
    public User getUser(Integer id) {
        return userDao.findById(id);
    }

    @Transactional(readOnly = false)
    @Override
    public void saveUser(User user) {
        userDao.save(user);

    }

	@Override
	public List<User> fetchAll() {
		return userDao.findAll();
	}

}
