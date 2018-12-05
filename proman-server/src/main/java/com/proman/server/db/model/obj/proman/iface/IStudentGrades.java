package com.proman.server.db.model.obj.proman.iface;

import java.util.Date;

/**
 * Object interface mapping for hibernate-handled table: student_grades.
 * 
 * @author autogenerated
 */

public interface IStudentGrades {

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
	 * Return the value associated with the column: gradeDescription.
	 * 
	 * @return A String object (this.gradeDescription)
	 */
	String getGradeDescription();

	/**
	 * Set the value related to the column: gradeDescription.
	 * 
	 * @param gradeDescription
	 *            the gradeDescription value you wish to set
	 */
	void setGradeDescription(final String gradeDescription);

	/**
	 * Return the value associated with the column: gradeValue.
	 * 
	 * @return A Integer object (this.gradeValue)
	 */
	Integer getGradeValue();

	/**
	 * Set the value related to the column: gradeValue.
	 * 
	 * @param gradeValue
	 *            the gradeValue value you wish to set
	 */
	void setGradeValue(final Integer gradeValue);

	/**
	 * Return the value associated with the column: id.
	 * 
	 * @return A String object (this.id)
	 */
	String getId();

	/**
	 * Set the value related to the column: id.
	 * 
	 * @param id
	 *            the id value you wish to set
	 */
	void setId(final String id);

	/**
	 * Return the value associated with the column: updateDate.
	 * 
	 * @return A Date object (this.updateDate)
	 */
	Date getUpdateDate();

	/**
	 * Set the value related to the column: updateDate.
	 * 
	 * @param updateDate
	 *            the updateDate value you wish to set
	 */
	void setUpdateDate(final Date updateDate);

	// end of interface
}