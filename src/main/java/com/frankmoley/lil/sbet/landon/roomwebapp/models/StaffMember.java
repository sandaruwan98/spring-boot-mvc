package com.frankmoley.lil.sbet.landon.roomwebapp.models;

public class StaffMember {

    public StaffMember(String empId, String firstname, String lastname, Position position) {
        this.empId = empId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.position = position;
    }

    private String empId;
    private String firstname;
    private String lastname;
    private Position position;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
