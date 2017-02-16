package com.nemavasi.jprodsim.core;

/**
 * Created by dmitry.shalygin on 2/16/2017.
 */
public class Human extends IdObject {

    String firstName;
    String middleName;
    String secondName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFullName(){
        return firstName + " " + middleName + " " + secondName;
    }
}
