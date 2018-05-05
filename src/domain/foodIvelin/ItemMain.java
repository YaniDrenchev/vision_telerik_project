public class ItemMain {
  public static void main(String[] args) throws Exception {
    Item mandja = new Food("mandja", 21.99, 600.00, "peppers and tomatoes", true);
    Item water = new Drink("Gorna Bania",0.99,1500.00,"Ph 9.65, Mineral Water From Gorna Bania",false,false);
    System.out.println("Name: " + mandja.getName() + " \nDescribe: " + mandja.getDescribe());
    System.out.println("Name: " + water.getName() + " \nDescribe: " + water.getDescribe());
  }
}