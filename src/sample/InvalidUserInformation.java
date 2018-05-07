package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class InvalidUserInformation {
    public static void display() {
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Unknown Gender Type or too long Name");
        window.setWidth(500);
        window.setHeight(200);

        Label label1 = new Label();
        label1.setText("Your gender input is invalid or your Name is too long");
        Label label2 = new Label();
        label2.setText("Gender choice should be from male and female and name should be less than 32 symbols");


        VBox layout = new VBox(10);
        Button addButton = new Button("Try Again");
        addButton.setOnAction(n -> window.close());
        layout.getChildren().addAll(label1,label2,addButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);

        window.setScene(scene);
        window.showAndWait();
    }
}