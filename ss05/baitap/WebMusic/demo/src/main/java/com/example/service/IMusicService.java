package com.example.service;

import com.example.bean.Music;

import java.util.List;

public interface IMusicService {
    void create(Music music);
    void update(Music music);
    Music findById(int id);
    List<Music> findAll();
    List<Music> findByNameAndCategory(String nameMusic);
    void deleteById(int id);
}
