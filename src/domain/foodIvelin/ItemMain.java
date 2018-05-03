import java.util.ArrayList;

public class ItemMain {
  public static void main(String[] args) throws Exception {
    
    //Fresh array.
    ArrayList<Fresh> fresh = new ArrayList<>();
    //Fresh product.
    Fresh orange = new Fresh("Orange", 2.00, 250, FreshType.Orange);
    fresh.add(orange);
    Fresh apple = new Fresh("Apple", 2.00, 250, FreshType.Apple);
    fresh.add(apple);
    Fresh banana = new Fresh("Banana", 2.00, 250, FreshType.Banana);
    fresh.add(banana);
    Fresh grapefruit = new Fresh("Grapefruit", 2.00, 250, FreshType.Grapefruit);
    fresh.add(grapefruit);
    Fresh grapes = new Fresh("Grapes", 2.00, 250, FreshType.Grapes);
    fresh.add(grapes);
    Fresh lemon = new Fresh("Lemon", 2.00, 250, FreshType.Lemon);
    fresh.add(lemon);
    Fresh lime = new Fresh("Lime", 2.00, 250, FreshType.Lime);
    fresh.add(lime);
    Fresh pear = new Fresh("Pear", 2.00, 250, FreshType.Pear);
    fresh.add(pear);
    Fresh plums = new Fresh("Plums", 2.00, 250, FreshType.Plums);
    fresh.add(plums);
    Fresh strawberries = new Fresh("Strawberries", 2.00, 250, FreshType.Strawberries);
    fresh.add(strawberries);
    Fresh tangerine = new Fresh("Tangerine", 2.00, 250, FreshType.Tangerine);
    fresh.add(tangerine);
    Fresh watermelon = new Fresh("Watermelon", 2.00, 250, FreshType.Watermelon);
    fresh.add(watermelon);
    //Alcohol array.
    ArrayList<Alcohol> alcohol = new ArrayList<>();
    //Alcohol product.
    Alcohol wine = new Alcohol("Wine", 15.99, 1000, 6.0);
    alcohol.add(wine);
    Alcohol mastika = new Alcohol("Mastika", 9.99, 500, 4.5);
    alcohol.add(mastika);
    Alcohol menta = new Alcohol("Menta", 7.00, 500, 3.7);
    alcohol.add(menta);
    Alcohol rakia = new Alcohol("Rakia", 7.99, 500, 6.0);
    alcohol.add(rakia);
    Alcohol whiskey = new Alcohol("Whiskey", 22.99, 750, 6.0);
    alcohol.add(whiskey);
    //non-alcohol.
    //Carbonated array.
    ArrayList<NonAlcohol> carbonated = new ArrayList<>();
    NonAlcohol cocaCola = new NonAlcohol("Coca-Cola", 2.00, 250, 3.0, 5.0);
    carbonated.add(cocaCola);
    NonAlcohol sprite = new NonAlcohol("Sprite ", 2.00, 250, 3.0, 5.0);
    carbonated.add(sprite);
    NonAlcohol fanta = new NonAlcohol("Fanta", 2.00, 250, 3.0, 5.0);
    carbonated.add(fanta);
    NonAlcohol monster = new NonAlcohol("Monster", 2.14, 500, 6.0, 12.0);
    carbonated.add(monster);
    NonAlcohol redBull = new NonAlcohol("Red Bull", 2.19, 250, 6.0, 8.0);
    carbonated.add(redBull);
    //Hot drinks
    ArrayList<NonAlcohol> hotDrinks = new ArrayList<>();
    NonAlcohol coffe = new NonAlcohol("Coffe", 1.19, 150, 12.0, 0.0);
    hotDrinks.add(coffe);
    NonAlcohol cappuccino = new NonAlcohol("Cappuccino", 1.19, 150, 4.0, 0.0);
    hotDrinks.add(cappuccino);
    NonAlcohol hotChocolate = new NonAlcohol("Hot Chocolate", 1.19, 150, 0.0, 5.0);
    hotDrinks.add(hotChocolate);
    NonAlcohol tea = new NonAlcohol("Tea", 1.19, 350, 0.0, 0.0);
    hotDrinks.add(tea);
    //Other drinks.
    ArrayList<NonAlcohol> otherDrinks = new ArrayList<>();
    NonAlcohol ayran = new NonAlcohol("Ayran", 2.00, 1000, 0.0, 0.0);
    otherDrinks.add(ayran);
    NonAlcohol mineralWater = new NonAlcohol("Mineral Water", 1.00, 1000, 0.0, 0.0);
    otherDrinks.add(mineralWater);
    NonAlcohol water = new NonAlcohol("Water", 0.99, 1000, 0.0, 0.0);
    otherDrinks.add(water);
    NonAlcohol boza = new NonAlcohol("Boza", 1.40, 500, 0.0, 0.0);
    otherDrinks.add(boza);
    //Chinese food.
    
  }
}