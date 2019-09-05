package com.home.pet.services;

import java.util.List;

public interface CrudService<T, ID> {
    T findById(ID id);
    List<T> finadAll();
    T create(ID id, T t);
    void deleteById(ID id);
    void delete(T t);
}
