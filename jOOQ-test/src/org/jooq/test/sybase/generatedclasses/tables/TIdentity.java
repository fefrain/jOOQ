/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class TIdentity extends org.jooq.impl.TableImpl<org.jooq.test.sybase.generatedclasses.tables.records.TIdentityRecord> {

	private static final long serialVersionUID = -659009862;

	/**
	 * The singleton instance of dba.t_identity
	 */
	public static final org.jooq.test.sybase.generatedclasses.tables.TIdentity T_IDENTITY = new org.jooq.test.sybase.generatedclasses.tables.TIdentity();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.sybase.generatedclasses.tables.records.TIdentityRecord> __RECORD_TYPE = org.jooq.test.sybase.generatedclasses.tables.records.TIdentityRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sybase.generatedclasses.tables.records.TIdentityRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TIdentityRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TIdentityRecord, java.lang.Integer> VAL = createField("val", org.jooq.impl.SQLDataType.INTEGER, this);

	public TIdentity() {
		super("t_identity", org.jooq.test.sybase.generatedclasses.Dba.DBA);
	}

	public TIdentity(java.lang.String alias) {
		super(alias, org.jooq.test.sybase.generatedclasses.Dba.DBA, org.jooq.test.sybase.generatedclasses.tables.TIdentity.T_IDENTITY);
	}

	@Override
	public org.jooq.Identity<org.jooq.test.sybase.generatedclasses.tables.records.TIdentityRecord, java.lang.Integer> getIdentity() {
		return org.jooq.test.sybase.generatedclasses.Keys.IDENTITY_T_IDENTITY;
	}

	@Override
	public org.jooq.test.sybase.generatedclasses.tables.TIdentity as(java.lang.String alias) {
		return new org.jooq.test.sybase.generatedclasses.tables.TIdentity(alias);
	}
}
