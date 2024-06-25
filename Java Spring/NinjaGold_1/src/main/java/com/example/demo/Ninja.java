package com.example.demo;



import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;




@Controller
public class Ninja {
    
   @RequestMapping("/")
   public String index(HttpSession session) {
	   if(session.getAttribute("gold")==null) {
		   session.setAttribute("gold", 0);
		  session.setAttribute("activites", new ArrayList<String>());
	   }
	   return "index.jsp";
   }
    
   @RequestMapping("/{place}")
   public String ninja(@PathVariable()String place, HttpSession session) {
	   
	   int gold = (int) session.getAttribute("gold");
	   ArrayList<String> activity = (ArrayList<String>) session.getAttribute("activites");
	   Random run = new Random();
	   int random = 0;
	   
	   LocalDateTime myDate = LocalDateTime.now();
	   DateTimeFormatter myFormate = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
	   String date = myDate.format(myFormate);
	   
	   if(place.equals("farm")){
           random = run.nextInt(10, 20);
       }

       else if(place.equals("cave")){
           random = run.nextInt(5, 10);
       }

       else if(place.equals("house")){
           random = run.nextInt(2, 5);
       }

       else if(place.equals("casino")){
           random = run.nextInt(-50, 50);
       }
			   
	   int newGold = gold+random;
	   session.setAttribute("gold", newGold);
	   int earned = random;
	   
	   String message;
	   if(earned<0) {
	   message = "You failed a "+ place + " ,and lost " + earned + " gold.....Ouch ( "+date+" )"; 
       activity.add(message);}
	   
       else {
    	   message = "You earned a" + place + ", and earned " + earned + "Gold (" +date+ ")";
    	   activity.add(message);
       }
	   
	   
	return "redirect:/";
	   
	
    
    
    	
    }
   
   @RequestMapping("/reset")
   public String reset(HttpSession session) {
	   session.removeAttribute("gold");
//	   session.setAttribute("activites", new ArrayList<String>());
	   return "redirect:/";
   }
   
}

    

