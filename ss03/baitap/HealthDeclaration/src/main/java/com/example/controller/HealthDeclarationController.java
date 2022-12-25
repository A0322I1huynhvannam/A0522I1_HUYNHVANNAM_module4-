package com.example.controller;

import com.example.model.HealthDeclaration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class HealthDeclarationController {
    @GetMapping("/home")
    String showToKhaiYTe(Model model){
     model.addAttribute( "toKhaiYTe",new HealthDeclaration() );
        return "home";
    }

    @PostMapping("/add")
    String showDienToKhaiYTe(Model model, @ModelAttribute HealthDeclaration healthDeclarationForm){
        model.addAttribute("toKhaiYTe",healthDeclarationForm);
        return "result";
    }
}
