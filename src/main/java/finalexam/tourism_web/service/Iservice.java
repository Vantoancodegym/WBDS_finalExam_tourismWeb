package finalexam.tourism_web.service;

import java.util.List;

public interface Iservice <T>{
    List<T> findAll();
    T findById(Long id);
    T save(T t);
    void delete (Long id);
}
