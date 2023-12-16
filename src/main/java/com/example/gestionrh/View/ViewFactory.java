package com.example.gestionrh.View;

import com.example.gestionrh.Controller.Admin.AdminController;
import com.example.gestionrh.Controller.User.UserController;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ViewFactory {

    private AccountType loginAccountType;
    private PostType postType;

    /* User Views */
    private final ObjectProperty<UserMenuOptions> userSelectedMenuItem;
    private AnchorPane userDashboardView;
    private AnchorPane userNotificationsView;
    private HBox userProfilView;

    /* Admin Views */
    private final ObjectProperty<AdminMenuOptions> adminSelectedMenuItem;
    private AnchorPane addEmployeView;
    private AnchorPane listEmployesView;
    private AnchorPane adminNotificationsView;

    public ViewFactory(){
        this.loginAccountType = AccountType.USER;
        this.postType = PostType.TECHNICIEN;
        this.userSelectedMenuItem = new SimpleObjectProperty<>();
        this.adminSelectedMenuItem = new SimpleObjectProperty<>();
    }

    public AccountType getLoginAccountType() {
        return loginAccountType;
    }

    public void setLoginAccountType(AccountType loginAccountType) {
        this.loginAccountType = loginAccountType;
    }

    public PostType getPostType() {
        return postType;
    }

    public void setPostType(PostType postType) {
        this.postType = postType;
    }

    /* User Views */

    public ObjectProperty<UserMenuOptions> getUserSelectedMenuItem() {
        return userSelectedMenuItem;
    }

    public AnchorPane getUserDashboardView() {
        if (userDashboardView == null) {
            try {
                userDashboardView = new FXMLLoader(getClass().getResource("/Fxml/User/UserDashboard.fxml")).load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return userDashboardView;
    }

    public AnchorPane getUserNotificationsView() {
        if (userNotificationsView == null) {
            try {
                userNotificationsView = new FXMLLoader(getClass().getResource("/Fxml/User/UserNotifications.fxml")).load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return userNotificationsView;
    }

    public HBox getUserProfilView() {
        if (userProfilView == null) {
            try {
                userProfilView = new FXMLLoader(getClass().getResource("/Fxml/User/UserProfil.fxml")).load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return userProfilView;
    }

    public void showUserWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/User/User.fxml"));
        UserController userController = new UserController();
        loader.setController(userController);
        Scene scene = null;

        try {
            scene = new Scene(loader.load());
        } catch (Exception e) {
            e.printStackTrace();
        }

        Stage stage = new Stage();
        stage.setTitle("Portail de l'utilisateur");
        stage.getIcons().add(new Image(String.valueOf(getClass().getResource("/Images/icon.png"))));
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    /* Admin Views */
    public ObjectProperty<AdminMenuOptions> getAdminSelectedMenuItem() {
        return adminSelectedMenuItem;
    }

    public AnchorPane getAddEmployeView() {
        if (addEmployeView == null) {
            try {
                addEmployeView = new FXMLLoader(getClass().getResource("/Fxml/Admin/AddEmploye.fxml")).load();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return addEmployeView;
    }

    public AnchorPane getEmployesListView() {
        if (listEmployesView == null) {
            try {
                listEmployesView = new FXMLLoader(getClass().getResource("/Fxml/Admin/EmployesList.fxml")).load();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return listEmployesView;
    }

    public AnchorPane getAdminNotificationsView() {
        if (adminNotificationsView == null) {
            try {
                adminNotificationsView = new FXMLLoader(getClass().getResource("/Fxml/Admin/AdminNotifications.fxml")).load();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return adminNotificationsView;
    }

    public void showAdminWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Admin/Admin.fxml"));
        AdminController adminController = new AdminController();
        loader.setController(adminController);
        Scene scene = null;

        try {
            scene = new Scene(loader.load());
        } catch (Exception e) {
            e.printStackTrace();
        }

        Stage stage = new Stage();
        stage.setTitle("Portail de l'utilisateur");
        stage.getIcons().add(new Image(String.valueOf(getClass().getResource("/Images/icon.png"))));
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public void showLoginWindow (){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Login.fxml"));
        Scene scene = null;

        try {
            scene = new Scene(loader.load());
        } catch (Exception e) {
            e.printStackTrace();
        }

        Stage stage = new Stage();
        stage.setTitle("Gestionnaire des Ressources Humaines");
        stage.setScene(scene);
        stage.getIcons().add(new Image(String.valueOf(getClass().getResource("/Images/icon.png"))));
        stage.setResizable(false);
        stage.show();
    }

    public void closeStage(Stage stage) {
        stage.close();
    }

}
