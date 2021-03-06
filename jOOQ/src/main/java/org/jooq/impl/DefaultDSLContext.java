/**
 * Copyright (c) 2009-2013, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * This software is licensed to you under the Apache License, Version 2.0
 * (the "License"); You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * . Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * . Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * . Neither the name "jOOQ" nor the names of its contributors may be
 *   used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package org.jooq.impl;

import static org.jooq.conf.ParamType.INLINED;
import static org.jooq.conf.ParamType.NAMED;
import static org.jooq.impl.DSL.field;
import static org.jooq.impl.DSL.fieldByName;
import static org.jooq.impl.DSL.trueCondition;
import static org.jooq.impl.Utils.list;

import java.io.IOException;
import java.io.Serializable;
import java.io.StringReader;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;
import javax.sql.DataSource;

import org.jooq.Attachable;
import org.jooq.Batch;
import org.jooq.BatchBindStep;
import org.jooq.BindContext;
import org.jooq.Condition;
import org.jooq.Configuration;
import org.jooq.ConnectionProvider;
import org.jooq.Cursor;
import org.jooq.DSLContext;
import org.jooq.DataType;
import org.jooq.DeleteQuery;
import org.jooq.DeleteWhereStep;
import org.jooq.ExecuteContext;
import org.jooq.ExecuteListener;
import org.jooq.Field;
import org.jooq.InsertQuery;
import org.jooq.InsertSetStep;
import org.jooq.InsertValuesStep1;
import org.jooq.InsertValuesStep10;
import org.jooq.InsertValuesStep11;
import org.jooq.InsertValuesStep12;
import org.jooq.InsertValuesStep13;
import org.jooq.InsertValuesStep14;
import org.jooq.InsertValuesStep15;
import org.jooq.InsertValuesStep16;
import org.jooq.InsertValuesStep17;
import org.jooq.InsertValuesStep18;
import org.jooq.InsertValuesStep19;
import org.jooq.InsertValuesStep2;
import org.jooq.InsertValuesStep20;
import org.jooq.InsertValuesStep21;
import org.jooq.InsertValuesStep22;
import org.jooq.InsertValuesStep3;
import org.jooq.InsertValuesStep4;
import org.jooq.InsertValuesStep5;
import org.jooq.InsertValuesStep6;
import org.jooq.InsertValuesStep7;
import org.jooq.InsertValuesStep8;
import org.jooq.InsertValuesStep9;
import org.jooq.InsertValuesStepN;
import org.jooq.LoaderOptionsStep;
import org.jooq.MergeKeyStep1;
import org.jooq.MergeKeyStep10;
import org.jooq.MergeKeyStep11;
import org.jooq.MergeKeyStep12;
import org.jooq.MergeKeyStep13;
import org.jooq.MergeKeyStep14;
import org.jooq.MergeKeyStep15;
import org.jooq.MergeKeyStep16;
import org.jooq.MergeKeyStep17;
import org.jooq.MergeKeyStep18;
import org.jooq.MergeKeyStep19;
import org.jooq.MergeKeyStep2;
import org.jooq.MergeKeyStep20;
import org.jooq.MergeKeyStep21;
import org.jooq.MergeKeyStep22;
import org.jooq.MergeKeyStep3;
import org.jooq.MergeKeyStep4;
import org.jooq.MergeKeyStep5;
import org.jooq.MergeKeyStep6;
import org.jooq.MergeKeyStep7;
import org.jooq.MergeKeyStep8;
import org.jooq.MergeKeyStep9;
import org.jooq.MergeKeyStepN;
import org.jooq.MergeUsingStep;
import org.jooq.Meta;
import org.jooq.Param;
import org.jooq.Query;
import org.jooq.QueryPart;
import org.jooq.Record;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Record11;
import org.jooq.Record12;
import org.jooq.Record13;
import org.jooq.Record14;
import org.jooq.Record15;
import org.jooq.Record16;
import org.jooq.Record17;
import org.jooq.Record18;
import org.jooq.Record19;
import org.jooq.Record2;
import org.jooq.Record20;
import org.jooq.Record21;
import org.jooq.Record22;
import org.jooq.Record3;
import org.jooq.Record4;
import org.jooq.Record5;
import org.jooq.Record6;
import org.jooq.Record7;
import org.jooq.Record8;
import org.jooq.Record9;
import org.jooq.RenderContext;
import org.jooq.Result;
import org.jooq.ResultQuery;
import org.jooq.SQLDialect;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.SelectQuery;
import org.jooq.SelectSelectStep;
import org.jooq.SelectWhereStep;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.TableLike;
import org.jooq.TableRecord;
import org.jooq.TruncateIdentityStep;
import org.jooq.UDT;
import org.jooq.UDTRecord;
import org.jooq.UpdatableRecord;
import org.jooq.UpdateQuery;
import org.jooq.UpdateSetFirstStep;
import org.jooq.conf.Settings;
import org.jooq.exception.DataAccessException;
import org.jooq.exception.InvalidResultException;
import org.jooq.exception.SQLDialectNotSupportedException;
import org.jooq.impl.BatchCRUD.Action;
import org.jooq.tools.csv.CSVReader;

/**
 * @author Lukas Eder
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
public class DefaultDSLContext implements DSLContext, Serializable {

    /**
     * Generated UID
     */
    private static final long   serialVersionUID = 2681360188806309513L;
    private final Configuration configuration;

    // -------------------------------------------------------------------------
    // XXX Constructors
    // -------------------------------------------------------------------------

    public DefaultDSLContext(SQLDialect dialect) {
        this(dialect, null);
    }

    public DefaultDSLContext(SQLDialect dialect, Settings settings) {
        this(new DefaultConfiguration(new NoConnectionProvider(), null, null, dialect, settings, null));
    }

    public DefaultDSLContext(Connection connection, SQLDialect dialect) {
        this(connection, dialect, null);
    }

    public DefaultDSLContext(Connection connection, SQLDialect dialect, Settings settings) {
        this(new DefaultConfiguration(new DefaultConnectionProvider(connection), null, null, dialect, settings, null));
    }

    public DefaultDSLContext(DataSource datasource, SQLDialect dialect) {
        this(datasource, dialect, null);
    }

    public DefaultDSLContext(DataSource datasource, SQLDialect dialect, Settings settings) {
        this(new DefaultConfiguration(new DataSourceConnectionProvider(datasource), null, null, dialect, settings, null));
    }

    public DefaultDSLContext(ConnectionProvider connectionProvider, SQLDialect dialect) {
        this(connectionProvider, dialect, null);
    }

    public DefaultDSLContext(ConnectionProvider connectionProvider, SQLDialect dialect, Settings settings) {
        this(new DefaultConfiguration(connectionProvider, null, null, dialect, settings, null));
    }

    public DefaultDSLContext(Configuration configuration) {

        // The Configuration can be null when unattached Query objects are
        // executed or when unattached Records are stored...
        if (configuration == null) {
            configuration = new DefaultConfiguration();
        }

        this.configuration = configuration;
    }

    // -------------------------------------------------------------------------
    // XXX Configuration API
    // -------------------------------------------------------------------------

    @Override
    public Configuration configuration() {
        return configuration;
    }

    @Override
    public Schema map(Schema schema) {
        return Utils.getMappedSchema(configuration, schema);
    }

    @Override
    public <R extends Record> Table<R> map(Table<R> table) {
        return Utils.getMappedTable(configuration, table);
    }

    // -------------------------------------------------------------------------
    // XXX Convenience methods accessing the underlying Connection
    // -------------------------------------------------------------------------

    @Override
    public Meta meta() {
        return new MetaImpl(configuration);
    }

    // -------------------------------------------------------------------------
    // XXX RenderContext and BindContext accessors
    // -------------------------------------------------------------------------

    @Override
    public RenderContext renderContext() {
        return new DefaultRenderContext(configuration);
    }

    @Override
    public String render(QueryPart part) {
        return renderContext().render(part);
    }

    @Override
    public String renderNamedParams(QueryPart part) {
        return renderContext().paramType(NAMED).render(part);
    }

    @Override
    public String renderInlined(QueryPart part) {
        return renderContext().paramType(INLINED).render(part);
    }

    @Override
    public List<Object> extractBindValues(QueryPart part) {
        List<Object> result = new ArrayList<Object>();

        for (Param<?> param : extractParams(part).values()) {
            result.add(param.getValue());
        }

        return Collections.unmodifiableList(result);
    }

    @Override
    public Map<String, Param<?>> extractParams(QueryPart part) {
        ParamCollector collector = new ParamCollector(configuration);
        collector.bind(part);
        return Collections.unmodifiableMap(collector.result);
    }

    @Override
    public Param<?> extractParam(QueryPart part, String name) {
        return extractParams(part).get(name);
    }

    @Override
    public BindContext bindContext(PreparedStatement stmt) {
        return new DefaultBindContext(configuration, stmt);
    }

    @Override
    public int bind(QueryPart part, PreparedStatement stmt) {
        return bindContext(stmt).bind(part).peekIndex();
    }

    // -------------------------------------------------------------------------
    // XXX Attachable and Serializable API
    // -------------------------------------------------------------------------

    @Override
    public void attach(Attachable... attachables) {
        attach(Arrays.asList(attachables));
    }

    @Override
    public void attach(Collection<? extends Attachable> attachables) {
        for (Attachable attachable : attachables) {
            attachable.attach(configuration);
        }
    }

    // -------------------------------------------------------------------------
    // XXX Access to the loader API
    // -------------------------------------------------------------------------

    @Override
    public <R extends TableRecord<R>> LoaderOptionsStep<R> loadInto(Table<R> table) {
        return new LoaderImpl<R>(configuration, table);
    }

    @Override
    public Query query(String sql) {
        return query(sql, new Object[0]);
    }

    @Override
    public Query query(String sql, Object... bindings) {
        return new SQLQuery(configuration, sql, bindings);
    }

    @Override
    public Query query(String sql, QueryPart... parts) {
        return new SQLQuery(configuration, sql, parts);
    }

    @Override
    public Result<Record> fetch(String sql) throws DataAccessException {
        return resultQuery(sql).fetch();
    }

    @Override
    public Result<Record> fetch(String sql, Object... bindings) throws DataAccessException {
        return resultQuery(sql, bindings).fetch();
    }

    @Override
    public Result<Record> fetch(String sql, QueryPart... parts) throws DataAccessException {
        return resultQuery(sql, parts).fetch();
    }

    @Override
    public Cursor<Record> fetchLazy(String sql) throws DataAccessException {
        return resultQuery(sql).fetchLazy();
    }

    @Override
    public Cursor<Record> fetchLazy(String sql, Object... bindings) throws DataAccessException {
        return resultQuery(sql, bindings).fetchLazy();
    }

    @Override
    public Cursor<Record> fetchLazy(String sql, QueryPart... parts) throws DataAccessException {
        return resultQuery(sql, parts).fetchLazy();
    }

    @Override
    public List<Result<Record>> fetchMany(String sql) throws DataAccessException {
        return resultQuery(sql).fetchMany();
    }

    @Override
    public List<Result<Record>> fetchMany(String sql, Object... bindings) throws DataAccessException {
        return resultQuery(sql, bindings).fetchMany();
    }

    @Override
    public List<Result<Record>> fetchMany(String sql, QueryPart... parts) throws DataAccessException {
        return resultQuery(sql, parts).fetchMany();
    }

    @Override
    public Record fetchOne(String sql) throws DataAccessException, InvalidResultException {
        return resultQuery(sql).fetchOne();
    }

    @Override
    public Record fetchOne(String sql, Object... bindings) throws DataAccessException, InvalidResultException {
        return resultQuery(sql, bindings).fetchOne();
    }

    @Override
    public Record fetchOne(String sql, QueryPart... parts) throws DataAccessException, InvalidResultException {
        return resultQuery(sql, parts).fetchOne();
    }

    @Override
    public int execute(String sql) throws DataAccessException {
        return query(sql).execute();
    }

    @Override
    public int execute(String sql, Object... bindings) throws DataAccessException {
        return query(sql, bindings).execute();
    }

    @Override
    public int execute(String sql, QueryPart... parts) throws DataAccessException {
        return query(sql, parts).execute();
    }

    @Override
    public ResultQuery<Record> resultQuery(String sql) {
        return resultQuery(sql, new Object[0]);
    }

    @Override
    public ResultQuery<Record> resultQuery(String sql, Object... bindings) {
        return new SQLResultQuery(configuration, sql, bindings);
    }

    @Override
    public ResultQuery<Record> resultQuery(String sql, QueryPart... parts) {
        return new SQLResultQuery(configuration, sql, parts);
    }

    // -------------------------------------------------------------------------
    // XXX JDBC convenience methods
    // -------------------------------------------------------------------------

    @Override
    public Result<Record> fetch(ResultSet rs) throws DataAccessException {
        return fetchLazy(rs).fetch();
    }

    @Override
    public Result<Record> fetch(ResultSet rs, Field<?>... fields) throws DataAccessException {
        return fetchLazy(rs, fields).fetch();
    }

    @Override
    public Result<Record> fetch(ResultSet rs, DataType<?>... types) throws DataAccessException {
        return fetchLazy(rs, types).fetch();
    }

    @Override
    public Result<Record> fetch(ResultSet rs, Class<?>... types) throws DataAccessException {
        return fetchLazy(rs, types).fetch();
    }

    @Override
    public Record fetchOne(ResultSet rs) throws DataAccessException, InvalidResultException {
        return Utils.fetchOne(fetchLazy(rs));
    }

    @Override
    public Record fetchOne(ResultSet rs, Field<?>... fields) throws DataAccessException, InvalidResultException {
        return Utils.fetchOne(fetchLazy(rs, fields));
    }

    @Override
    public Record fetchOne(ResultSet rs, DataType<?>... types) throws DataAccessException, InvalidResultException {
        return Utils.fetchOne(fetchLazy(rs, types));
    }

    @Override
    public Record fetchOne(ResultSet rs, Class<?>... types) throws DataAccessException, InvalidResultException {
        return Utils.fetchOne(fetchLazy(rs, types));
    }

    @Override
    public Cursor<Record> fetchLazy(ResultSet rs) throws DataAccessException {
        try {
            return fetchLazy(rs, new MetaDataFieldProvider(configuration, rs.getMetaData()).getFields());
        }
        catch (SQLException e) {
            throw new DataAccessException("Error while accessing ResultSet meta data", e);
        }
    }

    @Override
    public Cursor<Record> fetchLazy(ResultSet rs, Field<?>... fields) throws DataAccessException {
        ExecuteContext ctx = new DefaultExecuteContext(configuration);
        ExecuteListener listener = new ExecuteListeners(ctx);

        ctx.resultSet(rs);
        return new CursorImpl<Record>(ctx, listener, fields, null, false, true);
    }

    @Override
    public Cursor<Record> fetchLazy(ResultSet rs, DataType<?>... types) throws DataAccessException {
        try {
            Field<?>[] fields = new Field[types.length];
            ResultSetMetaData meta = rs.getMetaData();
            int columns = meta.getColumnCount();

            for (int i = 0; i < types.length && i < columns; i++) {
                fields[i] = field(meta.getColumnLabel(i + 1), types[i]);
            }

            return fetchLazy(rs, fields);
        }
        catch (SQLException e) {
            throw new DataAccessException("Error while accessing ResultSet meta data", e);
        }
    }

    @Override
    public Cursor<Record> fetchLazy(ResultSet rs, Class<?>... types) throws DataAccessException {
        return fetchLazy(rs, Utils.getDataTypes(types));
    }

    @Override
    public Result<Record> fetchFromTXT(String string) throws DataAccessException {
        return fetchFromTXT(string, "{null}");
    }

    @Override
    public Result<Record> fetchFromTXT(String string, String nullLiteral) throws DataAccessException {
        return fetchFromStringData(Utils.parseTXT(string, nullLiteral));
    }

    @Override
    public Result<Record> fetchFromCSV(String string) throws DataAccessException {
        return fetchFromCSV(string, ',');
    }

    @Override
    public Result<Record> fetchFromCSV(String string, char delimiter) throws DataAccessException {
        CSVReader reader = new CSVReader(new StringReader(string), delimiter);
        List<String[]> data = null;

        try {
            data = reader.readAll();
        }
        catch (IOException e) {
            throw new DataAccessException("Could not read the CSV string", e);
        }
        finally {
            try {
                reader.close();
            }
            catch (IOException ignore) {}
        }

        return fetchFromStringData(data);
    }

    @Override
    public Result<Record> fetchFromStringData(String[]... data) {
        return fetchFromStringData(list(data));
    }

    @Override
    public Result<Record> fetchFromStringData(List<String[]> data) {
        if (data.size() == 0) {
            return new ResultImpl<Record>(configuration);
        }
        else {
            List<Field<?>> fields = new ArrayList<Field<?>>();

            for (String name : data.get(0)) {
                fields.add(fieldByName(String.class, name));
            }

            Result<Record> result = new ResultImpl<Record>(configuration, fields);

            if (data.size() > 1) {
                for (String[] values : data.subList(1, data.size())) {
                    RecordImpl record = new RecordImpl(fields);

                    for (int i = 0; i < Math.min(values.length, fields.size()); i++) {
                        record.setValue(i, new Value<Object>(values[i]));
                    }

                    result.add(record);
                }
            }

            return result;
        }
    }

    // -------------------------------------------------------------------------
    // XXX Global Query factory
    // -------------------------------------------------------------------------

    @Override
    public <R extends Record> SelectWhereStep<R> selectFrom(Table<R> table) {
        SelectWhereStep<R> result = DSL.selectFrom(table);
        result.attach(configuration);
        return result;
    }

    @Override
    public SelectSelectStep<Record> select(Collection<? extends Field<?>> fields) {
        SelectSelectStep<Record> result = DSL.select(fields);
        result.attach(configuration);
        return result;
    }

    @Override
    public SelectSelectStep<Record> select(Field<?>... fields) {
        SelectSelectStep<Record> result = DSL.select(fields);
        result.attach(configuration);
        return result;
    }

// [jooq-tools] START [select]

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1> SelectSelectStep<Record1<T1>> select(Field<T1> field1) {
        return (SelectSelectStep) select(new Field[] { field1 });
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1, T2> SelectSelectStep<Record2<T1, T2>> select(Field<T1> field1, Field<T2> field2) {
        return (SelectSelectStep) select(new Field[] { field1, field2 });
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1, T2, T3> SelectSelectStep<Record3<T1, T2, T3>> select(Field<T1> field1, Field<T2> field2, Field<T3> field3) {
        return (SelectSelectStep) select(new Field[] { field1, field2, field3 });
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1, T2, T3, T4> SelectSelectStep<Record4<T1, T2, T3, T4>> select(Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4) {
        return (SelectSelectStep) select(new Field[] { field1, field2, field3, field4 });
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1, T2, T3, T4, T5> SelectSelectStep<Record5<T1, T2, T3, T4, T5>> select(Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5) {
        return (SelectSelectStep) select(new Field[] { field1, field2, field3, field4, field5 });
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1, T2, T3, T4, T5, T6> SelectSelectStep<Record6<T1, T2, T3, T4, T5, T6>> select(Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6) {
        return (SelectSelectStep) select(new Field[] { field1, field2, field3, field4, field5, field6 });
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1, T2, T3, T4, T5, T6, T7> SelectSelectStep<Record7<T1, T2, T3, T4, T5, T6, T7>> select(Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7) {
        return (SelectSelectStep) select(new Field[] { field1, field2, field3, field4, field5, field6, field7 });
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8> SelectSelectStep<Record8<T1, T2, T3, T4, T5, T6, T7, T8>> select(Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8) {
        return (SelectSelectStep) select(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8 });
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9> SelectSelectStep<Record9<T1, T2, T3, T4, T5, T6, T7, T8, T9>> select(Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9) {
        return (SelectSelectStep) select(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8, field9 });
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> SelectSelectStep<Record10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>> select(Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10) {
        return (SelectSelectStep) select(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8, field9, field10 });
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> SelectSelectStep<Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>> select(Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11) {
        return (SelectSelectStep) select(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11 });
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> SelectSelectStep<Record12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>> select(Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12) {
        return (SelectSelectStep) select(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12 });
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> SelectSelectStep<Record13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>> select(Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12, Field<T13> field13) {
        return (SelectSelectStep) select(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13 });
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> SelectSelectStep<Record14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>> select(Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12, Field<T13> field13, Field<T14> field14) {
        return (SelectSelectStep) select(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14 });
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> SelectSelectStep<Record15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>> select(Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12, Field<T13> field13, Field<T14> field14, Field<T15> field15) {
        return (SelectSelectStep) select(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14, field15 });
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> SelectSelectStep<Record16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>> select(Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12, Field<T13> field13, Field<T14> field14, Field<T15> field15, Field<T16> field16) {
        return (SelectSelectStep) select(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14, field15, field16 });
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> SelectSelectStep<Record17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>> select(Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12, Field<T13> field13, Field<T14> field14, Field<T15> field15, Field<T16> field16, Field<T17> field17) {
        return (SelectSelectStep) select(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14, field15, field16, field17 });
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> SelectSelectStep<Record18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>> select(Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12, Field<T13> field13, Field<T14> field14, Field<T15> field15, Field<T16> field16, Field<T17> field17, Field<T18> field18) {
        return (SelectSelectStep) select(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14, field15, field16, field17, field18 });
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> SelectSelectStep<Record19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>> select(Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12, Field<T13> field13, Field<T14> field14, Field<T15> field15, Field<T16> field16, Field<T17> field17, Field<T18> field18, Field<T19> field19) {
        return (SelectSelectStep) select(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14, field15, field16, field17, field18, field19 });
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> SelectSelectStep<Record20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20>> select(Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12, Field<T13> field13, Field<T14> field14, Field<T15> field15, Field<T16> field16, Field<T17> field17, Field<T18> field18, Field<T19> field19, Field<T20> field20) {
        return (SelectSelectStep) select(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14, field15, field16, field17, field18, field19, field20 });
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> SelectSelectStep<Record21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>> select(Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12, Field<T13> field13, Field<T14> field14, Field<T15> field15, Field<T16> field16, Field<T17> field17, Field<T18> field18, Field<T19> field19, Field<T20> field20, Field<T21> field21) {
        return (SelectSelectStep) select(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14, field15, field16, field17, field18, field19, field20, field21 });
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> SelectSelectStep<Record22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>> select(Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12, Field<T13> field13, Field<T14> field14, Field<T15> field15, Field<T16> field16, Field<T17> field17, Field<T18> field18, Field<T19> field19, Field<T20> field20, Field<T21> field21, Field<T22> field22) {
        return (SelectSelectStep) select(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14, field15, field16, field17, field18, field19, field20, field21, field22 });
    }

// [jooq-tools] END [select]

    @Override
    public SelectSelectStep<Record> selectDistinct(Collection<? extends Field<?>> fields) {
        SelectSelectStep<Record> result = DSL.selectDistinct(fields);
        result.attach(configuration);
        return result;
    }

    @Override
    public SelectSelectStep<Record> selectDistinct(Field<?>... fields) {
        SelectSelectStep<Record> result = DSL.selectDistinct(fields);
        result.attach(configuration);
        return result;
    }

// [jooq-tools] START [selectDistinct]

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1> SelectSelectStep<Record1<T1>> selectDistinct(Field<T1> field1) {
        return (SelectSelectStep) selectDistinct(new Field[] { field1 });
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1, T2> SelectSelectStep<Record2<T1, T2>> selectDistinct(Field<T1> field1, Field<T2> field2) {
        return (SelectSelectStep) selectDistinct(new Field[] { field1, field2 });
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1, T2, T3> SelectSelectStep<Record3<T1, T2, T3>> selectDistinct(Field<T1> field1, Field<T2> field2, Field<T3> field3) {
        return (SelectSelectStep) selectDistinct(new Field[] { field1, field2, field3 });
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1, T2, T3, T4> SelectSelectStep<Record4<T1, T2, T3, T4>> selectDistinct(Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4) {
        return (SelectSelectStep) selectDistinct(new Field[] { field1, field2, field3, field4 });
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1, T2, T3, T4, T5> SelectSelectStep<Record5<T1, T2, T3, T4, T5>> selectDistinct(Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5) {
        return (SelectSelectStep) selectDistinct(new Field[] { field1, field2, field3, field4, field5 });
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1, T2, T3, T4, T5, T6> SelectSelectStep<Record6<T1, T2, T3, T4, T5, T6>> selectDistinct(Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6) {
        return (SelectSelectStep) selectDistinct(new Field[] { field1, field2, field3, field4, field5, field6 });
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1, T2, T3, T4, T5, T6, T7> SelectSelectStep<Record7<T1, T2, T3, T4, T5, T6, T7>> selectDistinct(Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7) {
        return (SelectSelectStep) selectDistinct(new Field[] { field1, field2, field3, field4, field5, field6, field7 });
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8> SelectSelectStep<Record8<T1, T2, T3, T4, T5, T6, T7, T8>> selectDistinct(Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8) {
        return (SelectSelectStep) selectDistinct(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8 });
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9> SelectSelectStep<Record9<T1, T2, T3, T4, T5, T6, T7, T8, T9>> selectDistinct(Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9) {
        return (SelectSelectStep) selectDistinct(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8, field9 });
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> SelectSelectStep<Record10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>> selectDistinct(Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10) {
        return (SelectSelectStep) selectDistinct(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8, field9, field10 });
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> SelectSelectStep<Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>> selectDistinct(Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11) {
        return (SelectSelectStep) selectDistinct(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11 });
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> SelectSelectStep<Record12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>> selectDistinct(Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12) {
        return (SelectSelectStep) selectDistinct(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12 });
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> SelectSelectStep<Record13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>> selectDistinct(Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12, Field<T13> field13) {
        return (SelectSelectStep) selectDistinct(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13 });
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> SelectSelectStep<Record14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>> selectDistinct(Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12, Field<T13> field13, Field<T14> field14) {
        return (SelectSelectStep) selectDistinct(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14 });
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> SelectSelectStep<Record15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>> selectDistinct(Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12, Field<T13> field13, Field<T14> field14, Field<T15> field15) {
        return (SelectSelectStep) selectDistinct(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14, field15 });
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> SelectSelectStep<Record16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>> selectDistinct(Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12, Field<T13> field13, Field<T14> field14, Field<T15> field15, Field<T16> field16) {
        return (SelectSelectStep) selectDistinct(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14, field15, field16 });
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> SelectSelectStep<Record17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>> selectDistinct(Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12, Field<T13> field13, Field<T14> field14, Field<T15> field15, Field<T16> field16, Field<T17> field17) {
        return (SelectSelectStep) selectDistinct(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14, field15, field16, field17 });
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> SelectSelectStep<Record18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>> selectDistinct(Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12, Field<T13> field13, Field<T14> field14, Field<T15> field15, Field<T16> field16, Field<T17> field17, Field<T18> field18) {
        return (SelectSelectStep) selectDistinct(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14, field15, field16, field17, field18 });
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> SelectSelectStep<Record19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>> selectDistinct(Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12, Field<T13> field13, Field<T14> field14, Field<T15> field15, Field<T16> field16, Field<T17> field17, Field<T18> field18, Field<T19> field19) {
        return (SelectSelectStep) selectDistinct(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14, field15, field16, field17, field18, field19 });
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> SelectSelectStep<Record20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20>> selectDistinct(Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12, Field<T13> field13, Field<T14> field14, Field<T15> field15, Field<T16> field16, Field<T17> field17, Field<T18> field18, Field<T19> field19, Field<T20> field20) {
        return (SelectSelectStep) selectDistinct(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14, field15, field16, field17, field18, field19, field20 });
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> SelectSelectStep<Record21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>> selectDistinct(Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12, Field<T13> field13, Field<T14> field14, Field<T15> field15, Field<T16> field16, Field<T17> field17, Field<T18> field18, Field<T19> field19, Field<T20> field20, Field<T21> field21) {
        return (SelectSelectStep) selectDistinct(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14, field15, field16, field17, field18, field19, field20, field21 });
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> SelectSelectStep<Record22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>> selectDistinct(Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12, Field<T13> field13, Field<T14> field14, Field<T15> field15, Field<T16> field16, Field<T17> field17, Field<T18> field18, Field<T19> field19, Field<T20> field20, Field<T21> field21, Field<T22> field22) {
        return (SelectSelectStep) selectDistinct(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14, field15, field16, field17, field18, field19, field20, field21, field22 });
    }

// [jooq-tools] END [selectDistinct]

    @Override
    public SelectSelectStep<Record1<Integer>> selectZero() {
        SelectSelectStep<Record1<Integer>> result = DSL.selectZero();
        result.attach(configuration);
        return result;
    }

    @Override
    public SelectSelectStep<Record1<Integer>> selectOne() {
        SelectSelectStep<Record1<Integer>> result = DSL.selectOne();
        result.attach(configuration);
        return result;
    }

    @Override
    public SelectSelectStep<Record1<Integer>> selectCount() {
        SelectSelectStep<Record1<Integer>> result = DSL.selectCount();
        result.attach(configuration);
        return result;
    }

    @Override
    public SelectQuery<Record> selectQuery() {
        return new SelectQueryImpl(configuration);
    }

    @Override
    public <R extends Record> SelectQuery<R> selectQuery(TableLike<R> table) {
        return new SelectQueryImpl<R>(configuration, table);
    }

    @Override
    public <R extends Record> InsertQuery<R> insertQuery(Table<R> into) {
        return new InsertQueryImpl<R>(configuration, into);
    }

    @Override
    public <R extends Record> InsertSetStep<R> insertInto(Table<R> into) {
        return new InsertImpl(configuration, into, Collections.<Field<?>>emptyList());
    }

// [jooq-tools] START [insert]

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1> InsertValuesStep1<R, T1> insertInto(Table<R> into, Field<T1> field1) {
        return new InsertImpl(configuration, into, Arrays.asList(new Field[] { field1 }));
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1, T2> InsertValuesStep2<R, T1, T2> insertInto(Table<R> into, Field<T1> field1, Field<T2> field2) {
        return new InsertImpl(configuration, into, Arrays.asList(new Field[] { field1, field2 }));
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1, T2, T3> InsertValuesStep3<R, T1, T2, T3> insertInto(Table<R> into, Field<T1> field1, Field<T2> field2, Field<T3> field3) {
        return new InsertImpl(configuration, into, Arrays.asList(new Field[] { field1, field2, field3 }));
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1, T2, T3, T4> InsertValuesStep4<R, T1, T2, T3, T4> insertInto(Table<R> into, Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4) {
        return new InsertImpl(configuration, into, Arrays.asList(new Field[] { field1, field2, field3, field4 }));
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1, T2, T3, T4, T5> InsertValuesStep5<R, T1, T2, T3, T4, T5> insertInto(Table<R> into, Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5) {
        return new InsertImpl(configuration, into, Arrays.asList(new Field[] { field1, field2, field3, field4, field5 }));
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1, T2, T3, T4, T5, T6> InsertValuesStep6<R, T1, T2, T3, T4, T5, T6> insertInto(Table<R> into, Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6) {
        return new InsertImpl(configuration, into, Arrays.asList(new Field[] { field1, field2, field3, field4, field5, field6 }));
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1, T2, T3, T4, T5, T6, T7> InsertValuesStep7<R, T1, T2, T3, T4, T5, T6, T7> insertInto(Table<R> into, Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7) {
        return new InsertImpl(configuration, into, Arrays.asList(new Field[] { field1, field2, field3, field4, field5, field6, field7 }));
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1, T2, T3, T4, T5, T6, T7, T8> InsertValuesStep8<R, T1, T2, T3, T4, T5, T6, T7, T8> insertInto(Table<R> into, Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8) {
        return new InsertImpl(configuration, into, Arrays.asList(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8 }));
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1, T2, T3, T4, T5, T6, T7, T8, T9> InsertValuesStep9<R, T1, T2, T3, T4, T5, T6, T7, T8, T9> insertInto(Table<R> into, Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9) {
        return new InsertImpl(configuration, into, Arrays.asList(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8, field9 }));
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> InsertValuesStep10<R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> insertInto(Table<R> into, Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10) {
        return new InsertImpl(configuration, into, Arrays.asList(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8, field9, field10 }));
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> InsertValuesStep11<R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> insertInto(Table<R> into, Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11) {
        return new InsertImpl(configuration, into, Arrays.asList(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11 }));
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> InsertValuesStep12<R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> insertInto(Table<R> into, Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12) {
        return new InsertImpl(configuration, into, Arrays.asList(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12 }));
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> InsertValuesStep13<R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> insertInto(Table<R> into, Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12, Field<T13> field13) {
        return new InsertImpl(configuration, into, Arrays.asList(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13 }));
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> InsertValuesStep14<R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> insertInto(Table<R> into, Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12, Field<T13> field13, Field<T14> field14) {
        return new InsertImpl(configuration, into, Arrays.asList(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14 }));
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> InsertValuesStep15<R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> insertInto(Table<R> into, Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12, Field<T13> field13, Field<T14> field14, Field<T15> field15) {
        return new InsertImpl(configuration, into, Arrays.asList(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14, field15 }));
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> InsertValuesStep16<R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> insertInto(Table<R> into, Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12, Field<T13> field13, Field<T14> field14, Field<T15> field15, Field<T16> field16) {
        return new InsertImpl(configuration, into, Arrays.asList(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14, field15, field16 }));
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> InsertValuesStep17<R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> insertInto(Table<R> into, Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12, Field<T13> field13, Field<T14> field14, Field<T15> field15, Field<T16> field16, Field<T17> field17) {
        return new InsertImpl(configuration, into, Arrays.asList(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14, field15, field16, field17 }));
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> InsertValuesStep18<R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> insertInto(Table<R> into, Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12, Field<T13> field13, Field<T14> field14, Field<T15> field15, Field<T16> field16, Field<T17> field17, Field<T18> field18) {
        return new InsertImpl(configuration, into, Arrays.asList(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14, field15, field16, field17, field18 }));
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> InsertValuesStep19<R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> insertInto(Table<R> into, Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12, Field<T13> field13, Field<T14> field14, Field<T15> field15, Field<T16> field16, Field<T17> field17, Field<T18> field18, Field<T19> field19) {
        return new InsertImpl(configuration, into, Arrays.asList(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14, field15, field16, field17, field18, field19 }));
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> InsertValuesStep20<R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> insertInto(Table<R> into, Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12, Field<T13> field13, Field<T14> field14, Field<T15> field15, Field<T16> field16, Field<T17> field17, Field<T18> field18, Field<T19> field19, Field<T20> field20) {
        return new InsertImpl(configuration, into, Arrays.asList(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14, field15, field16, field17, field18, field19, field20 }));
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> InsertValuesStep21<R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> insertInto(Table<R> into, Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12, Field<T13> field13, Field<T14> field14, Field<T15> field15, Field<T16> field16, Field<T17> field17, Field<T18> field18, Field<T19> field19, Field<T20> field20, Field<T21> field21) {
        return new InsertImpl(configuration, into, Arrays.asList(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14, field15, field16, field17, field18, field19, field20, field21 }));
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> InsertValuesStep22<R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> insertInto(Table<R> into, Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12, Field<T13> field13, Field<T14> field14, Field<T15> field15, Field<T16> field16, Field<T17> field17, Field<T18> field18, Field<T19> field19, Field<T20> field20, Field<T21> field21, Field<T22> field22) {
        return new InsertImpl(configuration, into, Arrays.asList(new Field[] { field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14, field15, field16, field17, field18, field19, field20, field21, field22 }));
    }

// [jooq-tools] END [insert]

    @Override
    public <R extends Record> InsertValuesStepN<R> insertInto(Table<R> into, Field<?>... fields) {
        return new InsertImpl(configuration, into, Arrays.asList(fields));
    }

    @Override
    public <R extends Record> InsertValuesStepN<R> insertInto(Table<R> into, Collection<? extends Field<?>> fields) {
        return new InsertImpl(configuration, into, fields);
    }

    @Override
    public <R extends Record> UpdateQuery<R> updateQuery(Table<R> table) {
        return new UpdateQueryImpl<R>(configuration, table);
    }

    @Override
    public <R extends Record> UpdateSetFirstStep<R> update(Table<R> table) {
        return new UpdateImpl<R>(configuration, table);
    }

    @Override
    public <R extends Record> MergeUsingStep<R> mergeInto(Table<R> table) {
        return new MergeImpl(configuration, table);
    }

// [jooq-tools] START [merge]

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1> MergeKeyStep1<R, T1> mergeInto(Table<R> table, Field<T1> field1) {
        return new MergeImpl(configuration, table, Arrays.asList(field1));
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1, T2> MergeKeyStep2<R, T1, T2> mergeInto(Table<R> table, Field<T1> field1, Field<T2> field2) {
        return new MergeImpl(configuration, table, Arrays.asList(field1, field2));
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1, T2, T3> MergeKeyStep3<R, T1, T2, T3> mergeInto(Table<R> table, Field<T1> field1, Field<T2> field2, Field<T3> field3) {
        return new MergeImpl(configuration, table, Arrays.asList(field1, field2, field3));
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1, T2, T3, T4> MergeKeyStep4<R, T1, T2, T3, T4> mergeInto(Table<R> table, Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4) {
        return new MergeImpl(configuration, table, Arrays.asList(field1, field2, field3, field4));
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1, T2, T3, T4, T5> MergeKeyStep5<R, T1, T2, T3, T4, T5> mergeInto(Table<R> table, Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5) {
        return new MergeImpl(configuration, table, Arrays.asList(field1, field2, field3, field4, field5));
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1, T2, T3, T4, T5, T6> MergeKeyStep6<R, T1, T2, T3, T4, T5, T6> mergeInto(Table<R> table, Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6) {
        return new MergeImpl(configuration, table, Arrays.asList(field1, field2, field3, field4, field5, field6));
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1, T2, T3, T4, T5, T6, T7> MergeKeyStep7<R, T1, T2, T3, T4, T5, T6, T7> mergeInto(Table<R> table, Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7) {
        return new MergeImpl(configuration, table, Arrays.asList(field1, field2, field3, field4, field5, field6, field7));
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1, T2, T3, T4, T5, T6, T7, T8> MergeKeyStep8<R, T1, T2, T3, T4, T5, T6, T7, T8> mergeInto(Table<R> table, Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8) {
        return new MergeImpl(configuration, table, Arrays.asList(field1, field2, field3, field4, field5, field6, field7, field8));
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1, T2, T3, T4, T5, T6, T7, T8, T9> MergeKeyStep9<R, T1, T2, T3, T4, T5, T6, T7, T8, T9> mergeInto(Table<R> table, Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9) {
        return new MergeImpl(configuration, table, Arrays.asList(field1, field2, field3, field4, field5, field6, field7, field8, field9));
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> MergeKeyStep10<R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> mergeInto(Table<R> table, Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10) {
        return new MergeImpl(configuration, table, Arrays.asList(field1, field2, field3, field4, field5, field6, field7, field8, field9, field10));
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> MergeKeyStep11<R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> mergeInto(Table<R> table, Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11) {
        return new MergeImpl(configuration, table, Arrays.asList(field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11));
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> MergeKeyStep12<R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> mergeInto(Table<R> table, Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12) {
        return new MergeImpl(configuration, table, Arrays.asList(field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12));
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> MergeKeyStep13<R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> mergeInto(Table<R> table, Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12, Field<T13> field13) {
        return new MergeImpl(configuration, table, Arrays.asList(field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13));
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> MergeKeyStep14<R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> mergeInto(Table<R> table, Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12, Field<T13> field13, Field<T14> field14) {
        return new MergeImpl(configuration, table, Arrays.asList(field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14));
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> MergeKeyStep15<R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> mergeInto(Table<R> table, Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12, Field<T13> field13, Field<T14> field14, Field<T15> field15) {
        return new MergeImpl(configuration, table, Arrays.asList(field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14, field15));
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> MergeKeyStep16<R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> mergeInto(Table<R> table, Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12, Field<T13> field13, Field<T14> field14, Field<T15> field15, Field<T16> field16) {
        return new MergeImpl(configuration, table, Arrays.asList(field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14, field15, field16));
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> MergeKeyStep17<R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> mergeInto(Table<R> table, Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12, Field<T13> field13, Field<T14> field14, Field<T15> field15, Field<T16> field16, Field<T17> field17) {
        return new MergeImpl(configuration, table, Arrays.asList(field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14, field15, field16, field17));
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> MergeKeyStep18<R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> mergeInto(Table<R> table, Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12, Field<T13> field13, Field<T14> field14, Field<T15> field15, Field<T16> field16, Field<T17> field17, Field<T18> field18) {
        return new MergeImpl(configuration, table, Arrays.asList(field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14, field15, field16, field17, field18));
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> MergeKeyStep19<R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> mergeInto(Table<R> table, Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12, Field<T13> field13, Field<T14> field14, Field<T15> field15, Field<T16> field16, Field<T17> field17, Field<T18> field18, Field<T19> field19) {
        return new MergeImpl(configuration, table, Arrays.asList(field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14, field15, field16, field17, field18, field19));
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> MergeKeyStep20<R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> mergeInto(Table<R> table, Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12, Field<T13> field13, Field<T14> field14, Field<T15> field15, Field<T16> field16, Field<T17> field17, Field<T18> field18, Field<T19> field19, Field<T20> field20) {
        return new MergeImpl(configuration, table, Arrays.asList(field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14, field15, field16, field17, field18, field19, field20));
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> MergeKeyStep21<R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> mergeInto(Table<R> table, Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12, Field<T13> field13, Field<T14> field14, Field<T15> field15, Field<T16> field16, Field<T17> field17, Field<T18> field18, Field<T19> field19, Field<T20> field20, Field<T21> field21) {
        return new MergeImpl(configuration, table, Arrays.asList(field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14, field15, field16, field17, field18, field19, field20, field21));
    }

    @Generated("This method was generated using jOOQ-tools")
    @Override
    public <R extends Record, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> MergeKeyStep22<R, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> mergeInto(Table<R> table, Field<T1> field1, Field<T2> field2, Field<T3> field3, Field<T4> field4, Field<T5> field5, Field<T6> field6, Field<T7> field7, Field<T8> field8, Field<T9> field9, Field<T10> field10, Field<T11> field11, Field<T12> field12, Field<T13> field13, Field<T14> field14, Field<T15> field15, Field<T16> field16, Field<T17> field17, Field<T18> field18, Field<T19> field19, Field<T20> field20, Field<T21> field21, Field<T22> field22) {
        return new MergeImpl(configuration, table, Arrays.asList(field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14, field15, field16, field17, field18, field19, field20, field21, field22));
    }

// [jooq-tools] END [merge]

    @Override
    public <R extends Record> MergeKeyStepN<R> mergeInto(Table<R> table, Field<?>... fields) {
        return mergeInto(table, Arrays.asList(fields));
    }

    @Override
    public <R extends Record> MergeKeyStepN<R> mergeInto(Table<R> table, Collection<? extends Field<?>> fields) {
        return new MergeImpl(configuration, table, fields);
    }

    @Override
    public <R extends Record> DeleteQuery<R> deleteQuery(Table<R> table) {
        return new DeleteQueryImpl<R>(configuration, table);
    }

    @Override
    public <R extends Record> DeleteWhereStep<R> delete(Table<R> table) {
        return new DeleteImpl<R>(configuration, table);
    }

    // -------------------------------------------------------------------------
    // XXX Batch query execution
    // -------------------------------------------------------------------------

    @Override
    public Batch batch(Query... queries) {
        return new BatchMultiple(configuration, queries);
    }

    @Override
    public Batch batch(String... queries) {
        Query[] result = new Query[queries.length];

        for (int i = 0; i < queries.length; i++) {
            result[i] = query(queries[i]);
        }

        return batch(result);
    }

    @Override
    public Batch batch(Collection<? extends Query> queries) {
        return batch(queries.toArray(new Query[queries.size()]));
    }

    @Override
    public BatchBindStep batch(Query query) {
        return new BatchSingle(configuration, query);
    }

    @Override
    public BatchBindStep batch(String sql) {
        return batch(query(sql));
    }

    @Override
    public Batch batch(Query query, Object[]... bindings) {
        return batch(query).bind(bindings);
    }

    @Override
    public Batch batch(String sql, Object[]... bindings) {
        return batch(query(sql), bindings);
    }

    @Override
    public Batch batchStore(UpdatableRecord<?>... records) {
        return new BatchCRUD(configuration, Action.STORE, records);
    }

    @Override
    public Batch batchStore(Collection<? extends UpdatableRecord<?>> records) {
        return batchStore(records.toArray(new UpdatableRecord[records.size()]));
    }

    @Override
    public Batch batchInsert(UpdatableRecord<?>... records) {
        return new BatchCRUD(configuration, Action.INSERT, records);
    }

    @Override
    public Batch batchInsert(Collection<? extends UpdatableRecord<?>> records) {
        return batchInsert(records.toArray(new UpdatableRecord[records.size()]));
    }

    @Override
    public Batch batchUpdate(UpdatableRecord<?>... records) {
        return new BatchCRUD(configuration, Action.UPDATE, records);
    }

    @Override
    public Batch batchUpdate(Collection<? extends UpdatableRecord<?>> records) {
        return batchUpdate(records.toArray(new UpdatableRecord[records.size()]));
    }

    @Override
    public Batch batchDelete(UpdatableRecord<?>... records) {
        return new BatchCRUD(configuration, Action.DELETE, records);
    }

    @Override
    public Batch batchDelete(Collection<? extends UpdatableRecord<?>> records) {
        return batchDelete(records.toArray(new UpdatableRecord[records.size()]));
    }

    // -------------------------------------------------------------------------
    // XXX DDL Statements
    // -------------------------------------------------------------------------

    @Override
    public <R extends Record> TruncateIdentityStep<R> truncate(Table<R> table) {
        return new TruncateImpl<R>(configuration, table);
    }

    // -------------------------------------------------------------------------
    // XXX Other queries for identites and sequences
    // -------------------------------------------------------------------------

    @Override
    public BigInteger lastID() throws DataAccessException {
        switch (configuration.dialect().family()) {
            case DERBY: {
                Field<BigInteger> field = field("identity_val_local()", BigInteger.class);
                return select(field).fetchOne(field);
            }

            case H2:
            case HSQLDB: {
                Field<BigInteger> field = field("identity()", BigInteger.class);
                return select(field).fetchOne(field);
            }

            case INGRES: {
                Field<BigInteger> field = field("last_identity()", BigInteger.class);
                return select(field).fetchOne(field);
            }

            case CUBRID:
            case MARIADB:
            case MYSQL: {
                Field<BigInteger> field = field("last_insert_id()", BigInteger.class);
                return select(field).fetchOne(field);
            }

            case SQLITE: {
                Field<BigInteger> field = field("last_insert_rowid()", BigInteger.class);
                return select(field).fetchOne(field);
            }

            case ASE:
            case SQLSERVER:
            case SYBASE: {
                Field<BigInteger> field = field("@@identity", BigInteger.class);
                return select(field).fetchOne(field);
            }

            default:
                throw new SQLDialectNotSupportedException("identity functionality not supported by " + configuration.dialect());
        }
    }

    @Override
    public <T extends Number> T nextval(Sequence<T> sequence) {
        Field<T> nextval = sequence.nextval();
        return select(nextval).fetchOne(nextval);
    }

    @Override
    public <T extends Number> T currval(Sequence<T> sequence) {
        Field<T> currval = sequence.currval();
        return select(currval).fetchOne(currval);
    }

    // -------------------------------------------------------------------------
    // XXX Global Record factory
    // -------------------------------------------------------------------------

    @Override
    public <R extends UDTRecord<R>> R newRecord(UDT<R> type) {
        return Utils.newRecord(type, configuration);
    }

    @Override
    public <R extends Record> R newRecord(Table<R> table) {
        return Utils.newRecord(table, configuration);
    }

    @Override
    public <R extends Record> R newRecord(Table<R> table, Object source) {
        R result = newRecord(table);
        result.from(source);
        return result;
    }

    @Override
    public <R extends Record> Result<R> newResult(Table<R> table) {
        return new ResultImpl<R>(configuration, table.fields());
    }

    // -------------------------------------------------------------------------
    // XXX Executing queries
    // -------------------------------------------------------------------------

    @Override
    public <R extends Record> Result<R> fetch(ResultQuery<R> query) throws DataAccessException {
        final Configuration previous = Utils.getConfiguration(query);

        try {
            query.attach(configuration);
            return query.fetch();
        }
        finally {
            query.attach(previous);
        }
    }

    @Override
    public <R extends Record> Cursor<R> fetchLazy(ResultQuery<R> query) throws DataAccessException {
        final Configuration previous = Utils.getConfiguration(query);

        try {
            query.attach(configuration);
            return query.fetchLazy();
        }
        finally {
            query.attach(previous);
        }
    }

    @Override
    public <R extends Record> List<Result<Record>> fetchMany(ResultQuery<R> query) throws DataAccessException {
        final Configuration previous = Utils.getConfiguration(query);

        try {
            query.attach(configuration);
            return query.fetchMany();
        }
        finally {
            query.attach(previous);
        }
    }

    @Override
    public <R extends Record> R fetchOne(ResultQuery<R> query) throws DataAccessException, InvalidResultException {
        final Configuration previous = Utils.getConfiguration(query);

        try {
            query.attach(configuration);
            return query.fetchOne();
        }
        finally {
            query.attach(previous);
        }
    }

    @Override
    public int fetchCount(Select<?> query) throws DataAccessException {
        return selectCount().from(query).fetchOne(0, int.class);
    }

    @Override
    public int execute(Query query) throws DataAccessException {
        final Configuration previous = Utils.getConfiguration(query);

        try {
            query.attach(configuration);
            return query.execute();
        }
        finally {
            query.attach(previous);
        }
    }

    // -------------------------------------------------------------------------
    // XXX Fast querying
    // -------------------------------------------------------------------------

    @Override
    public <R extends Record> Result<R> fetch(Table<R> table) throws DataAccessException {
        return fetch(table, trueCondition());
    }

    @Override
    public <R extends Record> Result<R> fetch(Table<R> table, Condition condition) throws DataAccessException {
        return selectFrom(table).where(condition).fetch();
    }

    @Override
    public <R extends Record> R fetchOne(Table<R> table) throws DataAccessException, InvalidResultException {
        return Utils.fetchOne(fetchLazy(table));
    }

    @Override
    public <R extends Record> R fetchOne(Table<R> table, Condition condition) throws DataAccessException, InvalidResultException {
        return Utils.fetchOne(fetchLazy(table, condition));
    }

    @Override
    public <R extends Record> R fetchAny(Table<R> table) throws DataAccessException {
        return Utils.filterOne(selectFrom(table).limit(1).fetch());
    }

    @Override
    public <R extends Record> R fetchAny(Table<R> table, Condition condition) throws DataAccessException {
        return Utils.filterOne(selectFrom(table).where(condition).limit(1).fetch());
    }

    @Override
    public <R extends Record> Cursor<R> fetchLazy(Table<R> table) throws DataAccessException {
        return fetchLazy(table, trueCondition());
    }

    @Override
    public <R extends Record> Cursor<R> fetchLazy(Table<R> table, Condition condition) throws DataAccessException {
        return selectFrom(table).where(condition).fetchLazy();
    }

    @Override
    public <R extends TableRecord<R>> int executeInsert(R record) throws DataAccessException {
        InsertQuery<R> insert = insertQuery(record.getTable());
        insert.setRecord(record);
        return insert.execute();
    }

    @Override
    public <R extends UpdatableRecord<R>> int executeUpdate(R record) throws DataAccessException {
        UpdateQuery<R> update = updateQuery(record.getTable());
        Utils.addConditions(update, record, record.getTable().getPrimaryKey().getFieldsArray());
        update.setRecord(record);
        return update.execute();
    }

    @Override
    public <R extends TableRecord<R>, T> int executeUpdate(R record, Condition condition) throws DataAccessException {
        UpdateQuery<R> update = updateQuery(record.getTable());
        update.addConditions(condition);
        update.setRecord(record);
        return update.execute();
    }

    @Override
    public <R extends UpdatableRecord<R>> int executeDelete(R record) throws DataAccessException {
        DeleteQuery<R> delete = deleteQuery(record.getTable());
        Utils.addConditions(delete, record, record.getTable().getPrimaryKey().getFieldsArray());
        return delete.execute();
    }

    @Override
    public <R extends TableRecord<R>, T> int executeDelete(R record, Condition condition) throws DataAccessException {
        DeleteQuery<R> delete = deleteQuery(record.getTable());
        delete.addConditions(condition);
        return delete.execute();
    }

    // -------------------------------------------------------------------------
    // XXX Static initialisation of dialect-specific data types
    // -------------------------------------------------------------------------

    static {
        // Load all dialect-specific data types
        // TODO [#650] Make this more reliable using a data type registry

        try {
            Class.forName(SQLDataType.class.getName());
        } catch (Exception ignore) {}
    }

    // -------------------------------------------------------------------------
    // XXX Internals
    // -------------------------------------------------------------------------

    @Override
    public String toString() {
        return configuration.toString();
    }
}
