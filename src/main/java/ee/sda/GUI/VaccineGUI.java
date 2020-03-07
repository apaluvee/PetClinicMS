package ee.sda.GUI;

import ee.sda.Main;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VaccineGUI extends Application {
    @Override
    public void init() throws Exception{
        System.out.println("Initialization");
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        System.out.println("Starting");
        VBox vaccineWindow= new VBox();
        Label label= new Label("Vaccine Menu");


        Button ExitButton=new Button("Exit");
        ExitButton.setOnAction(e-> Platform.exit());
        vaccineWindow.getChildren().addAll(ExitButton);

        Scene scene=new Scene(vaccineWindow);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    @Override
    public void stop()throws  Exception{
        System.out.println("Exiting...");

    }

    public static void main(String[] args) {

    }
}
