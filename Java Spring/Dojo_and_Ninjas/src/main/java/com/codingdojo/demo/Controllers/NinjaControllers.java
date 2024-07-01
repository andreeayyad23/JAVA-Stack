package com.codingdojo.demo.Controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.demo.models.Dojo;
import com.codingdojo.demo.models.Ninja;
import com.codingdojo.demo.servecies.DojoServecies;
import com.codingdojo.demo.servecies.NinjasServecies;

import jakarta.validation.Valid;
@Controller
public class NinjaControllers {
	private final NinjasServecies ninjaserv;
	public NinjaControllers(NinjasServecies ninjaserv) {
		this.ninjaserv = ninjaserv;
	}
	
	@Autowired
	DojoServecies dojoServecies;
	
	@GetMapping("/ninjas/{ninja_id}")
	public String Ninja(@PathVariable Long ninja_id, Model model) {
	    
	    Ninja ninja = ninjaserv.findNinja(ninja_id);
	    model.addAttribute("ninja", ninja);
	    return "Result.jsp";
	}
	
	@GetMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninjas, Model model) {
		List<Dojo> dojo = dojoServecies.allDojos();
		model.addAttribute("dojo", dojo);
		return "Ninjas.jsp";
	}
	
	@PostMapping("/ninjas")
	public String create(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
	    if (result.hasErrors()) {
	        model.addAttribute("ninjas", ninjaserv.allNinjas());
	        return "Ninjas.jsp";
	    }
	    Ninja createdNinja = ninjaserv.createNinja(ninja);
	    return "redirect:/ninjas/" + createdNinja.getId();
	}
}
