package com.vkthumati.sfgpetclinic.services;

import com.vkthumati.sfgpetclinic.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner, Long>{
    public Owner findByLastName(String lastName);
    List<Owner> findAllByLastNameLike(String lastName);
}
