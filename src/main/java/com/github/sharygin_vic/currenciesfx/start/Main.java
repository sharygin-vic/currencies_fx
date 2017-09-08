package com.github.sharygin_vic.currenciesfx.start;


import com.github.sharygin_vic.currenciesfx.controller.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        final String fxmlMainFile = "/fxml/main.fxml";
        FXMLLoader fxmlLoader = new FXMLLoader();
        java.net.URL url =  getClass().getResource(fxmlMainFile);
        fxmlLoader.setLocation(url);
        Parent fxmlMain = fxmlLoader.load();
        MainController mainController = fxmlLoader.getController();
        mainController.setMainStage(primaryStage);

        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/imgs/mainicon.png")));

        primaryStage.setTitle("Currency rate history");
        primaryStage.setMinHeight(600);
        primaryStage.setMinWidth(800);
        primaryStage.setScene(new Scene(fxmlMain, 800, 600));
        primaryStage.show();
    }
}
