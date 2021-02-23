package org.launchcode.techjobs_oo;

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

    //Getters and Setters

    public int getId() { return id; }

    public String getValue() { return value; }

    public void setValue(String value) { this.value = value; }
}

