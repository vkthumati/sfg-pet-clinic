package com.vkthumati.sfgpetclinic.services.springdatajpa;

import com.vkthumati.sfgpetclinic.model.Visit;
import com.vkthumati.sfgpetclinic.repositories.VisitRepository;
import com.vkthumati.sfgpetclinic.services.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VisitJpaServiceImpl implements VisitService {

    private final VisitRepository visitRepository;

    @Autowired
    public VisitJpaServiceImpl(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();
        visitRepository.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public Visit findById(Long id) {
        return visitRepository.findById(id).orElse(null);
    }

    @Override
    public Visit save(Visit domain) {
        return visitRepository.save(domain);
    }

    @Override
    public void delete(Visit domain) {
        visitRepository.delete(domain);
    }

    @Override
    public void deleteById(Long id) {
        visitRepository.deleteById(id);
    }
}
