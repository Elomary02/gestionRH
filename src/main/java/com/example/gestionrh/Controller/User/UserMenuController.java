package com.example.gestionrh.Controller.User;

import com.example.gestionrh.Model.Model;
import com.example.gestionrh.View.UserMenuOptions;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class UserMenuController implements Initializable {
    public Button btn_dashboard;
    public Button btn_notifications;
    public Button btn_profile;
    public Button btn_logout;
    public Button btn_report;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListeners();
    }

    private void addListeners() {
        btn_dashboard.setOnAction(event -> onUserDashboard());
        btn_notifications.setOnAction(event -> onUserNotifications());
        btn_profile.setOnAction(event -> onUserProfil());
        btn_logout.setOnAction(event -> onLogout());
    }

    private void onUserDashboard() {
        Model.getInstance().getViewFactory().getUserSelectedMenuItem().set(UserMenuOptions.USERDASHBOARD);
    }

    private void onUserNotifications() {
        Model.getInstance().getViewFactory().getUserSelectedMenuItem().set(UserMenuOptions.USERNOTIFICATIONS);
    }

    private void onUserProfil() {
        Model.getInstance().getViewFactory().getUserSelectedMenuItem().set(UserMenuOptions.USERPROFIL);
    }

    private void onLogout() {
        Stage stage = (Stage) btn_report.getScene().getWindow();
        Model.getInstance().getViewFactory().closeStage(stage);
        Model.getInstance().getViewFactory().showLoginWindow();
    }

}
