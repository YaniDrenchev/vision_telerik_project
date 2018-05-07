package sample;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;



public class NoSuchProduct {
    public static void display(String title,String message){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setWidth(250);
        window.setHeight(200);
        Label label1 = new Label();
        label1.setText(message);
        Button addButton = new Button("Thank you");
        addButton.setOnAction(e->window.close());
        VBox layout = new VBox(10);
        layout.getChildren().addAll(label1,addButton);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
    }

}
