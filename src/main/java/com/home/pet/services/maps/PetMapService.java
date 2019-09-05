package com.home.pet.services.maps;

import com.home.pet.model.Pet;
import com.home.pet.services.PetService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Pet findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public List<Pet> finadAll() {
        return super.finadAll();
    }

    @Override
    public Pet create(Long aLong, Pet pet) {
        return super.create(aLong, pet);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }
}
