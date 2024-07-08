package com.codingdojo.demo.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.codingdojo.demo.models.LoginUser;
import com.codingdojo.demo.models.User;
import com.codingdojo.demo.repositories.UserRepo;

@Service
public class UserService {
	@Autowired
	UserRepo userRepository;
	
	public User createUser(User u) {
		return userRepository.save(u);
	}
	public User findUser(Long id) {
		Optional<User> optional = userRepository.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null ;
				
	}
	
	public User register(User newUser, BindingResult result) {
// TO-DO - Reject values or register if no errors:
        Optional<User> optional = userRepository.findByEmail(newUser.getEmail());
        // Reject if email is taken (present in database)
        if(optional.isPresent()) {
        	result.rejectValue("email","UNIQUE","Email  is already used");
        }
        // Reject if password doesn't match confirmation
        String passwordEntered = newUser.getPassword();
        if(!passwordEntered.equals(newUser.getConfirmPassword())) {
        	 result.rejectValue("confirmPassword", "Matches", "The Confirm Password must match Password!");
        }
        // Return null if result has errors
        if(result.hasErrors()) {
            // Exit the method and go back to the controller 
            // to handle the response
            return null;
        }
        // Hash and set password, save user to database
        String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
        newUser.setPassword(hashed);
       return userRepository.save(newUser);
        
    }
    public User login(LoginUser newLoginObject, BindingResult result) {
    // TO-DO - Reject values:
        
    	// Find user in the DB by email
        Optional<User> optional = userRepository.findByEmail(newLoginObject.getEmail());

    	
        // Reject if NOT present
        if(!optional.isPresent()) {
        	result.rejectValue("email","NOTFOUND","Email is Not Found");
        	return null;
        }
        
        // Reject if BCrypt password match fails
        User user = optional.get();
        if(!BCrypt.checkpw(newLoginObject.getPassword(), user.getPassword())) {
            result.rejectValue("password", "Matches", "Invalid Password!");
        }

    
        // Return null if result has errors
        if(result.hasErrors()) {
            // Exit the method and go back to the controller 
            // to handle the response
            return null;
        }
        
        // Otherwise, return the user object
        
        return user;
    }
}