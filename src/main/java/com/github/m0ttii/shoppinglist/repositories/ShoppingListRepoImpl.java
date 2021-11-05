package com.github.m0ttii.shoppinglist.repositories;

import com.github.m0ttii.shoppinglist.repositories.interfaces.ShoppingListRepoCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

public class ShoppingListRepoImpl implements ShoppingListRepoCustom {

    @Autowired
    private MongoTemplate mongoTemplate;

}
