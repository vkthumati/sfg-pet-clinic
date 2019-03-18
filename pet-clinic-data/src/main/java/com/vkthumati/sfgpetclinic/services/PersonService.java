package com.vkthumati.sfgpetclinic.services;

import com.vkthumati.sfgpetclinic.model.Person;

public interface PersonService extends CrudService<Person, Long> {
    public Person findByLastName(String lastName);
}
