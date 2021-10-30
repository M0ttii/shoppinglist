package com.github.m0ttii.shoppinglist.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document("items")
public class ItemEntity {

    @Id private String id;
    private String name;
    private Integer quantity;
    private Boolean check;

    public ItemEntity(String id, String name, Integer quantity, Boolean check){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.check = check;
    }
}
