package com.example.gestionrh.Model;

import com.example.gestionrh.View.ViewFactory;

public class Model {
    private static Model model;
    private ViewFactory viewFactory;
    private DatabaseHandler databaseHandler;

    // Employe Data Section
    private Employe employe;
    private boolean employeLoginSuccess;

    // Admin Data Section

    private Model() {
        this.viewFactory = new ViewFactory();
        this.databaseHandler = new DatabaseHandler();
    }

    public static synchronized Model getInstance() {
        if (model == null) {
            model = new Model();
        }
        return model;
    }

    public ViewFactory getViewFactory() {
        return viewFactory;
    }

    public DatabaseHandler getDatabaseHandler() {
        return databaseHandler;
    }
}
