package com.example.testtech.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Entity;
import java.util.Date;

@Entity(name="materiel")
public class Materiel {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name="id")
     private Integer materiel_id;
     @Column(name = "nom")
     private String nom;
     @Column(name = "description")
     private String description;

     public String getImage_url() {
          return image_url;
     }

     public void setImage_url(String image_url) {
          this.image_url = image_url;
     }

     public Date getUpdated_at() {
          return updated_at;
     }

     public void setUpdated_at(Date updated_at) {
          this.updated_at = updated_at;
     }

     public Long getCout_remplacement() {
          return cout_remplacement;
     }

     public void setCout_remplacement(Long cout_remplacement) {
          this.cout_remplacement = cout_remplacement;
     }

     public Long getCout_location() {
          return cout_location;
     }

     public void setCout_location(Long cout_location) {
          this.cout_location = cout_location;
     }

     public Integer getDuree_location() {
          return duree_location;
     }

     public void setDuree_location(Integer duree_location) {
          this.duree_location = duree_location;
     }

     public Integer getCategorie_id() {
          return categorie_id;
     }

     public void setCategorie_id(Integer categorie_id) {
          this.categorie_id = categorie_id;
     }

     public Enum getTaille() {
          return taille;
     }

     public void setTaille(Enum taille) {
          this.taille = taille;
     }

     public String getMarque() {
          return marque;
     }

     public void setMarque(String marque) {
          this.marque = marque;
     }

     public String getNom() {
          return nom;
     }

     public void setNom(String nom) {
          this.nom = nom;
     }

     public String getDescription() {
          return description;
     }

     public void setDescription(String description) {
          this.description = description;
     }

     @Column(name = "marque")
     private String marque;
     @Column(name = "taille")
     private Enum taille;

     @Column(name = "duree_location")
     private Integer duree_location;

     @Column(name = "cout_location")
     private Long cout_location;

     @Column(name = "cout_remplacement")
     private Long cout_remplacement;
     @Column(name = "categorie_id")
     private Integer categorie_id;

     @Column(name = "updated_at")
     private Date updated_at;

     public Integer getMateriel_id() {
          return materiel_id;
     }

     public void setMateriel_id(Integer materiel_id) {
          this.materiel_id = materiel_id;
     }

     @Column(name = "image_url")
     private String image_url;






}
