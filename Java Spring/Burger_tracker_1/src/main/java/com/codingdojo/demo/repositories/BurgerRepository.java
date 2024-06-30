package com.codingdojo.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.demo.models.Burger;

//...
@Repository
public interface BurgerRepository extends CrudRepository<Burger, Long>{
 // this method retrieves all the books from the database
 List<Burger> findAll();

}


