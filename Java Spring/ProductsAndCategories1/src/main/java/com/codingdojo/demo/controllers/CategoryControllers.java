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
public class CategoryControllers {
	
	private final ProductService productService;
	private final CategoryService categoryService;

	
	public CategoryControllers(CategoryService categoryService, ProductService productService) {
		this.categoryService = categoryService;
		this.productService = productService;
	}
	
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("categories", categoryService.getAll());
		model.addAttribute("products", productService.getAll());
		return "index.jsp";
	}
	
	@GetMapping("/categories/new")
	public String addCategory(Model model, @ModelAttribute("category") Category category) {
		return "newCategory.jsp";
	}
	
	@PostMapping("/categories/new")
	public String newCategory(@Valid @ModelAttribute("category") Category category, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "rediredt:/categories/new";
		}else {
			categoryService.addCategory(category);
			return "redirect:/";
		}
	}
	
	@GetMapping("/categories/{id}")
	public String getProduct(@PathVariable("id")Long id , Model model) {
		Category category= categoryService.getOne(id);
		model.addAttribute("category", category);
		model.addAttribute("products", productService.getAllExcept(id));
		return "Category_page.jsp";
	}

	
	@PostMapping("/categories/{id}")
	public String addCategories(@PathVariable("id") Long categoryId, @RequestParam("product") Long productId) {
		Category category = categoryService.getOne(categoryId);
		Product product = productService.findProduct(productId);
		List<Product> products = category.getProducts();
		products.add(product);
		categoryService.updateCategory(category);
		return "redirect:/categories/"+categoryId;
	}
}

