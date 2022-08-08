package com.example.testtech.model;

import java.util.Date;

public class Magasin {

    private Integer magasin_id;

    public Date getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Date update_at) {
        this.update_at = update_at;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Integer getMagasin_id() {
        return magasin_id;
    }

    public void setMagasin_id(Integer magasin_id) {
        this.magasin_id = magasin_id;
    }

    public Integer getDirecteur_personnal_id() {
        return directeur_personnal_id;
    }

    public void setDirecteur_personnal_id(Integer directeur_personnal_id) {
        this.directeur_personnal_id = directeur_personnal_id;
    }

    private Integer directeur_personnal_id;
    private String ville;
    private Date update_at;
}
