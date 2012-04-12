/**
 * This class is generated by jOOQ
 */
package org.jooq.util.sybase.sys.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.6"},
                            comments = "This class is generated by jOOQ")
public class Sysview extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -967800213;

	/**
	 * The singleton instance of sys.SYSVIEW
	 */
	public static final org.jooq.util.sybase.sys.tables.Sysview SYSVIEW = new org.jooq.util.sybase.sys.tables.Sysview();

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
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> VIEW_OBJECT_ID = createField("view_object_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> VIEW_DEF = createField("view_def", org.jooq.impl.SQLDataType.LONGVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Byte> MV_BUILD_TYPE = createField("mv_build_type", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Byte> MV_REFRESH_TYPE = createField("mv_refresh_type", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Byte> MV_USE_IN_OPTIMIZATION = createField("mv_use_in_optimization", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.sql.Timestamp> MV_LAST_REFRESHED_AT = createField("mv_last_refreshed_at", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.sql.Timestamp> MV_KNOWN_STALE_AT = createField("mv_known_stale_at", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> MV_LAST_REFRESHED_TSN = createField("mv_last_refreshed_tsn", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * No further instances allowed
	 */
	private Sysview() {
		super("SYSVIEW", org.jooq.util.sybase.sys.Sys.SYS);
	}

	/**
	 * No further instances allowed
	 */
	private Sysview(java.lang.String alias) {
		super(alias, org.jooq.util.sybase.sys.Sys.SYS, org.jooq.util.sybase.sys.tables.Sysview.SYSVIEW);
	}

	@Override
	public org.jooq.util.sybase.sys.tables.Sysview as(java.lang.String alias) {
		return new org.jooq.util.sybase.sys.tables.Sysview(alias);
	}
}
