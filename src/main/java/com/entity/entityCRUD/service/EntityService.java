package com.entity.entityCRUD.service;

import com.entity.entityCRUD.entity.Entity;
import com.entity.entityCRUD.repository.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EntityService {

    @Autowired
    private EntityRepository entityRepository;

    public List<Entity> getAllEntities()
    {
        List<Entity> list = (List<Entity>)this.entityRepository.findAll();
        return list;
    }

    public Entity addEntity(Entity entity) {
        Entity addedEntity = this.entityRepository.save(entity);
        return addedEntity;
    }

    public String deleteEntity(int id) {

        try {
            this.entityRepository.deleteById(id);
            return "success";
        }catch (Exception e)
        {
            return "failed";
        }
    }

    public String updateEntity(int id, Entity entity) {
        if(this.entityRepository.existsById(id))
        {
            entity.setEntityId(id);
            this.entityRepository.save(entity);
            return "success";
        }
        else
        {
            return "failed";
        }
    }

    public Entity getEntityById(int id) {
        Entity entity = null;
        if(this.entityRepository.existsById(id))
        {
            entity = this.entityRepository.findById(id).get();
        }
        return entity;
    }
}
