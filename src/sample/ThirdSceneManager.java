package sample;


import com.compan.Gender;
import com.compan.Manager;
import domain.IAddable;
import domain.Index;
import domain.Restaurant;
import domain.Type;
import domain.food.Food;
import domain.food.Item;

import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.NoSuchElementException;

public class ThirdSceneManager extends SecondSceneManager {
    private static TextField nameInputRestaurant1, contentInput, priceInput;
    private static TableView<IAddable> table1;
    private static Index index1 = null;

    public static void display() {
        Scene scene;
        Stage window = new Stage();
        window.setTitle("Add new menu");

        nameInputRestaurant1 = new TextField();
        nameInputRestaurant1.setPromptText("Product name");
        nameInputRestaurant1.setMinWidth(100);
        contentInput = new TextField();
        contentInput.setPromptText("Product content");
        contentInput.setMinWidth(100);
        priceInput = new TextField();
        priceInput.setPromptText("Product price");
        priceInput.setMinWidth(100);

        TableColumn<IAddable, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<IAddable, Double> contentColumn = new TableColumn<>("Content");
        contentColumn.setMinWidth(200);
        contentColumn.setCellValueFactory(new PropertyValueFactory<>("content"));

        TableColumn<IAddable, Double> priceColumn = new TableColumn<>("Price");
        priceColumn.setMinWidth(200);
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
        table1 = new TableView<>();
        table1.getColumns().addAll(nameColumn, contentColumn, priceColumn);


        VBox vBoxRestaurant = new VBox();
        Button addButton = new Button("Add");
        addButton.setOnAction(e -> addRestaurant());
        Button deleteButton = new Button("Delete");
        deleteButton.setOnAction(event -> deleteProduct());
        HBox hBoxRestaurant = new HBox();
        hBoxRestaurant.setPadding(new Insets(10, 10, 10, 10));
        hBoxRestaurant.setSpacing(10);
        hBoxRestaurant.getChildren().addAll(nameInputRestaurant1, contentInput, priceInput, addButton, deleteButton);
        vBoxRestaurant.getChildren().addAll(table1, hBoxRestaurant);

        scene = new Scene(vBoxRestaurant);

        window.setScene(scene);
        window.show();


    }

    public static void deleteProduct() {
        try {
            ObservableList<IAddable> productsSelected, allProducts;
            allProducts = table1.getItems();
            productsSelected = table1.getSelectionModel().getSelectedItems();
            productsSelected.forEach(allProducts::remove);
        } catch (NoSuchElementException ex) {
            Stage window = new Stage();
            window.setTitle("No products");
            window.setWidth(250);
            window.setHeight(200);

            VBox layout = new VBox(10);
            Label label1 = new Label();
            label1.setText("There are no products");
            Button addButton = new Button("Back");
            addButton.setOnAction(e -> window.close());
            layout.getChildren().addAll(label1, addButton);
            layout.setAlignment(Pos.CENTER);

            Scene scene = new Scene(layout);

            window.setScene(scene);
            window.showAndWait();
        }
    }

    public static void addRestaurant() {
        try {

            Item restAdd = new Food(nameInputRestaurant1.getText(), Double.parseDouble(contentInput.getText()), Double.parseDouble(priceInput.getText()), "new item", true);
            table1.getItems().add(restAdd);
            nameInputRestaurant1.clear();
            contentInput.clear();
            priceInput.clear();
        } catch (NumberFormatException e) {
            Stage window = new Stage();
            window.initModality(Modality.APPLICATION_MODAL);
            window.setTitle("Invalid content or price");
            window.setWidth(300);
            window.setHeight(100);

            Label label1 = new Label();
            label1.setText("Your content and price must be a number");

            VBox layout = new VBox(10);
            Button addButton = new Button("Try Again");
            addButton.setOnAction(n -> window.close());
            layout.getChildren().addAll(label1, addButton);
            layout.setAlignment(Pos.CENTER);

            Scene scene = new Scene(layout);

            window.setScene(scene);
            window.showAndWait();
        }
    }
}

