package com.home.pet.services.maps;

import com.home.pet.services.CrudService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public abstract class AbstractMapService<T, ID> implements CrudService<T, ID> {
    protected final Map<ID,T> map = new HashMap<>();


    @Override
    public T findById(ID id) {
        return map.get(id);
    }

    @Override
    public List<T> finadAll() {
       return  new ArrayList<T>(map.values());
    }

    @Override
    public T create(ID id, T t) {
         map.put(id, t);
         return t;
    }

    @Override
    public void deleteById(ID id) {
        map.remove(id);
    }

    @Override
    public void delete(T t) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(t));
    }
}
