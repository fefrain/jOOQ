/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "T_639_NUMBERS_TABLE", schema = "TEST")
public class T_639_NUMBERS_TABLE_POJO extends java.lang.ThreadDeath implements java.lang.Cloneable {

	private static final long serialVersionUID = 1155928586;

	private java.lang.Integer    ID;
	private java.lang.Byte       BYTE;
	private java.lang.Short      SHORT;
	private java.lang.Integer    INTEGER;
	private java.lang.Long       LONG;
	private java.lang.Byte       BYTE_DECIMAL;
	private java.lang.Short      SHORT_DECIMAL;
	private java.lang.Integer    INTEGER_DECIMAL;
	private java.lang.Long       LONG_DECIMAL;
	private java.math.BigInteger BIG_INTEGER;
	private java.math.BigDecimal BIG_DECIMAL;

	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getID() {
		return this.ID;
	}

	public void setID(java.lang.Integer ID) {
		this.ID = ID;
	}

	@javax.persistence.Column(name = "BYTE", precision = 2)
	public java.lang.Byte getBYTE() {
		return this.BYTE;
	}

	public void setBYTE(java.lang.Byte BYTE) {
		this.BYTE = BYTE;
	}

	@javax.persistence.Column(name = "SHORT", precision = 4)
	public java.lang.Short getSHORT() {
		return this.SHORT;
	}

	public void setSHORT(java.lang.Short SHORT) {
		this.SHORT = SHORT;
	}

	@javax.persistence.Column(name = "INTEGER", precision = 7)
	public java.lang.Integer getINTEGER() {
		return this.INTEGER;
	}

	public void setINTEGER(java.lang.Integer INTEGER) {
		this.INTEGER = INTEGER;
	}

	@javax.persistence.Column(name = "LONG", precision = 18)
	public java.lang.Long getLONG() {
		return this.LONG;
	}

	public void setLONG(java.lang.Long LONG) {
		this.LONG = LONG;
	}

	@javax.persistence.Column(name = "BYTE_DECIMAL", precision = 2)
	public java.lang.Byte getBYTE_DECIMAL() {
		return this.BYTE_DECIMAL;
	}

	public void setBYTE_DECIMAL(java.lang.Byte BYTE_DECIMAL) {
		this.BYTE_DECIMAL = BYTE_DECIMAL;
	}

	@javax.persistence.Column(name = "SHORT_DECIMAL", precision = 4)
	public java.lang.Short getSHORT_DECIMAL() {
		return this.SHORT_DECIMAL;
	}

	public void setSHORT_DECIMAL(java.lang.Short SHORT_DECIMAL) {
		this.SHORT_DECIMAL = SHORT_DECIMAL;
	}

	@javax.persistence.Column(name = "INTEGER_DECIMAL", precision = 9)
	public java.lang.Integer getINTEGER_DECIMAL() {
		return this.INTEGER_DECIMAL;
	}

	public void setINTEGER_DECIMAL(java.lang.Integer INTEGER_DECIMAL) {
		this.INTEGER_DECIMAL = INTEGER_DECIMAL;
	}

	@javax.persistence.Column(name = "LONG_DECIMAL", precision = 18)
	public java.lang.Long getLONG_DECIMAL() {
		return this.LONG_DECIMAL;
	}

	public void setLONG_DECIMAL(java.lang.Long LONG_DECIMAL) {
		this.LONG_DECIMAL = LONG_DECIMAL;
	}

	@javax.persistence.Column(name = "BIG_INTEGER", precision = 22)
	public java.math.BigInteger getBIG_INTEGER() {
		return this.BIG_INTEGER;
	}

	public void setBIG_INTEGER(java.math.BigInteger BIG_INTEGER) {
		this.BIG_INTEGER = BIG_INTEGER;
	}

	@javax.persistence.Column(name = "BIG_DECIMAL", precision = 22, scale = 5)
	public java.math.BigDecimal getBIG_DECIMAL() {
		return this.BIG_DECIMAL;
	}

	public void setBIG_DECIMAL(java.math.BigDecimal BIG_DECIMAL) {
		this.BIG_DECIMAL = BIG_DECIMAL;
	}
}
