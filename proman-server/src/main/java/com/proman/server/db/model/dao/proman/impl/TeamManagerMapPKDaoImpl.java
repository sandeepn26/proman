package com.proman.server.db.model.dao.proman.impl;

import com.proman.server.db.model.obj.proman.TeamManagerMapPK;
import org.springframework.stereotype.Repository;

import com.github.wwadge.hbnpojogen.persistence.impl.GenericHibernateDaoImpl;
import com.proman.server.db.model.dao.proman.TeamManagerMapPKDao;
import java.io.Serializable;
 
/**
 * DAO for table: TeamManagerMapPK.
 * @author autogenerated
 */
@Repository
public class TeamManagerMapPKDaoImpl extends GenericHibernateDaoImpl<TeamManagerMapPK, Serializable> implements TeamManagerMapPKDao {
	
	/** Constructor method. */
		public TeamManagerMapPKDaoImpl() {
			super(TeamManagerMapPK.class);
		}
	}

