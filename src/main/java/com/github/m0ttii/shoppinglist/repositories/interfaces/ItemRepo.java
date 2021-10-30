package com.github.m0ttii.shoppinglist.repositories.interfaces;

import com.github.m0ttii.shoppinglist.entities.ItemEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemRepo extends MongoRepository<ItemEntity, String> {

    ItemEntity addQuantity(Integer quantity);

    ItemEntity removeQuantity(Integer quantity);
}
