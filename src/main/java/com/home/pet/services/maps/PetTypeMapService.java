package com.home.pet.services.maps;

import com.home.pet.model.PetType;
import com.home.pet.repository.PetTypeRepository;
import com.home.pet.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {
    @Override
    public PetType findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public List<PetType> finadAll() {
        return super.finadAll();
    }

    @Override
    public PetType create(Long aLong, PetType petType) {
        return super.create(aLong, petType);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(PetType petType) {
        super.delete(petType);
    }
}
