package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    //Class Variables:
    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    //Constructors:

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    //Code a second constructor that takes 5 parameters and assigns values to
    // name, employer, location, positionType, and coreCompetency
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }


    //Methods:
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


    //TODO Create toString() method
    @Override
    public String toString() {
        if (this.name == null && this.employer == null &&this.location == null && this.positionType == null && this.coreCompetency == null) {
            return "\nOOPS! This job does not seem to exist.\n";
        }

        //variables
        //ternary operator
//        String name = this.name == null ? "Data not available" : this.name;
//        String employer = this.employer == null ? "Data not available" : this.getEmployer().toString();
//        String location = this.location == null ? "Data not available" : this.getLocation().toString();
//        String positionType = this.positionType == null ? "Data not available" : this.getPositionType().toString();
//        String coreCompetency = this.coreCompetency == null ? "Data not available" : this.getCoreCompetency().toString();

        return "\nID: " + this.getId() + "\nName: " + name + "\nEmployer: " + employer +"\nLocation: " + location + "\nPosition Type: " + positionType + "\nCore Competency: " + coreCompetency +"\n";
    }


    //Getters & Setters:
    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() { return id; }

    public String getName() {
        if (name == "") {
            return "Data not available";
        }
        return name;
    }

    public void setName(String name) { this.name = name; }

    public Employer getEmployer() { return employer; }

    public void setEmployer(Employer employer) { this.employer = employer; }

    public Location getLocation() { return location; }

    public void setLocation(Location location) { this.location = location; }

    public PositionType getPositionType() { return positionType; }

    public void setPositionType(PositionType positionType) { this.positionType = positionType; }

    public CoreCompetency getCoreCompetency() { return coreCompetency; }

    public void setCoreCompetency(CoreCompetency coreCompetency) { this.coreCompetency = coreCompetency; }


}
