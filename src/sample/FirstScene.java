package sample;
import javafx.animation.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class FirstScene extends Application {


    public ImageView click;
    public ImageView clickCustomer;
    public ImageView clickManager;
    public AnchorPane hideCustomer;
    public AnchorPane hideManager;
    public ImageView buttonSitNEat,buttonDelivery,buttonOrder;
    public ImageView firstImgHide,secondImgHide,thirdImgHide,forthImgHide,fifthImgHide;
    private static String customerOrManager; //With the same Image Buttons at SecondScene opens different TableScene for Manager/Customer
    private String payMessage;


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("thevision");
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        loader.setController(new FirstScene());
        customerOrManager="Customer";

        primaryStage.initStyle(StageStyle.TRANSPARENT);
        Pane layout1 = new Pane();
        //TODO:fix buttons
        layout1.getChildren().add(loader.load());
        Scene scene1 = new Scene(layout1, 600, 400);
        primaryStage.setScene(scene1);
        primaryStage.setTitle("Menu");
        primaryStage.show();
    }
    //button "X"
    public void mousePressed() {
        Stage window = (Stage) click.getScene().getWindow();
        window.close();
    }

    //Goes to FirstSceneManager. FirstSceneManager uses String "Manager" so it can open the
    //same second scene but then with if and else opens different ThirdScene from the same ImageView buttons.
    public void clickManager() {
        final Duration sec_2 = Duration.millis(2000);
        final Duration sec_1 = Duration.millis(1000);

        ScaleTransition resize = new ScaleTransition(sec_1);
        resize.setByX(-1f);
        resize.setByY(-1f);
        resize.setAutoReverse(true);
        PauseTransition openManagerScene = new PauseTransition(sec_1);
        openManagerScene.setOnFinished(e -> FirstSceneManager.displayManager(payMessage));
        PauseTransition closeFirstScene = new PauseTransition(Duration.seconds(0.1));
        Stage window2 = (Stage)hideManager.getScene().getWindow();
        closeFirstScene.setOnFinished(e-> window2.close());
        SequentialTransition seqT = new SequentialTransition(clickManager, resize, openManagerScene,closeFirstScene);
        seqT.play();
        FadeTransition fade = new FadeTransition(sec_1,clickCustomer);
        fade.setFromValue(1.0);
        fade.setToValue(0);
        fade.play();
        FadeTransition fade1 = new FadeTransition(sec_1,firstImgHide);
        fade1.setFromValue(1.0);
        fade1.setToValue(0);
        fade1.play();
        FadeTransition fade2 = new FadeTransition(sec_1,secondImgHide);
        fade2.setFromValue(1.0);
        fade2.setToValue(0);
        fade2.play();
        FadeTransition fade3 = new FadeTransition(sec_1,thirdImgHide);
        fade3.setFromValue(1.0);
        fade3.setToValue(0);
        fade3.play();
        FadeTransition fade4 = new FadeTransition(sec_1,forthImgHide);
        fade4.setFromValue(1.0);
        fade4.setToValue(0);
        fade4.play();
        FadeTransition fade5 = new FadeTransition(sec_1,fifthImgHide);
        fade5.setFromValue(1.0);
        fade5.setToValue(0);
        fade5.play();
    }

    //At the same Scene reveals a hidden Pane and some animations
    public void clickCustomer() {
        final Duration sec_2 = Duration.millis(2000);
        final Duration sec_1 = Duration.millis(1000);
        PauseTransition reveal = new PauseTransition(Duration.seconds(1));
        reveal.setOnFinished(e -> hideCustomer.setVisible(true));
        reveal.setOnFinished(e -> hideCustomer.setStyle("-fx-background-color: white "));
        TranslateTransition move = new TranslateTransition(sec_2);
        move.setToX(-178);
        move.setToY(-303);
        ScaleTransition resize = new ScaleTransition(sec_1);
        resize.setByX(-0.55f);
        resize.setByY(-0.55f);
        resize.setAutoReverse(true);

        SequentialTransition seqT = new SequentialTransition(clickCustomer, resize, move, reveal);
        seqT.play();

        FadeTransition fade = new FadeTransition(sec_1,clickManager);
        fade.setFromValue(1.0);
        fade.setToValue(0);
        fade.play();
        FadeTransition fade1 = new FadeTransition(sec_1,firstImgHide);
        fade1.setFromValue(1.0);
        fade1.setToValue(0);
        fade1.play();
        FadeTransition fade2 = new FadeTransition(sec_1,secondImgHide);
        fade2.setFromValue(1.0);
        fade2.setToValue(0);
        fade2.play();
        FadeTransition fade3 = new FadeTransition(sec_1,thirdImgHide);
        fade3.setFromValue(1.0);
        fade3.setToValue(0);
        fade3.play();
        FadeTransition fade4 = new FadeTransition(sec_1,forthImgHide);
        fade4.setFromValue(1.0);
        fade4.setToValue(0);
        fade4.play();
        FadeTransition fade5 = new FadeTransition(sec_1,fifthImgHide);
        fade5.setFromValue(1.0);
        fade5.setToValue(0);
        String result = ""; //if exception is found result = not found if word is found result = thatword
        fade5.play();
        PauseTransition hideImg = new PauseTransition(sec_1);
        hideImg.setOnFinished(e->firstImgHide.setVisible(false));
        hideImg.play();
        PauseTransition  hideImg1= new PauseTransition(sec_1);
        hideImg1.setOnFinished(e->secondImgHide.setVisible(false));
        hideImg1.play();
        PauseTransition hideImg2= new PauseTransition(sec_1);
        hideImg2.setOnFinished(e->thirdImgHide.setVisible(false));
        hideImg2.play();
        PauseTransition hideImg3 = new PauseTransition(sec_1);
        hideImg3.setOnFinished(e->forthImgHide.setVisible(false));
        hideImg3.play();
        PauseTransition hideImg4 = new PauseTransition(sec_1);
        hideImg4.setOnFinished(e->fifthImgHide.setVisible(false));
        hideImg4.play();
        PauseTransition hideImg5 = new PauseTransition(sec_1);
        hideImg5.setOnFinished(e->clickManager.setVisible(false));
        hideImg5.play();



    }
    //order in a digital way when in the restaurant
    public void buttonClickSit(){
        payMessage=buttonSitNEat.getId();//at the PayScene those give different messages for the type of service you have chosen
        SecondScene.display1(payMessage,customerOrManager);
        Stage window = (Stage) buttonSitNEat.getScene().getWindow();
        window.close();

    }
    //order and take from restaurant
    public void buttonClickOrder(){
        payMessage=buttonDelivery.getId();
        SecondScene.display1(payMessage,customerOrManager);
        Stage window = (Stage) buttonSitNEat.getScene().getWindow();
        window.close();

    }
    //order at address
    public void buttonClickDelivery(){
        payMessage=buttonOrder.getId();
        SecondScene.display1(payMessage,customerOrManager);
        Stage window = (Stage) buttonSitNEat.getScene().getWindow();
        window.close();
    }

    public void mouseEnteredCustomer() {
        clickCustomer.setRotate(2);
        PauseTransition rotate = new PauseTransition(Duration.millis(100));
        rotate.setOnFinished(e -> clickCustomer.setRotate(-4));
        rotate.play();
        PauseTransition roate1 = new PauseTransition(Duration.millis(200));
        roate1.setOnFinished(e -> clickCustomer.setRotate(2));
        roate1.play();
        PauseTransition roate3 = new PauseTransition(Duration.millis(300));
        roate3.setOnFinished(e -> clickCustomer.setRotate(-2));
        roate3.play();
        PauseTransition rotate4 = new PauseTransition(Duration.millis(400));
        rotate4.setOnFinished(e -> clickCustomer.setRotate(0));
        rotate4.play();
    }
    public void mouseEnteredManager(){
        clickManager.setRotate(2);
        PauseTransition rotate = new PauseTransition(Duration.millis(100));
        rotate.setOnFinished(e -> clickManager.setRotate(-4));
        rotate.play();
        PauseTransition rotate1 = new PauseTransition(Duration.millis(200));
        rotate1.setOnFinished(e -> clickManager.setRotate(2));
        rotate1.play();
        PauseTransition rotate2 = new PauseTransition(Duration.millis(300));
        rotate2.setOnFinished(e -> clickManager.setRotate(-2));
        rotate2.play();
        PauseTransition rotate3 = new PauseTransition(Duration.millis(400));
        rotate3.setOnFinished(e -> clickManager.setRotate(0));
        rotate3.play();
    }
}