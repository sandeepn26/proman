package com.proman.server.db.model.obj.proman;

import com.github.wwadge.hbnpojogen.persistence.IPojoGenEntity;
import com.proman.server.db.model.obj.proman.TeamManagerMap;
import com.proman.server.db.model.obj.proman.iface.ITeamManager;
import java.io.Serializable;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.proxy.HibernateProxy;


/** 
 * Object mapping for hibernate-handled table: team_manager.
 * @author autogenerated
 */

@Entity
@Table(name = "team_manager", catalog = "proman")
public class TeamManager implements Cloneable, Serializable, IPojoGenEntity, ITeamManager {

	/** Serial Version UID. */
	private static final long serialVersionUID = -559039805L;

	/** Use a WeakHashMap so entries will be garbage collected once all entities 
		referring to a saved hash are garbage collected themselves. */
	private static final Map<Serializable, Integer> SAVED_HASHES =
		Collections.synchronizedMap(new WeakHashMap<Serializable, Integer>());
	
	/** hashCode temporary storage. */
	private volatile Integer hashCode;
	

	/** Field mapping. */
	private Boolean assuranceWaiverSigned;
	/** Field mapping. */
	private Date createDate;
	/** Field mapping. */
	private Boolean fingerPrintingDone;
	/** Field mapping. */
	private Integer id = 0; // init for hibernate bug workaround
	/** Field mapping. */
	private Users managerUser;
	/** Field mapping. */
	private Set<TeamManagerMap> teamManagerMaps = new HashSet<TeamManagerMap>();

	/** Field mapping. */
	private Date updateDate;
	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public TeamManager() {
		// Default constructor
	} 

	/** Constructor taking a given ID.
	 * @param id to set
	 */
	public TeamManager(Integer id) {
		this.id = id;
	}
	
	/** Constructor taking a given ID.
	 * @param assuranceWaiverSigned Boolean object;
	 * @param createDate Date object;
	 * @param fingerPrintingDone Boolean object;
	 * @param id Integer object;
	 * @param managerUser Users object;
	 * @param updateDate Date object;
	 */
	public TeamManager(Boolean assuranceWaiverSigned, Date createDate, Boolean fingerPrintingDone, 					
			Integer id, Users managerUser, Date updateDate) {

		this.assuranceWaiverSigned = assuranceWaiverSigned;
		this.createDate = createDate;
		this.fingerPrintingDone = fingerPrintingDone;
		this.id = id;
		this.managerUser = managerUser;
		this.updateDate = updateDate;
	}
	
 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return TeamManager.class;
	}
 

    /**
     * Return the value associated with the column: assuranceWaiverSigned.
	 * @return A Boolean object (this.assuranceWaiverSigned)
	 */
	@Basic( optional = false )
	@Column( name = "assurance_waiver_signed", nullable = false  )
	public Boolean isAssuranceWaiverSigned() {
		return this.assuranceWaiverSigned;
		
	}
	

  
    /**  
     * Set the value related to the column: assuranceWaiverSigned.
	 * @param assuranceWaiverSigned the assuranceWaiverSigned value you wish to set
	 */
	public void setAssuranceWaiverSigned(final Boolean assuranceWaiverSigned) {
		this.assuranceWaiverSigned = assuranceWaiverSigned;
	}

    /**
     * Return the value associated with the column: createDate.
	 * @return A Date object (this.createDate)
	 */
	@Basic( optional = false )
	@Column( name = "create_date", nullable = false  )
	public Date getCreateDate() {
		return this.createDate;
		
	}
	

  
    /**  
     * Set the value related to the column: createDate.
	 * @param createDate the createDate value you wish to set
	 */
	public void setCreateDate(final Date createDate) {
		this.createDate = createDate;
	}

    /**
     * Return the value associated with the column: fingerPrintingDone.
	 * @return A Boolean object (this.fingerPrintingDone)
	 */
	@Basic( optional = false )
	@Column( name = "finger_printing_done", nullable = false  )
	public Boolean isFingerPrintingDone() {
		return this.fingerPrintingDone;
		
	}
	

  
    /**  
     * Set the value related to the column: fingerPrintingDone.
	 * @param fingerPrintingDone the fingerPrintingDone value you wish to set
	 */
	public void setFingerPrintingDone(final Boolean fingerPrintingDone) {
		this.fingerPrintingDone = fingerPrintingDone;
	}

    /**
     * Return the value associated with the column: id.
	 * @return A Integer object (this.id)
	 */
    @Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Basic( optional = false )
	@Column( name = "manager_id", nullable = false  )
	public Integer getId() {
		return this.id;
		
	}
	

  
    /**  
     * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	public void setId(final Integer id) {
		// If we've just been persisted and hashCode has been
		// returned then make sure other entities with this
		// ID return the already returned hash code
		if ( (this.id == null || this.id == 0) &&
				(id != null) &&
				(this.hashCode != null) ) {
		SAVED_HASHES.put( id, this.hashCode );
		}
		this.id = id;
	}

    /**
     * Return the value associated with the column: managerUser.
	 * @return A Users object (this.managerUser)
	 */
	@ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@JoinColumn(name = "manager_user_id", nullable = false )
	public Users getManagerUser() {
		return this.managerUser;
		
	}
	

  
    /**  
     * Set the value related to the column: managerUser.
	 * @param managerUser the managerUser value you wish to set
	 */
	public void setManagerUser(final Users managerUser) {
		this.managerUser = managerUser;
	}

    /**
     * Return the value associated with the column: teamManagerMap.
	 * @return A Set&lt;TeamManagerMap&gt; object (this.teamManagerMap)
	 */
 	@OneToMany( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "id.manager"  )
 	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@Column( name = "manager_id", nullable = false  )
	public Set<TeamManagerMap> getTeamManagerMaps() {
		return this.teamManagerMaps;
		
	}
	
	/**
	 * Adds a bi-directional link of type TeamManagerMap to the teamManagerMaps set.
	 * @param teamManagerMap item to add
	 */
	public void addTeamManagerMap(TeamManagerMap teamManagerMap) {
		teamManagerMap.getId().setManager(this);
		this.teamManagerMaps.add(teamManagerMap);
	}

  
    /**  
     * Set the value related to the column: teamManagerMap.
	 * @param teamManagerMap the teamManagerMap value you wish to set
	 */
	public void setTeamManagerMaps(final Set<TeamManagerMap> teamManagerMap) {
		this.teamManagerMaps = teamManagerMap;
	}

    /**
     * Return the value associated with the column: updateDate.
	 * @return A Date object (this.updateDate)
	 */
	@Basic( optional = false )
	@Column( name = "update_date", nullable = false  )
	public Date getUpdateDate() {
		return this.updateDate;
		
	}
	

  
    /**  
     * Set the value related to the column: updateDate.
	 * @param updateDate the updateDate value you wish to set
	 */
	public void setUpdateDate(final Date updateDate) {
		this.updateDate = updateDate;
	}


   /**
    * Deep copy.
	* @return cloned object
	* @throws CloneNotSupportedException on error
    */
    @Override
    public TeamManager clone() throws CloneNotSupportedException {
		
        final TeamManager copy = (TeamManager)super.clone();

		copy.setAssuranceWaiverSigned(this.isAssuranceWaiverSigned());
		copy.setCreateDate(this.getCreateDate());
		copy.setFingerPrintingDone(this.isFingerPrintingDone());
		copy.setId(this.getId());
		copy.setManagerUser(this.getManagerUser());
		if (this.getTeamManagerMaps() != null) {
			copy.getTeamManagerMaps().addAll(this.getTeamManagerMaps());
		}
		copy.setUpdateDate(this.getUpdateDate());
		return copy;
	}
	


	/** Provides toString implementation.
	 * @see java.lang.Object#toString()
	 * @return String representation of this class.
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("assuranceWaiverSigned: " + this.isAssuranceWaiverSigned() + ", ");
		sb.append("createDate: " + this.getCreateDate() + ", ");
		sb.append("fingerPrintingDone: " + this.isFingerPrintingDone() + ", ");
		sb.append("id: " + this.getId() + ", ");
		sb.append("updateDate: " + this.getUpdateDate());
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

		
		if (aThat instanceof HibernateProxy) {
 			// narrow down the proxy to the class we are dealing with.
 			try {
				proxyThat = ((HibernateProxy) aThat).getHibernateLazyInitializer().getImplementation(); 
			} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		   	}
		}
		if (aThat == null)  {
			 return false;
		}
		
		final TeamManager that; 
		try {
			that = (TeamManager) proxyThat;
			if ( !(that.getClassType().equals(this.getClassType()))){
				return false;
			}
		} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		} catch (ClassCastException e) {
				return false;
		}
		
		
		boolean result = true;
		result = result && (((this.getId() == null) && ( that.getId() == null)) || (this.getId() != null  && this.getId().equals(that.getId())));
		result = result && (((isAssuranceWaiverSigned() == null) && (that.isAssuranceWaiverSigned() == null)) || (isAssuranceWaiverSigned() != null && isAssuranceWaiverSigned().equals(that.isAssuranceWaiverSigned())));
		result = result && (((getCreateDate() == null) && (that.getCreateDate() == null)) || (getCreateDate() != null && getCreateDate().equals(that.getCreateDate())));
		result = result && (((isFingerPrintingDone() == null) && (that.isFingerPrintingDone() == null)) || (isFingerPrintingDone() != null && isFingerPrintingDone().equals(that.isFingerPrintingDone())));
		result = result && (((getManagerUser() == null) && (that.getManagerUser() == null)) || (getManagerUser() != null && getManagerUser().getId().equals(that.getManagerUser().getId())));	
		result = result && (((getUpdateDate() == null) && (that.getUpdateDate() == null)) || (getUpdateDate() != null && getUpdateDate().equals(that.getUpdateDate())));
		return result;
	}
	
	/** Calculate the hashcode.
	 * @see java.lang.Object#hashCode()
	 * @return a calculated number
	 */
	@Override
	public int hashCode() {
		if ( this.hashCode == null ) {
			synchronized ( this ) {
				if ( this.hashCode == null ) {
					Integer newHashCode = null;

					if ( getId() != null ) {
					newHashCode = SAVED_HASHES.get( getId() );
					}
					
					if ( newHashCode == null ) {
						if ( getId() != null && getId() != 0) {
							newHashCode = getId();
						} else {

						}
					}
					
					this.hashCode = newHashCode;
				}
			}
		}
	return this.hashCode;
	}
	

	
}