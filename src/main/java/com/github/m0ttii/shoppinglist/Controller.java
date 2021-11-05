package com.github.m0ttii.shoppinglist;

import com.github.m0ttii.shoppinglist.entities.ItemEntity;
import com.github.m0ttii.shoppinglist.repositories.interfaces.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired private ItemRepo itemRepo;

    @GetMapping("/additem")
    public void addItem(@RequestParam(value = "name")String name){
        ItemEntity itemEntity = new ItemEntity(name);
        itemRepo.save(itemEntity);
    }
}
