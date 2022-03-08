package com.example.gestiondecontactos;

import javafx.animation.TranslateTransition;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

public class MainController {


    @FXML
    private ListView<Personaje> listView;
    private ObservableList<Personaje> listPersonas;
    @FXML
    private Button btnmenu;
    @FXML
    private VBox vboxMenu;
  /*  @FXML
    private Button botonOpcion1;
    @FXML
    private Button botonOpcion2;
    @FXML
    private Button botonOpcion3;*/
    @FXML
    private Button botonPreferenicas;
    @FXML
    private Button btnSalir;
    @FXML
    private StackPane vistaDetalle;
    @FXML
    private StackPane vistaGraficas;
    @FXML
    private StackPane preferencesViewPane;
    @FXML
    private StackPane listViewPersonas;
    @FXML
    private VistaDetalleController detallecontroller;

    private Personaje personaje;


@FXML
public void menuAbierto() {
    if(vboxMenu.getTranslateX()!=0){
        TranslateTransition menuAnimation = new TranslateTransition(Duration.millis(100),vboxMenu);
    vboxMenu.setTranslateX(0);
    btnmenu.setTranslateX(106);}else{
        TranslateTransition menuAnimation = new TranslateTransition(Duration.millis(100), vboxMenu);
        vboxMenu.setTranslateX(-106);
        btnmenu.setTranslateX(0);
    }
}
    //boton preferences by @Author sps169


    @FXML
    protected void onPreferencesButtonClick() {
        vistaDetalle.setVisible(false);
        preferencesViewPane.toFront();
        vboxMenu.toFront();
        preferencesViewPane.setVisible(true);
    }
    @FXML
    protected void onPersonaje1(){
        detallecontroller.setModel(new Personaje("goku.jpg","goku","sayan","hombre","1 millon"));
        onPersonaje();
        
    }

    @FXML
    protected void onPersonaje2(){
       // detallecontroller.setModel(new Personaje("goku.jpg","goku","sayan","hombre","1 millon"));
        onPersonaje();
    }
    @FXML
    protected void onPersonaje3(){
        //detallecontroller.setModel(new Personaje("goku.jpg","goku","sayan","hombre","1 millon"));
        onPersonaje();
    }




    private void onPersonaje(){
    vistaDetalle.setVisible(true);
    preferencesViewPane.setVisible(false);
    vistaDetalle.toFront();
    vboxMenu.toFront();
    }

    @FXML
    protected void exit(){
    System.exit(0);
    }


}






