/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * A book store
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "T_BOOK_STORE", schema = "TEST")
public class TBookStoreRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookStoreRecord> implements org.jooq.Record1<java.lang.String> {

	private static final long serialVersionUID = 1355100994;

	/**
	 * Setter for <code>TEST.T_BOOK_STORE.NAME</code>. The books store name
	 */
	public void setName(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOK_STORE.NAME</code>. The books store name
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "NAME", unique = true, nullable = false, length = 400)
	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 400)
	public java.lang.String getName() {
		return (java.lang.String) getValue(0);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.String> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record1 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.String> fieldsRow() {
		return (org.jooq.Row1) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.String> valuesRow() {
		return (org.jooq.Row1) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.jooq.test.oracle.generatedclasses.test.tables.TBookStore.T_BOOK_STORE.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getName();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TBookStoreRecord
	 */
	public TBookStoreRecord() {
		super(org.jooq.test.oracle.generatedclasses.test.tables.TBookStore.T_BOOK_STORE);
	}
}
