package com.vkthumati.sfgpetclinic.services.map;

import com.vkthumati.sfgpetclinic.model.Owner;
import com.vkthumati.sfgpetclinic.services.CrudService;

import java.util.Set;

public class OwnerMapService extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner domain) {
        return super.save(domain.getId(), domain);
    }

    @Override
    public void delete(Owner domain) {
        super.delete(domain);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
