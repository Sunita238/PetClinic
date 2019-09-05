package com.home.pet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@MappedSuperclass
public class Person extends BaseEntity{
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name= "LAST_NAME")
    private String lastName;

    public Person() {
    }

    public Person(Long id, String firstName, String lastName) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
    }

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
