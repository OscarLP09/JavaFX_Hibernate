package org.example.javafxhibernatehello.dao;

import java.util.List;

public interface DAO<T>{
    public List<T> findAll();
    public T findById(Long id);
    public void save(T t);
    public void update(T t);
    public void delete(T t);
}
