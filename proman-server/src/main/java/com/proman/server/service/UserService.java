/**
 *
 */
package com.proman.server.service;

import com.proman.server.model.User;

/**
 * @author Sandeep
 *
 */
public interface UserService {

    void saveLastLoginDate(String username);

    User getUser(String username);

    void saveUser(User user);

    User getUser(Integer id);
}
