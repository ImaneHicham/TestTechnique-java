package com.example.testtech.service;


import com.example.testtech.entity.Inventaire;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class InventaireImpl implements Inventaires{

    public static List<Inventaire> inventaires = new ArrayList<>();

    static {
        Date updated_at = new Date();
        inventaires.add(new Inventaire(4, 5, 220, updated_at));
    }

    @Override
    public List<Inventaire> findAll() {

        return inventaires;
    }
    @Override
    public Optional<Inventaire> findById(int id) {
        for (Inventaire inventaire : inventaires){
            if (inventaire.getInvId() == id){
                return  Optional.of(inventaire);
            }
        }
        return Optional.empty();
    }
    @Override
    public Inventaire save(Inventaire inventaire) {
        inventaires.add(inventaire);
        return inventaire;
    }
}
