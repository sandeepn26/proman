package com.proman.server.db.model.obj.proman;

import com.proman.server.db.model.obj.proman.iface.ITeamManagerMapPK;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;


/** 
 * Object mapping for hibernate-handled table: team_manager_map.
 * @author autogenerated
 */

@Embeddable
public class TeamManagerMapPK implements Cloneable, Serializable,  ITeamManagerMapPK {

	/** Serial Version UID. */
	private static final long serialVersionUID = -559039802L;

	

	/** Field mapping. */
	@ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@JoinColumn(name = "manager_id", nullable = false , insertable = false, updatable = false )
	private TeamManager manager;

	/** Field mapping. */
	@ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@JoinColumn(name = "team_id", nullable = false , insertable = false, updatable = false )
	private Team team;

 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return TeamManagerMapPK.class;
	}
 

    /**
     * Return the value associated with the column: manager.
	 * @return A TeamManager object (this.manager)
	 */
	public TeamManager getManager() {
		return this.manager;
		
	}
	

  
    /**  
     * Set the value related to the column: manager.
	 * @param manager the manager value you wish to set
	 */
	public void setManager(final TeamManager manager) {
		this.manager = manager;
	}

    /**
     * Return the value associated with the column: team.
	 * @return A Team object (this.team)
	 */
	public Team getTeam() {
		return this.team;
		
	}
	

  
    /**  
     * Set the value related to the column: team.
	 * @param team the team value you wish to set
	 */
	public void setTeam(final Team team) {
		this.team = team;
	}


   /**
    * Deep copy.
	* @return cloned object
	* @throws CloneNotSupportedException on error
    */
    @Override
    public TeamManagerMapPK clone() throws CloneNotSupportedException {
		
        final TeamManagerMapPK copy = (TeamManagerMapPK)super.clone();

		return copy;
	}
	


	/** Provides toString implementation.
	 * @see java.lang.Object#toString()
	 * @return String representation of this class.
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		return sb.toString();		
	}


	/** Equals implementation. 
	 * @see java.lang.Object#equals(java.lang.Object)
	 * @param aThat Object to compare with
	 * @return true/false
	 */
	@Override
	public boolean equals(final Object aThat) {
		Object proxyThat = aThat;
		
		if ( this == aThat ) {
			 return true;
		}

		if (aThat == null)  {
			 return false;
		}
		
		final TeamManagerMapPK that; 
		try {
			that = (TeamManagerMapPK) proxyThat;
			if ( !(that.getClassType().equals(this.getClassType()))){
				return false;
			}
		} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		} catch (ClassCastException e) {
				return false;
		}
		
		
		boolean result = true;
		result = result && (((getManager() == null) && (that.getManager() == null)) || (getManager() != null && getManager().getId().equals(that.getManager().getId())));	
		result = result && (((getTeam() == null) && (that.getTeam() == null)) || (getTeam() != null && getTeam().getId().equals(that.getTeam().getId())));	
		return result;
	}
	
	/** Calculate the hashcode.
	 * @see java.lang.Object#hashCode()
	 * @return a calculated number
	 */
	@Override
	public int hashCode() {
	int hash = 0;
		hash = hash + getManager().hashCode();
		hash = hash + getTeam().hashCode();
	return hash;
	}
	

	
}
