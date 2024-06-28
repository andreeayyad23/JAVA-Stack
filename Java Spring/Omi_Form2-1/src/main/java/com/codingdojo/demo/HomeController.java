package com.codingdojo.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller

public class HomeController {
	@RequestMapping("/omikuji")
	public String home() {
		return "index.jsp";
	}

	@PostMapping("/send")
	public String send(
		@RequestParam(value = "num") Integer num,
		@RequestParam(value = "city") String city,
		@RequestParam(value = "person") String person,
		@RequestParam(value = "hobby") String hobby,
		@RequestParam(value = "living") String living,
		@RequestParam(value = "desc") String desc,
		HttpSession session) {
			session.setAttribute("num", num);
			session.setAttribute("city", city);
			session.setAttribute("person", person);
			session.setAttribute("hobby", hobby);
			session.setAttribute("living", living);
			session.setAttribute("desc", desc);
		return "redirect:omikuji/show";
	}

	@RequestMapping("omikuji/show")
	public String Show() {
		return "show.jsp";
	}
}
