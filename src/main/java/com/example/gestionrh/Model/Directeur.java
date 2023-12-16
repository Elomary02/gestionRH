package com.example.gestionrh.Model;

import java.util.Date;

public class Directeur extends Employe{

    public Directeur(String nom, String prenom, Date dateNaissance, String adress, String telephone, String email, Double salaire, Post post) {
        super(nom, prenom, dateNaissance, adress, telephone, email, salaire, post);
    }

    @Override
    public Double calculerSalaire() {
        return this.getSalaire();
    }
}
