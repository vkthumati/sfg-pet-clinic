package com.vkthumati.sfgpetclinic.services.map;

import com.vkthumati.sfgpetclinic.model.Specialty;
import com.vkthumati.sfgpetclinic.model.Vet;
import com.vkthumati.sfgpetclinic.services.SpecialtyService;
import com.vkthumati.sfgpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    private SpecialtyService specialtyService;

    @Autowired
    public VetMapService(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet domain) {
        if(domain.getSpecialties().size()>0){
            domain.getSpecialties().forEach(specialty -> {
                if(specialty.getId()==null){
                    Specialty savedSpecialty1 = specialtyService.save(specialty);
                    specialty.setId(savedSpecialty1.getId());
                }
            });
        }
        return super.save(domain);
    }

    @Override
    public void delete(Vet domain) {
        super.delete(domain);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
