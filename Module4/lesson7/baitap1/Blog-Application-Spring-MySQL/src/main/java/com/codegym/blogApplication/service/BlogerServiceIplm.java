package com.codegym.blogApplication.service;


import com.codegym.blogApplication.model.Bloger;
import com.codegym.blogApplication.repository.BlogerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BlogerServiceIplm implements BlogerService {

    @Autowired
    private BlogerRepository blogerRepository;

    @Override
    public List<Bloger> findAll() {
        return blogerRepository.findAll();
    }

    @Override
    public Bloger findById(long id) {
        return blogerRepository.findById(id);
    }

    @Override
    public void save(Bloger bloger) {
        blogerRepository.save(bloger);
    }

    @Override
    public void remove(long id) {
        blogerRepository.remove(id);
    }
}