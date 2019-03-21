package com.vkthumati.sfgpetclinic.services.map;

import com.vkthumati.sfgpetclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {
    protected Map<Long , T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

    T save(T domain){
        if(domain!=null){
            if(domain.getId()==null){
                domain.setId(getNextId());
            }
            map.put(domain.getId(), domain);
        }else{
            throw new RuntimeException("Object can't be null");
        }
        return domain;
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void delete(T domain){
        map.entrySet().removeIf(entry -> entry.getValue().equals(domain));
    }

    private Long getNextId(){
        Long nextId = null;
        try{
            nextId = Collections.max(map.keySet());
        }catch (NoSuchElementException ex){
            nextId = 1L;
        }
        return nextId+1;
    }
}
