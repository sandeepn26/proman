package com.proman.server.db.model.dao.proman.impl;

import com.proman.server.db.model.obj.proman.Team;
import org.springframework.stereotype.Repository;

import com.github.wwadge.hbnpojogen.persistence.impl.GenericHibernateDaoImpl;
import com.proman.server.db.model.dao.proman.TeamDao;
 
 
/**
 * DAO for table: Team.
 * @author autogenerated
 */
@Repository
public class TeamDaoImpl extends GenericHibernateDaoImpl<Team, Integer> implements TeamDao {
	
	/** Constructor method. */
		public TeamDaoImpl() {
			super(Team.class);
		}
	}

