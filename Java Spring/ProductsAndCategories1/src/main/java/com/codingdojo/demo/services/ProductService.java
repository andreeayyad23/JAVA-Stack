package com.codingdojo.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.demo.models.Category;
import com.codingdojo.demo.models.Product;
import com.codingdojo.demo.reposotories.CategoryRepo;
import com.codingdojo.demo.reposotories.ProductRepo;

@Service
public class ProductService {
	
	private final ProductRepo productRepo;
	private final CategoryRepo categoryRepo;
	
	
	public ProductService(ProductRepo productRepo, CategoryRepo categoryRepo) {
		this.productRepo = productRepo;
		this.categoryRepo = categoryRepo;
	}
	
	
	
	public Product addProduct(Product p) {
		return productRepo.save(p);
	}
		
	
	public List<Product> getAll(){
		return productRepo.findAll();
	}
	
	
	public Product findProduct(Long id) {
		Optional<Product> product = productRepo.findById(id);
		if (product.isPresent()) {
			return product.get();
		}
		else {
			return null;
		}
	}
	
	
	public Product updateProduct(Product p) {
		return productRepo.save(p);
	}
	
	
	public List<Product> getAllExcept(Long categoryId) {
		List<Product> products = this.getAll();
		Optional<Category> category = categoryRepo.findById(categoryId);
		if (category.isPresent()) {
			List<Product> categoryProducts = category.get().getProducts();
			products.removeAll(categoryProducts);
			return products;
		} else {
			return null;
		}
	}
}