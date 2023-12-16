package com.example.gestionrh.Controller.Admin;

import com.example.gestionrh.Model.DatabaseHandler;
import com.example.gestionrh.Model.PasswordGenerator;
import com.example.gestionrh.View.PostType;
import javafx.collections.FXCollections;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.sql.Date;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class AddEmployeController implements Initializable {
    public TextField tf_fname;
    public TextField tf_lname;
    public DatePicker tf_birthday;
    public TextField tf_adress;
    public TextField tf_numberPhone;
    public TextField tf_email;
    public TextField tf_salary;
    public Button btn_addEmploye;
    public Label lbl_error;
    public ChoiceBox<PostType> post_selector;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        post_selector.setItems(FXCollections.observableArrayList(PostType.TECHNICIEN, PostType.MANAGER, PostType.DIRECTEUR));
        btn_addEmploye.setOnAction(event -> onAddEmploye());
    }

    private void onAddEmploye() {
        if (validateFields()) {
            String fname = tf_fname.getText();
            String lname = tf_lname.getText();
            LocalDate birthday = tf_birthday.getValue();
            String address = tf_adress.getText();
            String phoneNumber = tf_numberPhone.getText();
            String email = tf_email.getText();
            Double salary = Double.parseDouble(tf_salary.getText());
            String post = post_selector.getValue().toString();

            DatabaseHandler dbHandler = new DatabaseHandler();
            String employe_password = PasswordGenerator.generateRandomPassword(12);
            dbHandler.insertNewEmploye(
                    employe_password, fname, lname, Date.valueOf(birthday),
                    address, phoneNumber, email, salary, post
            );

            EmployesListController.appendEmployeToList(fname, lname, post);
        } else {
            lbl_error.setText("Veuillez remplir tout les champs.");
        }
    }

    private boolean validateFields() {
        return !tf_fname.getText().isEmpty() &&
                !tf_lname.getText().isEmpty() &&
                tf_birthday.getValue() != null &&
                !tf_adress.getText().isEmpty() &&
                !tf_numberPhone.getText().isEmpty() &&
                !tf_email.getText().isEmpty() &&
                !tf_salary.getText().isEmpty() &&
                post_selector.getValue() != null;
    }
}
