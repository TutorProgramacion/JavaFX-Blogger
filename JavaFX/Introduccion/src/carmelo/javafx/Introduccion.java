/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carmelo.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Carmelo Marin Abrego
 */
public class Introduccion extends Application {

    @Override
    public void init() throws Exception {
        System.out.println("Inicializando applicacion...");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        TextField txt = new TextField();
        txt.setPromptText("Dime tu nombre");

        Button btn = new Button("Saludar");
        btn.setOnAction(e -> System.out.println("Hola: " + txt.getText()));

        VBox root = new VBox(5.0);
        root.setPadding(new Insets(10.0));
        root.setAlignment(Pos.CENTER);
        root.getChildren().add(btn);
        root.getChildren().add(txt);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hola JavaFX 8");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        System.out.println("Deteniendo applicacion...");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
