package com.example.testtech.service;

import com.example.testtech.entity.Inventaire;

import java.util.List;
import java.util.Optional;

public interface Inventaires {
    List<Inventaire> findAll();
    Optional<Inventaire> findById(int id);
    Inventaire save (Inventaire proposal);
}
