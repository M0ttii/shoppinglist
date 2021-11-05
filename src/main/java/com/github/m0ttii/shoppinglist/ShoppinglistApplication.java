package com.github.m0ttii.shoppinglist;

import com.github.m0ttii.shoppinglist.entities.ItemEntity;
import com.github.m0ttii.shoppinglist.repositories.interfaces.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class ShoppinglistApplication implements CommandLineRunner {

	@Autowired private ItemRepo itemRepo;

	public static void main(String[] args) {
		SpringApplication.run(ShoppinglistApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ItemEntity itemEntity = new ItemEntity("Milch", 1, false);
		itemRepo.save(itemEntity);
	}
}
