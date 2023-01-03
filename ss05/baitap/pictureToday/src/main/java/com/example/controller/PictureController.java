package com.example.controller;

import com.example.bean.Picture;
import com.example.service.IPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/picture")
public class PictureController {
   @Autowired
    IPictureService pictureService;

   @GetMapping("/home")
    public String index(Model model){
       model.addAttribute( "picture",pictureService.findAll() );
       return "index";
   }

   @GetMapping("/create")
    public String create(Model model){
       model.addAttribute( "picture", new Picture() );
       return "create";
   }

   @GetMapping("/save")
    public String save(@ModelAttribute("picture")Picture picture){
       pictureService.create( picture );
       return "redirect:/picture/home";
   }
}
