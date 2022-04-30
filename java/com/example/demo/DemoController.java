package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/springbootapp")
    public String index(Model model) {
        model.addAttribute("message", "Hello");
        return "Hello, This is Rundi Liu";
    }

}