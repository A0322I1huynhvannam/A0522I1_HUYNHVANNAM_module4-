package com.example.music.service;

import com.example.music.model.Music1;

import java.util.List;

public interface IMusicServices {
    void addNewSongOrEditSong(Music1 song);
    List<Music1> getAllSong();
    void removeSong(Music1 song);
    Music1 getMusicByNameSong(String nameSong);
}
