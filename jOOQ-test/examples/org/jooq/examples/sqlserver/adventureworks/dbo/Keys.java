/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.dbo;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the dbo schema
 */
@SuppressWarnings({"unchecked"})
public class Keys extends org.jooq.impl.AbstractKeys {

	// IDENTITY definitions
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.AWBuildVersion, java.lang.Byte> IDENTITY_AWBuildVersion = createIdentity(org.jooq.examples.sqlserver.adventureworks.dbo.tables.AWBuildVersion.AWBuildVersion, org.jooq.examples.sqlserver.adventureworks.dbo.tables.AWBuildVersion.AWBuildVersion.SystemInformationID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.DatabaseLog, java.lang.Integer> IDENTITY_DatabaseLog = createIdentity(org.jooq.examples.sqlserver.adventureworks.dbo.tables.DatabaseLog.DatabaseLog, org.jooq.examples.sqlserver.adventureworks.dbo.tables.DatabaseLog.DatabaseLog.DatabaseLogID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.ErrorLog, java.lang.Integer> IDENTITY_ErrorLog = createIdentity(org.jooq.examples.sqlserver.adventureworks.dbo.tables.ErrorLog.ErrorLog, org.jooq.examples.sqlserver.adventureworks.dbo.tables.ErrorLog.ErrorLog.ErrorLogID);

	// UNIQUE and PRIMARY KEY definitions
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.AWBuildVersion> PK_AWBuildVersion_SystemInformationID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.dbo.tables.AWBuildVersion.AWBuildVersion, org.jooq.examples.sqlserver.adventureworks.dbo.tables.AWBuildVersion.AWBuildVersion.SystemInformationID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.DatabaseLog> PK_DatabaseLog_DatabaseLogID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.dbo.tables.DatabaseLog.DatabaseLog, org.jooq.examples.sqlserver.adventureworks.dbo.tables.DatabaseLog.DatabaseLog.DatabaseLogID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.ErrorLog> PK_ErrorLog_ErrorLogID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.dbo.tables.ErrorLog.ErrorLog, org.jooq.examples.sqlserver.adventureworks.dbo.tables.ErrorLog.ErrorLog.ErrorLogID);

	// FOREIGN KEY definitions

	/**
	 * No instances
	 */
	private Keys() {}
}
