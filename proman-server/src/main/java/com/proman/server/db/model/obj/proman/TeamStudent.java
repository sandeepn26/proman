package com.proman.server.db.model.obj.proman;

import com.proman.server.db.model.obj.proman.iface.ITeamStudent;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.github.wwadge.hbnpojogen.persistence.IPojoGenEntity;


/** 
 * Object mapping for hibernate-handled table: team_student.
 * @author autogenerated
 */

@Entity
@Table(name = "team_student", catalog = "proman")
public class TeamStudent implements Cloneable, Serializable, IPojoGenEntity, ITeamStudent {

	/** Serial Version UID. */
	private static final long serialVersionUID = -559039801L;

	

	/** Field mapping. */
	@Id 
	private TeamStudentPK id;

	/** Field mapping. */
	@Column( name = "updated_date", nullable = false  )
	private Date updatedDate;

	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public TeamStudent() {
		// Default constructor
	} 

	/** Constructor taking a given ID.
	 * @param id to set
	 */
	public TeamStudent(TeamStudentPK id) {
		this.id = id;
	}
	
	/** Constructor taking a given ID.
	 * @param id TeamStudentPK object;
	 * @param updatedDate Date object;
	 */
	public TeamStudent(TeamStudentPK id, Date updatedDate) {

		this.id = id;
		this.updatedDate = updatedDate;
	}
	
 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return TeamStudent.class;
	}
 

    /**
     * Return the value associated with the column: id.
	 * @return A TeamStudentPK object (this.id)
	 */
	public TeamStudentPK getId() {
		return this.id;
		
	}
	

  
    /**  
     * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	public void setId(final TeamStudentPK id) {
		this.id = id;
	}

    /**
     * Return the value associated with the column: updatedDate.
	 * @return A Date object (this.updatedDate)
	 */
	@Basic( optional = false )
	@Column( name = "updated_date", nullable = false  )
	public Date getUpdatedDate() {
		return this.updatedDate;
		
	}
	

  
    /**  
     * Set the value related to the column: updatedDate.
	 * @param updatedDate the updatedDate value you wish to set
	 */
	public void setUpdatedDate(final Date updatedDate) {
		this.updatedDate = updatedDate;
	}


   /**
    * Deep copy.
	* @return cloned object
	* @throws CloneNotSupportedException on error
    */
    @Override
    public TeamStudent clone() throws CloneNotSupportedException {
		
        final TeamStudent copy = (TeamStudent)super.clone();

		copy.setId(this.getId());
		copy.setUpdatedDate(this.getUpdatedDate());
		return copy;
	}
	


	/** Provides toString implementation.
	 * @see java.lang.Object#toString()
	 * @return String representation of this class.
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("id: " + this.getId() + ", ");
		sb.append("updatedDate: " + this.getUpdatedDate());
		return sb.toString();		
	}


	/** Equals implementation. 
	 * @see java.lang.Object#equals(java.lang.Object)
	 * @param aThat Object to compare with
	 * @return true/false
	 */
	@Override
	public boolean equals(final Object aThat) {
		if ( this == aThat ) {
			 return true;
		}

		if ((aThat == null) || ( !(aThat.getClass().equals(this.getClass())))) {
			 return false;
		}
	
		final TeamStudent that = (TeamStudent) aThat;
		return this.getId().equals(that.getId());
	}
	
	/** Calculate the hashcode.
	 * @see java.lang.Object#hashCode()
	 * @return a calculated number
	 */
	@Override
	public int hashCode() {
		return getId().hashCode();
	}
	

	
}