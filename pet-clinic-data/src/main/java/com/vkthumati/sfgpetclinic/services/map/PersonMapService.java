package com.vkthumati.sfgpetclinic.services.map;

import com.vkthumati.sfgpetclinic.model.Person;
import com.vkthumati.sfgpetclinic.services.CrudService;
import com.vkthumati.sfgpetclinic.services.PersonService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PersonMapService extends AbstractMapService<Person, Long> implements PersonService {
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

    @Override
    public Person findByLastName(String lastName) {
        return null;
    }
}
