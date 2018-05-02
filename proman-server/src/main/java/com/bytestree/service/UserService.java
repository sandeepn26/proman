/**
 *
 */
package com.bytestree.service;

import com.bytestree.model.Users;

/**
 * @author Sandeep
 *
 */
public interface UserService {

    void saveLastLoginDate(String username);

    Users getUser(String username);

    void saveUser(Users user);
}
