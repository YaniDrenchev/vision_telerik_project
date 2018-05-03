public class Food extends Item {
  
  private Double weight;
  private FoodType type;
  private String describe;

  public Food(Double weight, FoodType type, String describe) {
    this.weight = weight;
    this.type = type;
    this.describe = describe;
  }
  
  public Double getWeight() {
    return weight;
  }
  
  public FoodType getType() {
    return type;
  }
  
  public String getDescribe() {
    return describe;
  }
  
  public void setWeight(Double weight) {
    this.weight = weight;
  }
  
  public void setType(FoodType type) {
    this.type = type;
  }
  
  public void setDescribe(String describe) {
    this.describe = describe;
  }
}
