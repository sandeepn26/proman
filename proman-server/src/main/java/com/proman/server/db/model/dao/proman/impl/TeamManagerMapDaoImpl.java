package com.proman.server.db.model.dao.proman.impl;

import com.proman.server.db.model.obj.proman.TeamManagerMap;
import org.springframework.stereotype.Repository;

import com.github.wwadge.hbnpojogen.persistence.impl.GenericHibernateDaoImpl;
import com.proman.server.db.model.dao.proman.TeamManagerMapDao;
import com.proman.server.db.model.obj.proman.TeamManagerMapPK;
 
/**
 * DAO for table: TeamManagerMap.
 * @author autogenerated
 */
@Repository
public class TeamManagerMapDaoImpl extends GenericHibernateDaoImpl<TeamManagerMap, TeamManagerMapPK> implements TeamManagerMapDao {
	
	/** Constructor method. */
		public TeamManagerMapDaoImpl() {
			super(TeamManagerMap.class);
		}
	}

