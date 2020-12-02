package com.pluralsight.conferenceMVC.controller;

import com.pluralsight.conferenceMVC.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//ensures that calls looks at the content type
//and the accept headers to how and what to
//return
@RestController
public class UserController {
    
    @GetMapping("/user")
                        //pulls from URL
    public User getUser(@RequestParam(value = "firstName", defaultValue = "First name") String firstname,
                        @RequestParam(value = "lastName", defaultValue = "Last name") String lastname,
                        @RequestParam(value = "age", defaultValue = " 0") int age){
        
        //this would be replaced by db call
        User user = new User();
        
        user.setFirstName(firstname);
        user.setLastName(lastname);
        user.setAge(age);
        
        
        //the actual body of the response
        return user;
    }
    
    @PostMapping("/user")
    public User postUser(User user){
        System.out.println("User firstname: " + user.getFirstName());
        
        return user;
    }
}
