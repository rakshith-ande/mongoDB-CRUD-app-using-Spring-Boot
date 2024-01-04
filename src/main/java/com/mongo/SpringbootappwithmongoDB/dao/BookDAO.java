package com.mongo.SpringbootappwithmongoDB.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mongo.SpringbootappwithmongoDB.model.Book;

@Repository
public interface BookDAO extends CrudRepository<Book, Integer> {
	
	@Override
	List<Book> findAll();

}
