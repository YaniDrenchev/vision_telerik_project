package sample;
import domain.Index;
import javafx.animation.PauseTransition;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.image.ImageView ;
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class SecondScene extends FirstScene {
    private static ImageView CHINESE,PIZZA,INDIAN,SUSHI,CAFETERIA,PUB;
    private static String payMessage1;
    private static String customerManager;
    private static Index index1 = null;
    public static void display1(String payMessage,String customerOrManager) {
        Stage window = new Stage();
        window.setTitle("thevision");
        window.initStyle(StageStyle.TRANSPARENT);
        payMessage1=payMessage;
        customerManager=customerOrManager;
        Pane layout5 = new Pane();

        AnchorPane header = new AnchorPane();
        header.setMinHeight(100);
        header.setMinWidth(600);
        header.setStyle("-fx-background-color:#A92232");

        AnchorPane root = new AnchorPane();
        root.setMinHeight(347);
        root.setMinWidth(600);
        root.setTranslateY(53);
        root.setStyle("-fx-background-color:white");

        Image vision = new Image("/resources/vision.png");
        ImageView visionView = new ImageView(vision);
        visionView.setY(200);
        visionView.setX(190);
        visionView.setFitHeight(50);
        visionView.setFitWidth(222);

        Image pizza = new Image("/resources/pizza.png");
        PIZZA = new ImageView(pizza);
        PIZZA.setFitHeight(150);
        PIZZA.setFitWidth(150);
        PIZZA.setY(272);
        PIZZA.setX(230);
        PIZZA.setId("PIZZA");
        PIZZA.setOnMousePressed(e->close(PIZZA));
        PIZZA.setOnMouseEntered(e->shake(PIZZA));

        Image chinese = new Image("/resources/chinese.jpg");
        CHINESE = new ImageView(chinese);
        CHINESE.setFitHeight(190);
        CHINESE.setFitWidth(230);
        CHINESE.setX(-10);
        CHINESE.setY(165);
        CHINESE.setId("CHINESE");
        CHINESE.setOnMousePressed(e->close(CHINESE));
        CHINESE.setOnMouseEntered(e->shake(CHINESE));

        Image cafeterias = new Image("/resources/cafeteria.jpg");
        CAFETERIA = new ImageView(cafeterias);
        CAFETERIA.setFitHeight(135);
        CAFETERIA.setFitWidth(250);
        CAFETERIA.setX(365);
        CAFETERIA.setY(225);
        CAFETERIA.setId("CAFETERIA");
        CAFETERIA.setOnMousePressed(e->close(CAFETERIA));
        CAFETERIA.setOnMouseEntered(e->shake(CAFETERIA));

        Image indians = new Image("/resources/indian4.jpg");
        INDIAN = new ImageView(indians);
        INDIAN.setFitHeight(100);
        INDIAN.setFitWidth(200);
        INDIAN.setX(193);
        INDIAN.setY(60);
        INDIAN.setId("INDIAN");
        INDIAN.setOnMousePressed(e->close(INDIAN));
        INDIAN.setOnMouseEntered(e->shake(INDIAN));

        Image sushi = new Image("/resources/sushi.png");
        SUSHI = new ImageView(sushi);
        SUSHI.setFitHeight(200);
        SUSHI.setFitWidth(185);
        SUSHI.setX(405);
        SUSHI.setY(60);
        SUSHI.setId("SUSHI");
        SUSHI.setOnMousePressed(e->close(SUSHI));
        SUSHI.setOnMouseEntered(e->shake(SUSHI));

        Image pubs = new Image("/resources/pub.png");
        PUB = new ImageView(pubs);
        PUB.setFitHeight(105);
        PUB.setFitWidth(250);
        PUB.setX(-20);
        PUB.setY(100);
        PUB.setId("PUB");
        PUB.setOnMousePressed(e->close(PUB));
        PUB.setOnMouseEntered(e->shake(PUB));

        layout5.getChildren().addAll(header,root,CHINESE,CAFETERIA,PIZZA,SUSHI,PUB,INDIAN,visionView);
        Scene scene2 = new Scene(layout5,600, 400);

        window.setScene(scene2);
        window.show();
    }
    public static void shake(ImageView current){
        current.setRotate(2);
        PauseTransition delay = new PauseTransition(Duration.millis(100));
        delay.setOnFinished(e -> current.setRotate(-4));
        delay.play();
        PauseTransition delay1 = new PauseTransition(Duration.millis(200));
        delay1.setOnFinished(e -> current.setRotate(2));
        delay1.play();
        PauseTransition delay2 = new PauseTransition(Duration.millis(300));
        delay2.setOnFinished(e -> current.setRotate(-2));
        delay2.play();
        PauseTransition delay3 = new PauseTransition(Duration.millis(400));
        delay3.setOnFinished(e -> current.setRotate(0));
        delay3.play();

    }
    public static void close(ImageView current){
        //if SecondScene has been opened from FirstSceneManager it uses String="Manager" else customer.
        if (customerManager.equals("Manager")){
            SecondSceneManager.display(current.getId());
            Stage window1 = (Stage) current.getScene().getWindow();
            window1.close();

        }else{
        ThirdScene.display2(current.getId(),payMessage1,payMessage1);
        Stage window1 = (Stage) current.getScene().getWindow();
        window1.close();
        }
    }
}
