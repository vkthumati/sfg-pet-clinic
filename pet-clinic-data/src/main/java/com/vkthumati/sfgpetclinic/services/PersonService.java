package com.vkthumati.sfgpetclinic.services;

import com.vkthumati.sfgpetclinic.model.Person;

import java.util.Set;

public interface PersonService {
    public Person findByLastName(String lastName);

    public Person findById(Long Id);

    public Person save(Person person);

    public Set<Person> findAll();
}
