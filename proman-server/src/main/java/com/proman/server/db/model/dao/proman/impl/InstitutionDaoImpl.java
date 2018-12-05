

package com.proman.server.db.model.dao.proman.impl;

import com.proman.server.db.model.dao.proman.InstitutionDao;
import com.proman.server.db.model.obj.proman.Institution;

import org.springframework.stereotype.Repository;

import com.github.wwadge.hbnpojogen.persistence.impl.GenericHibernateDaoImpl;
 
/**
 * DAO for table: Institution.
 * @author autogenerated
 */
@Repository
public class InstitutionDaoImpl extends GenericHibernateDaoImpl<Institution, Integer> implements InstitutionDao {
	
	/** Constructor method. */
		public InstitutionDaoImpl() {
			super(Institution.class);
		}
	}
