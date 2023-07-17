package org.example.prototype;

import java.util.List;

public class Statement implements Cloneable{
    private String sql;
    private List<String> parameters;
    private Record record;

    public Statement(String sql, List<String> parameters, Record record) {
        this.sql = sql;
        this.parameters = parameters;
        this.record = record;
    }

    public String getSql() {
        return sql;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public Record getRecord() {
        return record;
    }

    public void setRecord(Record record) {
        this.record = record;
    }

    @Override
    protected Statement clone() {
        try {
            Statement statement = (Statement) super.clone();
            statement.setRecord((Record) this.record.clone());
            return statement;
        }catch (CloneNotSupportedException ee){
            ee.printStackTrace();
        }
        return null;

    }
}
