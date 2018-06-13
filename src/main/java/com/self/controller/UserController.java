package com.self.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.self.domain.User;
import com.self.service.impl.UserServiceImpl;

@Controller
public class UserController {
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@RequestMapping("/user")
	@ResponseBody 
    public String index() {    
         return"user service";    
    }  
	
    @RequestMapping("/get")    
    public String get(ModelMap map) {  
    	
        User u=userServiceImpl.getNameById(1);  
        
        map.addAttribute("user", u);
          
        return "index";    
    }  

}
