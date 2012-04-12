/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class XTestCase_85Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_85Record> {

	private static final long serialVersionUID = 945054287;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.XTestCase_85.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.XTestCase_85.ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_x_test_case_85_X_UNUSED_1
	 * FOREIGN KEY (x_unused_id, x_unused_name)
	 * REFERENCES x_unused (ID)
	 * </pre></code>
	 */
	public void setXUnusedId(java.lang.Integer value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.XTestCase_85.X_UNUSED_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_x_test_case_85_X_UNUSED_1
	 * FOREIGN KEY (x_unused_id, x_unused_name)
	 * REFERENCES x_unused (ID)
	 * </pre></code>
	 */
	public java.lang.Integer getXUnusedId() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.XTestCase_85.X_UNUSED_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_x_test_case_85_X_UNUSED_1
	 * FOREIGN KEY (x_unused_id, x_unused_name)
	 * REFERENCES x_unused (ID)
	 * </pre></code>
	 */
	public void setXUnusedName(java.lang.String value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.XTestCase_85.X_UNUSED_NAME, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_x_test_case_85_X_UNUSED_1
	 * FOREIGN KEY (x_unused_id, x_unused_name)
	 * REFERENCES x_unused (ID)
	 * </pre></code>
	 */
	public java.lang.String getXUnusedName() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.XTestCase_85.X_UNUSED_NAME);
	}

	/**
	 * Create a detached XTestCase_85Record
	 */
	public XTestCase_85Record() {
		super(org.jooq.test.sqlite.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85);
	}
}
