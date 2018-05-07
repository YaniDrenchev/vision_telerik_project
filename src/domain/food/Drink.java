package domain.food;

public class Drink extends Item {
  
  private Boolean alcohol;
  private Boolean sugarFree;
  
  public Drink(String name, Double price, Double measure, String describe, Boolean alcohol, Boolean sugarFree) {
    super(name, price, measure, describe);
    this.alcohol = alcohol;
    this.sugarFree = sugarFree;
  }
  
  public Boolean getAlcohol() {
    return alcohol;
  }
  
  public Boolean getSugarFree() {
    return sugarFree;
  }
  
  public void setAlcohol(Boolean alcohol) {
    this.alcohol = alcohol;
  }
  
  public void setSugarFree(Boolean sugarFree) {
    this.sugarFree = sugarFree;
  }
}
