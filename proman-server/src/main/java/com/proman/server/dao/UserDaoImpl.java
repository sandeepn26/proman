package com.proman.server.dao;

import org.springframework.stereotype.Repository;

import com.proman.server.model.User;

@Repository("userDao")
public class UserDaoImpl extends AbstractDao<User> {

}
