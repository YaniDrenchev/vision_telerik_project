package sample;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;



public class NoSuchProduct {
    public static void display(){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Wrong Restaurant name");
        window.setWidth(250);
        window.setHeight(200);
        Label label1 = new Label();
        label1.setText("There is no restaurant with such name");
        Button addButton = new Button("Try Again");
        addButton.setOnAction(e->window.close());
        VBox layout = new VBox(10);
        layout.getChildren().addAll(label1,addButton);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
    }

}
