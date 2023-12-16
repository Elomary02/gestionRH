package com.example.gestionrh.Controller.Admin;

import com.example.gestionrh.Model.DatabaseHandler;
import com.example.gestionrh.Model.Employe;
import com.example.gestionrh.Model.Model;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class EmployeCellController implements Initializable {
    public Label emplye_id;
    public Label employe_fname;
    public Label employe_lname;
    public Label employe_post;
    public Label employe_salary;
    public Button btn_deleteEmplyee;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btn_deleteEmplyee.setOnAction(event -> onDelete());
    }

    public void onDelete() {
        Model.getInstance().getViewFactory().getEmployesListView().setVisible(false);
    }

}
