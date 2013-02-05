/**
 * This class is generated by jOOQ
 */
package org.jooq.test.firebird.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class XTestCase_71Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.firebird.generatedclasses.tables.records.XTestCase_71Record> implements org.jooq.test.firebird.generatedclasses.tables.interfaces.IXTestCase_71 {

	private static final long serialVersionUID = -1918458872;

	/**
	 * The table column <code>X_TEST_CASE_71.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.firebird.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71.ID, value);
	}

	/**
	 * The table column <code>X_TEST_CASE_71.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@Override
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.firebird.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71.ID);
	}

	/**
	 * The table column <code>X_TEST_CASE_71.TEST_CASE_64_69_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_71
	 * FOREIGN KEY (TEST_CASE_64_69_ID)
	 * REFERENCES X_TEST_CASE_64_69 (ID)
	 * </pre></code>
	 */
	@Override
	public void setTestCase_64_69Id(java.lang.Short value) {
		setValue(org.jooq.test.firebird.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71.TEST_CASE_64_69_ID, value);
	}

	/**
	 * The table column <code>X_TEST_CASE_71.TEST_CASE_64_69_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_71
	 * FOREIGN KEY (TEST_CASE_64_69_ID)
	 * REFERENCES X_TEST_CASE_64_69 (ID)
	 * </pre></code>
	 */
	@Override
	public java.lang.Short getTestCase_64_69Id() {
		return getValue(org.jooq.test.firebird.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71.TEST_CASE_64_69_ID);
	}

	/**
	 * @deprecated - [#2040] - 2.7.0 - This method will be no longer be generated in jOOQ 3.0
	 */
	public void setTestCase_64_69Id(org.jooq.test.firebird.generatedclasses.tables.records.XTestCase_64_69Record value) {
		if (value == null) {
			setValue(org.jooq.test.firebird.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71.TEST_CASE_64_69_ID, null);
		}
		else {
			setValue(org.jooq.test.firebird.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71.TEST_CASE_64_69_ID, value.getValueAsShort(org.jooq.test.firebird.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.ID));
		}
	}

	/**
	 * The table column <code>X_TEST_CASE_71.TEST_CASE_64_69_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_71
	 * FOREIGN KEY (TEST_CASE_64_69_ID)
	 * REFERENCES X_TEST_CASE_64_69 (ID)
	 * </pre></code>
	 *
	 * @deprecated [#2040] - 2.7.0 - This method will be no longer be generated in jOOQ 3.0
	 */
	@Deprecated
	public org.jooq.test.firebird.generatedclasses.tables.records.XTestCase_64_69Record fetchXTestCase_64_69() {
		return create()
			.selectFrom(org.jooq.test.firebird.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69)
			.where(org.jooq.test.firebird.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.ID.equal(getValueAsInteger(org.jooq.test.firebird.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71.TEST_CASE_64_69_ID)))
			.fetchOne();
	}

	/**
	 * Create a detached XTestCase_71Record
	 */
	public XTestCase_71Record() {
		super(org.jooq.test.firebird.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71);
	}
}
