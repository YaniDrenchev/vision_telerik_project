public abstract class Drink extends Item {
  
  private Integer measure;
  
  public Drink() {
  
  }
  
  public Drink(Integer measure) {
    this.measure = measure;
  }
  
  public Integer getMeasure() {
    return measure;
  }
  
  public void setMeasure(Integer measure) {
    this.measure = measure;
  }
}
