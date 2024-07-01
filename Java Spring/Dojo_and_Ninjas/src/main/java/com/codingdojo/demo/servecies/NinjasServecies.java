package com.codingdojo.demo.servecies;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.demo.models.Ninja;
import com.codingdojo.demo.repositories.NinjaRepositories;
@Service
public class NinjasServecies {
	private final NinjaRepositories ninjaRepo;
	public NinjasServecies(NinjaRepositories ninjaRepo) {
		this.ninjaRepo = ninjaRepo;
	}
	
	public List<Ninja> allNinjas(){
		return ninjaRepo.findAll();
	}
	
	 public Ninja createNinja(Ninja b) {
	        return ninjaRepo.save(b);
	    }
	
	 public Ninja findNinja(Long id) {
	        Optional<Ninja> optionalNinja = ninjaRepo.findById(id);
	        if(optionalNinja.isPresent()) {
	            return optionalNinja.get();
	        } else {
	            return null;
	        }
	    }
}
