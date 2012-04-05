/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.cubrid.demodb.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "record", schema = "PUBLIC", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"host_year", "event_code", "athlete_code", "medal"})
})
public class Record implements java.io.Serializable {

	private static final long serialVersionUID = 182628481;

	private java.lang.Integer hostYear;
	private java.lang.Integer eventCode;
	private java.lang.Integer athleteCode;
	private java.lang.String  medal;
	private java.lang.String  score;
	private java.lang.String  unit;

	@javax.persistence.Column(name = "host_year", nullable = false)
	public java.lang.Integer getHostYear() {
		return this.hostYear;
	}

	public void setHostYear(java.lang.Integer hostYear) {
		this.hostYear = hostYear;
	}

	@javax.persistence.Column(name = "event_code", nullable = false)
	public java.lang.Integer getEventCode() {
		return this.eventCode;
	}

	public void setEventCode(java.lang.Integer eventCode) {
		this.eventCode = eventCode;
	}

	@javax.persistence.Column(name = "athlete_code", nullable = false)
	public java.lang.Integer getAthleteCode() {
		return this.athleteCode;
	}

	public void setAthleteCode(java.lang.Integer athleteCode) {
		this.athleteCode = athleteCode;
	}

	@javax.persistence.Column(name = "medal", nullable = false, length = 1)
	public java.lang.String getMedal() {
		return this.medal;
	}

	public void setMedal(java.lang.String medal) {
		this.medal = medal;
	}

	@javax.persistence.Column(name = "score", precision = 20)
	public java.lang.String getScore() {
		return this.score;
	}

	public void setScore(java.lang.String score) {
		this.score = score;
	}

	@javax.persistence.Column(name = "unit", precision = 5)
	public java.lang.String getUnit() {
		return this.unit;
	}

	public void setUnit(java.lang.String unit) {
		this.unit = unit;
	}
}