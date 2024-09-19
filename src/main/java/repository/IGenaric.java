package repository;

import java.util.List;

public interface IGenaric<T, E> {
    List<T> findAll();

    void update(T t);

    T findById(E id);
}
