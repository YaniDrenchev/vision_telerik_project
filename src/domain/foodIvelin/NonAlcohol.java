public class NonAlcohol extends Drink {
  
  private Double caffeine;
  private Double sugar;
  
  public NonAlcohol(String name,Double price,Integer measure, Double caffeine, Double sugar) {
    setName(name);
    setPrice(price);
    setMeasure(measure);
    this.caffeine = caffeine;
    this.sugar = sugar;
  }
  
  public double getCaffeine() {
    return caffeine;
  }
  
  public double getSugar() {
    return sugar;
  }
  
  public void setCaffeine(double caffeine) {
    this.caffeine = caffeine;
  }
  
  public void setSugar(double sugar) {
    this.sugar = sugar;
  }
}
