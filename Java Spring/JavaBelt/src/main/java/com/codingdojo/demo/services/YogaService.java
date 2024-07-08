package com.codingdojo.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.demo.models.Yoga;
import com.codingdojo.demo.repositories.YogaRepo;

@Service
public class YogaService {
		private final YogaRepo yogaRepo;
		public YogaService(YogaRepo yogaRepo) {
			this.yogaRepo = yogaRepo;
		}
		
		public List<Yoga> allYogas(){
			return yogaRepo.findAll();
		}
		
		 public Yoga createYogas(Yoga y) {
		        return yogaRepo.save(y);
		    }
		 
		 public Yoga editYogas(Yoga y) {
		        return yogaRepo.save(y);
		    }
		    
		    public void deleteYogas(Long id) {
		    	yogaRepo.deleteById(id);
		    }
		
		 public Yoga findYoga(Long id) {
		        Optional<Yoga> optionalYoga = yogaRepo.findById(id);
		        if(optionalYoga.isPresent()) {
		            return optionalYoga.get();
		        } else {
		            return null;
		        }
		    }
}
