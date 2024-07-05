package com.codingdojo.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.demo.models.Category;
import com.codingdojo.demo.models.Product;
import com.codingdojo.demo.reposotories.CategoryRepo;
import com.codingdojo.demo.reposotories.ProductRepo;

@Service
public class CategoryService {
	
	private final ProductRepo productRepo;
	private final CategoryRepo categoryRepo;
	
	
	public CategoryService(CategoryRepo categoryRepo, ProductRepo productRepo) {
		this.categoryRepo = categoryRepo;
		this.productRepo = productRepo;
	}
	
	
	public Category addCategory(Category c) {
		return categoryRepo.save(c);
	}
	
	
	public List<Category> getAll() {
		return categoryRepo.findAll();
	}
	
	
	public Category getOne(Long id) {
		Optional<Category> category = categoryRepo.findById(id);
		if (category.isPresent()) {
			return category.get();
		}
		else {
			return null;
		}
	}
	
	
	public Category updateCategory(Category c) {
		return categoryRepo.save(c);
	}
	
	
	public List<Category> getAllExcept(Long productId) {
		List<Category> categories = this.getAll();
		Optional<Product> product = productRepo.findById(productId);
		if (product.isPresent()) {
			List<Category> productCategories = product.get().getCategories();
			categories.removeAll(productCategories);
			return categories;
		} else {
			return null;
		}
	}
}