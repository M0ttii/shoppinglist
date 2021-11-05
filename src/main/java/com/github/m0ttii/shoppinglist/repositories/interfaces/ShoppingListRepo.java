package com.github.m0ttii.shoppinglist.repositories.interfaces;

import com.github.m0ttii.shoppinglist.entities.ShoppingListEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingListRepo extends MongoRepository<ShoppingListEntity, String>, ShoppingListRepoCustom {
}
