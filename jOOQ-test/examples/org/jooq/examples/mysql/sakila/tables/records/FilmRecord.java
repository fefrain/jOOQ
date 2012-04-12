/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class FilmRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.FilmRecord> {

	private static final long serialVersionUID = 572677983;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setFilmId(java.lang.Short value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Film.FILM.FILM_ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Short getFilmId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Film.FILM.FILM_ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord> fetchFilmActorList() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.FilmActor.FILM_ACTOR)
			.where(org.jooq.examples.mysql.sakila.tables.FilmActor.FILM_ACTOR.FILM_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Film.FILM.FILM_ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.examples.mysql.sakila.tables.records.FilmCategoryRecord> fetchFilmCategoryList() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.FilmCategory.FILM_CATEGORY)
			.where(org.jooq.examples.mysql.sakila.tables.FilmCategory.FILM_CATEGORY.FILM_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Film.FILM.FILM_ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.examples.mysql.sakila.tables.records.InventoryRecord> fetchInventoryList() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Inventory.INVENTORY)
			.where(org.jooq.examples.mysql.sakila.tables.Inventory.INVENTORY.FILM_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Film.FILM.FILM_ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Film.FILM.TITLE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getTitle() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Film.FILM.TITLE);
	}

	/**
	 * An uncommented item
	 */
	public void setDescription(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Film.FILM.DESCRIPTION, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getDescription() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Film.FILM.DESCRIPTION);
	}

	/**
	 * An uncommented item
	 */
	public void setReleaseYear(java.sql.Date value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Film.FILM.RELEASE_YEAR, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Date getReleaseYear() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Film.FILM.RELEASE_YEAR);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_film_language
	 * FOREIGN KEY (language_id)
	 * REFERENCES sakila.language (language_id)
	 * </pre></code>
	 */
	public void setLanguageId(java.lang.Byte value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Film.FILM.LANGUAGE_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_film_language
	 * FOREIGN KEY (language_id)
	 * REFERENCES sakila.language (language_id)
	 * </pre></code>
	 */
	public java.lang.Byte getLanguageId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Film.FILM.LANGUAGE_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_film_language
	 * FOREIGN KEY (language_id)
	 * REFERENCES sakila.language (language_id)
	 * </pre></code>
	 */
	public org.jooq.examples.mysql.sakila.tables.records.LanguageRecord fetchLanguageByLanguageId() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Language.LANGUAGE)
			.where(org.jooq.examples.mysql.sakila.tables.Language.LANGUAGE.LANGUAGE_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Film.FILM.LANGUAGE_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_film_language_original
	 * FOREIGN KEY (original_language_id)
	 * REFERENCES sakila.language (language_id)
	 * </pre></code>
	 */
	public void setOriginalLanguageId(java.lang.Byte value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Film.FILM.ORIGINAL_LANGUAGE_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_film_language_original
	 * FOREIGN KEY (original_language_id)
	 * REFERENCES sakila.language (language_id)
	 * </pre></code>
	 */
	public java.lang.Byte getOriginalLanguageId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Film.FILM.ORIGINAL_LANGUAGE_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_film_language_original
	 * FOREIGN KEY (original_language_id)
	 * REFERENCES sakila.language (language_id)
	 * </pre></code>
	 */
	public org.jooq.examples.mysql.sakila.tables.records.LanguageRecord fetchLanguageByOriginalLanguageId() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Language.LANGUAGE)
			.where(org.jooq.examples.mysql.sakila.tables.Language.LANGUAGE.LANGUAGE_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Film.FILM.ORIGINAL_LANGUAGE_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 */
	public void setRentalDuration(java.lang.Byte value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Film.FILM.RENTAL_DURATION, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Byte getRentalDuration() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Film.FILM.RENTAL_DURATION);
	}

	/**
	 * An uncommented item
	 */
	public void setRentalRate(java.math.BigDecimal value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Film.FILM.RENTAL_RATE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.math.BigDecimal getRentalRate() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Film.FILM.RENTAL_RATE);
	}

	/**
	 * An uncommented item
	 */
	public void setLength(java.lang.Short value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Film.FILM.LENGTH, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Short getLength() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Film.FILM.LENGTH);
	}

	/**
	 * An uncommented item
	 */
	public void setReplacementCost(java.math.BigDecimal value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Film.FILM.REPLACEMENT_COST, value);
	}

	/**
	 * An uncommented item
	 */
	public java.math.BigDecimal getReplacementCost() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Film.FILM.REPLACEMENT_COST);
	}

	/**
	 * An uncommented item
	 */
	public void setRating(org.jooq.examples.mysql.sakila.enums.FilmRating value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Film.FILM.RATING, value);
	}

	/**
	 * An uncommented item
	 */
	public org.jooq.examples.mysql.sakila.enums.FilmRating getRating() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Film.FILM.RATING);
	}

	/**
	 * An uncommented item
	 */
	public void setSpecialFeatures(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Film.FILM.SPECIAL_FEATURES, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getSpecialFeatures() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Film.FILM.SPECIAL_FEATURES);
	}

	/**
	 * An uncommented item
	 */
	public void setLastUpdate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Film.FILM.LAST_UPDATE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Timestamp getLastUpdate() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Film.FILM.LAST_UPDATE);
	}

	/**
	 * Create a detached FilmRecord
	 */
	public FilmRecord() {
		super(org.jooq.examples.mysql.sakila.tables.Film.FILM);
	}
}
