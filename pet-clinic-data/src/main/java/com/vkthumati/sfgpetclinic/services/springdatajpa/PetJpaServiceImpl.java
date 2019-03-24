package com.vkthumati.sfgpetclinic.services.springdatajpa;

import com.vkthumati.sfgpetclinic.model.Pet;
import com.vkthumati.sfgpetclinic.repositories.PetRepository;
import com.vkthumati.sfgpetclinic.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetJpaServiceImpl implements PetService {

    private final PetRepository petRepository;

    @Autowired
    public PetJpaServiceImpl(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>();
        petRepository.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public Pet findById(Long id) {
        return petRepository.findById(id).orElse(null);
    }

    @Override
    public Pet save(Pet domain) {
        return petRepository.save(domain);
    }

    @Override
    public void delete(Pet domain) {
        petRepository.delete(domain);
    }

    @Override
    public void deleteById(Long id) {
        petRepository.deleteById(id);
    }
}
