/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
public class FOne extends org.jooq.impl.AbstractRoutine<java.lang.Integer> {

	private static final long serialVersionUID = -1295751083;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public FOne() {
		super("f_one", org.jooq.test.sybase.generatedclasses.Dba.DBA, org.jooq.impl.SQLDataType.INTEGER);

		setReturnParameter(RETURN_VALUE);
	}
}
