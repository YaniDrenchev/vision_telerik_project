package sample;

import com.compan.Customer;
import com.compan.Gender;
import domain.ISearchable;
import domain.Restaurant;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class PayScene extends FirstScene {
    private static TextField nameInput, genderInput, usernameInput, commentInput, rankInput;
    private static Button addCommentButton, addRankButton;
    public static Customer custNew;

    public static void displayPay(ISearchable currentRest, double n, String message) {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Pay");
        window.setWidth(500);
        window.setHeight(400);
        Label payMessage = new Label();
        payMessage.setText(message);
        nameInput = new TextField();
        nameInput.setPromptText("Your Name");
        nameInput.setMinWidth(100);
        genderInput = new TextField();
        genderInput.setPromptText("Your Gender");
        genderInput.setMinWidth(100);
        usernameInput = new TextField();
        usernameInput.setPromptText("Your Username");
        usernameInput.setMinWidth(100);
        commentInput = new TextField();
        commentInput.setPromptText("Your comment for the restaurant");
        commentInput.setMinWidth(100);
        commentInput.setVisible(false);
        rankInput = new TextField();
        rankInput.setPromptText("Your rank for the restaurant");
        rankInput.setMinWidth(100);
        rankInput.setVisible(false);
        Button createButton = new Button("Create");
        createButton.setOnAction(e -> createButton());
        addRankButton = new Button("Add Rating");
        addRankButton.setOnAction(e -> rankButton(currentRest));
        addRankButton.setVisible(false);
        addCommentButton = new Button("Add Comment");
        addCommentButton.setOnAction(e -> commentButton(currentRest));
        addCommentButton.setVisible(false);
        if (message.equals("buttonSitNEat")) {
            payMessage.setText("Your order will be served by a waiter after 20 minutes, your bill is: " + n);
        }
        if (message.equals("buttonDelivery")) {
            payMessage.setText("Your order will be delivered at your address after 40 minutes, your bill is: " + n);
        }
        if (message.equals("buttonOrder")) {
            payMessage.setText("Your order will be ready after 15 minutes and you may collect it at the orders bar, your bill is: " + n);
        }

        Button addButton = new Button("Thank you");
        addButton.setOnAction(e -> window.close());
        VBox layout = new VBox(10);
        layout.getChildren().addAll(payMessage, addButton, nameInput, genderInput, usernameInput, createButton, commentInput, addCommentButton, rankInput, addRankButton);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
        window.close();
    }

    public static void createButton() {
        try {
            custNew = new Customer(nameInput.getText(), Gender.valueOf(genderInput.getText().toUpperCase()), usernameInput.getText());
            addCommentButton.setVisible(true);
            commentInput.setVisible(true);
        } catch (IllegalArgumentException e) {
            Stage window = new Stage();
            window.initModality(Modality.APPLICATION_MODAL);
            window.setTitle("Unknown Gender Type");
            window.setWidth(250);
            window.setHeight(200);
            Label label1 = new Label();
            label1.setText("Write:Male or Female");
            Button addButton = new Button("Try Again");
            addButton.setOnAction(n -> window.close());
            VBox layout = new VBox(10);
            layout.getChildren().addAll(label1, addButton);
            layout.setAlignment(Pos.CENTER);
            Scene scene = new Scene(layout);
            window.setScene(scene);
            window.showAndWait();
        }

    }

    public static void commentButton(ISearchable currentRest) {

        custNew.writeAComment((Restaurant) currentRest, commentInput.getText());
        ((Restaurant) currentRest).displayAllCustomerComments();
        addRankButton.setVisible(true);
        rankInput.setVisible(true);

    }

    public static void rankButton(ISearchable currentRest) {
        custNew.evaluate((Restaurant) currentRest, 8.4);
    }
}
