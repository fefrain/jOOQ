/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "Employee", schema = "HumanResources")
public class Employee extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.Employee> implements org.jooq.Record16<java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.sql.Timestamp, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.Boolean, java.lang.Short, java.lang.Short, java.lang.Boolean, java.lang.String, java.sql.Timestamp> {

	private static final long serialVersionUID = 957446035;

	/**
	 * Setter for <code>HumanResources.Employee.EmployeeID</code>. 
	 */
	public void setEmployeeID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.EmployeeID, value);
	}

	/**
	 * Getter for <code>HumanResources.Employee.EmployeeID</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "EmployeeID", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getEmployeeID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.EmployeeID);
	}

	/**
	 * Setter for <code>HumanResources.Employee.NationalIDNumber</code>. 
	 */
	public void setNationalIDNumber(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.NationalIDNumber, value);
	}

	/**
	 * Getter for <code>HumanResources.Employee.NationalIDNumber</code>. 
	 */
	@javax.persistence.Column(name = "NationalIDNumber", nullable = false, length = 15)
	public java.lang.String getNationalIDNumber() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.NationalIDNumber);
	}

	/**
	 * Setter for <code>HumanResources.Employee.ContactID</code>. 
	 */
	public void setContactID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.ContactID, value);
	}

	/**
	 * Getter for <code>HumanResources.Employee.ContactID</code>. 
	 */
	@javax.persistence.Column(name = "ContactID", nullable = false, precision = 10)
	public java.lang.Integer getContactID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.ContactID);
	}

	/**
	 * Setter for <code>HumanResources.Employee.LoginID</code>. 
	 */
	public void setLoginID(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.LoginID, value);
	}

	/**
	 * Getter for <code>HumanResources.Employee.LoginID</code>. 
	 */
	@javax.persistence.Column(name = "LoginID", nullable = false, length = 256)
	public java.lang.String getLoginID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.LoginID);
	}

	/**
	 * Setter for <code>HumanResources.Employee.ManagerID</code>. 
	 */
	public void setManagerID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.ManagerID, value);
	}

	/**
	 * Getter for <code>HumanResources.Employee.ManagerID</code>. 
	 */
	@javax.persistence.Column(name = "ManagerID", precision = 10)
	public java.lang.Integer getManagerID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.ManagerID);
	}

	/**
	 * Setter for <code>HumanResources.Employee.Title</code>. 
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.Title, value);
	}

	/**
	 * Getter for <code>HumanResources.Employee.Title</code>. 
	 */
	@javax.persistence.Column(name = "Title", nullable = false, length = 50)
	public java.lang.String getTitle() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.Title);
	}

	/**
	 * Setter for <code>HumanResources.Employee.BirthDate</code>. 
	 */
	public void setBirthDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.BirthDate, value);
	}

	/**
	 * Getter for <code>HumanResources.Employee.BirthDate</code>. 
	 */
	@javax.persistence.Column(name = "BirthDate", nullable = false)
	public java.sql.Timestamp getBirthDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.BirthDate);
	}

	/**
	 * Setter for <code>HumanResources.Employee.MaritalStatus</code>. 
	 */
	public void setMaritalStatus(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.MaritalStatus, value);
	}

	/**
	 * Getter for <code>HumanResources.Employee.MaritalStatus</code>. 
	 */
	@javax.persistence.Column(name = "MaritalStatus", nullable = false, length = 1)
	public java.lang.String getMaritalStatus() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.MaritalStatus);
	}

	/**
	 * Setter for <code>HumanResources.Employee.Gender</code>. 
	 */
	public void setGender(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.Gender, value);
	}

	/**
	 * Getter for <code>HumanResources.Employee.Gender</code>. 
	 */
	@javax.persistence.Column(name = "Gender", nullable = false, length = 1)
	public java.lang.String getGender() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.Gender);
	}

	/**
	 * Setter for <code>HumanResources.Employee.HireDate</code>. 
	 */
	public void setHireDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.HireDate, value);
	}

	/**
	 * Getter for <code>HumanResources.Employee.HireDate</code>. 
	 */
	@javax.persistence.Column(name = "HireDate", nullable = false)
	public java.sql.Timestamp getHireDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.HireDate);
	}

	/**
	 * Setter for <code>HumanResources.Employee.SalariedFlag</code>. 
	 */
	public void setSalariedFlag(java.lang.Boolean value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.SalariedFlag, value);
	}

	/**
	 * Getter for <code>HumanResources.Employee.SalariedFlag</code>. 
	 */
	@javax.persistence.Column(name = "SalariedFlag", nullable = false)
	public java.lang.Boolean getSalariedFlag() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.SalariedFlag);
	}

	/**
	 * Setter for <code>HumanResources.Employee.VacationHours</code>. 
	 */
	public void setVacationHours(java.lang.Short value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.VacationHours, value);
	}

	/**
	 * Getter for <code>HumanResources.Employee.VacationHours</code>. 
	 */
	@javax.persistence.Column(name = "VacationHours", nullable = false, precision = 5)
	public java.lang.Short getVacationHours() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.VacationHours);
	}

	/**
	 * Setter for <code>HumanResources.Employee.SickLeaveHours</code>. 
	 */
	public void setSickLeaveHours(java.lang.Short value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.SickLeaveHours, value);
	}

	/**
	 * Getter for <code>HumanResources.Employee.SickLeaveHours</code>. 
	 */
	@javax.persistence.Column(name = "SickLeaveHours", nullable = false, precision = 5)
	public java.lang.Short getSickLeaveHours() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.SickLeaveHours);
	}

	/**
	 * Setter for <code>HumanResources.Employee.CurrentFlag</code>. 
	 */
	public void setCurrentFlag(java.lang.Boolean value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.CurrentFlag, value);
	}

	/**
	 * Getter for <code>HumanResources.Employee.CurrentFlag</code>. 
	 */
	@javax.persistence.Column(name = "CurrentFlag", nullable = false)
	public java.lang.Boolean getCurrentFlag() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.CurrentFlag);
	}

	/**
	 * Setter for <code>HumanResources.Employee.rowguid</code>. 
	 */
	public void setrowguid(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.rowguid, value);
	}

	/**
	 * Getter for <code>HumanResources.Employee.rowguid</code>. 
	 */
	@javax.persistence.Column(name = "rowguid", nullable = false)
	public java.lang.String getrowguid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.rowguid);
	}

	/**
	 * Setter for <code>HumanResources.Employee.ModifiedDate</code>. 
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.ModifiedDate, value);
	}

	/**
	 * Getter for <code>HumanResources.Employee.ModifiedDate</code>. 
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.ModifiedDate);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record16 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row16<java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.sql.Timestamp, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.Boolean, java.lang.Short, java.lang.Short, java.lang.Boolean, java.lang.String, java.sql.Timestamp> fieldsRow() {
		return org.jooq.impl.DSL.row(field1(), field2(), field3(), field4(), field5(), field6(), field7(), field8(), field9(), field10(), field11(), field12(), field13(), field14(), field15(), field16());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row16<java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.sql.Timestamp, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.Boolean, java.lang.Short, java.lang.Short, java.lang.Boolean, java.lang.String, java.sql.Timestamp> valuesRow() {
		return org.jooq.impl.DSL.row(value1(), value2(), value3(), value4(), value5(), value6(), value7(), value8(), value9(), value10(), value11(), value12(), value13(), value14(), value15(), value16());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.EmployeeID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.NationalIDNumber;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.ContactID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.LoginID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.ManagerID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.Title;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field7() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.BirthDate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.MaritalStatus;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.Gender;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field10() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.HireDate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field11() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.SalariedFlag;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field12() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.VacationHours;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field13() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.SickLeaveHours;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field14() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.CurrentFlag;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field15() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.rowguid;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field16() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee.ModifiedDate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getEmployeeID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getNationalIDNumber();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getContactID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getLoginID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getManagerID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value7() {
		return getBirthDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getMaritalStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getGender();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value10() {
		return getHireDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value11() {
		return getSalariedFlag();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value12() {
		return getVacationHours();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value13() {
		return getSickLeaveHours();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value14() {
		return getCurrentFlag();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value15() {
		return getrowguid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value16() {
		return getModifiedDate();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached Employee
	 */
	public Employee() {
		super(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employee.Employee);
	}
}
