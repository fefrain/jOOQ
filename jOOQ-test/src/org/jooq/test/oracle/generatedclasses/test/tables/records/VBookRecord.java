/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "V_BOOK", schema = "TEST")
public class VBookRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.VBookRecord> implements org.jooq.Record9<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, byte[]> {

	private static final long serialVersionUID = -60010966;

	/**
	 * Setter for <code>TEST.V_BOOK.ID</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.V_BOOK.ID</code>. 
	 */
	@javax.persistence.Column(name = "ID", nullable = false, precision = 7)
	@javax.validation.constraints.NotNull
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>TEST.V_BOOK.AUTHOR_ID</code>. 
	 */
	public void setAuthorId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>TEST.V_BOOK.AUTHOR_ID</code>. 
	 */
	@javax.persistence.Column(name = "AUTHOR_ID", nullable = false, precision = 7)
	@javax.validation.constraints.NotNull
	public java.lang.Integer getAuthorId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>TEST.V_BOOK.CO_AUTHOR_ID</code>. 
	 */
	public void setCoAuthorId(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>TEST.V_BOOK.CO_AUTHOR_ID</code>. 
	 */
	@javax.persistence.Column(name = "CO_AUTHOR_ID", precision = 7)
	public java.lang.Integer getCoAuthorId() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>TEST.V_BOOK.DETAILS_ID</code>. 
	 */
	public void setDetailsId(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>TEST.V_BOOK.DETAILS_ID</code>. 
	 */
	@javax.persistence.Column(name = "DETAILS_ID", precision = 7)
	public java.lang.Integer getDetailsId() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>TEST.V_BOOK.TITLE</code>. 
	 */
	public void setTitle(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>TEST.V_BOOK.TITLE</code>. 
	 */
	@javax.persistence.Column(name = "TITLE", nullable = false, length = 400)
	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 400)
	public java.lang.String getTitle() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>TEST.V_BOOK.PUBLISHED_IN</code>. 
	 */
	public void setPublishedIn(java.lang.Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>TEST.V_BOOK.PUBLISHED_IN</code>. 
	 */
	@javax.persistence.Column(name = "PUBLISHED_IN", nullable = false, precision = 7)
	@javax.validation.constraints.NotNull
	public java.lang.Integer getPublishedIn() {
		return (java.lang.Integer) getValue(5);
	}

	/**
	 * Setter for <code>TEST.V_BOOK.LANGUAGE_ID</code>. 
	 */
	public void setLanguageId(java.lang.Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>TEST.V_BOOK.LANGUAGE_ID</code>. 
	 */
	@javax.persistence.Column(name = "LANGUAGE_ID", nullable = false, precision = 7)
	@javax.validation.constraints.NotNull
	public java.lang.Integer getLanguageId() {
		return (java.lang.Integer) getValue(6);
	}

	/**
	 * Setter for <code>TEST.V_BOOK.CONTENT_TEXT</code>. 
	 */
	public void setContentText(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>TEST.V_BOOK.CONTENT_TEXT</code>. 
	 */
	@javax.persistence.Column(name = "CONTENT_TEXT")
	public java.lang.String getContentText() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>TEST.V_BOOK.CONTENT_PDF</code>. 
	 */
	public void setContentPdf(byte[] value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>TEST.V_BOOK.CONTENT_PDF</code>. 
	 */
	@javax.persistence.Column(name = "CONTENT_PDF")
	public byte[] getContentPdf() {
		return (byte[]) getValue(8);
	}

	// -------------------------------------------------------------------------
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, byte[]> fieldsRow() {
		return (org.jooq.Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, byte[]> valuesRow() {
		return (org.jooq.Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.oracle.generatedclasses.test.tables.VBook.V_BOOK.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.oracle.generatedclasses.test.tables.VBook.V_BOOK.AUTHOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.jooq.test.oracle.generatedclasses.test.tables.VBook.V_BOOK.CO_AUTHOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return org.jooq.test.oracle.generatedclasses.test.tables.VBook.V_BOOK.DETAILS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.jooq.test.oracle.generatedclasses.test.tables.VBook.V_BOOK.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field6() {
		return org.jooq.test.oracle.generatedclasses.test.tables.VBook.V_BOOK.PUBLISHED_IN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field7() {
		return org.jooq.test.oracle.generatedclasses.test.tables.VBook.V_BOOK.LANGUAGE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return org.jooq.test.oracle.generatedclasses.test.tables.VBook.V_BOOK.CONTENT_TEXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<byte[]> field9() {
		return org.jooq.test.oracle.generatedclasses.test.tables.VBook.V_BOOK.CONTENT_PDF;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getAuthorId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getCoAuthorId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getDetailsId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value6() {
		return getPublishedIn();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value7() {
		return getLanguageId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getContentText();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte[] value9() {
		return getContentPdf();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached VBookRecord
	 */
	public VBookRecord() {
		super(org.jooq.test.oracle.generatedclasses.test.tables.VBook.V_BOOK);
	}
}
