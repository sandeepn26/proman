package com.proman.server.db.model.obj.proman;

import com.github.wwadge.hbnpojogen.persistence.IPojoGenEntity;
import com.proman.server.db.model.obj.proman.TeamManagerMap;
import com.proman.server.db.model.obj.proman.TeamStudent;
import com.proman.server.db.model.obj.proman.iface.ITeam;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.proxy.HibernateProxy;


/** 
 * Object mapping for hibernate-handled table: team.
 * @author autogenerated
 */

@Entity
@Table(name = "team", catalog = "proman")
public class Team implements Cloneable, Serializable, IPojoGenEntity, ITeam {

	/** Serial Version UID. */
	private static final long serialVersionUID = -559039806L;

	/** Use a WeakHashMap so entries will be garbage collected once all entities 
		referring to a saved hash are garbage collected themselves. */
	private static final Map<Serializable, Integer> SAVED_HASHES =
		Collections.synchronizedMap(new WeakHashMap<Serializable, Integer>());
	
	/** hashCode temporary storage. */
	private volatile Integer hashCode;
	

	/** Field mapping. */
	private Boolean active;
	/** Field mapping. */
	private Date createDate;
	/** Field mapping. */
	private Integer id = 0; // init for hibernate bug workaround
	/** Field mapping. */
	private Integer ownerId;
	/** Field mapping. */
	private Set<TeamManagerMap> teamManagerMaps = new HashSet<TeamManagerMap>();

	/** Field mapping. */
	private Set<TeamStudent> teamStudents = new HashSet<TeamStudent>();

	/** Field mapping. */
	private String teamCode;
	/** Field mapping. */
	private String teamDescription;
	/** Field mapping. */
	private String teamGradeMax;
	/** Field mapping. */
	private String teamGradeMin;
	/** Field mapping. */
	private String teamName;
	/** Field mapping. */
	private String teamType;
	/** Field mapping. */
	private Date updateDate;
	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public Team() {
		// Default constructor
	} 

	/** Constructor taking a given ID.
	 * @param id to set
	 */
	public Team(Integer id) {
		this.id = id;
	}
	
	/** Constructor taking a given ID.
	 * @param active Boolean object;
	 * @param createDate Date object;
	 * @param id Integer object;
	 * @param ownerId Integer object;
	 * @param teamDescription String object;
	 * @param teamName String object;
	 * @param updateDate Date object;
	 */
	public Team(Boolean active, Date createDate, Integer id, 					
			Integer ownerId, String teamDescription, String teamName, 					
			Date updateDate) {

		this.active = active;
		this.createDate = createDate;
		this.id = id;
		this.ownerId = ownerId;
		this.teamDescription = teamDescription;
		this.teamName = teamName;
		this.updateDate = updateDate;
	}
	
 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return Team.class;
	}
 

    /**
     * Return the value associated with the column: active.
	 * @return A Boolean object (this.active)
	 */
	@Basic( optional = false )
	@Column( nullable = false  )
	public Boolean isActive() {
		return this.active;
		
	}
	

  
    /**  
     * Set the value related to the column: active.
	 * @param active the active value you wish to set
	 */
	public void setActive(final Boolean active) {
		this.active = active;
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
     * Return the value associated with the column: id.
	 * @return A Integer object (this.id)
	 */
    @Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Basic( optional = false )
	@Column( name = "team_id", nullable = false  )
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
     * Return the value associated with the column: ownerId.
	 * @return A Integer object (this.ownerId)
	 */
	@Basic( optional = false )
	@Column( name = "owner_id", nullable = false  )
	public Integer getOwnerId() {
		return this.ownerId;
		
	}
	

  
    /**  
     * Set the value related to the column: ownerId.
	 * @param ownerId the ownerId value you wish to set
	 */
	public void setOwnerId(final Integer ownerId) {
		this.ownerId = ownerId;
	}

    /**
     * Return the value associated with the column: teamManagerMap.
	 * @return A Set&lt;TeamManagerMap&gt; object (this.teamManagerMap)
	 */
 	@OneToMany( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "id.team"  )
 	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@Column( name = "team_id", nullable = false  )
	public Set<TeamManagerMap> getTeamManagerMaps() {
		return this.teamManagerMaps;
		
	}
	
	/**
	 * Adds a bi-directional link of type TeamManagerMap to the teamManagerMaps set.
	 * @param teamManagerMap item to add
	 */
	public void addTeamManagerMap(TeamManagerMap teamManagerMap) {
		teamManagerMap.getId().setTeam(this);
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
     * Return the value associated with the column: teamStudent.
	 * @return A Set&lt;TeamStudent&gt; object (this.teamStudent)
	 */
 	@OneToMany( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "id.team"  )
 	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@Column( name = "team_id", nullable = false  )
	public Set<TeamStudent> getTeamStudents() {
		return this.teamStudents;
		
	}
	
	/**
	 * Adds a bi-directional link of type TeamStudent to the teamStudents set.
	 * @param teamStudent item to add
	 */
	public void addTeamStudent(TeamStudent teamStudent) {
		teamStudent.getId().setTeam(this);
		this.teamStudents.add(teamStudent);
	}

  
    /**  
     * Set the value related to the column: teamStudent.
	 * @param teamStudent the teamStudent value you wish to set
	 */
	public void setTeamStudents(final Set<TeamStudent> teamStudent) {
		this.teamStudents = teamStudent;
	}

    /**
     * Return the value associated with the column: teamCode.
	 * @return A String object (this.teamCode)
	 */
	@Basic( optional = true )
	@Column( name = "team_code", length = 20  )
	public String getTeamCode() {
		return this.teamCode;
		
	}
	

  
    /**  
     * Set the value related to the column: teamCode.
	 * @param teamCode the teamCode value you wish to set
	 */
	public void setTeamCode(final String teamCode) {
		this.teamCode = teamCode;
	}

    /**
     * Return the value associated with the column: teamDescription.
	 * @return A String object (this.teamDescription)
	 */
	@Basic( optional = false )
	@Column( name = "team_description", nullable = false, length = 50  )
	public String getTeamDescription() {
		return this.teamDescription;
		
	}
	

  
    /**  
     * Set the value related to the column: teamDescription.
	 * @param teamDescription the teamDescription value you wish to set
	 */
	public void setTeamDescription(final String teamDescription) {
		this.teamDescription = teamDescription;
	}

    /**
     * Return the value associated with the column: teamGradeMax.
	 * @return A String object (this.teamGradeMax)
	 */
	@Basic( optional = true )
	@Column( name = "team_grade_max", length = 10  )
	public String getTeamGradeMax() {
		return this.teamGradeMax;
		
	}
	

  
    /**  
     * Set the value related to the column: teamGradeMax.
	 * @param teamGradeMax the teamGradeMax value you wish to set
	 */
	public void setTeamGradeMax(final String teamGradeMax) {
		this.teamGradeMax = teamGradeMax;
	}

    /**
     * Return the value associated with the column: teamGradeMin.
	 * @return A String object (this.teamGradeMin)
	 */
	@Basic( optional = true )
	@Column( name = "team_grade_min", length = 10  )
	public String getTeamGradeMin() {
		return this.teamGradeMin;
		
	}
	

  
    /**  
     * Set the value related to the column: teamGradeMin.
	 * @param teamGradeMin the teamGradeMin value you wish to set
	 */
	public void setTeamGradeMin(final String teamGradeMin) {
		this.teamGradeMin = teamGradeMin;
	}

    /**
     * Return the value associated with the column: teamName.
	 * @return A String object (this.teamName)
	 */
	@Basic( optional = false )
	@Column( name = "team_name", nullable = false, length = 50  )
	public String getTeamName() {
		return this.teamName;
		
	}
	

  
    /**  
     * Set the value related to the column: teamName.
	 * @param teamName the teamName value you wish to set
	 */
	public void setTeamName(final String teamName) {
		this.teamName = teamName;
	}

    /**
     * Return the value associated with the column: teamType.
	 * @return A String object (this.teamType)
	 */
	@Basic( optional = true )
	@Column( name = "team_type", length = 10  )
	public String getTeamType() {
		return this.teamType;
		
	}
	

  
    /**  
     * Set the value related to the column: teamType.
	 * @param teamType the teamType value you wish to set
	 */
	public void setTeamType(final String teamType) {
		this.teamType = teamType;
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
    public Team clone() throws CloneNotSupportedException {
		
        final Team copy = (Team)super.clone();

		copy.setActive(this.isActive());
		copy.setCreateDate(this.getCreateDate());
		copy.setId(this.getId());
		copy.setOwnerId(this.getOwnerId());
		if (this.getTeamManagerMaps() != null) {
			copy.getTeamManagerMaps().addAll(this.getTeamManagerMaps());
		}
		if (this.getTeamStudents() != null) {
			copy.getTeamStudents().addAll(this.getTeamStudents());
		}
		copy.setTeamCode(this.getTeamCode());
		copy.setTeamDescription(this.getTeamDescription());
		copy.setTeamGradeMax(this.getTeamGradeMax());
		copy.setTeamGradeMin(this.getTeamGradeMin());
		copy.setTeamName(this.getTeamName());
		copy.setTeamType(this.getTeamType());
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
		
		sb.append("active: " + this.isActive() + ", ");
		sb.append("createDate: " + this.getCreateDate() + ", ");
		sb.append("id: " + this.getId() + ", ");
		sb.append("ownerId: " + this.getOwnerId() + ", ");
		sb.append("teamCode: " + this.getTeamCode() + ", ");
		sb.append("teamDescription: " + this.getTeamDescription() + ", ");
		sb.append("teamGradeMax: " + this.getTeamGradeMax() + ", ");
		sb.append("teamGradeMin: " + this.getTeamGradeMin() + ", ");
		sb.append("teamName: " + this.getTeamName() + ", ");
		sb.append("teamType: " + this.getTeamType() + ", ");
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
		
		final Team that; 
		try {
			that = (Team) proxyThat;
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
		result = result && (((isActive() == null) && (that.isActive() == null)) || (isActive() != null && isActive().equals(that.isActive())));
		result = result && (((getCreateDate() == null) && (that.getCreateDate() == null)) || (getCreateDate() != null && getCreateDate().equals(that.getCreateDate())));
		result = result && (((getOwnerId() == null) && (that.getOwnerId() == null)) || (getOwnerId() != null && getOwnerId().equals(that.getOwnerId())));
		result = result && (((getTeamCode() == null) && (that.getTeamCode() == null)) || (getTeamCode() != null && getTeamCode().equals(that.getTeamCode())));
		result = result && (((getTeamDescription() == null) && (that.getTeamDescription() == null)) || (getTeamDescription() != null && getTeamDescription().equals(that.getTeamDescription())));
		result = result && (((getTeamGradeMax() == null) && (that.getTeamGradeMax() == null)) || (getTeamGradeMax() != null && getTeamGradeMax().equals(that.getTeamGradeMax())));
		result = result && (((getTeamGradeMin() == null) && (that.getTeamGradeMin() == null)) || (getTeamGradeMin() != null && getTeamGradeMin().equals(that.getTeamGradeMin())));
		result = result && (((getTeamName() == null) && (that.getTeamName() == null)) || (getTeamName() != null && getTeamName().equals(that.getTeamName())));
		result = result && (((getTeamType() == null) && (that.getTeamType() == null)) || (getTeamType() != null && getTeamType().equals(that.getTeamType())));
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
