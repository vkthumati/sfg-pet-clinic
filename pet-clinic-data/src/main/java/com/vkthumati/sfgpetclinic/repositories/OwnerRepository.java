package com.vkthumati.sfgpetclinic.repositories;

import com.vkthumati.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    public Owner findByLastName(String lastName);
    List<Owner> findAllByLastNameLike(String lastName);
}
