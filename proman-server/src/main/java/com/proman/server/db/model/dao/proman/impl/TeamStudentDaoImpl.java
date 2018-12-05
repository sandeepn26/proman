package com.proman.server.db.model.dao.proman.impl;

import com.proman.server.db.model.obj.proman.TeamStudent;
import org.springframework.stereotype.Repository;

import com.github.wwadge.hbnpojogen.persistence.impl.GenericHibernateDaoImpl;
import com.proman.server.db.model.dao.proman.TeamStudentDao;
import com.proman.server.db.model.obj.proman.TeamStudentPK;
 
/**
 * DAO for table: TeamStudent.
 * @author autogenerated
 */
@Repository
public class TeamStudentDaoImpl extends GenericHibernateDaoImpl<TeamStudent, TeamStudentPK> implements TeamStudentDao {
	
	/** Constructor method. */
		public TeamStudentDaoImpl() {
			super(TeamStudent.class);
		}
	}

