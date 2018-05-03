public class Fresh extends Drink {
  
  private FreshType type;
  
  public Fresh(String name,Double price,Integer measure, FreshType type) {
    setName(name);
    setPrice(price);
    setMeasure(measure);
    this.type = type;
  }
  
  public FreshType getType() {
    return type;
  }
  
  public void setType(FreshType type) {
    this.type = type;
  }
}
