package com.vkthumati.sfgpetclinic.model;

import com.sun.xml.internal.rngom.parse.host.Base;

public class Person extends BaseEntity {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
