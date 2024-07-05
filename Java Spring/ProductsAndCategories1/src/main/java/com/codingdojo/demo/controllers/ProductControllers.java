package com.codingdojo.demo.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.demo.models.Category;
import com.codingdojo.demo.models.Product;
import com.codingdojo.demo.services.CategoryService;
import com.codingdojo.demo.services.ProductService;

import jakarta.validation.Valid;




@Controller
public class ProductControllers {
	private final ProductService productService;
	private final CategoryService categoryService;

	
	public ProductControllers(CategoryService categoryService, ProductService productService) {
		this.categoryService = categoryService;
		this.productService = productService;
	}
	
	@GetMapping("/products/new")
	public String addCategory(Model model, @ModelAttribute("product") Product product) {
		return "newProduct.jsp";
	}
	
	@PostMapping("/new")
	public String addProduct(@Valid @ModelAttribute("product") Product product, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "rediredt:/new";
		}else {
			productService.addProduct(product);
			return "redirect:/";
		}
	}
	
	@GetMapping("/products/{id}")
	public String getProduct(@PathVariable("id")Long id , Model model) {
		Product product= productService.findProduct(id);
		model.addAttribute("product", product);
		model.addAttribute("categories", categoryService.getAllExcept(id));
		return "Product_page.jsp";
	}
	
	@PostMapping("/products/{id}")
	public String updateProduct(@PathVariable("id") Long productId, @RequestParam("category") Long categoryId) {
		Product product = productService.findProduct(productId);
		Category category = categoryService.getOne(categoryId);
		List<Category> categories = product.getCategories();
		categories.add(category);
		productService.updateProduct(product);
		return "redirect:/products/"+productId;
	}
}
