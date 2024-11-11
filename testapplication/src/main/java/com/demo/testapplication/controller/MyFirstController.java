package com.demo.testapplication.controller;

import org.springframework.validation.DataBinder;
import org.springframework.web.bind.annotation.*;

import java.beans.PropertyEditorSupport;

@RestController
@RequestMapping(path = "/api")
public class MyFirstController {

    //http://localhost:8080/api/fetchUser?firstName=moBIn&lastName=Arshad

    @InitBinder
    protected  void initBinder(DataBinder binder){
        binder.registerCustomEditor(String.class, "firstName", new FirstNamePropertyEditor());
    }

    @GetMapping("/fetchUserval")
    public String getUserDetails(@RequestParam(name="firstName") String firstName,
                                 @RequestParam(name = "lastName", required = false) String lastName){
       return  "The user details are \nFirst name::" + firstName+"\nLast Name::"+lastName;
    }
}

class FirstNamePropertyEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text){
         setValue(text.substring(0,1).toUpperCase()+text.substring(1).toLowerCase());
    }
}


