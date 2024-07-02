package com.codingdojo.demo.reposotories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.demo.models.Expense;

@Repository
public interface ExpensesRepo extends CrudRepository<Expense, Long> {
	List<Expense> findAll();
}
