package sample;
import com.compan.Customer;
import com.compan.Gender;
import domain.IAddable;
import domain.ISearchable;
import domain.Restaurant;
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


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;


public class ForthScene extends Main {
    private static TextField nameInputProduct;
    private static double n = 0;

    public static void display2(ISearchable rest, String payMessage) {
        TableView<IAddable> table;
        TableColumn<IAddable, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<IAddable, Double> contentColumn = new TableColumn<>("Content");
        contentColumn.setMinWidth(100);
        contentColumn.setCellValueFactory(new PropertyValueFactory<>("content"));

        TableColumn<IAddable, Double> priceColumn = new TableColumn<>("Price");
        priceColumn.setMinWidth(100);
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
        table = new TableView<>();
        ArrayList<IAddable> restMenu = (((Restaurant) rest).getMenu().getMenu());

        ObservableList<IAddable> restMenuObs = FXCollections.observableArrayList(restMenu);
        table.setItems(restMenuObs);
        table.getColumns().addAll(nameColumn, priceColumn, contentColumn);
        nameInputProduct = new TextField();
        nameInputProduct.setPromptText("Restaurant Number");
        nameInputProduct.setMinWidth(100);
        Customer cust5 = new Customer("Sokrat", Gender.MALE, "gre_pte");
        cust5.writeAComment(((Restaurant) rest), "das");
        VBox vBox = new VBox();
        Button addButton = new Button("Add");
        Button billButton = new Button("Bill" + ": " + n + "0" + "lv");

        addButton.setOnAction(e -> addButtonClick(billButton, rest));

        Button payButton = new Button("Pay");
        payButton.setOnAction(e -> PayScene.displayPay(rest, n, payMessage));
        System.out.println(payMessage);


        HBox hBox = new HBox();
        hBox.setPadding(new Insets(10, 10, 10, 10));
        hBox.setSpacing(10);
        hBox.getChildren().addAll(nameInputProduct, addButton, billButton, payButton);

        vBox.getChildren().addAll(table, hBox);
        Scene scene4 = new Scene(vBox);


        Stage window = new Stage();
        window.setScene(scene4);
        window.setTitle("Menu");
        window.show();
    }

    private static void addButtonClick(Button button, ISearchable rest) {
        String menu = nameInputProduct.getText();

        ExceptionClass2 current = new ExceptionClass2(rest, menu,n);
        current.getException();
        n+=current.getPrice();
        n=round(n,2);
        button.setText("Bill" + ": " + n  + "lv");

    }
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

}




