package com.vkthumati.sfgpetclinic.services;

import com.vkthumati.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    public Owner findByLastName(String lastName);
}
