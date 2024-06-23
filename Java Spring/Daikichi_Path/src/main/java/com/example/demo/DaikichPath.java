package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("daikichi")
public class DaikichPath {
			
		@RequestMapping("travel/{city}")
		public String index(@PathVariable("city") String city) {

				return "Congratulations! You will soon travel to "+ city;
		}
		
		@RequestMapping("lotto/{num}")
		public String b(@PathVariable(value="num", required=false) String num) {
			int n = Integer.parseInt(num);
			
			if(n % 2 == 0 ) {
				return "You will take a grand journey in the near future, but be weary of tempting offers";
			}
			else{
				return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
			}
			
	}
}