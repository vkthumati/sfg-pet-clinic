package com.vkthumati.sfgpetclinic.bootstrap;

import com.vkthumati.sfgpetclinic.model.*;
import com.vkthumati.sfgpetclinic.services.*;
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
    private final SpecialtyService specialtyService;
    private final VisitService visitService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtyService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = petTypeService.findAll().size();
        if(count==0){
            loadData();
        }
    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Specialty radiolgy = new Specialty();
        radiolgy.setDescription("Radiolgy");

        Specialty surgery = new Specialty();
        radiolgy.setDescription("Surgery");

        Specialty dentistry = new Specialty();
        radiolgy.setDescription("Dentistry");

        Specialty savedRadiolgy = specialtyService.save(radiolgy);
        Specialty savedSurgery = specialtyService.save(surgery);
        Specialty savedDentistry = specialtyService.save(dentistry);

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
        vet.getSpecialties().add(savedRadiolgy);

        vetService.save(vet);

        vet = new Vet();
        vet.setFirstName("Vasantha");
        vet.setLastName("Thumati");
        vet.getSpecialties().add(savedSurgery);

        vetService.save(vet);

        vet = new Vet();
        vet.setFirstName("Kumar");
        vet.setLastName("Thumati");
        vet.getSpecialties().add(savedDentistry);

        vetService.save(vet);

        System.out.println("Loaded Vets .............");

        Visit catVisit = new Visit();
        catVisit.setPet(fionaPet);
        catVisit.setVisitDate(LocalDate.now());
        catVisit.setDescription("Sneezy Kitty");

        visitService.save(catVisit);

        Visit dogVisit = new Visit();
        dogVisit.setPet(mikesPet);
        dogVisit.setVisitDate(LocalDate.now());
        dogVisit.setDescription("Sneezy Puppy");

        visitService.save(dogVisit);
    }
}
