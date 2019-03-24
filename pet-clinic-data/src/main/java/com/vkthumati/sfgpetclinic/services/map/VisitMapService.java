package com.vkthumati.sfgpetclinic.services.map;

import com.vkthumati.sfgpetclinic.model.Visit;
import com.vkthumati.sfgpetclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Visit save(Visit domain) {

        if(domain.getPet()==null || domain.getPet().getOwner()==null || domain.getPet().getId()==null || domain.getPet().getOwner().getId()==null){
            throw new RuntimeException("Invalid Visit");
        }
        return super.save(domain);
    }

    @Override
    public void delete(Visit domain) {
        super.delete(domain);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
