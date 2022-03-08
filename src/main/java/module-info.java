module com.example.gestiondecontactos {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.ikonli.core;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.ikonli.fontawesome5;
    requires lombok;


    opens com.example.gestiondecontactos to javafx.fxml;
    exports com.example.gestiondecontactos;
}