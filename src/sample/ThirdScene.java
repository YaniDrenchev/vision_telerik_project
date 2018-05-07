package sample;
import com.compan.Customer;
import com.compan.Gender;
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
import sample.ExceptionClass;

import java.util.ArrayList;

public class ThirdScene extends FirstScene {
    private static TextField  nameInputRestaurant1;
    private static Index index1 = null;
    private static String payMessage1;
    private static String managerCustomer;
    public static void display2(String type,String payMessage,String managerOrCustomer){
        Scene scene3;
        Stage window = new Stage();
        payMessage1=payMessage;
        managerCustomer=managerOrCustomer;
        TableView<ISearchable> table1;
        TableColumn<ISearchable, String> nameColumnRestaurants = new TableColumn<>("Name");
        nameColumnRestaurants.setMinWidth(200);
        nameColumnRestaurants.setCellValueFactory(new PropertyValueFactory<>("name"));
        TableColumn<ISearchable, String> addressColumn = new TableColumn<>("Address");
        addressColumn.setMinWidth(200);
        addressColumn.setCellValueFactory(new PropertyValueFactory<>("address"));

        TableColumn<ISearchable, Integer> ratingColumn = new TableColumn<>("Rating");
        ratingColumn.setMinWidth(100);
        ratingColumn.setCellValueFactory(new PropertyValueFactory<>("rating"));
        table1 = new TableView<>();

        index1 = Index.getInstance();
        Item bread = new Food("Gorna Bania",0.99,1500.00,"Ph 9.65, Mineral Water From Gorna Bania", false);
        Item wine = new Food("Gorna Bania",0.99,1500.00,"Ph 9.65, Mineral Water From Gorna Bania", false);
        ArrayList<Item> rest1List = new ArrayList<>();
        rest1List.add(bread);
        rest1List.add(wine);

        //ISearchable casaMia = index1.findByName("Дон Вито");
        //Item foood = new Food("na", 8);
        //((Restaurant) casaMia).getList().add(foood);
        //add Restaurants
        Restaurant rest1 = new Restaurant("Дон Вито", Type.PIZZA, "http://pizzadonvito.com/bg/", "0889934934", "бул. Васил Левски, 34, София",  "Пица за душата от Италия", rest1List);
        Restaurant rest2 = new Restaurant("Дон Вито–2", Type.PIZZA, "http://pizzadonvito.com/bg/", "0889934934", "ул. Христо Ботев 43, София",   "Пица за душата от Италия", rest1List);
        Restaurant rest3 = new Restaurant("Casa Mia", Type.PIZZA, "http://casamia.com/bg/", "08834344934","бл 153, Младост 3, София",  "Твоята пицария в Младост ",rest1List );
        Restaurant rest4 = new Restaurant("Die Alte Lampe", Type.PUB, "http://alteLampe.com/bg/", "0883435934", "бул Дондуков 42, София",  "Студена бира в гореща вечер",rest1List);
        Restaurant rest5 = new Restaurant("Test", Type.CHINESE, "tets.bg", "3434523", "Lulin 10", "Test hrana za vkushti",rest1List);
        Restaurant rest10 = new Restaurant("Casa de Lava", Type.PIZZA, "http://pizzadonvito.com/", "0889934934", "бул. Васил Левски, 34, София","Пица за душата от Италия",rest1List,4.5);
        index1.addToList(rest1);
        index1.addToList(rest2);
        index1.addToList(rest3);
        index1.addToList(rest4);
        index1.addToList(rest5);
        Customer cust1 = new Customer("Iani", Gender.MALE, "iani_1");
        Customer cust2 = new Customer("Petar", Gender.MALE, "great_peter");
        Customer cust3 = new Customer("Genadi", Gender.MALE, "genadi_3");
        Customer cust4 = new Customer("Stoiko", Gender.MALE, "sto_r");
        Customer cust5 = new Customer("Sokrat", Gender.MALE, "gre_pte");

        Item mandja = new Food("mandja", 21.99, 600.00, "peppers and tomatoes", true);
        Item salad = new Food("Salad", 21.99, 600.00, "Fresh Salad from the field", true);
        Item tarator = new Food("Tarator", 21.99, 600.00, "Fresh Salad from the field", true);
        Item water = new Drink("Gorna Bania",0.99,1500.00,"Ph 9.65, Mineral Water From Gorna Bania", false, false);
        Item vodka = new Drink("Vodka Savoy",2.99,1500.00,"Ph 9.65, Fire Water From The Deep Balkan", false, false);
        Item vodka2 = new Drink("Vodka Smirnoff",2.99,1500.00,"Ph 9.65, Fire Water From Mother Russia", false, false);


        Menu menu = new Menu();
        menu.addToList(mandja);
        menu.addToList(water);
        menu.addToList(vodka);
        rest1.getMenu().addToList(mandja);
        rest1.getMenu().addToList(water);
        rest1.getMenu().addToList(vodka);
        rest1.getMenu().addToList(vodka2);
        rest1.getMenu().addToList(salad);
        rest1.getMenu().addToList(tarator);


        cust1.evaluate(rest1, 8.4);
        cust2.evaluate(rest1, 0.3);


        ArrayList<ISearchable> restaurantsOfType = index1.findByType(Type.valueOf(type));
        ObservableList<ISearchable> restaurantOfType = FXCollections.observableArrayList(restaurantsOfType);
        table1.setItems(restaurantOfType);
        table1.getColumns().addAll(nameColumnRestaurants, addressColumn, ratingColumn);

        nameInputRestaurant1 = new TextField();
        nameInputRestaurant1.setPromptText("Restaurant Number");
        nameInputRestaurant1.setMinWidth(100);


        VBox vBoxRestaurant = new VBox();
        Button choseButton = new Button("Choose");
        choseButton.setOnAction(e -> choseRestaurant());
        HBox hBoxRestaurant = new HBox();
        hBoxRestaurant.setPadding(new Insets(10, 10, 10, 10));
        hBoxRestaurant.setSpacing(10);
        hBoxRestaurant.getChildren().addAll(nameInputRestaurant1, choseButton);

        vBoxRestaurant.getChildren().addAll(table1, hBoxRestaurant);
        scene3 = new Scene(vBoxRestaurant);
        window.setScene(scene3);
        window.show();


    }

    private static void choseRestaurant() {
        String menu = nameInputRestaurant1.getText();
        ExceptionClass current = new ExceptionClass(index1, menu,managerCustomer);
        current.getException();

    }
}


