/**
 *
 */
package com.bytestree.service;

import com.bytestree.model.User;

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
