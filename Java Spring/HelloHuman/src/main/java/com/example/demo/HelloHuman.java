package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHuman {
    @RequestMapping("/")
    public String index(@RequestParam(value="name", required=false) String name, @RequestParam(value="last_name", required=false) String last_name) {
    	if(name==null) {
            return "Hello Human";
    	}
    	if(name != null && last_name != null ) {
    		return "Hello " + name +" " +last_name;
    		
    	}else{
    		return "Hello " + name;
    	}
    }
}