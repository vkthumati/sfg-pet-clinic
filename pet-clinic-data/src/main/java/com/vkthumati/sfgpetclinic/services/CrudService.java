package com.vkthumati.sfgpetclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {
    Set<T> findAll();
    T findById(ID id);
    T save(T domain);
    void delete(T domain);
    void deleteById(ID id);
}
