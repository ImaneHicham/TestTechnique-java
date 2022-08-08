package com.example.testtech.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.Date;

@Entity(name= "inventaire")
public class Inventaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer inventaire_id;
    @Column(name="materiel")
    private Integer materiel_id;

    @Column(name="magasin")
    private Integer magasin_id;

    @Column(name="updated_at")
    private Date updated_at;


    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public Integer getInventaire_id() {
        return inventaire_id;
    }

    public void setInventaire_id(Integer inventaire_id) {
        this.inventaire_id = inventaire_id;
    }




    public Integer getMateriel_id() {
        return materiel_id;
    }

    public void setMateriel_id(Integer materiel_id) {
        this.materiel_id = materiel_id;
    }

    public Integer getMagasin_id() {
        return magasin_id;
    }

    public void setMagasin_id(Integer magasin_id) {
        this.magasin_id = magasin_id;
    }

    public void setInvId(Integer inventaire_id) {
        this.inventaire_id = inventaire_id;
    }

    public Inventaire(Integer inventaire_id, Integer magasin_id,Integer materiel_id ,Date updated_at) {
        this.inventaire_id =inventaire_id;
        this.magasin_id =magasin_id;
        this.materiel_id =materiel_id;
        this.updated_at = updated_at;
    }

    public Integer getInvId() {
        return inventaire_id;
    }


}
