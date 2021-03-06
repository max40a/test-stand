package com.gmail.maksimus40a.test.stand.features.base.interfaces;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface BaseService<T> {

    List<T> getAllEntities();

    List<T> getEntitiesByCriteria(Map<String, String> params);

    Optional<T> getEntityById(Integer id);

    T addEntity(T entity);

    Optional<T> editEntityById(Integer id, T entity);

    Optional<T> deleteEntityById(Integer id);
}