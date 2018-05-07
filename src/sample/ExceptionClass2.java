package sample;

import domain.ISearchable;
import domain.Restaurant;
import domain.food.Item;




public class ExceptionClass2 extends FirstScene {
    private ISearchable rest;
    private String input;
    private double n;
    private String text;


    public ExceptionClass2(ISearchable rest, String input, double n) {
        this.rest = rest;
        this.input = input;
        this.n = n;
    }

    public void getException() {
        try {
            Item currentItem = (Item) ((Restaurant) rest).getMenu().findByName(input);
            double currentProductPrice = currentItem.getPrice();
            n = currentProductPrice;

        } catch (NullPointerException e) {
            NoSuchProduct.display();
        }
    }

    public Double getPrice() {
        return n;
    }
}