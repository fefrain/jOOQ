/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
public class ActorInfo extends org.jooq.impl.TableImpl<org.jooq.examples.mysql.sakila.tables.records.ActorInfoRecord> {

	private static final long serialVersionUID = 1873053134;

	/**
	 * The singleton instance of sakila.actor_info
	 */
	public static final org.jooq.examples.mysql.sakila.tables.ActorInfo ACTOR_INFO = new org.jooq.examples.mysql.sakila.tables.ActorInfo();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.ActorInfoRecord> __RECORD_TYPE = org.jooq.examples.mysql.sakila.tables.records.ActorInfoRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.ActorInfoRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.ActorInfoRecord, java.lang.Short> ACTOR_ID = createField("actor_id", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.ActorInfoRecord, java.lang.String> FIRST_NAME = createField("first_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.ActorInfoRecord, java.lang.String> LAST_NAME = createField("last_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.ActorInfoRecord, java.lang.String> FILM_INFO = createField("film_info", org.jooq.impl.SQLDataType.VARCHAR, this);

	public ActorInfo() {
		super("actor_info", org.jooq.examples.mysql.sakila.Sakila.SAKILA);
	}

	public ActorInfo(java.lang.String alias) {
		super(alias, org.jooq.examples.mysql.sakila.Sakila.SAKILA, org.jooq.examples.mysql.sakila.tables.ActorInfo.ACTOR_INFO);
	}

	@Override
	public org.jooq.examples.mysql.sakila.tables.ActorInfo as(java.lang.String alias) {
		return new org.jooq.examples.mysql.sakila.tables.ActorInfo(alias);
	}
}
