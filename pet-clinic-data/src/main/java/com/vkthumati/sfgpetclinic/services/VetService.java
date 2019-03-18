package com.vkthumati.sfgpetclinic.services;

import com.vkthumati.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    public Vet findById(Long Id);

    public void save(Vet vet);

    public Set<Vet> findAll();
}
