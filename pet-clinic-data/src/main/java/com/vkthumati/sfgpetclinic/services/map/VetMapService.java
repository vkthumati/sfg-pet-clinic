package com.vkthumati.sfgpetclinic.services.map;

import com.vkthumati.sfgpetclinic.model.Pet;
import com.vkthumati.sfgpetclinic.model.Vet;
import com.vkthumati.sfgpetclinic.services.CrudService;

import java.util.Set;

public class VetMapService extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet domain) {
        return super.save(domain.getId(), domain);
    }

    @Override
    public void delete(Vet domain) {
        super.delete(domain);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
