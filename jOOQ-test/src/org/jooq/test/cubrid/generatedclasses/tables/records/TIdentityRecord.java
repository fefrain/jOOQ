/**
 * This class is generated by jOOQ
 */
package org.jooq.test.cubrid.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class TIdentityRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.cubrid.generatedclasses.tables.records.TIdentityRecord> {

	private static final long serialVersionUID = 2069322597;

	/**
	 * An uncommented item
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.cubrid.generatedclasses.tables.TIdentity.ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.cubrid.generatedclasses.tables.TIdentity.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setVal(java.lang.Integer value) {
		setValue(org.jooq.test.cubrid.generatedclasses.tables.TIdentity.VAL, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getVal() {
		return getValue(org.jooq.test.cubrid.generatedclasses.tables.TIdentity.VAL);
	}

	/**
	 * Create a detached TIdentityRecord
	 */
	public TIdentityRecord() {
		super(org.jooq.test.cubrid.generatedclasses.tables.TIdentity.T_IDENTITY);
	}
}
