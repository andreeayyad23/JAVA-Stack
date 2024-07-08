package com.codingdojo.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.codingdojo.demo.models.User;
import com.codingdojo.demo.models.Yoga;
import com.codingdojo.demo.services.UserService;
import com.codingdojo.demo.services.YogaService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class YogaControllers {
	@Autowired
	UserService userService;
	@Autowired
	YogaService yogaService;
	
	
	@GetMapping("/classes/new")
	public String addYoga(@ModelAttribute("yoga") Yoga yoga, HttpSession session, Model model) {
		if(session.getAttribute("userId") ==null) {
			return "redirect:/";
		}
		User user = userService.findUser( (Long) session.getAttribute("userId"));
		model.addAttribute("user", user);
		return "addCourse.jsp";
		
	}
	
	@PostMapping("/create")
    public String create(@Valid @ModelAttribute("yoga") Yoga yoga, BindingResult result, HttpSession session) {
      
		if (result.hasErrors()) {
            return "addCourse.jsp";
		}else {
        	yogaService.createYogas(yoga);
        	return "redirect:/classes";
        	
        }
	}
        @GetMapping("/classes/{id}")
		public String showYoga(@PathVariable("id") Long id, HttpSession session, Model model) {
        	if(session.getAttribute("userId") ==null) {
    			return "redirect:/";
    		}
			Yoga yoga = yogaService.findYoga(id);
			model.addAttribute("yoga", yoga);
			model.addAttribute("users", userService.findUser((Long)session.getAttribute("userId")));
			return "info.jsp";
			
		}
        
        @GetMapping("/classes/{id}/edit")
	    public String edit(@PathVariable("id") Long id, Model model, HttpSession session) {
			if(session.getAttribute("userId")==null) {
				return "redirect:/";
			}
	        Yoga yoga = yogaService.findYoga(id);
	        model.addAttribute("yoga", yoga);
	        return "edit.jsp";
	    }
        
        @PutMapping("/classes/{id}")
		public String update(@Valid @ModelAttribute("yoga") Yoga yoga, BindingResult result, Model model) {
			if (result.hasErrors()) {
				model.addAttribute("yoga", yoga);
				return "edit.jsp";
			} else {
				yogaService.editYogas(yoga);
				return "redirect:/classes";
			}
		}
        
        @DeleteMapping("/delete/{id}")
		public String destroy(@PathVariable("id") Long id) {
        	yogaService.deleteYogas(id);
			return "redirect:/classes";
		}
        
        
        
	}


