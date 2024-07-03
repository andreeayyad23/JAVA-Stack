package com.codingdojo.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.codingdojo.demo.models.LoginUser;
import com.codingdojo.demo.models.User;
import com.codingdojo.demo.services.BookService;
import com.codingdojo.demo.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class MainController {
	@Autowired
	UserService userService;
	@Autowired
	BookService bookService;
	
@GetMapping("/home")
public String index(Model model, HttpSession session,RedirectAttributes redirectAttributes) {
	if(session.getAttribute("userId") ==null) {
		redirectAttributes.addFlashAttribute("mustlogin", "Error:please login or registraion");
		return "redirect:/";
	}
	
	model.addAttribute("books", bookService.allBooks());
	User user = userService.findUser( (Long) session.getAttribute("userId"));
	model.addAttribute("user",  user);
	return "home_page.jsp";
}

	@GetMapping("/")
	public String Login(Model model) {

		model.addAttribute("newUser", new User());
		model.addAttribute("newLogin", new LoginUser());

		return "login_page.jsp";
	}

	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("newUser") User newUser, BindingResult result, Model model,
			HttpSession session) {

		// TO-DO Later -- call a register method in the service
		// to do some extra validations and create a new user!
		User user = userService.register(newUser, result);
		if (result.hasErrors()) {
			// Be sure to send in the empty LoginUser before
			// re-rendering the page.
			model.addAttribute("newLogin", new LoginUser());
			return "login_page.jsp";
		}

		// No errors!
		// TO-DO Later: Store their ID from the DB in session,
		session.setAttribute("userId", user.getId());
		// in other words, log them in.

		return "redirect:/home";
	}

	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, BindingResult result, Model model,
			HttpSession session) {

		// Add once service is implemented:
		 User user = userService.login(newLogin, result);

		if (result.hasErrors()) {
			model.addAttribute("newUser", new User());
			return "login_page.jsp";
		}

		// No errors!
		// TO-DO Later: Store their ID from the DB in session,
		// in other words, log them in.
		session.setAttribute("userId", user.getId());

		return "redirect:/home";
	}
	
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
			
		session.removeAttribute("userId"); 
		//session.invalidate();
		return "redirect:/";
	}
	
	
}
