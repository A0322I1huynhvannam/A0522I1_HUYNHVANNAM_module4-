package com.example.controller;

import com.example.model.Song;
import com.example.repo.SongRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SongController {
    private static SongRepo songRepo = new SongRepo();
    @GetMapping("")
    String showList(Model model){
        model.addAttribute( "list",songRepo.showAll() );
        return "list";
    }
    @GetMapping("/add")
    String addMusic(Model model){
        model.addAttribute("music",new Song());
        return "home";
    }
    @PostMapping("/save")
    String add(@ModelAttribute("music") Song music, Model model){
        songRepo.addMusic(music);
        model.addAttribute("list",songRepo.showAll());
        return "list";
    }
}
