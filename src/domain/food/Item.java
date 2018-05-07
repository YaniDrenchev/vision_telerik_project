package domain.food;

import domain.IAddable;

public abstract class Item implements IAddable {
  
  private Integer id;
  private static Integer idCounter = 1;
  private String name;
  private Double price;
  private Double content;
  private String description;
  
  public Item() {
    id = idCounter++;
    name = getName();
    price = getPrice();
    content = getContent();
    description = getDescription();
  }
  
  public Item(String name, Double price, Double content, String description) {
    id = idCounter++;
    this.name = name;
    this.price = price;
    this.content = content;
    this.description = description;
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
  
  public String getDescription() {
    return description;
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
  
  public void setDescription(String description) {
    this.description = description;
  }
}