package com.codingdojo.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.demo.models.Yoga;

@Repository
public interface YogaRepo extends CrudRepository<Yoga, Long> {
	List<Yoga> findAll();
}


