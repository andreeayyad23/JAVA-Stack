package com.codingdojo.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.demo.models.Books;
import com.codingdojo.demo.repositories.BookRepository;

@Service
public class BookService {
		private final BookRepository bookRepo;
		public BookService(BookRepository bookRepo) {
			this.bookRepo = bookRepo;
		}
		
		public List<Books> allBooks(){
			return bookRepo.findAll();
		}
		
		 public Books createBooks(Books b) {
		        return bookRepo.save(b);
		    }
		 
		 public Books editBooks(Books b) {
		        return bookRepo.save(b);
		    }
		    
		    public void deleteBooks(Long id) {
		    	bookRepo.deleteById(id);
		    }
		
		 public Books findBook(Long id) {
		        Optional<Books> optionalBook = bookRepo.findById(id);
		        if(optionalBook.isPresent()) {
		            return optionalBook.get();
		        } else {
		            return null;
		        }
		    }
}
