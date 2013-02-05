/**
 * This class is generated by jOOQ
 */
package org.jooq.test.firebird.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public interface IXTestCase_85 extends java.io.Serializable {

	/**
	 * The table column <code>X_TEST_CASE_85.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setId(java.lang.Integer value);

	/**
	 * The table column <code>X_TEST_CASE_85.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.Integer getId();

	/**
	 * The table column <code>X_TEST_CASE_85.X_UNUSED_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_85
	 * FOREIGN KEY (X_UNUSED_ID, X_UNUSED_NAME)
	 * REFERENCES X_UNUSED (ID, NAME)
	 * </pre></code>
	 */
	public void setXUnusedId(java.lang.Integer value);

	/**
	 * The table column <code>X_TEST_CASE_85.X_UNUSED_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_85
	 * FOREIGN KEY (X_UNUSED_ID, X_UNUSED_NAME)
	 * REFERENCES X_UNUSED (ID, NAME)
	 * </pre></code>
	 */
	public java.lang.Integer getXUnusedId();

	/**
	 * The table column <code>X_TEST_CASE_85.X_UNUSED_NAME</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_85
	 * FOREIGN KEY (X_UNUSED_ID, X_UNUSED_NAME)
	 * REFERENCES X_UNUSED (ID, NAME)
	 * </pre></code>
	 */
	public void setXUnusedName(java.lang.String value);

	/**
	 * The table column <code>X_TEST_CASE_85.X_UNUSED_NAME</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_85
	 * FOREIGN KEY (X_UNUSED_ID, X_UNUSED_NAME)
	 * REFERENCES X_UNUSED (ID, NAME)
	 * </pre></code>
	 */
	public java.lang.String getXUnusedName();
}
