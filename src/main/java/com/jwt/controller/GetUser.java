package com.jwt.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
public class GetUser {
	
    @RequestMapping("/getuser")
    public String getUser() {
    	String re = "{\"name\":\"Durgesh\"}";
        return re;
    }

}
