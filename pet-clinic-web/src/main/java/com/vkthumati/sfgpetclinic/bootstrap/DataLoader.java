package com.vkthumati.sfgpetclinic.bootstrap;

import com.vkthumati.sfgpetclinic.model.Owner;
import com.vkthumati.sfgpetclinic.model.Vet;
import com.vkthumati.sfgpetclinic.services.OwnerService;
import com.vkthumati.sfgpetclinic.services.VetService;
import com.vkthumati.sfgpetclinic.services.map.OwnerMapService;
import com.vkthumati.sfgpetclinic.services.map.VetMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner = new Owner();
        owner.setId(1L);
        owner.setFirstName("Michael");
        owner.setLastName("Weston");

        ownerService.save(owner);

        owner = new Owner();
        owner.setId(2L);
        owner.setFirstName("Fiona");
        owner.setLastName("Glenanne");

        ownerService.save(owner);
        System.out.println("Loaded Owners .............");

        Vet vet = new Vet();
        vet.setId(1L);
        vet.setFirstName("Sam");
        vet.setLastName("Axe");

        vetService.save(vet);

        vet = new Vet();
        vet.setId(2L);
        vet.setFirstName("Vasantha");
        vet.setLastName("Thumati");

        vetService.save(vet);
        System.out.println("Loaded Vets .............");
    }
}
