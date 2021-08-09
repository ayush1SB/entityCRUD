package com.entity.entityCRUD.repository;

import com.entity.entityCRUD.entity.Entity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityRepository extends CrudRepository<Entity, Integer> {

}
