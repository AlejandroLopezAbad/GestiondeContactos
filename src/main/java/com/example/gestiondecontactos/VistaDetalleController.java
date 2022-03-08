package com.example.gestiondecontactos;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class VistaDetalleController {
    @FXML
    private ImageView imagenVistadetalle;
    @FXML
    private VBox vboxDatos;
    @FXML
    private Label labelNombreMod;
    @FXML
    private Label labelRazaMod;
    @FXML
    private Label labelGeneroMod;
    @FXML
    private Label labelKiMod;

    Personaje personaje;

    public void setModel(Personaje personaje){
        this.personaje = personaje;
        imagenVistadetalle.setImage(new Image(personaje.getImage()));
        labelNombreMod.setText(personaje.getNombre());
        labelRazaMod.setText(personaje.getRaza());
        labelGeneroMod.setText(personaje.getGenero());
        labelKiMod.setText(personaje.getKi());

    }



    @FXML
    public void volverprincipalD(){

    }
}
