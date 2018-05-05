public abstract class Item {
  
  private Integer id;
  private static Integer idCounter = 1;
  private String name;
  private Double price;
  private Double content;
  private String describe;
  
  public Item() {
    id = idCounter++;
    name = getName();
    price = getPrice();
    content = getContent();
    describe = getDescribe();
  }
  
  public Item(String name, Double price, Double content, String describe) {
    id = idCounter++;
    this.name = name;
    this.price = price;
    this.content = content;
    this.describe = describe;
  }
  
  public Integer getId() {
    return id;
  }
  
  public String getName() {
    return name;
  }
  
  public Double getPrice() {
    return price;
  }
  
  public Double getContent() {
    return content;
  }
  
  public String getDescribe() {
    return describe;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public void setPrice(Double price) {
    this.price = price;
  }
  
  public void setContent(Double content) {
    this.content = content;
  }
  
  public void setDescribe(String describe) {
    this.describe = describe;
  }
}
