package com.codingdojo.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.demo.models.Books;
import com.codingdojo.demo.models.User;
import com.codingdojo.demo.services.BookService;
import com.codingdojo.demo.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class BookController {
	@Autowired
	UserService userService;
	@Autowired
	BookService bookService;
	
	
	@GetMapping("/books/new")
	public String addBook(@ModelAttribute("book") Books books, HttpSession session, Model model) {
		User user = userService.findUser( (Long) session.getAttribute("userId"));
		model.addAttribute("user", user);
		return "addBook.jsp";
		
	}
	
	 @PostMapping("/create")
	    public String create(@Valid @ModelAttribute("book") Books books, BindingResult result, HttpSession session) {
	        if (result.hasErrors()) {
	            return "addBook.jsp";
	        } else {
	        	
	        	
//	        	Long id = (Long) session.getAttribute("userId");
//	        	User user = userService.findUser(id);
//	        	books.setUser(user);
//	        	System.out.println( user.getId()+">>>>>"+books.getUser());
	            bookService.createBooks(books);
	            return "redirect:/home";
	        }
	    }
	 
		@GetMapping("/books/{id}")
		public String addBook(@PathVariable("id") Long id, HttpSession session, Model model) {
			if(session.getAttribute("userId")==null) {
				return "login_page.jsp";
			}
			Books books = bookService.findBook(id);
			model.addAttribute("books", books);
			model.addAttribute("users", userService.findUser((Long)session.getAttribute("userId")));
			return "info.jsp";
			
		}
		
		@RequestMapping(value="/books/{id}", method=RequestMethod.PUT)
		public String update(@Valid @ModelAttribute("book") Books book, BindingResult result, Model model) {
			if (result.hasErrors()) {
				model.addAttribute("books", book);
				return "edit.jsp";
			} else {
				bookService.editBooks(book);
				return "redirect:/home";
			}
		}
		
		@GetMapping("/books/{id}/edit")
	    public String edit(@PathVariable("id") Long id, Model model, HttpSession session) {
			if(session.getAttribute("userId")==null) {
				return "redirect:/";
			}
	        Books books = bookService.findBook(id);
	        model.addAttribute("book", books);
	        return "edit.jsp";
	    }
		
		@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
		public String destroy(@PathVariable("id") Long id) {
			bookService.deleteBooks(id);
			return "redirect:/home";
		}
		
}
