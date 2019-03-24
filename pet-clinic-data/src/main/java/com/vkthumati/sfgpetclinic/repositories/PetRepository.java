package com.vkthumati.sfgpetclinic.repositories;

import com.vkthumati.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
