package com.codingdojo.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.demo.models.Books;

public interface BookRepository extends CrudRepository<Books, Long> {
	List<Books> findAll();
}
