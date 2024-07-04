package com.example.servicetwo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/servicetwo")
public class Controller {

    @GetMapping("/{companyName}")
    public String welcome(@PathVariable String companyName) {
        return "Welcome " + companyName;
    }
}
