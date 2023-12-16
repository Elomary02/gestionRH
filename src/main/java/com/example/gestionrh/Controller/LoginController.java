package com.example.gestionrh.Controller;

import com.example.gestionrh.Model.Model;
import com.example.gestionrh.View.AccountType;
import javafx.collections.FXCollections;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    public ChoiceBox<AccountType> acc_selector;
    public TextField tf_username;
    public TextField tf_password;
    public Button btn_login;
    public Label lbl_error;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        acc_selector.setItems(FXCollections.observableArrayList(AccountType.ADMIN, AccountType.USER));
        acc_selector.setValue(Model.getInstance().getViewFactory().getLoginAccountType());
        acc_selector.valueProperty().addListener(observable -> Model.getInstance().getViewFactory().setLoginAccountType(acc_selector.getValue()));
        btn_login.setOnAction(event -> onLogin());
    }

    private void onLogin() {
        Stage stage = (Stage) lbl_error.getScene().getWindow();

        String username = tf_username.getText();
        String password = tf_password.getText();

        AccountType accountType = Model.getInstance().getViewFactory().getLoginAccountType();

        if (username.isEmpty() || password.isEmpty()) {
            lbl_error.setText("Veuillez remplir tout les champs.");
            return;
        }

        boolean userExists = false;
        try {
            ResultSet resultSet;
            if (accountType == AccountType.USER) {
                resultSet = Model.getInstance().getDatabaseHandler().getEmployeData(username, password);
            } else {
                resultSet = Model.getInstance().getDatabaseHandler().getAdminData(username, password);
            }

            userExists = resultSet.next();
            resultSet.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (!userExists) {
            lbl_error.setText("Aucun utilisateur trouvé.");
            return;
        }

        Model.getInstance().getViewFactory().closeStage(stage);
        if (accountType == AccountType.USER) {
            Model.getInstance().getViewFactory().showUserWindow();
        } else {
            Model.getInstance().getViewFactory().showAdminWindow();
        }
    }


}
