package com.codingdojo.demo.reposotories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.demo.models.Category;
import com.codingdojo.demo.models.Product;

public interface ProductRepo extends CrudRepository<Product,Long> {
	
	List<Product> findAll();

    List<Product> findAllByCategories(Category category);

    List<Product> findByCategoriesNotContains(Category category);

    Product findProductById(Long productId);
    

}
