/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ingres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TExoticTypes extends org.jooq.impl.TableImpl<org.jooq.test.ingres.generatedclasses.tables.records.TExoticTypesRecord> {

	private static final long serialVersionUID = 2004484092;

	/**
	 * The singleton instance of <code>test.t_exotic_types</code>
	 */
	public static final org.jooq.test.ingres.generatedclasses.tables.TExoticTypes T_EXOTIC_TYPES = new org.jooq.test.ingres.generatedclasses.tables.TExoticTypes();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.ingres.generatedclasses.tables.records.TExoticTypesRecord> getRecordType() {
		return org.jooq.test.ingres.generatedclasses.tables.records.TExoticTypesRecord.class;
	}

	/**
	 * The column <code>test.t_exotic_types.id</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.TExoticTypesRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, T_EXOTIC_TYPES);

	/**
	 * The column <code>test.t_exotic_types.uu</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.TExoticTypesRecord, java.util.UUID> UU = createField("uu", org.jooq.impl.SQLDataType.UUID, T_EXOTIC_TYPES);

	/**
	 * No further instances allowed
	 */
	private TExoticTypes() {
		super("t_exotic_types", org.jooq.test.ingres.generatedclasses.Test.TEST);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.TExoticTypesRecord> getPrimaryKey() {
		return org.jooq.test.ingres.generatedclasses.Keys.PK_T_EXOTIC_TYPES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.TExoticTypesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.TExoticTypesRecord>>asList(org.jooq.test.ingres.generatedclasses.Keys.PK_T_EXOTIC_TYPES);
	}
}
