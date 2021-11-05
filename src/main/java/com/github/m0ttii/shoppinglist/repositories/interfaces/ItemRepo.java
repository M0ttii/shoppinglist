package com.github.m0ttii.shoppinglist.repositories.interfaces;

import com.github.m0ttii.shoppinglist.entities.ItemEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepo extends MongoRepository<ItemEntity, String>, ItemRepoCustom{

    public ItemEntity findByName(String name);
}
