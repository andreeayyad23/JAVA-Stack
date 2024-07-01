package com.codingdojo.demo.servecies;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.demo.models.Dojo;
import com.codingdojo.demo.repositories.DojoRepository;

@Service

public class DojoServecies {
	private final DojoRepository dojoRepo;
	public DojoServecies(DojoRepository dojoRepo) {
		this.dojoRepo = dojoRepo;
	}
	
	public List<Dojo> allDojos(){
		return dojoRepo.findAll();
	}
	
	 public Dojo createDojo(Dojo b) {
	        return dojoRepo.save(b);
	    }
	
	 public Dojo findDojo(Long id) {
	        Optional<Dojo> optionalDojo = dojoRepo.findById(id);
	        if(optionalDojo.isPresent()) {
	            return optionalDojo.get();
	        } else {
	            return null;
	        }
	    }
}
