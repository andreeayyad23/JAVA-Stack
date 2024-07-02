package com.codingdojo.demo.services;

import java.util.List;
import java.util.Optional;

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
    
    public Burger createBurger(Burger b) {
        return burgerRepository.save(b);
    }
    
    public Burger updateBurger(Burger burger) {
        return burgerRepository.save(burger);
      }
    
    public Burger findBurger(Long id) {
        Optional<Burger> optionalBurger = burgerRepository.findById(id);
        if (optionalBurger.isPresent()) {
          return optionalBurger.get();
        } else {
          return null;
        }
      }
    
    public void deleteBurger(Long id) {
        burgerRepository.deleteById(id);
      }
    
    
}