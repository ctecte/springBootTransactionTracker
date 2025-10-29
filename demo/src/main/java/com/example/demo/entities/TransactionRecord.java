package com.example.demo.entities;

import java.sql.Date;

public class TransactionRecord {
    private int id;
    private Date date;
    private String name;
    private double cost;
    private int quantity;
    private String type;
    // to identify which user chat this transaction record belongs to
    // The query will only return results that belong to the users chat_id
    // cannot see other people's queries
    // need sql injection protection
    private String chat_id; 

    public String toString() {
        return Integer.toString(id) + ": " + name;
    }
}
