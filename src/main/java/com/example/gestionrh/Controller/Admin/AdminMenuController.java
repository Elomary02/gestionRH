package com.example.gestionrh.Controller.Admin;

import com.example.gestionrh.Model.Model;
import com.example.gestionrh.View.AdminMenuOptions;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminMenuController implements Initializable {
    public Button btn_addEmploye;
    public Button btn_showListEmploye;
    public Button bnt_logout;
    public Button btn_notification;
    public Button btn_report;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListeners();
    }

    private void addListeners() {
        btn_addEmploye.setOnAction(event -> onAddEmploye());
        btn_showListEmploye.setOnAction(event -> onEmployesList());
        btn_notification.setOnAction(event -> onAdminNotifs());
        bnt_logout.setOnAction(event -> onLogout());
    }

    private void onAddEmploye() {
        Model.getInstance().getViewFactory().getAdminSelectedMenuItem().set(AdminMenuOptions.ADD_EMPLOYE);
    }

    private void onEmployesList() {
        Model.getInstance().getViewFactory().getAdminSelectedMenuItem().set(AdminMenuOptions.LIST_EMPLOYES);
    }

    private void onAdminNotifs() {
        Model.getInstance().getViewFactory().getAdminSelectedMenuItem().set(AdminMenuOptions.ADMINNOTIFICATIONS);
    }

    private void onLogout(){
        Stage stage = (Stage) btn_report.getScene().getWindow();
        Model.getInstance().getViewFactory().closeStage(stage);
        Model.getInstance().getViewFactory().showLoginWindow();
    }
}
