package sample;


import domain.IAddable;
import domain.food.Food;
import domain.food.Item;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ThirdSceneManager extends SecondSceneManager {
        private static TextField nameInputRestaurant1,contentInput,priceInput;
        private static TableView<IAddable> table1;
    public static void display(){
            Scene scene;
            Stage window = new Stage();
            window.setTitle("Add new menu");

            nameInputRestaurant1 = new TextField();
            nameInputRestaurant1.setPromptText("Restaurant name");
            nameInputRestaurant1.setMinWidth(100);
            contentInput = new TextField();
            contentInput.setPromptText("Restaurant address");
            contentInput.setMinWidth(100);
            priceInput = new TextField();
            priceInput.setPromptText("Restaurant address");
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
            table1.getColumns().addAll(nameColumn, contentColumn,priceColumn);


            VBox vBoxRestaurant = new VBox();
            Button addButton = new Button("Add");
            addButton.setOnAction(e -> addRestaurant());
            Button deleteButton = new Button("Delete");

            HBox hBoxRestaurant = new HBox();
            hBoxRestaurant.setPadding(new Insets(10, 10, 10, 10));
            hBoxRestaurant.setSpacing(10);
            hBoxRestaurant.getChildren().addAll(nameInputRestaurant1,contentInput,priceInput,addButton,deleteButton);
            vBoxRestaurant.getChildren().addAll(table1, hBoxRestaurant);

            scene = new Scene(vBoxRestaurant);

            window.setScene(scene);
            window.show();


        }

        public static void addRestaurant(){
            Item restAdd = new Food(nameInputRestaurant1.getText(),Double.parseDouble(contentInput.getText()),Double.parseDouble(priceInput.getText()),"new item",true);
            table1.getItems().add(restAdd);
            nameInputRestaurant1.clear();
            contentInput.clear();
            priceInput.clear();

        }
    }

