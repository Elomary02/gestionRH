package com.example.gestionrh.Model;

import java.util.ArrayList;
import java.util.List;

public class Post {
    private String nom;
    private String descreption;
    private List<String> responsabilities;

    public Post(String nom, String descreption) {
        this.nom = nom;
        this.descreption = descreption;
        this.responsabilities = new ArrayList<>();
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

    public List<String> getResponsabilities() {
        return responsabilities;
    }

    public void setResponsabilities(List<String> responsabilities) {
        this.responsabilities = responsabilities;
    }
}
