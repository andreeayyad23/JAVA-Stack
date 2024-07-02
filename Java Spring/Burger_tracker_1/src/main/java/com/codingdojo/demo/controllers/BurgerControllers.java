package com.codingdojo.demo.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

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
	public String newBurger(@ModelAttribute("burger") Burger burger, Model model) {
		List<Burger> burgers = burgerService.allBurgers();
		model.addAttribute("burgers", burgers);
		return "index.jsp";
	}

	@PostMapping("/burgers")
	public String create(@Valid @ModelAttribute("burger") Burger burger, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("burgers", burgerService.allBurgers());
			return "index.jsp";
		}
		burgerService.createBurger(burger);
		return "redirect:/burger/new";
	}

	@GetMapping("/burger/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {
		Burger burger = burgerService.findBurger(id);
		model.addAttribute("burger", burger);
		return "edit.jsp";
	}

	@PutMapping("/burger/{id}")
	public String update(@PathVariable("id") Long id, @Valid @ModelAttribute("burger") Burger burger,
			BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("burger", burger);
			return "edit.jsp";
		} else {
			burgerService.updateBurger(burger);
			return "redirect:/burger/new";
		}
	}

	@DeleteMapping("/burger/{id}")
	public String destroy(@PathVariable("id") Long id) {
		burgerService.deleteBurger(id);
		return "redirect:/burger/new";
	}

	@GetMapping("/burgers")
	public String index(Model model) {
		List<Burger> burgers = burgerService.allBurgers();
		model.addAttribute("burgers", burgers);
		return "index.jsp";
	}

	@GetMapping("/burger/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		Burger burger = burgerService.findBurger(id);
		model.addAttribute("burger", burger);
		return "show.jsp";
	}
}