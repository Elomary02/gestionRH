package com.example.gestionrh.Controller.User;

import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class UserDashboardController implements Initializable {
    public DatePicker date_picker_task;
    public TextField tasks_number;
    public TextArea tasks_descreption;
    public Button btn_send_task;
    public DatePicker date_piker_breakDebut;
    public DatePicker date_piker_breakFin;
    public TextArea break_reason;
    public ListView<String> transactions;
    public Text user_name;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String notif = "01/12/2023-00:00: Votre salaire est disponible sur compte bancaire";
        transactions.getItems().add(notif);
    }
}
