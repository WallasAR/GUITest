package com.example.guitest;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Main extends Application {

    private static Stage stage; // Variavel estaticas para fazer a mudança de tela

    private static Scene mainScene, homeScene, funcScene, medScene, clientScene; // variavel do tipo Scene

    @Override
    public void start(Stage primaryStage) throws Exception { // Metodo padrão do JavaFX
        stage = primaryStage; // inicializando a variavel stage

        primaryStage.setTitle("UmbrellaCorp. System");
        stage.getIcons().add(new Image("icon.png"));
        //primaryStage.initStyle(StageStyle.UNDECORATED);

        Parent fxmlLogin = FXMLLoader.load(getClass().getResource("TelaLogin.fxml"));
        mainScene = new Scene(fxmlLogin, 700, 500); // Cache tela 1

        Parent fxmlHome = FXMLLoader.load(getClass().getResource("homePage.fxml"));
        homeScene = new Scene(fxmlHome, 1920, 1080); // Cache tela 2

        Parent fxmlFunc = FXMLLoader.load(getClass().getResource("funcPage.fxml"));
        funcScene = new Scene(fxmlFunc, 1920, 1080); // Cache tela 3

        Parent fxmlMed = FXMLLoader.load(getClass().getResource("medPage.fxml"));
        medScene = new Scene(fxmlMed, 1920, 1080); // Cache tela 4

        Parent fxmlClient = FXMLLoader.load(getClass().getResource("clientPage.fxml"));
        clientScene = new Scene(fxmlClient, 1920, 1080); // Cache tela

        primaryStage.setScene(mainScene); // Definindo tela principal/inicial
        primaryStage.show(); // mostrando a cena
    }

    public static void changedScene(String scr){ // metodo que muda a tela
        switch (scr){
            case "main":
                stage.setScene(mainScene);
                break;
            case "home":
                stage.setScene(homeScene);
                break;
            case "func":
                stage.setScene(funcScene);
                break;
            case "med":
                stage.setScene(medScene);
                break;
            case "client":
                stage.setScene(clientScene);
                break;
        }
    }

    public static void main(String[] args) {
        launch();
    }
}