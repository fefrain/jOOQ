/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.person.tables;

/**
 * This class is generated by jOOQ.
 */
public class StateProvince extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.person.tables.records.StateProvince> {

	private static final long serialVersionUID = 646969579;

	/**
	 * The singleton instance of Person.StateProvince
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.person.tables.StateProvince StateProvince = new org.jooq.examples.sqlserver.adventureworks.person.tables.StateProvince();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.person.tables.records.StateProvince> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.person.tables.records.StateProvince.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.person.tables.records.StateProvince> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.StateProvince, java.lang.Integer> StateProvinceID = createField("StateProvinceID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.StateProvince, java.lang.String> StateProvinceCode = createField("StateProvinceCode", org.jooq.impl.SQLDataType.NCHAR, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_StateProvince_CountryRegion_CountryRegionCode
	 * FOREIGN KEY (CountryRegionCode)
	 * REFERENCES Person.CountryRegion (CountryRegionCode)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.StateProvince, java.lang.String> CountryRegionCode = createField("CountryRegionCode", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.StateProvince, java.lang.Boolean> IsOnlyStateProvinceFlag = createField("IsOnlyStateProvinceFlag", org.jooq.impl.SQLDataType.BIT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.StateProvince, java.lang.String> Name = createField("Name", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_StateProvince_SalesTerritory_TerritoryID
	 * FOREIGN KEY (TerritoryID)
	 * REFERENCES Sales.SalesTerritory (TerritoryID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.StateProvince, java.lang.Integer> TerritoryID = createField("TerritoryID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.StateProvince, java.lang.String> rowguid = createField("rowguid", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.StateProvince, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	public StateProvince() {
		super("StateProvince", org.jooq.examples.sqlserver.adventureworks.person.Person.Person);
	}

	public StateProvince(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.person.Person.Person, org.jooq.examples.sqlserver.adventureworks.person.tables.StateProvince.StateProvince);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.person.tables.records.StateProvince, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.person.Keys.IDENTITY_StateProvince;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.person.tables.records.StateProvince> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_StateProvince_StateProvinceID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.person.tables.records.StateProvince>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.person.tables.records.StateProvince>>asList(org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_StateProvince_StateProvinceID);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.person.tables.records.StateProvince, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.person.tables.records.StateProvince, ?>>asList(org.jooq.examples.sqlserver.adventureworks.person.Keys.FK_StateProvince_CountryRegion_CountryRegionCode, org.jooq.examples.sqlserver.adventureworks.person.Keys.FK_StateProvince_SalesTerritory_TerritoryID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.person.tables.StateProvince as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.person.tables.StateProvince(alias);
	}
}
