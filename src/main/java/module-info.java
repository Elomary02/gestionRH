module com.example.gestionrh {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.example.gestionrh to javafx.fxml;
    exports com.example.gestionrh;
    exports com.example.gestionrh.Controller;
    exports com.example.gestionrh.Controller.User;
    exports com.example.gestionrh.Controller.Admin;
    exports com.example.gestionrh.View;
    exports com.example.gestionrh.Model;
}