package com.codingdojo.demo.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.demo.models.Burger;
import com.codingdojo.demo.services.BurgerService;

import jakarta.validation.Valid;

@Controller
public class BurgerControllers {
	private final BurgerService burgerService;
	public BurgerControllers(BurgerService burgerService) {
		this.burgerService = burgerService;
	}
	

	
@GetMapping("/burger/new")
	public String newBurger(@ModelAttribute("burger") Burger burger,Model model) {
	List<Burger> burgers = burgerService.allBurgers();
	model.addAttribute("burgers", burgers);
	return "index.jsp";
}

@PostMapping("/burgers")
	public String create(
			@Valid @ModelAttribute("burger") Burger burger,
			BindingResult result )
	{
	if (result.hasErrors()) {return "index.jsp";}
	burgerService.createBurger(burger);
	return "redirect:/burger/new";
	}
}
