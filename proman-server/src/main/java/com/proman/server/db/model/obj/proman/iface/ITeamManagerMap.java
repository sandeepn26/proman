package com.proman.server.db.model.obj.proman.iface;

import java.util.Date;

import com.proman.server.db.model.obj.proman.TeamManagerMapPK;

/**
 * Object interface mapping for hibernate-handled table: team_manager_map.
 * 
 * @author autogenerated
 */

public interface ITeamManagerMap {

	/**
	 * Return the value associated with the column: id.
	 * 
	 * @return A TeamManagerMapPK object (this.id)
	 */
	TeamManagerMapPK getId();

	/**
	 * Set the value related to the column: id.
	 * 
	 * @param id
	 *            the id value you wish to set
	 */
	void setId(final TeamManagerMapPK id);

	/**
	 * Return the value associated with the column: updatedDate.
	 * 
	 * @return A Date object (this.updatedDate)
	 */
	Date getUpdatedDate();

	/**
	 * Set the value related to the column: updatedDate.
	 * 
	 * @param updatedDate
	 *            the updatedDate value you wish to set
	 */
	void setUpdatedDate(final Date updatedDate);

	// end of interface
}