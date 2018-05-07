package sample;

import com.compan.*;
import domain.ISearchable;
import domain.Restaurant;
import domain.food.Item;


public class ExceptionClass2 extends FirstScene {
    private ISearchable rest;
    private String inputProduct;
    private double n;


    public ExceptionClass2(ISearchable rest, String inputProduct, double n) {
        this.rest = rest;
        this.inputProduct = inputProduct;
        this.n = n;
    }

    public void getException(Customer currentOrder) {
        try {

            Item currentItem = (Item) ((Restaurant) rest).getMenu().findByName(inputProduct);
            double currentProductPrice = currentItem.getPrice();
            n = currentProductPrice;
            ((Restaurant) rest).getOrderFromCustomer(currentOrder, currentItem);
        } catch (NullPointerException e) {
            NoSuchProduct.display();
        }

    }

    public Double getPrice() {
        return n;
    }
}