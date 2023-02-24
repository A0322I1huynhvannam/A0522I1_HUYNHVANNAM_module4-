package com.example.phone.service;

import com.example.phone.model.Smartphone;

import java.util.List;

public interface ISmartphoneService {
    List<Smartphone> findAll();
    Smartphone findById(Long id);
    Smartphone save(Smartphone smartPhone);
    void remove(Long id);
    Smartphone update(Smartphone smartphone);
}
