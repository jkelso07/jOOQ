/**
 * This class is generated by jOOQ
 */
package org.jooq.util.cubrid.dba.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.2.0"},
                            comments = "This class is generated by jOOQ")
public class DbIndexKey extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -1653020162;

	/**
	 * The singleton instance of DBA.db_index_key
	 */
	public static final org.jooq.util.cubrid.dba.tables.DbIndexKey DB_INDEX_KEY = new org.jooq.util.cubrid.dba.tables.DbIndexKey();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.Record> __RECORD_TYPE = org.jooq.Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> INDEX_NAME = createField("index_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CLASS_NAME = createField("class_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> KEY_ATTR_NAME = createField("key_attr_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> KEY_ORDER = createField("key_order", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> ASC_DESC = createField("asc_desc", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> KEY_PREFIX_LENGTH = createField("key_prefix_length", org.jooq.impl.SQLDataType.INTEGER, this);

	public DbIndexKey() {
		super("db_index_key", org.jooq.util.cubrid.dba.Dba.DBA);
	}

	public DbIndexKey(java.lang.String alias) {
		super(alias, org.jooq.util.cubrid.dba.Dba.DBA, org.jooq.util.cubrid.dba.tables.DbIndexKey.DB_INDEX_KEY);
	}

	@Override
	public org.jooq.util.cubrid.dba.tables.DbIndexKey as(java.lang.String alias) {
		return new org.jooq.util.cubrid.dba.tables.DbIndexKey(alias);
	}
}
