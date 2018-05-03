package staff;

public class Chef extends Person {
    public Chef(String name, Gender gender) {
        super(name, gender);
    }
    public static void takeOrder(Item item){
        cook(item);
    }
    public static void cook(Item item){
        System.out.println("Your " + item.getName() +  " will be ready in 15 min");
        Chef.giveOrder(item);

    }
    public static void giveOrder(Item item){
        Weiter.giveItem(item);
        System.out.println("Your food is comming");
    }

}