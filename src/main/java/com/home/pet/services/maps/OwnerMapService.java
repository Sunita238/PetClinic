package com.home.pet.services.maps;

import com.home.pet.model.Owner;
import com.home.pet.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile("map")
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Owner findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public List<Owner> finadAll() {
        return super.finadAll();
    }

    @Override
    public Owner create(Long aLong, Owner owner) {
        return super.create(aLong, owner);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }
}
