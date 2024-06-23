package com.daickichi.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daickichi")
public class HomeController {
	@RequestMapping("")
    public String wel() {
        return "Welcome!";}
	
	@RequestMapping("/today")
    public String hello() {
        return "Today you will find luck in all your endeavors!";
}
	@RequestMapping("/tomorrow")
    public String tom() {
        return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!'.";}
}
