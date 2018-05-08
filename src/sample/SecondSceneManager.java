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
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class SecondSceneManager extends FirstScene {
    private static TextField nameInputRestaurant1, addressInput;
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


//Restaurants and Items
        Restaurant rest1 = new Restaurant("Дон Вито", Type.PIZZA, "http://pizzadonvito.com/bg/", "0889934934", "бул. Васил Левски, 34, София", "Пица за душата от Италия", new Manager("Васил Цветков", Gender.MALE));
        Restaurant rest2 = new Restaurant("Casa Mia", Type.BURGER, "http://casamia.com/bg/", "08834344934", "бул. 153, Младост 3, София", "Твоята пицария в Младост ", new Manager("Лозан Иванов", Gender.MALE));
        Restaurant rest3 = new Restaurant("Die Alte Lampe", Type.PUB, "http://alteLampe.com/bg/", "0883435934", "бул. Дондуков 42, София", "Студена бира в гореща вечер", new Manager("Яни Петров", Gender.MALE));
        Restaurant rest4 = new Restaurant("При Китаеца", Type.CHINESE, "http://wu.bg", "3434523", "жк. Люлин 3 бл 234", "Китайска храна за вкъщи", new Manager("Василена Илиева", Gender.FEMALE));
        Restaurant rest5 = new Restaurant("Cafe Roma", Type.CAFETERIA, "http://pizzadonvito.com/", "0889934934", "бул. Васил Левски, 34, София", "Кафе от Италия", new Manager("Веска Илиева", Gender.FEMALE));
        Restaurant rest6 = new Restaurant("PizzaTime", Type.PIZZA, "http://indian.com/", "088344934", "бул. Ботев, 34, София", "Индийска храна ", new Manager("Ива Илиева", Gender.FEMALE));
        Restaurant rest7 = new Restaurant("Domino", Type.PIZZA, "www.Domino.com", "088985234", "жк.Стрелбище 23", "Pizza", new Manager("Лозан Иванов", Gender.MALE));
        Restaurant rest8 = new Restaurant("Mamma Mia", Type.PIZZA, "http://mamamia.com/", "0889934934", "бул. Надежда, София", "Пица за душата от Италия", new Manager("Илина Петрова", Gender.FEMALE));
        Restaurant rest9 = new Restaurant("Tex Burger", Type.BURGER, "http://texburger.com/", "0889934934", "бул. Дианабад, 34, София", "Сочни бургери ", new Manager("Светла Гошева", Gender.FEMALE));
        Restaurant rest10 = new Restaurant("Pizzaria", Type.PIZZA, "http://happy-people.com/", "0889934934", " жк.  Илинден 34, София", "Скара за душата ", new Manager("Илина Илиева", Gender.FEMALE));
        Restaurant rest11 = new Restaurant("Barfi", Type.INDIAN, "www.barfi.com", "088567734", "жк. Илинден 12,София", "Indian food", new Manager("Geri Georgieva", Gender.FEMALE));
        Restaurant rest12 = new Restaurant("Jalebi", Type.INDIAN, "www.Jalebi.com", "088659324", "жк.Лозенец 34", "indian food", new Manager("Ramzi raef", Gender.MALE));
        Restaurant rest13 = new Restaurant("Kheema", Type.INDIAN, "www.Kheema.com", "088995354", "жк.Стрелбище 51", "indian food", new Manager("Sami Fare", Gender.FEMALE));
        Restaurant rest14 = new Restaurant("Samosa", Type.INDIAN, "www.Samosa.com", "088967134", "жк.Западен Парк 21", "indian food", new Manager("Gado Lemi", Gender.FEMALE));
        Restaurant rest15 = new Restaurant("Uthapam", Type.INDIAN, "www.Uthapam.com", "089432334", "жк.Орландовци 36", "indian food", new Manager("Ivan Lechev", Gender.MALE));
        Restaurant rest16 = new Restaurant("Jalfrezi", Type.INDIAN, "www.Jalfrezi.com", "089456124", "жк.Орландовци 1", "indian food", new Manager("Ivan Lechev", Gender.MALE));
        Restaurant rest17 = new Restaurant("BeerBuster", Type.PUB, "http://BeerBuster.com/", "088924434", " жк.Хладилника  12, София", "Pub", new Manager("Gerard Manolov", Gender.MALE));
        Restaurant rest18 = new Restaurant("Woodbridge", Type.PUB, "http://Woodbridge.com/", "088245234", " жк.Стрелбище 11 , София", "Pub", new Manager("Tom Anderson", Gender.MALE));
        Restaurant rest19 = new Restaurant("Seawise", Type.PUB, "http://Seawise.com/", "088791534", " жк.Оборище 15 , София", "Pub", new Manager("Tom Anderson", Gender.MALE));
        Restaurant rest20 = new Restaurant("The Hive", Type.PUB, "http://The Hive.com/", "088933264", " жк.Надежда 79 , София", "Pub", new Manager("Tom Anderson", Gender.MALE));
        Restaurant rest21 = new Restaurant("The Silent Garden", Type.PUB, "http://SilentGarden.com/", "088235678", " жк.Обеля 23 , София", "Pub", new Manager("Maia Georgieva", Gender.FEMALE));
        Restaurant rest22 = new Restaurant("Castle", Type.PUB, "http://Castle.com/", "088953244", " жк.Обеля 65 , София", "Pub", new Manager("Tom Anderson", Gender.MALE));
        Restaurant rest23 = new Restaurant("Barfi", Type.CHINESE, "www.barfi.com", "088567734", "жк. Илинден 12,София", "Chinese food", new Manager("Geri Georgieva", Gender.FEMALE));
        Restaurant rest24 = new Restaurant("Jalebi", Type.CHINESE, "www.Jalebi.com", "088659324", "жк.Лозенец 34", "Chinese food", new Manager("Ramzi raef", Gender.MALE));
        Restaurant rest25 = new Restaurant("Kheema", Type.CHINESE, "www.Kheema.com", "088995354", "жк.Стрелбище 51", "Chinese food", new Manager("Sami Fare", Gender.FEMALE));
        Restaurant rest26 = new Restaurant("Samosa", Type.CHINESE, "www.Samosa.com", "088967134", "жк.Западен Парк 21", "Chinese food", new Manager("Gado Lemi", Gender.FEMALE));
        Restaurant rest27 = new Restaurant("Uthapam", Type.CHINESE, "www.Uthapam.com", "089432334", "жк.Орландовци 36", "Chinese food", new Manager("Ivan Lechev", Gender.MALE));
        Restaurant rest28 = new Restaurant("Jalfrezi", Type.CHINESE, "www.Jalfrezi.com", "089456124", "жк.Орландовци 1", "Chinese food", new Manager("Ivan Lechev", Gender.MALE));
        Restaurant rest29 = new Restaurant("Barfi", Type.SUSHI, "www.barfi.com", "088567734", "жк. Илинден 12,София", "Sushi food", new Manager("Geri Georgieva", Gender.FEMALE));
        Restaurant rest30 = new Restaurant("Jalebi", Type.SUSHI, "www.Jalebi.com", "088659324", "жк.Лозенец 34", "Sushi food", new Manager("Ramzi raef", Gender.MALE));
        Restaurant rest31 = new Restaurant("Kheema", Type.SUSHI, "www.Kheema.com", "088995354", "жк.Стрелбище 51", "Sushi food", new Manager("Sami Fare", Gender.FEMALE));
        Restaurant rest32 = new Restaurant("Samosa", Type.SUSHI, "www.Samosa.com", "088967134", "жк.Западен Парк 21", "Sushi food", new Manager("Gado Lemi", Gender.FEMALE));
        Restaurant rest33 = new Restaurant("Uthapam", Type.SUSHI, "www.Uthapam.com", "089432334", "жк.Орландовци 36", "Sushi food", new Manager("Ivan Lechev", Gender.MALE));
        Restaurant rest34 = new Restaurant("Jalfrezi", Type.SUSHI, "www.Jalfrezi.com", "089456124", "жк.Орландовци 1", "Sushi food", new Manager("Ivan Lechev", Gender.MALE));
        Restaurant rest35 = new Restaurant("Pizza Hut", Type.PIZZA, "www.Pizzahut.com", "088942584", "жк.Стрелбище 48", "Pizza", new Manager("Natasha Ivanova", Gender.FEMALE));
        Restaurant rest36 = new Restaurant("NightPizza", Type.PIZZA, "www.Pizzanight.com", "088985234", "жк.Света Тройца", "Pizza", new Manager("Лозан Иванов", Gender.MALE));
        Restaurant rest37 = new Restaurant("VIP", Type.CAFETERIA, "www.Vip.com", "088986334", "жк.Обеля 21", "Pizza", new Manager("Лозан Иванов", Gender.MALE));
        Restaurant rest38 = new Restaurant("Nexus", Type.CAFETERIA, "www.Coffenexus.com", "088936734", "жк.Света Тройца 7", "Pizza", new Manager("Лозан Иванов", Gender.MALE));
        Restaurant rest39 = new Restaurant("Boutique", Type.CAFETERIA, "www.boutique.com", "088984734", "жк.Хладилника 23", "Pizza", new Manager("Лозан Иванов", Gender.MALE));
        Restaurant rest40 = new Restaurant("Saint louis", Type.CAFETERIA, "www.louis.com", "0889863534", "жк.Сердика 4", "Pizza", new Manager("Лозан Иванов", Gender.MALE));

        index1.addToList(rest1);
        index1.addToList(rest2);
        index1.addToList(rest3);
        index1.addToList(rest4);
        index1.addToList(rest5);
        index1.addToList(rest6);
        index1.addToList(rest7);
        index1.addToList(rest8);
        index1.addToList(rest9);
        index1.addToList(rest10);
        index1.addToList(rest11);
        index1.addToList(rest12);
        index1.addToList(rest13);
        index1.addToList(rest14);
        index1.addToList(rest15);
        index1.addToList(rest16);
        index1.addToList(rest17);
        index1.addToList(rest18);
        index1.addToList(rest19);
        index1.addToList(rest20);
        index1.addToList(rest21);
        index1.addToList(rest22);
        index1.addToList(rest23);
        index1.addToList(rest24);
        index1.addToList(rest25);
        index1.addToList(rest26);
        index1.addToList(rest27);
        index1.addToList(rest28);
        index1.addToList(rest29);
        index1.addToList(rest30);
        index1.addToList(rest31);
        index1.addToList(rest32);
        index1.addToList(rest33);
        index1.addToList(rest34);
        index1.addToList(rest35);
        index1.addToList(rest36);
        index1.addToList(rest37);
        index1.addToList(rest38);
        index1.addToList(rest39);
        index1.addToList(rest40);
        //end


        ArrayList<ISearchable> restaurantsOfType = index1.findByType(Type.valueOf(type));
        ObservableList<ISearchable> restaurantOfType = FXCollections.observableArrayList(restaurantsOfType);
        table1.setItems(restaurantOfType);
        table1.getColumns().addAll(nameColumnRestaurants, addressColumn);


        VBox vBoxRestaurant = new VBox();
        Button addButton = new Button("Add");
        addButton.setOnAction(e -> addRestaurant());
        Button deleteButton = new Button("Delete");
        deleteButton.setOnAction(event -> deleteRestaurant());
        HBox hBoxRestaurant = new HBox();
        hBoxRestaurant.setPadding(new Insets(10, 10, 10, 10));
        hBoxRestaurant.setSpacing(10);
        hBoxRestaurant.getChildren().addAll(nameInputRestaurant1, addressInput, addButton, deleteButton);
        vBoxRestaurant.getChildren().addAll(table1, hBoxRestaurant);

        scene = new Scene(vBoxRestaurant);

        window.setScene(scene);
        window.show();


    }

    public static void deleteRestaurant() {
        try {

            ObservableList<ISearchable> restaurantsSelected, allRestaurants;
            allRestaurants = table1.getItems();
            restaurantsSelected = table1.getSelectionModel().getSelectedItems();
            restaurantsSelected.forEach(allRestaurants::remove);
        } catch (NoSuchElementException ex) {
            Stage window = new Stage();
            window.setTitle("No restaurants");
            window.setWidth(250);
            window.setHeight(200);

            VBox layout = new VBox(10);
            Label label1 = new Label();
            label1.setText("There are no restaurants");
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
        Restaurant restAdd = new Restaurant();
        restAdd.setName(nameInputRestaurant1.getText());
        restAdd.setAddress(addressInput.getText());
        table1.getItems().add(restAdd);
        nameInputRestaurant1.clear();
        addressInput.clear();

    }
}
