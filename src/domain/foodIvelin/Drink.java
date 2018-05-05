public class Drink extends Item {
  
  Boolean alcohol;
  Boolean freeSugar;
  
  public Drink(String name, Double price, Double measure, String describe, Boolean alcohol, Boolean freeSugar) {
    super(name, price, measure, describe);
    this.alcohol = alcohol;
    this.freeSugar = freeSugar;
  }
}
