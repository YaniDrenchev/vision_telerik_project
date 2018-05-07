package sample;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class FirstSceneManager extends FirstScene {
    public static ImageView addRestView, addMenuView;
    public static void displayManager(String paymessage) {
        Stage window = new Stage();
        window.setTitle("thevision");
        window.initStyle(StageStyle.TRANSPARENT);
        String customerOrManager="Manager";

        window.initStyle(StageStyle.TRANSPARENT);
        Pane layout1 = new Pane();
        layout1.setStyle("-fx-background-color: #A92232;");
        Image addRest = new Image("/resources/addrest.png");
        Image addMenu = new Image("/resources/menu1.png");
        addMenuView = new ImageView(addMenu);
        addRestView = new ImageView(addRest);
        addRestView.setFitWidth(100);
        addRestView.setFitHeight(100);
        addRestView.setOnMousePressed(e->SecondScene.display1(paymessage,customerOrManager));
        addMenuView.setFitHeight(100);
        addMenuView.setFitWidth(100);
        addRestView.setY(150);
        addRestView.setX(120);
        addMenuView.setY(150);
        addMenuView.setX(380);
        layout1.getChildren().addAll(addMenuView, addRestView);
        layout1.setStyle("-fx-border-color: black ; -fx-border-width: 5");
        Scene scene1 = new Scene(layout1, 600, 400);
        window.setScene(scene1);
        window.setTitle("Menu");
        window.show();
    }
}
