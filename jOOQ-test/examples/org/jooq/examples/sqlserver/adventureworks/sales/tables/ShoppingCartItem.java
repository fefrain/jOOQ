/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables;

/**
 * This class is generated by jOOQ.
 */
public class ShoppingCartItem extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ShoppingCartItem> {

	private static final long serialVersionUID = -1055336843;

	/**
	 * The singleton instance of Sales.ShoppingCartItem
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.sales.tables.ShoppingCartItem ShoppingCartItem = new org.jooq.examples.sqlserver.adventureworks.sales.tables.ShoppingCartItem();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ShoppingCartItem> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ShoppingCartItem.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ShoppingCartItem> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ShoppingCartItem, java.lang.Integer> ShoppingCartItemID = createField("ShoppingCartItemID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ShoppingCartItem, java.lang.String> ShoppingCartID = createField("ShoppingCartID", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ShoppingCartItem, java.lang.Integer> Quantity = createField("Quantity", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_ShoppingCartItem_Product_ProductID
	 * FOREIGN KEY (ProductID)
	 * REFERENCES Production.Product (ProductID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ShoppingCartItem, java.lang.Integer> ProductID = createField("ProductID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ShoppingCartItem, java.sql.Timestamp> DateCreated = createField("DateCreated", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ShoppingCartItem, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	public ShoppingCartItem() {
		super("ShoppingCartItem", org.jooq.examples.sqlserver.adventureworks.sales.Sales.Sales);
	}

	public ShoppingCartItem(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.sales.Sales.Sales, org.jooq.examples.sqlserver.adventureworks.sales.tables.ShoppingCartItem.ShoppingCartItem);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ShoppingCartItem, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.sales.Keys.IDENTITY_ShoppingCartItem;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ShoppingCartItem> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_ShoppingCartItem_ShoppingCartItemID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ShoppingCartItem>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ShoppingCartItem>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_ShoppingCartItem_ShoppingCartItemID);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ShoppingCartItem, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ShoppingCartItem, ?>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_ShoppingCartItem_Product_ProductID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.sales.tables.ShoppingCartItem as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.sales.tables.ShoppingCartItem(alias);
	}
}
