package com.Ashutosh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
                 
	              @GetMapping("/welcome")
	           public String welcome() {
	        	     return "Hii Buddy !!!! How are You ";
	           }
	            
	              @GetMapping("/exit")
	              public String exit(){
	            	   return "We will meet soon !!!!";
	              }
	              
}
