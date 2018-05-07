package sample;

import domain.ISearchable;
import domain.Index;

public class ExceptionClass extends FirstScene {
    private Index index2;
    private String input;
    private String payMassage;

    public ExceptionClass(Index index2, String input, String payMassage) {
        this.index2 = index2;
        this.input = input;
        this.payMassage = payMassage;
    }

    public void getException() {
        try {
            ISearchable currentRestaurant = index2.findByName(input);
            ForthScene.display2(currentRestaurant, payMassage);
        } catch (NullPointerException e) {
            NoSuchRestaurant.display();
        }
    }
}


