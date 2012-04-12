/**
 * This class is generated by jOOQ
 */
package org.jooq.util.db2.syscat.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.6"},
                            comments = "This class is generated by jOOQ")
public class References extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -98734711;

	/**
	 * The singleton instance of SYSCAT.REFERENCES
	 */
	public static final org.jooq.util.db2.syscat.tables.References REFERENCES = new org.jooq.util.db2.syscat.tables.References();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.Record> __RECORD_TYPE = org.jooq.Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> CONSTNAME = createField("CONSTNAME", org.jooq.impl.SQLDataType.VARCHAR, REFERENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TABSCHEMA = createField("TABSCHEMA", org.jooq.impl.SQLDataType.VARCHAR, REFERENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TABNAME = createField("TABNAME", org.jooq.impl.SQLDataType.VARCHAR, REFERENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> OWNER = createField("OWNER", org.jooq.impl.SQLDataType.VARCHAR, REFERENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> OWNERTYPE = createField("OWNERTYPE", org.jooq.impl.SQLDataType.CHAR, REFERENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> REFKEYNAME = createField("REFKEYNAME", org.jooq.impl.SQLDataType.VARCHAR, REFERENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> REFTABSCHEMA = createField("REFTABSCHEMA", org.jooq.impl.SQLDataType.VARCHAR, REFERENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> REFTABNAME = createField("REFTABNAME", org.jooq.impl.SQLDataType.VARCHAR, REFERENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> COLCOUNT = createField("COLCOUNT", org.jooq.impl.SQLDataType.SMALLINT, REFERENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> DELETERULE = createField("DELETERULE", org.jooq.impl.SQLDataType.CHAR, REFERENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> UPDATERULE = createField("UPDATERULE", org.jooq.impl.SQLDataType.CHAR, REFERENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.sql.Timestamp> CREATE_TIME = createField("CREATE_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, REFERENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> FK_COLNAMES = createField("FK_COLNAMES", org.jooq.impl.SQLDataType.VARCHAR, REFERENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> PK_COLNAMES = createField("PK_COLNAMES", org.jooq.impl.SQLDataType.VARCHAR, REFERENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> DEFINER = createField("DEFINER", org.jooq.impl.SQLDataType.VARCHAR, REFERENCES);

	/**
	 * No further instances allowed
	 */
	private References() {
		super("REFERENCES", org.jooq.util.db2.syscat.Syscat.SYSCAT);
	}
}
