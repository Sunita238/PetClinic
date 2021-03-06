package com.home.pet.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "PETS")
public class Pet extends BaseEntity{
    @ManyToOne
    @JoinColumn(name = "type_id")
    private PetType petType;
    @ManyToOne
    @JoinColumn(name="owner_id")
    private Owner owner;
    @Column(name = "BIRTH_DATE")
    private LocalDate birthDate;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
