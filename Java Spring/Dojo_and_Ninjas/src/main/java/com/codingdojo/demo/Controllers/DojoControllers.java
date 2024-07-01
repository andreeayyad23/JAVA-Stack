package com.codingdojo.demo.Controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.demo.models.Dojo;
import com.codingdojo.demo.servecies.DojoServecies;

import jakarta.validation.Valid;

@Controller
public class DojoControllers {
	private final DojoServecies dojoserv;
	public DojoControllers(DojoServecies dojoserv) {
		this.dojoserv=dojoserv;
	}
	
	@GetMapping("/dojos/new")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo, Model model) {
		List<Dojo> Dojo = dojoserv.allDojos();
		model.addAttribute("dojos", dojo);
		return "Dojo.jsp";
	}
	
	@PostMapping("/dojos")
	public String create(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result, Model model)

	{
		if (result.hasErrors()) {
			model.addAttribute("dojos", dojoserv.allDojos());
			return "Dojo.jsp";
		}
		dojoserv.createDojo(dojo);
		return "redirect:/dojos/new";
	}
	

}
