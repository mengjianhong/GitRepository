package com.yuxiu.edu.service.base;

public interface IBaseService<T> {
    public T findByUUID(String id);
    public T findByID(Integer id);
    public void deleteByID(Integer id);
    public void deleteByUUID(String id);
    public Integer update(T t);
    public Integer insert(T t);
}
