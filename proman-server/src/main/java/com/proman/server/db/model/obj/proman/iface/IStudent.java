package com.proman.server.db.model.obj.proman.iface;

import java.util.Date;
import java.util.Set;

import com.proman.server.db.model.obj.proman.TeamStudent;
import com.proman.server.db.model.obj.proman.Users;

/**
 * Object interface mapping for hibernate-handled table: student.
 * 
 * @author autogenerated
 */

public interface IStudent {

	/**
	 * Return the value associated with the column: authorizedPickupPersons.
	 * 
	 * @return A String object (this.authorizedPickupPersons)
	 */
	String getAuthorizedPickupPersons();

	/**
	 * Set the value related to the column: authorizedPickupPersons.
	 * 
	 * @param authorizedPickupPersons
	 *            the authorizedPickupPersons value you wish to set
	 */
	void setAuthorizedPickupPersons(final String authorizedPickupPersons);

	/**
	 * Return the value associated with the column: createDate.
	 * 
	 * @return A Date object (this.createDate)
	 */
	Date getCreateDate();

	/**
	 * Set the value related to the column: createDate.
	 * 
	 * @param createDate
	 *            the createDate value you wish to set
	 */
	void setCreateDate(final Date createDate);

	/**
	 * Return the value associated with the column: firstName.
	 * 
	 * @return A String object (this.firstName)
	 */
	String getFirstName();

	/**
	 * Set the value related to the column: firstName.
	 * 
	 * @param firstName
	 *            the firstName value you wish to set
	 */
	void setFirstName(final String firstName);

	/**
	 * Return the value associated with the column: foodAllergies.
	 * 
	 * @return A String object (this.foodAllergies)
	 */
	String getFoodAllergies();

	/**
	 * Set the value related to the column: foodAllergies.
	 * 
	 * @param foodAllergies
	 *            the foodAllergies value you wish to set
	 */
	void setFoodAllergies(final String foodAllergies);

	/**
	 * Return the value associated with the column: grade.
	 * 
	 * @return A String object (this.grade)
	 */
	String getGrade();

	/**
	 * Set the value related to the column: grade.
	 * 
	 * @param grade
	 *            the grade value you wish to set
	 */
	void setGrade(final String grade);

	/**
	 * Return the value associated with the column: id.
	 * 
	 * @return A Integer object (this.id)
	 */
	Integer getId();

	/**
	 * Set the value related to the column: id.
	 * 
	 * @param id
	 *            the id value you wish to set
	 */
	void setId(final Integer id);

	/**
	 * Return the value associated with the column: lastName.
	 * 
	 * @return A String object (this.lastName)
	 */
	String getLastName();

	/**
	 * Set the value related to the column: lastName.
	 * 
	 * @param lastName
	 *            the lastName value you wish to set
	 */
	void setLastName(final String lastName);

	/**
	 * Return the value associated with the column: otherConditions.
	 * 
	 * @return A String object (this.otherConditions)
	 */
	String getOtherConditions();

	/**
	 * Set the value related to the column: otherConditions.
	 * 
	 * @param otherConditions
	 *            the otherConditions value you wish to set
	 */
	void setOtherConditions(final String otherConditions);

	/**
	 * Return the value associated with the column: parentGuardian.
	 * 
	 * @return A Users object (this.parentGuardian)
	 */
	Users getParentGuardian();

	/**
	 * Set the value related to the column: parentGuardian.
	 * 
	 * @param parentGuardian
	 *            the parentGuardian value you wish to set
	 */
	void setParentGuardian(final Users parentGuardian);

	/**
	 * Return the value associated with the column: school.
	 * 
	 * @return A String object (this.school)
	 */
	String getSchool();

	/**
	 * Set the value related to the column: school.
	 * 
	 * @param school
	 *            the school value you wish to set
	 */
	void setSchool(final String school);

	/**
	 * Return the value associated with the column: teacher.
	 * 
	 * @return A String object (this.teacher)
	 */
	String getTeacher();

	/**
	 * Set the value related to the column: teacher.
	 * 
	 * @param teacher
	 *            the teacher value you wish to set
	 */
	void setTeacher(final String teacher);

	/**
	 * Return the value associated with the column: teamStudent.
	 * 
	 * @return A Set&lt;TeamStudent&gt; object (this.teamStudent)
	 */
	Set<TeamStudent> getTeamStudents();

	/**
	 * Adds a bi-directional link of type TeamStudent to the teamStudents set.
	 * 
	 * @param teamStudent
	 *            item to add
	 */
	void addTeamStudent(TeamStudent teamStudent);

	/**
	 * Set the value related to the column: teamStudent.
	 * 
	 * @param teamStudent
	 *            the teamStudent value you wish to set
	 */
	void setTeamStudents(final Set<TeamStudent> teamStudent);

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