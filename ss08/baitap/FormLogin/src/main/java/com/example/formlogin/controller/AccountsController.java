package com.example.formlogin.controller;

import com.example.formlogin.model.Accounts;
import com.example.formlogin.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class AccountsController {
    @Autowired
    IAccountService accountService;

    @GetMapping("/list")
    public String list(Model model){
        List<Accounts> accountsList = accountService.getAll();
        model.addAttribute( "accountsList",accountsList );
        return "list";
    }

    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute( "accounts",new Accounts() );
        return "index";
    }

    @PostMapping("/save")
    public String save(@Valid @ModelAttribute(value = "accounts") Accounts accounts, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            return "index";
        } else {
            accountService.create( accounts );
            return "redirect:/list";
        }
    }
}
