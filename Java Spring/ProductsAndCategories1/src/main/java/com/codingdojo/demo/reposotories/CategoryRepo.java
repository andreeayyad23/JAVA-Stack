package com.codingdojo.demo.reposotories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.demo.models.Category;
import com.codingdojo.demo.models.Product;

public interface CategoryRepo extends CrudRepository<Category,Long> {
	
	List<Category> findAll();
	
	List<Category> findAllByProducts(Product product);

    List<Category> findByProductsNotContains(Product product);

    Category findCategoryById(Long categoryId);
    


}
