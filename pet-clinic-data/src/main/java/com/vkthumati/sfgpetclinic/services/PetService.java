package com.vkthumati.sfgpetclinic.services;

import com.vkthumati.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    public Pet findById(Long Id);

    public void save(Pet pet);

    public Set<Pet> findAll();
}
