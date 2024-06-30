package com.codingdojo.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.demo.models.Burger;
import com.codingdojo.demo.repositories.BurgerRepository;

@Service
public class BurgerService {
	private final BurgerRepository burgerRepository;
	public BurgerService(BurgerRepository burgerRepository) {
		this.burgerRepository = burgerRepository;
	}
	
    public List<Burger> allBurgers(){
    	return burgerRepository.findAll();
    }
    // creates a book
    public Burger createBurger(Burger b) {
        return burgerRepository.save(b);
    }
}