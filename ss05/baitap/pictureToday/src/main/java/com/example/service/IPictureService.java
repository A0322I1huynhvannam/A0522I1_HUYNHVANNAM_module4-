package com.example.service;

import com.example.bean.Picture;

import java.util.List;

public interface IPictureService {
    Picture findById(int id);
    void create(Picture picture);
    void update(Picture picture);
    void deleteById(int id);
    List<Picture> findAll();
}
