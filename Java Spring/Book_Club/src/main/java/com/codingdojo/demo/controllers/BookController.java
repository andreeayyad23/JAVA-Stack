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

import com.codingdojo.demo.models.Books;
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
	public String newBook (@ModelAttribute("book") Books books, Model model, HttpSession session) {
		if (session.getAttribute("userId")==null) {
			return "redirect:/";
		}else {
		return "addBook.jsp";
	}
	}
	
	@PostMapping("/create")
	public String addBooks(@Valid @ModelAttribute("book") Books books, BindingResult result) {
		if (result.hasErrors()) {
			return "addBook.jsp";
			
		}else {
			bookService.createBooks(books);
			return "redirect:/home";
		}
	}
	

	
			@GetMapping("/books/{id}")
			public String addBook(@PathVariable("id") Long id, HttpSession session, Model model) {
				if(session.getAttribute("userId")==null) {
					return "login_page.jsp";
				}
				model.addAttribute("book", bookService.findBook(id));
				return "info.jsp";
				
			}
		
		
		@GetMapping("/books/{id}/edit")
	    public String edit(@PathVariable("id") Long id, Model model, HttpSession session) {
			if(session.getAttribute("userId")==null) {
				return "redirect:/";
			}
	        model.addAttribute("book", bookService.findBook(id));
	        return "edit.jsp";
	    }
		
		@PutMapping("/books/{id}")
		public String updateBook(@Valid @PathVariable("id") Long id, @ModelAttribute("book") Books book, BindingResult result) {
			if (result.hasErrors()) {
				return "edit.jsp";

			}else {
				bookService.editBooks(book);
				return "redirect:/home";
			}
		}
		
		@DeleteMapping("/delete/{id}")
		public String delete(@PathVariable ("id") Long id) {
			bookService.deleteBooks(id);
			return "redirect:/home";
		}
		
}