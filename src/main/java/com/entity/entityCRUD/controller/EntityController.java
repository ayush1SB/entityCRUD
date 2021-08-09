package com.entity.entityCRUD.controller;

import com.entity.entityCRUD.entity.Entity;
import com.entity.entityCRUD.service.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EntityController {

    @Autowired
    private EntityService entityService;

    @GetMapping("/getAllEntities")
    public ResponseEntity<List<Entity>> getEntities()
    {
        List<Entity> entityList = this.entityService.getAllEntities();
        if(entityList.isEmpty())
        {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(entityList);
    }

    @GetMapping("/entity/{id}")
    public ResponseEntity<Entity> getEntityById(@PathVariable("id") int id)
    {
        Entity entity = this.entityService.getEntityById(id);
        if(entity==null)
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(entity));
    }

    @PostMapping("/entity")
    public ResponseEntity<Entity> addNewEntity(@RequestBody Entity entity)
    {
        Entity flag = null;
        try
        {
            flag = this.entityService.addEntity(entity);
            System.out.println("Data added to db");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(flag));
    }

    @DeleteMapping("/entity/{id}")
    public ResponseEntity<?> deleteEntityById(@PathVariable("id") int id)
    {
        String result = this.entityService.deleteEntity(id);
        if(result.equals("success"))
        {

            System.out.println("Data deleted from db");
  //            return ResponseEntity.status(HttpStatus.OK).body("Data deleted successfully");
            return ResponseEntity.status(HttpStatus.OK).build();
        }
        else
        {
  //            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No data exist");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PutMapping("/entity/{id}")
    public ResponseEntity<Entity> updateEntityById(@RequestBody Entity entity , @PathVariable("id") int id)
    {
        String result = this.entityService.updateEntity(id,entity);
        if(result.equals("success"))
        {
            System.out.println("Data updated in db");
            return ResponseEntity.status(HttpStatus.OK).build();
        }
        else
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

}
