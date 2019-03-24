package com.vkthumati.sfgpetclinic.services.springdatajpa;

import com.vkthumati.sfgpetclinic.model.PetType;
import com.vkthumati.sfgpetclinic.repositories.PetTypeRepository;
import com.vkthumati.sfgpetclinic.services.PetTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetTypeJpaServiceImpl implements PetTypeService {

    private PetTypeRepository petTypeRepository;

    @Autowired
    public PetTypeJpaServiceImpl(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypes = new HashSet<>();
        petTypeRepository.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public PetType findById(Long id) {
        return petTypeRepository.findById(id).orElse(null);
    }

    @Override
    public PetType save(PetType domain) {
        return petTypeRepository.save(domain);
    }

    @Override
    public void delete(PetType domain) {
        petTypeRepository.delete(domain);
    }

    @Override
    public void deleteById(Long id) {
        petTypeRepository.deleteById(id);
    }
}
