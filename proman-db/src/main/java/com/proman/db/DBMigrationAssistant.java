package com.proman.db;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import org.flywaydb.core.Flyway;

public class DBMigrationAssistant {

	public static void init() {
		MysqlDataSource ds = new MysqlDataSource();
		ds.setAllowMultiQueries(true);
		ds.setURL("jdbc:mysql://localhost:3306/proman");
		ds.setUser("proman");
		ds.setPassword("proman");
		Flyway flyway = new Flyway();
		flyway.setDataSource(ds);
		flyway.migrate();
	}

	public static void main(String[] args) {
		init();
	}

}
