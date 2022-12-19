package com.example.bai1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller

public class ChuyenDoi {
    @GetMapping("/list")
    public String list(){
        return "list";
    }

    @PostMapping("/test")
    public String calculate(Model model, float a){
        float result = 23000* a;
        model.addAttribute("a",a);
        model.addAttribute("result",result);
        return "list";
    }
}
