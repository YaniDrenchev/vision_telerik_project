package sample;
import javafx.animation.*;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.awt.*;


public class FirstSceneManager extends FirstScene {
    public static ImageView addRestView, addMenuView;
    public static  Pane animationHelp,animationHelp1;
    public static void displayManager(String paymessage) {
        Stage window = new Stage();
        window.setTitle("thevision");
        window.initStyle(StageStyle.TRANSPARENT);
        String customerOrManager="Manager";

        Pane layout1 = new Pane();

        animationHelp = new Pane();
        animationHelp.setStyle("-fx-min-height:100;-fx-min-width:100;-fx-background-color: Transparent ");
        animationHelp.setLayoutX(375);
        animationHelp.setLayoutY(156);
        animationHelp.setOnMousePressed(e->ThirdSceneManager.display());
        animationHelp.setOnMouseEntered(e->mouseEnteredCustomer1());
        animationHelp1 = new Pane();
        animationHelp1.setStyle("-fx-min-height:100;-fx-min-width:100;-fx-background-color: transparent");
        animationHelp1.setLayoutX(120);
        animationHelp1.setLayoutY(145);
        animationHelp1.setOnMousePressed(e->SecondScene.display1(paymessage,customerOrManager));
        animationHelp1.setOnMouseEntered(e->mouseEnteredManager1());

        Image addMenu = new Image("/resources/menu1.png");
        addMenuView = new ImageView(addMenu);
        addMenuView.setFitHeight(100);
        addMenuView.setFitWidth(100);
        addMenuView.setY(150);
        addMenuView.setX(380);

        Image addRest = new Image("/resources/addrest.png");
        addRestView = new ImageView(addRest);
        addRestView.setFitWidth(100);
        addRestView.setFitHeight(100);
        addRestView.setY(150);
        addRestView.setX(120);

        layout1.getChildren().addAll(addMenuView, addRestView,animationHelp,animationHelp1);
        layout1.setStyle("-fx-border-color: black ; -fx-border-width: 5");

        Scene scene1 = new Scene(layout1, 600, 400);

        window.setScene(scene1);
        window.setTitle("Menu");
        window.show();
    }
    public static void mouseEnteredManager1(){
        ScaleTransition resize = new ScaleTransition(Duration.millis(500),addRestView);
        resize.setByX(-0.5f);
        resize.setToX(-1f);
        resize.play();
        ScaleTransition resize1 = new ScaleTransition(Duration.millis(500),addRestView);
        resize1.setByX(0.5f);
        resize1.setToX(1f);
        resize1.play();
        SequentialTransition seqT = new SequentialTransition(resize,resize1);
        seqT.play();

    }
    public static void mouseEnteredCustomer1(){
        ScaleTransition resize = new ScaleTransition(Duration.millis(500),addMenuView);
        resize.setByX(-0.5f);
        resize.setToX(-1f);
        resize.play();
        ScaleTransition resize1 = new ScaleTransition(Duration.millis(500),addMenuView);
        resize1.setByX(0.5f);
        resize1.setToX(1f);
        resize1.play();
        SequentialTransition seqT = new SequentialTransition(resize,resize1);
        seqT.play();
    }
}
