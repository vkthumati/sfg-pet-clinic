package com.vkthumati.sfgpetclinic.services.map;

import com.vkthumati.sfgpetclinic.model.Person;
import com.vkthumati.sfgpetclinic.services.CrudService;

import java.util.Set;

public class PersonMapService extends AbstractMapService<Person, Long> implements CrudService<Person, Long> {
    @Override
    public Set<Person> findAll() {
        return super.findAll();
    }

    @Override
    public Person findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Person save(Person domain) {
        return super.save(domain.getId(), domain);
    }

    @Override
    public void delete(Person domain) {
        super.delete(domain);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
