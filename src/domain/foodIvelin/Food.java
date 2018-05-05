public class Food extends Item {
  
  Boolean vegetarianism;
  
  public Food(String name, Double price, Double weight, String describe, Boolean vegetarianism) {
    super(name, price, weight, describe);
    this.vegetarianism = vegetarianism;
  }
}
