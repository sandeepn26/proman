package com.proman.server.delegate;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Iterables;
import com.proman.server.dto.UserDTO;
import com.proman.server.model.User;
import com.proman.server.service.UserService;

@Service("userDelegate")
public class UserDelegate {
	
	@Autowired
    private UserService userService;
	
	public UserDTO getUser(String username) {
		List<User> users = userService.getUser(username);
		User user = Iterables.getOnlyElement(users);
		UserDTO userDTO = new UserDTO();
		BeanUtils.copyProperties(user, userDTO);
		return userDTO;
	}
	
	public List<UserDTO> getUsers() {
		List<User> users = userService.fetchAll();
		List<UserDTO> userDTOs = new ArrayList<>();
		users.forEach(u -> userDTOs.add(u.getUserDTO()));
		return userDTOs;
	}
	

}
