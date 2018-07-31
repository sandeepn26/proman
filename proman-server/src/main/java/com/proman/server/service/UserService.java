/**
 *
 */
package com.proman.server.service;

import java.util.List;

import com.proman.server.model.User;

/**
 * @author Sandeep
 *
 */
public interface UserService {

    void saveLastLoginDate(String username);

    List<User> getUser(String username);

    void saveUser(User user);

    User getUser(Integer id);
    
    List<User> fetchAll();
}
