package com.tc.bigdata.tool.spec;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class OperationSpec implements Serializable {
    @JsonProperty("operation")
    public String operation;

    @JsonProperty("condition")
    public String condition;

    @JsonProperty("columns")
    public List<String> columns;

    @JsonProperty("column")
    public String column;

    @JsonProperty("expression")
    public String expression;

    public boolean isValid() {
        return true;
    }

    @Override
    public String toString() {
        return "SparkJobOperation{" +
                "operation='" + operation + '\'' +
                ", condition='" + condition + '\'' +
                ", columns=" + columns +
                ", column='" + column + '\'' +
                ", expression='" + expression + '\'' +
                '}';
    }
}
