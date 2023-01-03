package com.example.controller;

import com.example.bean.Music;
import com.example.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/music")
public class MusicController {
    @Autowired
    IMusicService musicService;
    @GetMapping("")
    public String index(Model model){
        model.addAttribute( "musicList",musicService.findAll() );
        return "index";
    }
    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("music", new Music());
        return "/create";
    }

    @PostMapping("/create")
    public String doCreate(@ModelAttribute("music") Music music) {
        musicService.create(music);
        return "redirect:/music";
    }
}
