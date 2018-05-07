package domain.food;

public class ItemMain {
  public static void main(String[] args) throws Exception {
    Item mandja = new Food("Mandja", 21.99, 600.00, "peppers and tomatoes", true);
    Item water = new Drink("Gorna Bania",0.99,1500.00,"Ph 9.65, Mineral Water From Gorna Bania",false,false);
  
    System.out.println("ID: "+ mandja.getId() + "\nName: " + mandja.getName() + " \nDescribe: " + mandja.getDescription() + "\nVegetarianism: " + ((Food) mandja).getVegetarianism());
    System.out.println("ID: "+ water.getId() + "\nName: " + water.getName() + " \nDescribe: " + water.getDescription() + "\nSugarFree: " + ((Drink) water).getSugarFree());
  }
}