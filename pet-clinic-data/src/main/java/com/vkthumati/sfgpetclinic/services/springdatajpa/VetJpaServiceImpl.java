package com.vkthumati.sfgpetclinic.services.springdatajpa;

import com.vkthumati.sfgpetclinic.model.Vet;
import com.vkthumati.sfgpetclinic.repositories.VetRepository;
import com.vkthumati.sfgpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VetJpaServiceImpl implements VetService {

    private final VetRepository vetRepository;

    @Autowired
    public VetJpaServiceImpl(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet findById(Long id) {
        return vetRepository.findById(id).orElse(null);
    }

    @Override
    public Vet save(Vet domain) {
        return vetRepository.save(domain);
    }

    @Override
    public void delete(Vet domain) {
        vetRepository.delete(domain);
    }

    @Override
    public void deleteById(Long id) {
        vetRepository.deleteById(id);
    }
}
