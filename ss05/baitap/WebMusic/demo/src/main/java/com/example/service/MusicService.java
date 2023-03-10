package com.example.service;

import com.example.bean.Music;
import com.example.repository.IMusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MusicService implements IMusicService{
    @Autowired
    IMusicRepository musicRepository;
    @Override
    public void create(Music music) {
     musicRepository.create( music );
    }

    @Override
    public void update(Music music) {
      musicRepository.update( music );
    }

    @Override
    public Music findById(int id) {
        return musicRepository.findById( id );
    }

    @Override
    public List<Music> findAll() {
        return musicRepository.findAll();
    }

    @Override
    public List<Music> findByNameAndCategory(String nameMusic) {
        return musicRepository.findByNameAndCategory( nameMusic );
    }

    @Override
    public void deleteById(int id) {
    musicRepository.deleteById( id );
    }
}
