package com.example.gestionrh.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Post postEmploye = new Post("Developpeur", "Developement mobile");
        Post postManager = new Post("Chef de projet", "Supervision");
        Employe employe = new Employe("Elomary", "Elhoucine", new Date(), "Adresse de Elomary Elhoucine", "01 23 45 67 89", "elomary.elhoucine@ofppt.ma", 5000.00, postEmploye) {
            @Override
            public Double calculerSalaire() {
                return getSalaire();
            }
        };

        Manager manager = new Manager("nomManager", "prenomManager", new Date(), "adress Manager", "02 34 56 78 90", "manager@entreprise.com", 8000.00, postManager, 1000.00);

        Departement departement = new Departement("Informatique", "Département chargé du développement informatique");

        System.out.println(manager.calculerSalaire());

        employe.demanderConge(new Conge(new Date(), new Date(), "Congé maladie"));
    }
}
