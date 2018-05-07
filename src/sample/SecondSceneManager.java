package sample;

import com.compan.Customer;
import com.compan.Gender;
import com.compan.Manager;
import domain.*;
import domain.food.Drink;
import domain.food.Food;
import domain.food.Item;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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

import java.util.ArrayList;

public class SecondSceneManager extends FirstScene {
    private static TextField nameInputRestaurant1,addressInput;
    private static Index index1 = null;
    private static TableView<ISearchable> table1;

    public static void display(String type) {
        Scene scene;
        Stage window = new Stage();
        window.setTitle("Create new restaurant");
        index1 = Index.getInstance();
        nameInputRestaurant1 = new TextField();
        nameInputRestaurant1.setPromptText("Restaurant name");
        nameInputRestaurant1.setMinWidth(100);
        addressInput = new TextField();
        addressInput.setPromptText("Restaurant address");
        addressInput.setMinWidth(100);

        TableColumn<ISearchable, String> nameColumnRestaurants = new TableColumn<>("Name");
        nameColumnRestaurants.setMinWidth(200);
        nameColumnRestaurants.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<ISearchable, String> addressColumn = new TableColumn<>("Address");
        addressColumn.setMinWidth(200);
        addressColumn.setCellValueFactory(new PropertyValueFactory<>("address"));

        table1 = new TableView<>();

        Restaurant rest1 = new Restaurant("Дон Вито", Type.PIZZA, "http://pizzadonvito.com/bg/", "0889934934", "бул. Васил Левски, 34, София", "Пица за душата от Италия", new Manager("Васил Цветков", Gender.MALE));
        Restaurant rest2 = new Restaurant("Дон Вито–2", Type.PIZZA, "http://pizzadonvito.com/bg/", "0889934934", "ул. Христо Ботев 43, София", "Пица за душата от Италия", new Manager("Васил Цветков", Gender.MALE));
        Restaurant rest3 = new Restaurant("Casa Mia", Type.PIZZA, "http://casamia.com/bg/", "08834344934", "бл 153, Младост 3, София", "Твоята пицария в Младост ", new Manager("Васил Цветков", Gender.MALE));
        Restaurant rest4 = new Restaurant("Die Alte Lampe", Type.PUB, "http://alteLampe.com/bg/", "0883435934", "бул Дондуков 42, София", "Студена бира в гореща вечер", new Manager("Васил Цветков", Gender.MALE));
        Restaurant rest5 = new Restaurant("Test", Type.CHINESE, "tets.bg", "3434523", "Lulin 10", "Test hrana za vkushti", new Manager("Васил Цветков", Gender.MALE));
        Restaurant rest10 = new Restaurant("Casa de Lava", Type.PIZZA, "http://pizzadonvito.com/", "0889934934", "бул. Васил Левски, 34, София", "Пица за душата от Италия", new Manager("Васил Цветков", Gender.MALE));
        index1.addToList(rest1);
        index1.addToList(rest2);
        index1.addToList(rest3);
        index1.addToList(rest4);
        index1.addToList(rest5);



        ArrayList<ISearchable> restaurantsOfType = index1.findByType(Type.valueOf(type));
        ObservableList<ISearchable> restaurantOfType = FXCollections.observableArrayList(restaurantsOfType);
        table1.setItems(restaurantOfType);
        table1.getColumns().addAll(nameColumnRestaurants, addressColumn);


        VBox vBoxRestaurant = new VBox();
        Button addButton = new Button("Add");
        addButton.setOnAction(e -> addRestaurant());
        Button deleteButton = new Button("Delete");

        HBox hBoxRestaurant = new HBox();
        hBoxRestaurant.setPadding(new Insets(10, 10, 10, 10));
        hBoxRestaurant.setSpacing(10);
        hBoxRestaurant.getChildren().addAll(nameInputRestaurant1,addressInput,addButton);
        vBoxRestaurant.getChildren().addAll(table1, hBoxRestaurant);

        scene = new Scene(vBoxRestaurant);

        window.setScene(scene);
        window.show();


    }

        public static void addRestaurant(){
            Restaurant restAdd = new Restaurant();
            restAdd.setName(nameInputRestaurant1.getText());
            restAdd.setAddress(addressInput.getText());
            table1.getItems().add(restAdd);
            nameInputRestaurant1.clear();
            addressInput.clear();

    }
}
