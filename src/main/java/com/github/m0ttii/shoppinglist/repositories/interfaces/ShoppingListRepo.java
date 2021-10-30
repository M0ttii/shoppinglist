package com.github.m0ttii.shoppinglist.repositories.interfaces;

import com.github.m0ttii.shoppinglist.entities.ItemEntity;
import com.github.m0ttii.shoppinglist.entities.ShoppingListEntity;
import com.github.m0ttii.shoppinglist.entities.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShoppingListRepo extends MongoRepository<ShoppingListEntity, String> {

    ShoppingListEntity getByID(String id);

    ShoppingListEntity addItem(ItemEntity item);

    ShoppingListEntity removeItem(ItemEntity item);

    ShoppingListEntity addUser(UserEntity user);

    ShoppingListEntity removeUser(UserEntity user);
}
