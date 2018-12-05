package com.proman.server.db.model.obj.proman;

import com.github.wwadge.hbnpojogen.persistence.IPojoGenEntity;
import com.proman.server.db.model.obj.proman.iface.IUserDetails;
import java.io.Serializable;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
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
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.proxy.HibernateProxy;


/** 
 * Object mapping for hibernate-handled table: user_details.
 * @author autogenerated
 */

@Entity
@Table(name = "user_details", catalog = "proman")
public class UserDetails implements Cloneable, Serializable, IPojoGenEntity, IUserDetails {

	/** Serial Version UID. */
	private static final long serialVersionUID = -559039797L;

	/** Use a WeakHashMap so entries will be garbage collected once all entities 
		referring to a saved hash are garbage collected themselves. */
	private static final Map<Serializable, Integer> SAVED_HASHES =
		Collections.synchronizedMap(new WeakHashMap<Serializable, Integer>());
	
	/** hashCode temporary storage. */
	private volatile Integer hashCode;
	

	/** Field mapping. */
	private String address;
	/** Field mapping. */
	private String city;
	/** Field mapping. */
	private String county;
	/** Field mapping. */
	private Date createDate;
	/** Field mapping. */
	private Date dateOfBirth;
	/** Field mapping. */
	private String firstName;
	/** Field mapping. */
	private Integer id = 0; // init for hibernate bug workaround
	/** Field mapping. */
	private String lastName;
	/** Field mapping. */
	private String phone;
	/** Field mapping. */
	private String postCode;
	/** Field mapping. */
	private String secondaryEmail;
	/** Field mapping. */
	private String secondaryPhone;
	/** Field mapping. */
	private String state;
	/** Field mapping. */
	private Date updateDate;
	/** Field mapping. */
	private Users user;
	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public UserDetails() {
		// Default constructor
	} 

	/** Constructor taking a given ID.
	 * @param id to set
	 */
	public UserDetails(Integer id) {
		this.id = id;
	}
	
	/** Constructor taking a given ID.
	 * @param address String object;
	 * @param city String object;
	 * @param county String object;
	 * @param createDate Date object;
	 * @param dateOfBirth Date object;
	 * @param firstName String object;
	 * @param id Integer object;
	 * @param lastName String object;
	 * @param phone String object;
	 * @param postCode String object;
	 * @param secondaryEmail String object;
	 * @param secondaryPhone String object;
	 * @param state String object;
	 * @param updateDate Date object;
	 * @param user Users object;
	 */
	public UserDetails(String address, String city, String county, 					
			Date createDate, Date dateOfBirth, String firstName, 					
			Integer id, String lastName, String phone, 					
			String postCode, String secondaryEmail, String secondaryPhone, 					
			String state, Date updateDate, Users user) {

		this.address = address;
		this.city = city;
		this.county = county;
		this.createDate = createDate;
		this.dateOfBirth = dateOfBirth;
		this.firstName = firstName;
		this.id = id;
		this.lastName = lastName;
		this.phone = phone;
		this.postCode = postCode;
		this.secondaryEmail = secondaryEmail;
		this.secondaryPhone = secondaryPhone;
		this.state = state;
		this.updateDate = updateDate;
		this.user = user;
	}
	
 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return UserDetails.class;
	}
 

    /**
     * Return the value associated with the column: address.
	 * @return A String object (this.address)
	 */
	@Basic( optional = false )
	@Column( nullable = false, length = 80  )
	public String getAddress() {
		return this.address;
		
	}
	

  
    /**  
     * Set the value related to the column: address.
	 * @param address the address value you wish to set
	 */
	public void setAddress(final String address) {
		this.address = address;
	}

    /**
     * Return the value associated with the column: city.
	 * @return A String object (this.city)
	 */
	@Basic( optional = false )
	@Column( nullable = false, length = 30  )
	public String getCity() {
		return this.city;
		
	}
	

  
    /**  
     * Set the value related to the column: city.
	 * @param city the city value you wish to set
	 */
	public void setCity(final String city) {
		this.city = city;
	}

    /**
     * Return the value associated with the column: county.
	 * @return A String object (this.county)
	 */
	@Basic( optional = false )
	@Column( nullable = false, length = 7  )
	public String getCounty() {
		return this.county;
		
	}
	

  
    /**  
     * Set the value related to the column: county.
	 * @param county the county value you wish to set
	 */
	public void setCounty(final String county) {
		this.county = county;
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
     * Return the value associated with the column: dateOfBirth.
	 * @return A Date object (this.dateOfBirth)
	 */
	@Basic( optional = false )
	@Column( name = "date_of_birth", nullable = false  )
	public Date getDateOfBirth() {
		return this.dateOfBirth;
		
	}
	

  
    /**  
     * Set the value related to the column: dateOfBirth.
	 * @param dateOfBirth the dateOfBirth value you wish to set
	 */
	public void setDateOfBirth(final Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

    /**
     * Return the value associated with the column: firstName.
	 * @return A String object (this.firstName)
	 */
	@Basic( optional = false )
	@Column( name = "first_name", nullable = false, length = 25  )
	public String getFirstName() {
		return this.firstName;
		
	}
	

  
    /**  
     * Set the value related to the column: firstName.
	 * @param firstName the firstName value you wish to set
	 */
	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

    /**
     * Return the value associated with the column: id.
	 * @return A Integer object (this.id)
	 */
    @Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Basic( optional = false )
	@Column( name = "user_detail_id", nullable = false  )
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
     * Return the value associated with the column: lastName.
	 * @return A String object (this.lastName)
	 */
	@Basic( optional = false )
	@Column( name = "last_name", nullable = false, length = 25  )
	public String getLastName() {
		return this.lastName;
		
	}
	

  
    /**  
     * Set the value related to the column: lastName.
	 * @param lastName the lastName value you wish to set
	 */
	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

    /**
     * Return the value associated with the column: phone.
	 * @return A String object (this.phone)
	 */
	@Basic( optional = false )
	@Column( nullable = false, length = 15  )
	public String getPhone() {
		return this.phone;
		
	}
	

  
    /**  
     * Set the value related to the column: phone.
	 * @param phone the phone value you wish to set
	 */
	public void setPhone(final String phone) {
		this.phone = phone;
	}

    /**
     * Return the value associated with the column: postCode.
	 * @return A String object (this.postCode)
	 */
	@Basic( optional = false )
	@Column( name = "post_code", nullable = false, length = 7  )
	public String getPostCode() {
		return this.postCode;
		
	}
	

  
    /**  
     * Set the value related to the column: postCode.
	 * @param postCode the postCode value you wish to set
	 */
	public void setPostCode(final String postCode) {
		this.postCode = postCode;
	}

    /**
     * Return the value associated with the column: secondaryEmail.
	 * @return A String object (this.secondaryEmail)
	 */
	@Basic( optional = false )
	@Column( name = "secondary_email", nullable = false, length = 80  )
	public String getSecondaryEmail() {
		return this.secondaryEmail;
		
	}
	

  
    /**  
     * Set the value related to the column: secondaryEmail.
	 * @param secondaryEmail the secondaryEmail value you wish to set
	 */
	public void setSecondaryEmail(final String secondaryEmail) {
		this.secondaryEmail = secondaryEmail;
	}

    /**
     * Return the value associated with the column: secondaryPhone.
	 * @return A String object (this.secondaryPhone)
	 */
	@Basic( optional = false )
	@Column( name = "secondary_phone", nullable = false, length = 15  )
	public String getSecondaryPhone() {
		return this.secondaryPhone;
		
	}
	

  
    /**  
     * Set the value related to the column: secondaryPhone.
	 * @param secondaryPhone the secondaryPhone value you wish to set
	 */
	public void setSecondaryPhone(final String secondaryPhone) {
		this.secondaryPhone = secondaryPhone;
	}

    /**
     * Return the value associated with the column: state.
	 * @return A String object (this.state)
	 */
	@Basic( optional = false )
	@Column( nullable = false, length = 2  )
	public String getState() {
		return this.state;
		
	}
	

  
    /**  
     * Set the value related to the column: state.
	 * @param state the state value you wish to set
	 */
	public void setState(final String state) {
		this.state = state;
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
     * Return the value associated with the column: user.
	 * @return A Users object (this.user)
	 */
	@ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@JoinColumn(name = "user_id", nullable = false )
	public Users getUser() {
		return this.user;
		
	}
	

  
    /**  
     * Set the value related to the column: user.
	 * @param user the user value you wish to set
	 */
	public void setUser(final Users user) {
		this.user = user;
	}


   /**
    * Deep copy.
	* @return cloned object
	* @throws CloneNotSupportedException on error
    */
    @Override
    public UserDetails clone() throws CloneNotSupportedException {
		
        final UserDetails copy = (UserDetails)super.clone();

		copy.setAddress(this.getAddress());
		copy.setCity(this.getCity());
		copy.setCounty(this.getCounty());
		copy.setCreateDate(this.getCreateDate());
		copy.setDateOfBirth(this.getDateOfBirth());
		copy.setFirstName(this.getFirstName());
		copy.setId(this.getId());
		copy.setLastName(this.getLastName());
		copy.setPhone(this.getPhone());
		copy.setPostCode(this.getPostCode());
		copy.setSecondaryEmail(this.getSecondaryEmail());
		copy.setSecondaryPhone(this.getSecondaryPhone());
		copy.setState(this.getState());
		copy.setUpdateDate(this.getUpdateDate());
		copy.setUser(this.getUser());
		return copy;
	}
	


	/** Provides toString implementation.
	 * @see java.lang.Object#toString()
	 * @return String representation of this class.
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("address: " + this.getAddress() + ", ");
		sb.append("city: " + this.getCity() + ", ");
		sb.append("county: " + this.getCounty() + ", ");
		sb.append("createDate: " + this.getCreateDate() + ", ");
		sb.append("dateOfBirth: " + this.getDateOfBirth() + ", ");
		sb.append("firstName: " + this.getFirstName() + ", ");
		sb.append("id: " + this.getId() + ", ");
		sb.append("lastName: " + this.getLastName() + ", ");
		sb.append("phone: " + this.getPhone() + ", ");
		sb.append("postCode: " + this.getPostCode() + ", ");
		sb.append("secondaryEmail: " + this.getSecondaryEmail() + ", ");
		sb.append("secondaryPhone: " + this.getSecondaryPhone() + ", ");
		sb.append("state: " + this.getState() + ", ");
		sb.append("updateDate: " + this.getUpdateDate() + ", ");
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
		
		final UserDetails that; 
		try {
			that = (UserDetails) proxyThat;
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
		result = result && (((getAddress() == null) && (that.getAddress() == null)) || (getAddress() != null && getAddress().equals(that.getAddress())));
		result = result && (((getCity() == null) && (that.getCity() == null)) || (getCity() != null && getCity().equals(that.getCity())));
		result = result && (((getCounty() == null) && (that.getCounty() == null)) || (getCounty() != null && getCounty().equals(that.getCounty())));
		result = result && (((getCreateDate() == null) && (that.getCreateDate() == null)) || (getCreateDate() != null && getCreateDate().equals(that.getCreateDate())));
		result = result && (((getDateOfBirth() == null) && (that.getDateOfBirth() == null)) || (getDateOfBirth() != null && getDateOfBirth().equals(that.getDateOfBirth())));
		result = result && (((getFirstName() == null) && (that.getFirstName() == null)) || (getFirstName() != null && getFirstName().equals(that.getFirstName())));
		result = result && (((getLastName() == null) && (that.getLastName() == null)) || (getLastName() != null && getLastName().equals(that.getLastName())));
		result = result && (((getPhone() == null) && (that.getPhone() == null)) || (getPhone() != null && getPhone().equals(that.getPhone())));
		result = result && (((getPostCode() == null) && (that.getPostCode() == null)) || (getPostCode() != null && getPostCode().equals(that.getPostCode())));
		result = result && (((getSecondaryEmail() == null) && (that.getSecondaryEmail() == null)) || (getSecondaryEmail() != null && getSecondaryEmail().equals(that.getSecondaryEmail())));
		result = result && (((getSecondaryPhone() == null) && (that.getSecondaryPhone() == null)) || (getSecondaryPhone() != null && getSecondaryPhone().equals(that.getSecondaryPhone())));
		result = result && (((getState() == null) && (that.getState() == null)) || (getState() != null && getState().equals(that.getState())));
		result = result && (((getUpdateDate() == null) && (that.getUpdateDate() == null)) || (getUpdateDate() != null && getUpdateDate().equals(that.getUpdateDate())));
		result = result && (((getUser() == null) && (that.getUser() == null)) || (getUser() != null && getUser().getId().equals(that.getUser().getId())));	
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
