package com.example.music.service;

import com.example.music.model.Music1;
import com.example.music.repository.IMusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MusicServices implements IMusicServices{
    @Autowired
    private IMusicRepository musicRepository;
    @Override
    public void addNewSongOrEditSong(Music1 song) {
     musicRepository.save( song );
    }

    @Override
    public List<Music1> getAllSong() {
        List<Music1> musicList = musicRepository.findAll();
        return musicList;
    }

    @Override
    public void removeSong(Music1 song) {
     musicRepository.delete( song );
    }

    @Override
    public Music1 getMusicByNameSong(String nameSong) {
        Music1 music = musicRepository.findBymusicNameContaining( nameSong );
        return music;
    }
}
