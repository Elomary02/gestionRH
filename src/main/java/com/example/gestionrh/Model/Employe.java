package com.example.gestionrh.Model;

import java.util.Date;

public abstract class Employe {
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String adress;
    private String telephone;
    private String email;
    private Double salaire;
    private Post post;

    public Employe(String nom, String prenom, Date dateNaissance, String adress, String telephone, String email, Double salaire, Post post) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adress = adress;
        this.telephone = telephone;
        this.email = email;
        this.salaire = salaire;
        this.post = post;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalaire() {
        return salaire;
    }

    public void setSalaire(Double salaire) {
        this.salaire = salaire;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public abstract Double calculerSalaire();
    public void demanderConge(Conge conge){}
}
