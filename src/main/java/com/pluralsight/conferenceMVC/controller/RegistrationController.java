package com.pluralsight.conferenceMVC.controller;

import com.pluralsight.conferenceMVC.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Map;

@Controller
public class RegistrationController {

    @GetMapping("registration")
    public String getRegistration(@ModelAttribute ("registration")Registration registration){

        return "registration";
    }

    @PostMapping("registration")
                                // the @Valid relies on validator depen and @NotEmpty in the model for validating input
    public String addRegistration(@Valid @ModelAttribute ("registration")Registration registration,
                                  BindingResult result){
        if (result.hasErrors()){
            System.out.println("There were errors");
            return "registration";
        }
            
        
        System.out.println("registraation: " + registration.getName());
        //the redirect ensures that the submit form is refreshed with no content - it kinda refreshes the view to null
        return "redirect:registration";
    }
}
