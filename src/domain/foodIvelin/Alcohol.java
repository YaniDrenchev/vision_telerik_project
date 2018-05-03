public class Alcohol extends Drink {
  
  private Double alcoholContent;
  
  public Alcohol(String name,Double price,Integer measure, Double alcoholContent) {
    setName(name);
    setPrice(price);
    setMeasure(measure);
    this.alcoholContent = alcoholContent;
  }
  
  public Double getAlcoholContent() {
    return alcoholContent;
  }
  
  public void setAlcoholContent(Double alcoholContent) {
    this.alcoholContent = alcoholContent;
  }
}
