/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "t_725_lob_test", schema = "test2")
public class T_725LobTestRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.mysql2.generatedclasses.tables.records.T_725LobTestRecord> {

	private static final long serialVersionUID = -346039927;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setLob(byte[] value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST.LOB, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "LOB")
	public byte[] getLob() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST.LOB);
	}

	/**
	 * Create a detached T_725LobTestRecord
	 */
	public T_725LobTestRecord() {
		super(org.jooq.test.mysql2.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST);
	}
}
