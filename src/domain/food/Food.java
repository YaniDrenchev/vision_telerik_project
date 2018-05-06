public class Food extends Item {
  
  private Boolean vegetarianism;
  
  public Food(String name, Double price, Double weight, String describe, Boolean vegetarianism) {
    super(name, price, weight, describe);
    this.vegetarianism = vegetarianism;
  }
  
  public Boolean getVegetarianism() {
    return vegetarianism;
  }
  
  public void setVegetarianism(Boolean vegetarianism) {
    this.vegetarianism = vegetarianism;
  }
}
