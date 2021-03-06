/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class P391 extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -1364908123;

	/**
	 * The parameter <code>TEST.P391.I1</code>. 
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> I1 = createParameter("I1", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * The parameter <code>TEST.P391.IO1</code>. 
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> IO1 = createParameter("IO1", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * The parameter <code>TEST.P391.O1</code>. 
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> O1 = createParameter("O1", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * The parameter <code>TEST.P391.O2</code>. 
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> O2 = createParameter("O2", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * The parameter <code>TEST.P391.IO2</code>. 
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> IO2 = createParameter("IO2", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * The parameter <code>TEST.P391.I2</code>. 
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> I2 = createParameter("I2", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * Create a new routine call instance
	 */
	public P391() {
		super("P391", org.jooq.test.oracle.generatedclasses.test.Test.TEST);

		addInParameter(I1);
		addInOutParameter(IO1);
		addOutParameter(O1);
		addOutParameter(O2);
		addInOutParameter(IO2);
		addInParameter(I2);
	}

	/**
	 * Set the <code>I1</code> parameter IN value to the routine
	 */
	public void setI1(java.lang.Number value) {
		setNumber(org.jooq.test.oracle.generatedclasses.test.routines.P391.I1, value);
	}

	/**
	 * Set the <code>IO1</code> parameter IN value to the routine
	 */
	public void setIo1(java.lang.Number value) {
		setNumber(org.jooq.test.oracle.generatedclasses.test.routines.P391.IO1, value);
	}

	/**
	 * Set the <code>IO2</code> parameter IN value to the routine
	 */
	public void setIo2(java.lang.Number value) {
		setNumber(org.jooq.test.oracle.generatedclasses.test.routines.P391.IO2, value);
	}

	/**
	 * Set the <code>I2</code> parameter IN value to the routine
	 */
	public void setI2(java.lang.Number value) {
		setNumber(org.jooq.test.oracle.generatedclasses.test.routines.P391.I2, value);
	}

	/**
	 * Get the <code>IO1</code> parameter OUT value from the routine
	 */
	public java.math.BigDecimal getIo1() {
		return getValue(IO1);
	}

	/**
	 * Get the <code>O1</code> parameter OUT value from the routine
	 */
	public java.math.BigDecimal getO1() {
		return getValue(O1);
	}

	/**
	 * Get the <code>O2</code> parameter OUT value from the routine
	 */
	public java.math.BigDecimal getO2() {
		return getValue(O2);
	}

	/**
	 * Get the <code>IO2</code> parameter OUT value from the routine
	 */
	public java.math.BigDecimal getIo2() {
		return getValue(IO2);
	}
}
