package com.example.emppackage;

public class CustDetails1 {

    String id;
    public Name name1;

    public CustDetails1(String id, Name name1) {
        this.id = id;
        this.name1 = name1;
    }

    public String getId() {
        return id;
    }

    public Name getName1() {
        return name1;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName1(Name name1) {
        this.name1 = name1;
    }

    @Override
    public String toString() {
        return "CustDetails1{" +
                "id='" + id + '\'' +
                ", name1=" + name1 +
                '}';
    }
}
