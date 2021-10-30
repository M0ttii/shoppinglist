package com.github.m0ttii.shoppinglist.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Getter
@Setter
@Document("shoppinglists")
public class ShoppingListEntity {

    private String id;
    private ArrayList<ItemEntity> content;
    private ArrayList<UserEntity> users;

    public ShoppingListEntity(String id, ArrayList<ItemEntity> content, ArrayList<UserEntity> users){
        this.id = id;
        this.content = content;
        this.users = users;
    }
}
