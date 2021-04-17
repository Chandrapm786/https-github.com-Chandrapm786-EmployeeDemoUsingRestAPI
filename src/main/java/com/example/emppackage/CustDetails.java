package com.example.emppackage;

public class CustDetails {
    String id;
    public Name name;

    public CustDetails() {
    }

    public CustDetails(String id, Name name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}
