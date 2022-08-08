package com.example.testtech.model;
import java.util.Date;

public class Categorie {
    public Date getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Date update_at) {
        this.update_at = update_at;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getCategorie_id() {
        return categorie_id;
    }

    public void setCategorie_id(Integer categorie_id) {
        this.categorie_id = categorie_id;
    }

    private Integer categorie_id;
    private String nom;
    private Date update_at;
}
