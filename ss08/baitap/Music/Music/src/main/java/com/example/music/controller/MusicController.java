package com.example.music.controller;

import com.example.music.model.Music1;
import com.example.music.service.IMusicServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
public class MusicController {
    @Autowired
    private IMusicServices iMusicServices;

    @GetMapping("musichome")
    public String showList(Model model) {
        List<Music1> musicList = iMusicServices.getAllSong();
        model.addAttribute( "musicList", musicList );
        return "home";
    }

    @GetMapping("showcreate")
    public String showCreate(Model model) {
        model.addAttribute( "music", new Music1() );
        return "create";
    }

    @PostMapping("docreate")
    public String doCreate(@Valid Music1 music, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        String response = "";
        if (bindingResult.hasErrors()) {
            response = "create";
        } else {
            iMusicServices.addNewSongOrEditSong( music );
            String sms = "success";
            redirectAttributes.addFlashAttribute( "sms", sms );
            response = "redirect:musichome";
        }
        return response;
    }

    @GetMapping("removesong")
    public String remove(String musicName, RedirectAttributes redirectAttributes) {
        Music1 music = iMusicServices.getMusicByNameSong( musicName );
        iMusicServices.removeSong( music );
        String sms = "success";
        redirectAttributes.addFlashAttribute( "sms", sms );
        return "redirect:musichome";
    }

    @GetMapping("editsong")
    public String editSong(String musicName, Model model) {
        Music1 music = iMusicServices.getMusicByNameSong( musicName );
        model.addAttribute( "music", music );
        return "edit";
    }

    @PostMapping("doedit")
    public String doEdit(Music1 music, RedirectAttributes redirectAttributes) {
        iMusicServices.addNewSongOrEditSong( music );
        String sms = "success";
        redirectAttributes.addFlashAttribute( "sms", sms );
        return "redirect:musichome";

    }
}
