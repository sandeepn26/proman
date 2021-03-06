package com.proman.server.db.model.obj.proman.iface;

import com.proman.server.db.model.obj.proman.Team;
import com.proman.server.db.model.obj.proman.TeamManager;

/**
 * Object interface mapping for hibernate-handled table: team_manager_map.
 * 
 * @author autogenerated
 */

public interface ITeamManagerMapPK {

	/**
	 * Return the value associated with the column: manager.
	 * 
	 * @return A TeamManager object (this.manager)
	 */
	TeamManager getManager();

	/**
	 * Set the value related to the column: manager.
	 * 
	 * @param manager
	 *            the manager value you wish to set
	 */
	void setManager(final TeamManager manager);

	/**
	 * Return the value associated with the column: team.
	 * 
	 * @return A Team object (this.team)
	 */
	Team getTeam();

	/**
	 * Set the value related to the column: team.
	 * 
	 * @param team
	 *            the team value you wish to set
	 */
	void setTeam(final Team team);

	// end of interface
}