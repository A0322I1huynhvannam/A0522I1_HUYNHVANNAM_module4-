package com.example.phone.service;

import com.example.phone.model.Smartphone;
import com.example.phone.repository.ISmartphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SmartphoneService implements ISmartphoneService{

    @Autowired
    ISmartphoneRepository smartphoneRepository;
    @Override
    public List<Smartphone> findAll() {
        return smartphoneRepository.findAll();
    }

    @Override
    public Smartphone findById(Long id) {
        return smartphoneRepository.findById( id ).orElse( null );
    }

    @Override
    public Smartphone save(Smartphone smartPhone) {
        return smartphoneRepository.save( smartPhone );
    }

    @Override
    public void remove(Long id) {
        smartphoneRepository.deleteById( id ) ;
    }

    @Override
    public Smartphone update(Smartphone smartphone) {
        return smartphoneRepository.save( smartphone );
    }
}
