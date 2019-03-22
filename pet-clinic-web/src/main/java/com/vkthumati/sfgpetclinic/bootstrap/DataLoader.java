package com.vkthumati.sfgpetclinic.bootstrap;

import com.vkthumati.sfgpetclinic.model.Owner;
import com.vkthumati.sfgpetclinic.model.Pet;
import com.vkthumati.sfgpetclinic.model.PetType;
import com.vkthumati.sfgpetclinic.model.Vet;
import com.vkthumati.sfgpetclinic.services.OwnerService;
import com.vkthumati.sfgpetclinic.services.PetTypeService;
import com.vkthumati.sfgpetclinic.services.VetService;
import com.vkthumati.sfgpetclinic.services.map.OwnerMapService;
import com.vkthumati.sfgpetclinic.services.map.VetMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner = new Owner();
        owner.setFirstName("Michael");
        owner.setLastName("Weston");
        owner.setAddress("3433 APT1B");
        owner.setCity("Moline");
        owner.setTelephone("2242533399");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");

        owner.getPets().add(mikesPet);

        ownerService.save(owner);

        owner = new Owner();
        owner.setFirstName("Fiona");
        owner.setLastName("Glenanne");
        owner.setAddress("60th Street, 3433 APT1B");
        owner.setCity("Moline");
        owner.setTelephone("2242533399");

        Pet fionaPet = new Pet();
        fionaPet.setPetType(savedCatPetType);
        fionaPet.setOwner(owner);
        fionaPet.setBirthDate(LocalDate.now());
        fionaPet.setName("Cute Cat");

        owner.getPets().add(fionaPet);

        ownerService.save(owner);
        System.out.println("Loaded Owners .............");

        Vet vet = new Vet();
        vet.setFirstName("Sam");
        vet.setLastName("Axe");

        vetService.save(vet);

        vet = new Vet();
        vet.setFirstName("Vasantha");
        vet.setLastName("Thumati");

        vetService.save(vet);
        System.out.println("Loaded Vets .............");


    }
}
