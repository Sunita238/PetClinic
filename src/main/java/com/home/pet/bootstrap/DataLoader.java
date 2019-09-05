package com.home.pet.bootstrap;

import com.home.pet.model.Owner;
import com.home.pet.repository.OwnerRepository;
import com.home.pet.services.OwnerService;
import com.home.pet.services.VetService;
import com.home.pet.services.jpa.OwnerJpaService;
import com.home.pet.services.maps.OwnerMapService;
import com.home.pet.services.maps.VetMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    @Autowired
    public DataLoader(OwnerRepository ownerRepository) {
        ownerService = new OwnerJpaService(ownerRepository);
        vetService = new VetMapService();
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Start loading owner");
        Owner owner1 = new Owner(1L,"sunita","satpathy","bbsr","bbsr","9938068537");
        ownerService.create(1L,owner1);
        Owner owner2 = new Owner(2L,"suraj","satpathy","bbsr","bbsr","9938068537");
        ownerService.create(2L,owner2);
        Owner owner3 = new Owner(3L,"mani","satpathy","bbsr","bbsr","9938068537");
        ownerService.create(3L,owner3);
        Owner owner4 = new Owner(4L,"arun","rath","bbsr","bbsr","9938068537");
        ownerService.create(4L,owner4);
        System.out.println("end loading owner"+ownerService.finadAll().toString());
    }
}
