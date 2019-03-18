package com.vkthumati.sfgpetclinic.services.map;

import com.vkthumati.sfgpetclinic.model.Person;
import com.vkthumati.sfgpetclinic.model.Pet;
import com.vkthumati.sfgpetclinic.services.CrudService;

import java.util.Set;

public class PetMapService extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet domain) {
        return super.save(domain.getId(), domain);
    }

    @Override
    public void delete(Pet domain) {
        super.delete(domain);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
