package com.home.pet.services.jpa;

import com.home.pet.model.Owner;
import com.home.pet.repository.OwnerRepository;
import com.home.pet.services.CrudService;
import com.home.pet.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Profile("jpa")
public class OwnerJpaService implements OwnerService {
    private OwnerRepository ownerRepository;

    @Autowired
    public OwnerJpaService(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    public OwnerJpaService() {
    }

    @Override
    public Owner findById(Long aLong) {
        return ownerRepository.findById(aLong).orElse(null);
    }

    @Override
    public List<Owner> finadAll() {
        List<Owner> owners = new ArrayList<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner create(Long aLong, Owner owner) {
       return ownerRepository.save(owner);
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Owner owner) {

    }
}
