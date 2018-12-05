package com.proman.server.db.model.dao.proman.impl;

import com.proman.server.db.model.obj.proman.SchemaVersion;
import org.springframework.stereotype.Repository;

import com.github.wwadge.hbnpojogen.persistence.impl.GenericHibernateDaoImpl;
import com.proman.server.db.model.dao.proman.SchemaVersionDao;
 
 
/**
 * DAO for table: SchemaVersion.
 * @author autogenerated
 */
@Repository
public class SchemaVersionDaoImpl extends GenericHibernateDaoImpl<SchemaVersion, Integer> implements SchemaVersionDao {
	
	/** Constructor method. */
		public SchemaVersionDaoImpl() {
			super(SchemaVersion.class);
		}
	}
