package com.home.pet.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "PET_TYPE")
public class PetType extends BaseEntity{
    @Column(name = "PET_TYPE_NAME")
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "petType")
    private Set<Pet> pets = new HashSet<>();

    public PetType() {
    }

    public PetType(Long id, String name, Set<Pet> pets) {
        super(id);
        this.name = name;
        this.pets = pets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
