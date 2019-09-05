package com.home.pet.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "VET")
public class Vet extends Person {
    public Vet(Long id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    public Vet() {
    }
}
