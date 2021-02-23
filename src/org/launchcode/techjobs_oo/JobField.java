package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {

    //Variables
    private int id;
    private static int nextId = 1;
    private String value;    //name of


    //Constructors
    public JobField() {
        this.id = nextId;
        nextId++;
    }

    public JobField (String value) {
        this();
        this.value = value;
    }

    //Methods
    @Override
    public String toString() {
        if (value == "" || value == null) {
            return "Data not available";
        }
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField jobField = (JobField) o;
        return getId() == jobField.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    //Getters and Setters

    public int getId() { return id; }

    public String getValue() { return value; }

    public void setValue(String value) { this.value = value; }
}

