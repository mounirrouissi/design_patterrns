package org.example.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDemo {
    public static void main(String[] args) {
        String sql = "SELECT * FROM movies WHERE title=?";
        List<String> params = new ArrayList<>();
        params.add("star wars");
        Record record = new Record(1);

        Statement statement1 = new Statement(sql,params,record);

        System.out.println(statement1.getSql());
        System.out.println(statement1.getParameters());
        System.out.println(statement1.getRecord());
        System.out.println(statement1.getRecord().getId());

        Statement statement2 = statement1.clone();

        System.out.println(statement2.getSql());
        System.out.println(statement2.getParameters());
        System.out.println(statement2.getRecord());
        System.out.println(statement2.getRecord().getId());
    }
}
