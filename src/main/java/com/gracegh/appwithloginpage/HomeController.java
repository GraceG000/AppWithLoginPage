package com.gracegh.appwithloginpage;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//Step 1: this class is the first class I created in the project...
@RestController
public class HomeController {

//Step 2: this is the first function I created in the project...
    @GetMapping("/home")//our api endpoint...
    public String home(){
        return "This is the Home Page.";
    }

//Step 3: this is the second function I created in the project...
    @GetMapping("/admin")//our api endpoint...
    public String admin(){
        return "This is the Admin Page.";
    }
}
