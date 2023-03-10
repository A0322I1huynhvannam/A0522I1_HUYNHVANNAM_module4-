package com.example.furama.controller;

import com.example.furama.model.Customer;
import com.example.furama.service.ICustomerService;
import com.example.furama.service.ICustomerTypeService;
import com.example.furama.validate.FuramaValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    ICustomerService customerService;
    @Autowired
    ICustomerTypeService customerTypeService;
    @Autowired
    FuramaValidate furamaValidate;

    @GetMapping("/index")
    public String showIndexCustomer(Model model) {
        model.addAttribute("customers", customerService.findAll());
        return "customer/index";
    }

    @GetMapping("/create")
    public String showCreateCustomer(Model model) {
        model.addAttribute("customerTypes", customerTypeService.findAll());
        model.addAttribute("customer", new Customer());
        return "customer/create";
    }

    @PostMapping("/create")
    public String createCustomer(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("customerTypes", customerTypeService.findAll());
            return "customer/create";
        }
        customerService.save(customer);
        return "redirect:/customer/index";
    }
    @GetMapping("/update/{id}")
    public String showEdit(@PathVariable("id") Integer id, Model model){
        model.addAttribute("customer", customerService.findById(id));
        model.addAttribute("customerTypes", customerTypeService.findAll());
        return "/customer/update";
    }

    @PostMapping("/update")
    public String edit(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("customerTypes", customerTypeService.findAll());
            return "/customer/update";
        }
        customerService.save(customer);
        return "redirect:/customer/index";
    }
    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam("idDelete")Integer id){
        customerService.delete(id);
        return "redirect:/customer/index";
    }
}
