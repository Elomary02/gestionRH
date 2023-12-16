package com.example.gestionrh.Model;

import java.util.HashSet;
import java.util.Set;

public class Departement {
    private String nom;
    private String descreption;
    private Set<Employe> employes;

    public Departement(String nom, String descreption) {
        this.nom = nom;
        this.descreption = descreption;
        this.employes = new HashSet<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescreption() {
        return descreption;
    }

    public void setDescreption(String descreption) {
        this.descreption = descreption;
    }

    public Set<Employe> getEmployes() {
        return employes;
    }
}
