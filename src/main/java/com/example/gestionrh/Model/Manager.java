package com.example.gestionrh.Model;

import java.util.Date;

public class Manager extends Employe {
    private Double bonus;

    public Manager(String nom, String prenom, Date dateNaissance, String adress, String telephone, String email, Double salaire, Post post, Double bonus) {
        super(nom, prenom, dateNaissance, adress, telephone, email, salaire, post);
        this.bonus = bonus;
    }

    @Override
    public Double calculerSalaire() {
        return this.getSalaire() + bonus;
    }
}
