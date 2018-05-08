package sample;

import com.compan.Customer;
import domain.ISearchable;
import domain.Restaurant;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class InvalidRankCustomException extends Exception{
    static void validate(String rank, Customer customerNew, ISearchable currentRest)throws InvalidRankCustomException {
        if (Double.parseDouble(rank) >0 && Double.parseDouble(rank) <=5){
            customerNew.evaluate((Restaurant) currentRest,Double.parseDouble(rank));
        }else {throw new InvalidRankCustomException();}
    }
    public void getException(String rank, Customer customerNew, ISearchable currentRest) {
        try {
            validate(rank,customerNew,currentRest);
        }catch (Exception m){
            Stage window = new Stage();
            window.setTitle("Wrong Rank");
            window.setWidth(350);
            window.setHeight(150);

            VBox layout = new VBox(10);
            Label label1 = new Label();
            label1.setText("The rank must be a number between 0 and 5");
            Button tryButton = new Button("Try Again");
            tryButton.setOnAction(e -> window.close());
            layout.getChildren().addAll(label1, tryButton);
            layout.setAlignment(Pos.CENTER);

            Scene scene = new Scene(layout);

            window.setScene(scene);
            window.showAndWait();
        }
    }
}
