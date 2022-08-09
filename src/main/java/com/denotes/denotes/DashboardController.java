package com.denotes.denotes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DashboardController {
    @GetMapping("/welcome")
    public String getWelcome(){
        return "welcome to denotes";
    }
}
