/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "V_LIBRARY", schema = "TEST")
public class VLibrary implements java.io.Serializable {

	private static final long serialVersionUID = -1620481067;

	private java.lang.String author;
	private java.lang.String title;

	@javax.persistence.Column(name = "AUTHOR", length = 101)
	public java.lang.String getAuthor() {
		return this.author;
	}

	public void setAuthor(java.lang.String author) {
		this.author = author;
	}

	@javax.persistence.Column(name = "TITLE", nullable = false, length = 400)
	public java.lang.String getTitle() {
		return this.title;
	}

	public void setTitle(java.lang.String title) {
		this.title = title;
	}
}
