/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.information_schema.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.5.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TablesRecord extends org.jooq.impl.TableRecordImpl<org.jooq.example.gradle.db.information_schema.tables.records.TablesRecord> implements org.jooq.Record12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Long> {

	private static final long serialVersionUID = -2010965577;

	/**
	 * Setter for <code>INFORMATION_SCHEMA.TABLES.TABLE_CATALOG</code>.
	 */
	public void setTableCatalog(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.TABLES.TABLE_CATALOG</code>.
	 */
	public java.lang.String getTableCatalog() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.TABLES.TABLE_SCHEMA</code>.
	 */
	public void setTableSchema(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.TABLES.TABLE_SCHEMA</code>.
	 */
	public java.lang.String getTableSchema() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.TABLES.TABLE_NAME</code>.
	 */
	public void setTableName(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.TABLES.TABLE_NAME</code>.
	 */
	public java.lang.String getTableName() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.TABLES.TABLE_TYPE</code>.
	 */
	public void setTableType(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.TABLES.TABLE_TYPE</code>.
	 */
	public java.lang.String getTableType() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.TABLES.STORAGE_TYPE</code>.
	 */
	public void setStorageType(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.TABLES.STORAGE_TYPE</code>.
	 */
	public java.lang.String getStorageType() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.TABLES.SQL</code>.
	 */
	public void setSql(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.TABLES.SQL</code>.
	 */
	public java.lang.String getSql() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.TABLES.REMARKS</code>.
	 */
	public void setRemarks(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.TABLES.REMARKS</code>.
	 */
	public java.lang.String getRemarks() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.TABLES.LAST_MODIFICATION</code>.
	 */
	public void setLastModification(java.lang.Long value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.TABLES.LAST_MODIFICATION</code>.
	 */
	public java.lang.Long getLastModification() {
		return (java.lang.Long) getValue(7);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.TABLES.ID</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.TABLES.ID</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(8);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.TABLES.TYPE_NAME</code>.
	 */
	public void setTypeName(java.lang.String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.TABLES.TYPE_NAME</code>.
	 */
	public java.lang.String getTypeName() {
		return (java.lang.String) getValue(9);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.TABLES.TABLE_CLASS</code>.
	 */
	public void setTableClass(java.lang.String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.TABLES.TABLE_CLASS</code>.
	 */
	public java.lang.String getTableClass() {
		return (java.lang.String) getValue(10);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.TABLES.ROW_COUNT_ESTIMATE</code>.
	 */
	public void setRowCountEstimate(java.lang.Long value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.TABLES.ROW_COUNT_ESTIMATE</code>.
	 */
	public java.lang.Long getRowCountEstimate() {
		return (java.lang.Long) getValue(11);
	}

	// -------------------------------------------------------------------------
	// Record12 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Long> fieldsRow() {
		return (org.jooq.Row12) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Long> valuesRow() {
		return (org.jooq.Row12) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.jooq.example.gradle.db.information_schema.tables.Tables.TABLES.TABLE_CATALOG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.example.gradle.db.information_schema.tables.Tables.TABLES.TABLE_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.example.gradle.db.information_schema.tables.Tables.TABLES.TABLE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.jooq.example.gradle.db.information_schema.tables.Tables.TABLES.TABLE_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.jooq.example.gradle.db.information_schema.tables.Tables.TABLES.STORAGE_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return org.jooq.example.gradle.db.information_schema.tables.Tables.TABLES.SQL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return org.jooq.example.gradle.db.information_schema.tables.Tables.TABLES.REMARKS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field8() {
		return org.jooq.example.gradle.db.information_schema.tables.Tables.TABLES.LAST_MODIFICATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field9() {
		return org.jooq.example.gradle.db.information_schema.tables.Tables.TABLES.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field10() {
		return org.jooq.example.gradle.db.information_schema.tables.Tables.TABLES.TYPE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field11() {
		return org.jooq.example.gradle.db.information_schema.tables.Tables.TABLES.TABLE_CLASS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field12() {
		return org.jooq.example.gradle.db.information_schema.tables.Tables.TABLES.ROW_COUNT_ESTIMATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getTableCatalog();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getTableSchema();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getTableName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getTableType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getStorageType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getSql();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getRemarks();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value8() {
		return getLastModification();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value9() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value10() {
		return getTypeName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value11() {
		return getTableClass();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value12() {
		return getRowCountEstimate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablesRecord value1(java.lang.String value) {
		setTableCatalog(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablesRecord value2(java.lang.String value) {
		setTableSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablesRecord value3(java.lang.String value) {
		setTableName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablesRecord value4(java.lang.String value) {
		setTableType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablesRecord value5(java.lang.String value) {
		setStorageType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablesRecord value6(java.lang.String value) {
		setSql(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablesRecord value7(java.lang.String value) {
		setRemarks(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablesRecord value8(java.lang.Long value) {
		setLastModification(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablesRecord value9(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablesRecord value10(java.lang.String value) {
		setTypeName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablesRecord value11(java.lang.String value) {
		setTableClass(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablesRecord value12(java.lang.Long value) {
		setRowCountEstimate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablesRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.lang.String value6, java.lang.String value7, java.lang.Long value8, java.lang.Integer value9, java.lang.String value10, java.lang.String value11, java.lang.Long value12) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TablesRecord
	 */
	public TablesRecord() {
		super(org.jooq.example.gradle.db.information_schema.tables.Tables.TABLES);
	}

	/**
	 * Create a detached, initialised TablesRecord
	 */
	public TablesRecord(java.lang.String tableCatalog, java.lang.String tableSchema, java.lang.String tableName, java.lang.String tableType, java.lang.String storageType, java.lang.String sql, java.lang.String remarks, java.lang.Long lastModification, java.lang.Integer id, java.lang.String typeName, java.lang.String tableClass, java.lang.Long rowCountEstimate) {
		super(org.jooq.example.gradle.db.information_schema.tables.Tables.TABLES);

		setValue(0, tableCatalog);
		setValue(1, tableSchema);
		setValue(2, tableName);
		setValue(3, tableType);
		setValue(4, storageType);
		setValue(5, sql);
		setValue(6, remarks);
		setValue(7, lastModification);
		setValue(8, id);
		setValue(9, typeName);
		setValue(10, tableClass);
		setValue(11, rowCountEstimate);
	}
}
