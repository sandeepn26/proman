package com.proman.server.db.model.dao.proman.impl;

import org.springframework.stereotype.Repository;

import com.github.wwadge.hbnpojogen.persistence.impl.GenericHibernateDaoImpl;
import com.proman.server.db.model.dao.proman.UsersDao;
import com.proman.server.db.model.obj.proman.Users;
 
 
/**
 * DAO for table: Users.
 * @author autogenerated
 */
@Repository
public class UsersDaoImpl extends GenericHibernateDaoImpl<Users, Integer> implements UsersDao {
	
	/** Constructor method. */
		public UsersDaoImpl() {
			super(Users.class);
		}
	}

