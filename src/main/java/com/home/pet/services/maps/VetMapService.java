package com.home.pet.services.maps;

import com.home.pet.model.Vet;
import com.home.pet.services.VetService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Vet findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public List<Vet> finadAll() {
        return super.finadAll();
    }

    @Override
    public Vet create(Long aLong, Vet vet) {
        return super.create(aLong, vet);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }
}
