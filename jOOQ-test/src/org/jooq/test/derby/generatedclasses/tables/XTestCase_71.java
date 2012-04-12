/**
 * This class is generated by jOOQ
 */
package org.jooq.test.derby.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class XTestCase_71 extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.derby.generatedclasses.tables.records.XTestCase_71Record> {

	private static final long serialVersionUID = 677019161;

	/**
	 * The singleton instance of TEST.X_TEST_CASE_71
	 */
	public static final org.jooq.test.derby.generatedclasses.tables.XTestCase_71 X_TEST_CASE_71 = new org.jooq.test.derby.generatedclasses.tables.XTestCase_71();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.derby.generatedclasses.tables.records.XTestCase_71Record> __RECORD_TYPE = org.jooq.test.derby.generatedclasses.tables.records.XTestCase_71Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.derby.generatedclasses.tables.records.XTestCase_71Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.XTestCase_71Record, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, X_TEST_CASE_71);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_71
	 * FOREIGN KEY (TEST_CASE_64_69_ID)
	 * REFERENCES TEST.X_TEST_CASE_64_69 (ID)
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.XTestCase_71Record, java.lang.Integer> TEST_CASE_64_69_ID = createField("TEST_CASE_64_69_ID", org.jooq.impl.SQLDataType.INTEGER, X_TEST_CASE_71);

	/**
	 * No further instances allowed
	 */
	private XTestCase_71() {
		super("X_TEST_CASE_71", org.jooq.test.derby.generatedclasses.Test.TEST);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.derby.generatedclasses.tables.records.XTestCase_71Record> getMainKey() {
		return org.jooq.test.derby.generatedclasses.Keys.PK_X_TEST_CASE_71;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.derby.generatedclasses.tables.records.XTestCase_71Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.derby.generatedclasses.tables.records.XTestCase_71Record>>asList(org.jooq.test.derby.generatedclasses.Keys.PK_X_TEST_CASE_71);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.derby.generatedclasses.tables.records.XTestCase_71Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.derby.generatedclasses.tables.records.XTestCase_71Record, ?>>asList(org.jooq.test.derby.generatedclasses.Keys.FK_X_TEST_CASE_71);
	}
}
