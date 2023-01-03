package com.example.service;

import com.example.bean.Picture;
import com.example.repository.IPictureRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PictureService implements IPictureService{
    @Autowired
    IPictureRepository pictureRepository;
    @Override
    public Picture findById(int id) {
        return pictureRepository.findById( id );
    }

    @Override
    public void create(Picture picture) {
    pictureRepository.create( picture );
    }

    @Override
    public void update(Picture picture) {
    pictureRepository.update( picture );
    }

    @Override
    public void deleteById(int id) {
    pictureRepository.deleteById( id );
    }

    @Override
    public List<Picture> findAll() {
        return pictureRepository.findAll();
    }
}
