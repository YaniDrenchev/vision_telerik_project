package sample;
import com.compan.Customer;
import com.compan.Gender;
import domain.*;
import domain.food.Drink;
import domain.food.Food;
import domain.food.Item;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import com.compan.Manager;

import java.io.FileOutputStream;
import java.util.ArrayList;

public class ThirdScene extends FirstScene {
    private static TextField  nameInputRestaurant1;
    private static Index index1 = null;
    private static String payMessage1;
    private static String managerCustomer;
    public static void display2(String type,String payMessage,String managerOrCustomer){
        Scene scene3;
        Stage window = new Stage();

        payMessage1=payMessage;
        managerCustomer=managerOrCustomer;
        index1 = Index.getInstance();

        nameInputRestaurant1 = new TextField();
        nameInputRestaurant1.setPromptText("Restaurant Name");
        nameInputRestaurant1.setMinWidth(100);

        TableView<ISearchable> table1;
        TableColumn<ISearchable, String> nameColumnRestaurants = new TableColumn<>("Name");
        nameColumnRestaurants.setMinWidth(200);
        nameColumnRestaurants.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<ISearchable, String> addressColumn = new TableColumn<>("Address");
        addressColumn.setMinWidth(200);
        addressColumn.setCellValueFactory(new PropertyValueFactory<>("address"));

        TableColumn<ISearchable, Integer> ratingColumn = new TableColumn<>("Rating");
        ratingColumn.setMinWidth(100);
        ratingColumn.setCellValueFactory(new PropertyValueFactory<>("rating"));
        table1 = new TableView<>();


        //Restaurants and Items
        Restaurant rest1 = new Restaurant("Дон Вито", Type.PIZZA, "http://pizzadonvito.com/bg/", "0889934934", "бул. Васил Левски, 34, София",  "Пица за душата от Италия", new Manager("Васил Цветков", Gender.MALE) );
        Restaurant rest2 = new Restaurant("Casa Mia", Type.BURGER, "http://casamia.com/bg/", "08834344934","бул. 153, Младост 3, София",  "Твоята пицария в Младост " , new Manager("Лозан Иванов", Gender.MALE));
        Restaurant rest3 = new Restaurant("Die Alte Lampe", Type.PUB, "http://alteLampe.com/bg/", "0883435934", "бул. Дондуков 42, София",  "Студена бира в гореща вечер", new Manager("Яни Петров", Gender.MALE));
        Restaurant rest4 = new Restaurant("При Китаеца", Type.CHINESE, "http://wu.bg", "3434523", "жк. Люлин 3 бл 234", "Китайска храна за вкъщи", new Manager("Василена Илиева", Gender.FEMALE));
        Restaurant rest5 = new Restaurant("Cafe Roma", Type.CAFETERIA, "http://pizzadonvito.com/", "0889934934", "бул. Васил Левски, 34, София","Кафе от Италия", new Manager("Веска Илиева", Gender.FEMALE) );
        Restaurant rest6 = new Restaurant("PizzaTime", Type.PIZZA, "http://indian.com/", "088344934", "бул. Ботев, 34, София","Индийска храна ", new Manager("Ива Илиева", Gender.FEMALE) );
        Restaurant rest7 = new Restaurant("Domino",Type.PIZZA,"www.Domino.com","088985234","жк.Стрелбище 23","Pizza",new Manager("Лозан Иванов", Gender.MALE));
        Restaurant rest8 = new Restaurant("Mamma Mia", Type.PIZZA, "http://mamamia.com/", "0889934934", "бул. Надежда, София","Пица за душата от Италия", new Manager("Илина Петрова", Gender.FEMALE) );
        Restaurant rest9 = new Restaurant("Tex Burger", Type.BURGER, "http://texburger.com/", "0889934934", "бул. Дианабад, 34, София","Сочни бургери ", new Manager("Светла Гошева", Gender.FEMALE) );
        Restaurant rest10 = new Restaurant("Pizzaria", Type.PIZZA, "http://happy-people.com/", "0889934934", " жк.  Илинден 34, София","Скара за душата ", new Manager("Илина Илиева", Gender.FEMALE) );
        Restaurant rest11 = new Restaurant("Barfi",Type.INDIAN,"www.barfi.com","088567734","жк. Илинден 12,София","Indian food",new Manager("Geri Georgieva", Gender.FEMALE));
        Restaurant rest12=new Restaurant("Jalebi",Type.INDIAN,"www.Jalebi.com","088659324","жк.Лозенец 34","indian food",new Manager("Ramzi raef", Gender.MALE));
        Restaurant rest13=new Restaurant("Kheema",Type.INDIAN,"www.Kheema.com","088995354","жк.Стрелбище 51","indian food",new Manager("Sami Fare", Gender.FEMALE));
        Restaurant rest14=new Restaurant("Samosa",Type.INDIAN,"www.Samosa.com","088967134","жк.Западен Парк 21","indian food",new Manager("Gado Lemi", Gender.FEMALE));
        Restaurant rest15=new Restaurant("Uthapam",Type.INDIAN,"www.Uthapam.com","089432334","жк.Орландовци 36","indian food",new Manager("Ivan Lechev", Gender.MALE));
        Restaurant rest16=new Restaurant("Jalfrezi",Type.INDIAN,"www.Jalfrezi.com","089456124","жк.Орландовци 1","indian food",new Manager("Ivan Lechev", Gender.MALE));
        Restaurant rest17 = new Restaurant("BeerBuster", Type.PUB, "http://BeerBuster.com/", "088924434", " жк.Хладилника  12, София","Pub", new Manager("Gerard Manolov", Gender.MALE) );
        Restaurant rest18 = new Restaurant("Woodbridge", Type.PUB, "http://Woodbridge.com/", "088245234", " жк.Стрелбище 11 , София","Pub", new Manager("Tom Anderson", Gender.MALE) );
        Restaurant rest19 = new Restaurant("Seawise", Type.PUB, "http://Seawise.com/", "088791534", " жк.Оборище 15 , София","Pub", new Manager("Tom Anderson", Gender.MALE) );
        Restaurant rest20 = new Restaurant("The Hive", Type.PUB, "http://The Hive.com/", "088933264", " жк.Надежда 79 , София","Pub", new Manager("Tom Anderson", Gender.MALE) );
        Restaurant rest21 = new Restaurant("The Silent Garden", Type.PUB, "http://SilentGarden.com/", "088235678", " жк.Обеля 23 , София","Pub", new Manager("Maia Georgieva", Gender.FEMALE) );
        Restaurant rest22 = new Restaurant("Castle", Type.PUB, "http://Castle.com/", "088953244", " жк.Обеля 65 , София","Pub", new Manager("Tom Anderson", Gender.MALE) );
        Restaurant rest23 = new Restaurant("Barfi",Type.CHINESE,"www.barfi.com","088567734","жк. Илинден 12,София","Chinese food",new Manager("Geri Georgieva", Gender.FEMALE));
        Restaurant rest24=new Restaurant("Jalebi",Type.CHINESE,"www.Jalebi.com","088659324","жк.Лозенец 34","Chinese food",new Manager("Ramzi raef", Gender.MALE));
        Restaurant rest25=new Restaurant("Kheema",Type.CHINESE,"www.Kheema.com","088995354","жк.Стрелбище 51","Chinese food",new Manager("Sami Fare", Gender.FEMALE));
        Restaurant rest26=new Restaurant("Samosa",Type.CHINESE,"www.Samosa.com","088967134","жк.Западен Парк 21","Chinese food",new Manager("Gado Lemi", Gender.FEMALE));
        Restaurant rest27=new Restaurant("Uthapam",Type.CHINESE,"www.Uthapam.com","089432334","жк.Орландовци 36","Chinese food",new Manager("Ivan Lechev", Gender.MALE));
        Restaurant rest28=new Restaurant("Jalfrezi",Type.CHINESE,"www.Jalfrezi.com","089456124","жк.Орландовци 1","Chinese food",new Manager("Ivan Lechev", Gender.MALE));
        Restaurant rest29 = new Restaurant("Barfi",Type.SUSHI,"www.barfi.com","088567734","жк. Илинден 12,София","Sushi food",new Manager("Geri Georgieva", Gender.FEMALE));
        Restaurant rest30=new Restaurant("Jalebi",Type.SUSHI,"www.Jalebi.com","088659324","жк.Лозенец 34","Sushi food",new Manager("Ramzi raef", Gender.MALE));
        Restaurant rest31=new Restaurant("Kheema",Type.SUSHI,"www.Kheema.com","088995354","жк.Стрелбище 51","Sushi food",new Manager("Sami Fare", Gender.FEMALE));
        Restaurant rest32=new Restaurant("Samosa",Type.SUSHI,"www.Samosa.com","088967134","жк.Западен Парк 21","Sushi food",new Manager("Gado Lemi", Gender.FEMALE));
        Restaurant rest33=new Restaurant("Uthapam",Type.SUSHI,"www.Uthapam.com","089432334","жк.Орландовци 36","Sushi food",new Manager("Ivan Lechev", Gender.MALE));
        Restaurant rest34=new Restaurant("Jalfrezi",Type.SUSHI,"www.Jalfrezi.com","089456124","жк.Орландовци 1","Sushi food",new Manager("Ivan Lechev", Gender.MALE));
        Restaurant rest35 = new Restaurant("Pizza Hut",Type.PIZZA,"www.Pizzahut.com","088942584","жк.Стрелбище 48","Pizza",new Manager("Natasha Ivanova", Gender.FEMALE));
        Restaurant rest36 = new Restaurant("NightPizza",Type.PIZZA,"www.Pizzanight.com","088985234","жк.Света Тройца","Pizza",new Manager("Лозан Иванов", Gender.MALE));
        Restaurant rest37 = new Restaurant("VIP",Type.CAFETERIA,"www.Vip.com","088986334","жк.Обеля 21","Pizza",new Manager("Лозан Иванов", Gender.MALE));
        Restaurant rest38 = new Restaurant("Nexus",Type.CAFETERIA,"www.Coffenexus.com","088936734","жк.Света Тройца 7","Pizza",new Manager("Лозан Иванов", Gender.MALE));
        Restaurant rest39 = new Restaurant("Boutique",Type.CAFETERIA,"www.boutique.com","088984734","жк.Хладилника 23","Pizza",new Manager("Лозан Иванов", Gender.MALE));
        Restaurant rest40 = new Restaurant("Saint louis",Type.CAFETERIA,"www.louis.com","0889863534","жк.Сердика 4","Pizza",new Manager("Лозан Иванов", Gender.MALE));

        index1.addToList(rest1);
        index1.addToList(rest2);
        index1.addToList(rest3);
        index1.addToList(rest4);
        index1.addToList(rest5);
        index1.addToList(rest6);
        index1.addToList(rest7);
        index1.addToList(rest8);
        index1.addToList(rest9);
        index1.addToList(rest10);
        index1.addToList(rest11);
        index1.addToList(rest12);
        index1.addToList(rest13);
        index1.addToList(rest14);
        index1.addToList(rest15);
        index1.addToList(rest16);
        index1.addToList(rest17);
        index1.addToList(rest18);
        index1.addToList(rest19);
        index1.addToList(rest20);
        index1.addToList(rest21);
        index1.addToList(rest22);
        index1.addToList(rest23);
        index1.addToList(rest24);
        index1.addToList(rest25);
        index1.addToList(rest26);
        index1.addToList(rest27);
        index1.addToList(rest28);
        index1.addToList(rest29);
        index1.addToList(rest30);
        index1.addToList(rest31);
        index1.addToList(rest32);
        index1.addToList(rest33);
        index1.addToList(rest34);
        index1.addToList(rest35);
        index1.addToList(rest36);
        index1.addToList(rest37);
        index1.addToList(rest38);
        index1.addToList(rest39);
        index1.addToList(rest40);


        Item AluGubi = new Food("Alu Gobi", 10.99,500.00,"Alu Gobi",true);
        Item AluMatar= new Food("Alu Matar",10.99,550.00,"Alu Matar",true);
        Item CarrotHalwa= new Food("Carrot Halwa",5.99,400.00,"Carrot Halwa",true);
        Item ChaatPapri= new Food("Chaat Papri",7.99,350.00,"Chaat Papri",true);
        Item ChamCham= new Food("Cham-Cham",9.50,450.00,"Cham-Cham",false);
        Item Barfi=new Food("Barfi",9.10,700.00,"Barfi",true);
        Item ChanaDal=new Food("Chana Dal",5.90,450.00,"Chana Dal",true);
        Item ChanaMasala=new Food("Chana Masala",5.40,250.00,"Chana Masala",true);
        Item Chapati = new Food("Chapati",5.40,250.00,"Chapati",true);
        Item ChickenBiriyani=new Food("Chicken Biriyani",4.50,350.00,"Chicken Biriyani",true);
        rest11.getMenu().addToList(AluGubi);
        rest11.getMenu().addToList(AluMatar);
        rest11.getMenu().addToList(CarrotHalwa);
        rest11.getMenu().addToList(ChaatPapri);
        rest11.getMenu().addToList(ChamCham);
        rest11.getMenu().addToList(Barfi);
        rest11.getMenu().addToList(ChanaDal);
        rest11.getMenu().addToList(ChanaMasala);
        rest11.getMenu().addToList(Chapati);
        rest11.getMenu().addToList(ChickenBiriyani);

        rest14.getMenu().addToList(AluGubi);
        rest14.getMenu().addToList(AluMatar);
        rest14.getMenu().addToList(CarrotHalwa);
        rest14.getMenu().addToList(ChaatPapri);
        rest14.getMenu().addToList(ChamCham);
        rest14.getMenu().addToList(Barfi);
        rest14.getMenu().addToList(ChanaDal);
        rest14.getMenu().addToList(ChanaMasala);
        rest14.getMenu().addToList(Chapati);
        rest14.getMenu().addToList(ChickenBiriyani);

        rest23.getMenu().addToList(AluGubi);
        rest23.getMenu().addToList(AluMatar);
        rest23.getMenu().addToList(CarrotHalwa);
        rest23.getMenu().addToList(ChaatPapri);
        rest23.getMenu().addToList(ChamCham);
        rest23.getMenu().addToList(Barfi);
        rest23.getMenu().addToList(ChanaDal);
        rest23.getMenu().addToList(ChanaMasala);
        rest23.getMenu().addToList(Chapati);
        rest23.getMenu().addToList(ChickenBiriyani);

        rest26.getMenu().addToList(AluGubi);
        rest26.getMenu().addToList(AluMatar);
        rest26.getMenu().addToList(CarrotHalwa);
        rest26.getMenu().addToList(ChaatPapri);
        rest26.getMenu().addToList(ChamCham);
        rest26.getMenu().addToList(Barfi);
        rest26.getMenu().addToList(ChanaDal);
        rest26.getMenu().addToList(ChanaMasala);
        rest26.getMenu().addToList(Chapati);
        rest26.getMenu().addToList(ChickenBiriyani);


        rest29.getMenu().addToList(AluGubi);
        rest29.getMenu().addToList(AluMatar);
        rest29.getMenu().addToList(CarrotHalwa);
        rest29.getMenu().addToList(ChaatPapri);
        rest29.getMenu().addToList(ChamCham);
        rest29.getMenu().addToList(Barfi);
        rest29.getMenu().addToList(ChanaDal);
        rest29.getMenu().addToList(ChanaMasala);
        rest29.getMenu().addToList(Chapati);
        rest29.getMenu().addToList(ChickenBiriyani);

        rest32.getMenu().addToList(AluGubi);
        rest32.getMenu().addToList(AluMatar);
        rest32.getMenu().addToList(CarrotHalwa);
        rest32.getMenu().addToList(ChaatPapri);
        rest32.getMenu().addToList(ChamCham);
        rest32.getMenu().addToList(Barfi);
        rest32.getMenu().addToList(ChanaDal);
        rest32.getMenu().addToList(ChanaMasala);
        rest32.getMenu().addToList(Chapati);
        rest32.getMenu().addToList(ChickenBiriyani);

        Item Kheer = new Food("Kheer",3.60,550.00,"Kheer",true);
        Item Idili = new Food("Idili",9.50,340.00,"Idili",false);
        Item Kulfi = new Food("Kulfi",2.50,290.00,"Kulfi",true);
        Item Ladoo = new Food("Ladoo", 5.50,340.00,"Ladoo",false);
        Item LambKebabs = new Food("Lamb Kebabs",7.70,440.00,"Lamb Kebabs",false);
        Item LambVindaloo = new Food("Lamb Vindaloo", 8.50,340.00,"Lamb Vindaloo",false);
        Item LimePickle = new Food("Lime Pickle", 3.50,350.00,"Lime Pickle",false);
        Item MailiKofta = new Food("Maili Kofta", 4.50, 250.00,"Maili Kofta",true);
        Item MangoLassi = new Drink("Mango Lassi",3.50,200.00,"Mango Lassi",true,false);
        Item MasalaChai = new Drink("Masala Chai",2.50,150.00,"Masala Chai",false,true);
        Item MasoorDal = new Food("Masoor Dal", 6.50,450.00,"Masoor Dal",true);
        rest12.getMenu().addToList(Kheer);
        rest12.getMenu().addToList(Idili);
        rest12.getMenu().addToList(Kulfi);
        rest12.getMenu().addToList(Ladoo);
        rest12.getMenu().addToList(LambKebabs);
        rest12.getMenu().addToList(LambVindaloo);
        rest12.getMenu().addToList(LimePickle);
        rest12.getMenu().addToList(MailiKofta);
        rest12.getMenu().addToList(MangoLassi);
        rest12.getMenu().addToList(MasalaChai);
        rest12.getMenu().addToList(MasoorDal);

        rest15.getMenu().addToList(Kheer);
        rest15.getMenu().addToList(Idili);
        rest15.getMenu().addToList(Kulfi);
        rest15.getMenu().addToList(Ladoo);
        rest15.getMenu().addToList(LambKebabs);
        rest15.getMenu().addToList(LambVindaloo);
        rest15.getMenu().addToList(LimePickle);
        rest15.getMenu().addToList(MailiKofta);
        rest15.getMenu().addToList(MangoLassi);
        rest15.getMenu().addToList(MasalaChai);
        rest15.getMenu().addToList(MasoorDal);


        rest24.getMenu().addToList(Kheer);
        rest24.getMenu().addToList(Idili);
        rest24.getMenu().addToList(Kulfi);
        rest24.getMenu().addToList(Ladoo);
        rest24.getMenu().addToList(LambKebabs);
        rest24.getMenu().addToList(LambVindaloo);
        rest24.getMenu().addToList(LimePickle);
        rest24.getMenu().addToList(MailiKofta);
        rest24.getMenu().addToList(MangoLassi);
        rest24.getMenu().addToList(MasalaChai);
        rest24.getMenu().addToList(MasoorDal);

        rest27.getMenu().addToList(Kheer);
        rest27.getMenu().addToList(Idili);
        rest27.getMenu().addToList(Kulfi);
        rest27.getMenu().addToList(Ladoo);
        rest27.getMenu().addToList(LambKebabs);
        rest27.getMenu().addToList(LambVindaloo);
        rest27.getMenu().addToList(LimePickle);
        rest27.getMenu().addToList(MailiKofta);
        rest27.getMenu().addToList(MangoLassi);
        rest27.getMenu().addToList(MasalaChai);
        rest27.getMenu().addToList(MasoorDal);

        rest30.getMenu().addToList(Kheer);
        rest30.getMenu().addToList(Idili);
        rest30.getMenu().addToList(Kulfi);
        rest30.getMenu().addToList(Ladoo);
        rest30.getMenu().addToList(LambKebabs);
        rest30.getMenu().addToList(LambVindaloo);
        rest30.getMenu().addToList(LimePickle);
        rest30.getMenu().addToList(MailiKofta);
        rest30.getMenu().addToList(MangoLassi);
        rest30.getMenu().addToList(MasalaChai);
        rest30.getMenu().addToList(MasoorDal);

        rest32.getMenu().addToList(Kheer);
        rest32.getMenu().addToList(Idili);
        rest32.getMenu().addToList(Kulfi);
        rest32.getMenu().addToList(Ladoo);
        rest32.getMenu().addToList(LambKebabs);
        rest32.getMenu().addToList(LambVindaloo);
        rest32.getMenu().addToList(LimePickle);
        rest32.getMenu().addToList(MailiKofta);
        rest32.getMenu().addToList(MangoLassi);
        rest32.getMenu().addToList(MasalaChai);
        rest32.getMenu().addToList(MasoorDal);

        Item MasalaDosa = new Food("Masala Dosa", 5.40,320.00,"Masala Dosa",true);
        Item MeduVada= new Food("Medu Vada",2.30, 250.00,"Medu Vada",true);
        Item Naan= new Food("Naan",2.50,150.00,"Naan",false);
        Item NavratanKorma = new Food("Navratan Korma",4.50,520.00,"Navratan Korma",false);
        Item OnionPakora = new Food("Onion Pakora",5.10, 510.00,"Onion Pakora",true);
        Item Papadum = new Food("Papadum",3.50, 200.00,"Papadum",true);
        Item Pulao = new Food("Pulao",2.80,280.00,"Pulao",false);
        Item Raita = new Food("Raita",2.90,220.00,"Raita",false);
        Item Rajma = new Food("Rajma",7.50,450.00,"Rajma",false);
        Item RasMalai= new Food("Ras Malai", 5.40,450.00,"Ras Malai",false);
        Item Sambar=new Food("Sambar",6.70,340.00,"Sambar",true);
        rest13.getMenu().addToList(MasalaDosa);
        rest13.getMenu().addToList(MeduVada);
        rest13.getMenu().addToList(Naan);
        rest13.getMenu().addToList(NavratanKorma);
        rest13.getMenu().addToList(OnionPakora);
        rest13.getMenu().addToList(OnionPakora);
        rest13.getMenu().addToList(Papadum);
        rest13.getMenu().addToList(Pulao);
        rest13.getMenu().addToList(Raita);
        rest13.getMenu().addToList(Rajma);
        rest13.getMenu().addToList(RasMalai);
        rest13.getMenu().addToList(Sambar);

        rest16.getMenu().addToList(MasalaDosa);
        rest16.getMenu().addToList(MeduVada);
        rest16.getMenu().addToList(Naan);
        rest16.getMenu().addToList(NavratanKorma);
        rest16.getMenu().addToList(OnionPakora);
        rest16.getMenu().addToList(OnionPakora);
        rest16.getMenu().addToList(Papadum);
        rest16.getMenu().addToList(Pulao);
        rest16.getMenu().addToList(Raita);
        rest16.getMenu().addToList(Rajma);
        rest16.getMenu().addToList(RasMalai);
        rest16.getMenu().addToList(Sambar);

        rest25.getMenu().addToList(MasalaDosa);
        rest25.getMenu().addToList(MeduVada);
        rest25.getMenu().addToList(Naan);
        rest25.getMenu().addToList(NavratanKorma);
        rest25.getMenu().addToList(OnionPakora);
        rest25.getMenu().addToList(OnionPakora);
        rest25.getMenu().addToList(Papadum);
        rest25.getMenu().addToList(Pulao);
        rest25.getMenu().addToList(Raita);
        rest25.getMenu().addToList(Rajma);
        rest25.getMenu().addToList(RasMalai);
        rest25.getMenu().addToList(Sambar);

        rest28.getMenu().addToList(MasalaDosa);
        rest28.getMenu().addToList(MeduVada);
        rest28.getMenu().addToList(Naan);
        rest28.getMenu().addToList(NavratanKorma);
        rest28.getMenu().addToList(OnionPakora);
        rest28.getMenu().addToList(OnionPakora);
        rest28.getMenu().addToList(Papadum);
        rest28.getMenu().addToList(Pulao);
        rest28.getMenu().addToList(Raita);
        rest28.getMenu().addToList(Rajma);
        rest28.getMenu().addToList(RasMalai);
        rest28.getMenu().addToList(Sambar);

        rest31.getMenu().addToList(MasalaDosa);
        rest31.getMenu().addToList(MeduVada);
        rest31.getMenu().addToList(Naan);
        rest31.getMenu().addToList(NavratanKorma);
        rest31.getMenu().addToList(OnionPakora);
        rest31.getMenu().addToList(OnionPakora);
        rest31.getMenu().addToList(Papadum);
        rest31.getMenu().addToList(Pulao);
        rest31.getMenu().addToList(Raita);
        rest31.getMenu().addToList(Rajma);
        rest31.getMenu().addToList(RasMalai);
        rest31.getMenu().addToList(Sambar);

        rest34.getMenu().addToList(MasalaDosa);
        rest34.getMenu().addToList(MeduVada);
        rest34.getMenu().addToList(Naan);
        rest34.getMenu().addToList(NavratanKorma);
        rest34.getMenu().addToList(OnionPakora);
        rest34.getMenu().addToList(OnionPakora);
        rest34.getMenu().addToList(Papadum);
        rest34.getMenu().addToList(Pulao);
        rest34.getMenu().addToList(Raita);
        rest34.getMenu().addToList(Rajma);
        rest34.getMenu().addToList(RasMalai);
        rest34.getMenu().addToList(Sambar);

        Item spinach = new Food("Spinach",5.90,400.00,"Spinach",true);
        Item artichokeDip = new Food("ArtichokeDip", 7.90,550.00,"ArtichokeDip",false);
        Item quesoFundido = new Food("Queso Fundido",5.90,430.00,"Queso Fundido",true);
        Item michigan = new Food("Michigan",3.90,250.00,"Michigan",false);
        Item whiteBeanDip= new Food("White Bean Dip",6.90,450.00,"White Bean Dip",false);
        Item porkSlider = new Food("Pork Slider",5.90,350.00,"Pork Slider",false);
        Item stuffedMushrooms = new Food("Stuffed Mushrooms",5.50,250.00,"Stuffed Mushrooms",true);
        Item steakBites = new Food(" Steak Bites",5.50,550.00,"Steak Bites",false);
        Item bbqRibs = new Food("BBQ Ribs",7.50, 440.00,"BBQ Ribs",false);
        Item bisonMeatball = new Food("Bison Meatball",4.50,550.00,"Bison Meatball",false);

        rest17.getMenu().addToList(spinach);
        rest17.getMenu().addToList(artichokeDip);
        rest17.getMenu().addToList(quesoFundido);
        rest17.getMenu().addToList(michigan);
        rest17.getMenu().addToList(whiteBeanDip);
        rest17.getMenu().addToList(porkSlider);
        rest17.getMenu().addToList(stuffedMushrooms);
        rest17.getMenu().addToList(steakBites);
        rest17.getMenu().addToList(bbqRibs);
        rest17.getMenu().addToList(bisonMeatball);

        rest20.getMenu().addToList(spinach);
        rest20.getMenu().addToList(artichokeDip);
        rest20.getMenu().addToList(quesoFundido);
        rest20.getMenu().addToList(michigan);
        rest20.getMenu().addToList(whiteBeanDip);
        rest20.getMenu().addToList(porkSlider);
        rest20.getMenu().addToList(stuffedMushrooms);
        rest20.getMenu().addToList(steakBites);
        rest20.getMenu().addToList(bbqRibs);
        rest20.getMenu().addToList(bisonMeatball);


        Item squashRaviol = new Food("Squash Raviol",7.50,650.00,"Squash Raviol",true);
        Item louisSpareRib = new Food("Louis Spare Rib",5.50,350.00,"Louis Spare Rib",false);
        Item stuffedPepper = new Food("Stuffed Pepper",4.70,520.00,"Stuffed Pepper",true);
        Item curryChicken = new Food("Curry Chicken", 5.50,220.00,"Curry Chicken",false);
        Item pubFish= new Food("Pub Fish", 2.50,200.00,"Pub Fish",false);
        Item mushroomRisotto = new Food(" Mushroom Risotto",4.50,450.00,"Mushroom Risotto",true);
        Item kaleCaesar = new Food("Kale Caesar",4.90,350.00,"Kale Caesar",true);
        Item maurice = new Food("Maurice", 5.20,410.0,"Maurice",true);
        Item cherryChicken= new Food("Cherry Chicken",4.20,250.00,"Cherry Chicken",false);
        Item mushroomSalad = new Food("Mushroom Salad",2.90,150.00,"Mushroom Salad",true);

        rest18.getMenu().addToList(squashRaviol);
        rest18.getMenu().addToList(louisSpareRib);
        rest18.getMenu().addToList(stuffedPepper);
        rest18.getMenu().addToList(curryChicken);
        rest18.getMenu().addToList(pubFish);
        rest18.getMenu().addToList(mushroomRisotto);
        rest18.getMenu().addToList(kaleCaesar);
        rest18.getMenu().addToList(maurice);
        rest18.getMenu().addToList(cherryChicken);
        rest18.getMenu().addToList(mushroomSalad);

        rest21.getMenu().addToList(squashRaviol);
        rest21.getMenu().addToList(louisSpareRib);
        rest21.getMenu().addToList(stuffedPepper);
        rest21.getMenu().addToList(curryChicken);
        rest21.getMenu().addToList(pubFish);
        rest21.getMenu().addToList(mushroomRisotto);
        rest21.getMenu().addToList(kaleCaesar);
        rest21.getMenu().addToList(maurice);
        rest21.getMenu().addToList(cherryChicken);
        rest21.getMenu().addToList(mushroomSalad);

        Item frenchOnion = new Food("French Onion", 4.50,650.00,"French Onion",true);
        Item creamofMushroom = new Food("Cream of Mushroom",5.20,750.00,"Cream of Mushroom",false);
        Item bauxPhilly = new Food("Faux Philly",2.90,290.00,"Faux Philly",false);
        Item buffalFaux = new Food("Buffal Faux",4.50,350.00,"Buffal-Faux",false);
        Item grilledCheese = new Food("Grilled Cheese",2.80,500.00,"Grilled Cheese",true);
        Item steakSandwich = new Food("Steak Sandwich", 2.20, 532.00,"Steak Sandwich",true);
        Item buffaloSteak = new Food("Buffalo Steak",5.40,500.20,"Buffalo Steak",false);
        Item choiceofpatty = new Food("Choice of Patty",2.30,590.00,"Choice of Patty",false);
        Item Cheeseburger = new Food(" Cheeseburger ",5.90,620.00,"Cheeseburger",true);
        Item Hipster = new Food("Hipster", 5.70,590.00,"Hipster",true);


        rest19.getMenu().addToList(frenchOnion);
        rest19.getMenu().addToList(creamofMushroom);
        rest19.getMenu().addToList(bauxPhilly);
        rest19.getMenu().addToList(buffalFaux);
        rest19.getMenu().addToList(grilledCheese);
        rest19.getMenu().addToList(steakSandwich);
        rest19.getMenu().addToList(buffaloSteak);
        rest19.getMenu().addToList(choiceofpatty);
        rest19.getMenu().addToList(Cheeseburger);
        rest19.getMenu().addToList(Hipster);

        rest22.getMenu().addToList(frenchOnion);
        rest22.getMenu().addToList(creamofMushroom);
        rest22.getMenu().addToList(bauxPhilly);
        rest22.getMenu().addToList(buffalFaux);
        rest22.getMenu().addToList(grilledCheese);
        rest22.getMenu().addToList(steakSandwich);
        rest22.getMenu().addToList(buffaloSteak);
        rest22.getMenu().addToList(choiceofpatty);
        rest22.getMenu().addToList(Cheeseburger);
        rest22.getMenu().addToList(Hipster);

        Item jalapeNoPopper = new Food("JalapeNo Popper",4.50,390.00,"Jalapeño Popper",false);
        Item michelada = new Food("Michelada",5.30,250.00,"Michelada",true);
        Item zesty = new Food("Zesty", 7.30, 800.00, "Zesty",false);
        Item sideMushroomPizza= new Food("Side Mushroom Pizza",5.90, 500.00,"Side Mushroom Risott",false);
        Item marinara = new Food("Marinara",5.5,520.00,"Marinara",true);
        Item margherita = new Food("Margherita", 4.50 , 450.00,"Margherita",false);
        Item chicago = new Food("Chicago",5.60,620.00,"Chicago",true);
        Item sicilian = new Food("Sicilian",5.10,420.00,"Sicilian",false);
        Item greeke = new Food("Greek",7.20,720.00,"Greek",false);
        Item california = new Food("California", 5.20, 450.00,"California",true);
        Item tomatoPie=new Food("Tomato Pie",4.50, 410.00,"Tomato Pie",false);
        Item neapolitan = new Food("Neapolitan",5.50,450.00,"Neapolitan",false);
        Item calzone = new Food("Calzone",5.20,500.00,"Calzone",false);


        rest1.getMenu().addToList(calzone);
        rest1.getMenu().addToList(greeke);
        rest1.getMenu().addToList(marinara);
        rest1.getMenu().addToList(chicago);
        rest1.getMenu().addToList(jalapeNoPopper);
        rest1.getMenu().addToList(michelada);
        rest1.getMenu().addToList(margherita);
        rest1.getMenu().addToList(neapolitan);
        rest1.getMenu().addToList(california);
        rest1.getMenu().addToList(sicilian);
        rest1.getMenu().addToList(Hipster);
        rest1.getMenu().addToList(Sambar);

        rest37.getMenu().addToList(calzone);
        rest37.getMenu().addToList(greeke);
        rest37.getMenu().addToList(marinara);
        rest37.getMenu().addToList(chicago);
        rest37.getMenu().addToList(jalapeNoPopper);
        rest37.getMenu().addToList(michelada);
        rest37.getMenu().addToList(margherita);
        rest37.getMenu().addToList(neapolitan);
        rest37.getMenu().addToList(california);
        rest37.getMenu().addToList(sicilian);
        rest37.getMenu().addToList(Hipster);
        rest37.getMenu().addToList(Sambar);

        rest37.getMenu().addToList(tomatoPie);
        rest37.getMenu().addToList(greeke);
        rest37.getMenu().addToList(zesty);
        rest37.getMenu().addToList(chicago);
        rest37.getMenu().addToList(jalapeNoPopper);
        rest37.getMenu().addToList(michelada);
        rest37.getMenu().addToList(choiceofpatty);
        rest37.getMenu().addToList(neapolitan);
        rest37.getMenu().addToList(sideMushroomPizza);
        rest37.getMenu().addToList(sicilian);
        rest37.getMenu().addToList(Hipster);
        rest37.getMenu().addToList(Sambar);

        rest7.getMenu().addToList(calzone);
        rest7.getMenu().addToList(greeke);
        rest7.getMenu().addToList(marinara);
        rest7.getMenu().addToList(chicago);
        rest7.getMenu().addToList(jalapeNoPopper);
        rest7.getMenu().addToList(michelada);
        rest7.getMenu().addToList(margherita);
        rest7.getMenu().addToList(neapolitan);
        rest7.getMenu().addToList(california);
        rest7.getMenu().addToList(sicilian);
        rest7.getMenu().addToList(Hipster);
        rest7.getMenu().addToList(Sambar);

        rest8.getMenu().addToList(calzone);
        rest8.getMenu().addToList(greeke);
        rest8.getMenu().addToList(marinara);
        rest8.getMenu().addToList(chicago);
        rest8.getMenu().addToList(jalapeNoPopper);
        rest8.getMenu().addToList(michelada);
        rest8.getMenu().addToList(margherita);
        rest8.getMenu().addToList(neapolitan);
        rest8.getMenu().addToList(california);
        rest8.getMenu().addToList(sicilian);
        rest8.getMenu().addToList(Hipster);
        rest8.getMenu().addToList(Sambar);

        rest10.getMenu().addToList(calzone);
        rest10.getMenu().addToList(greeke);
        rest10.getMenu().addToList(marinara);
        rest10.getMenu().addToList(chicago);
        rest10.getMenu().addToList(jalapeNoPopper);
        rest10.getMenu().addToList(michelada);
        rest10.getMenu().addToList(margherita);
        rest10.getMenu().addToList(neapolitan);
        rest10.getMenu().addToList(california);
        rest10.getMenu().addToList(sicilian);
        rest10.getMenu().addToList(Hipster);
        rest10.getMenu().addToList(Sambar);

        rest35.getMenu().addToList(calzone);
        rest35.getMenu().addToList(greeke);
        rest35.getMenu().addToList(marinara);
        rest35.getMenu().addToList(chicago);
        rest35.getMenu().addToList(jalapeNoPopper);
        rest35.getMenu().addToList(michelada);
        rest35.getMenu().addToList(margherita);
        rest35.getMenu().addToList(neapolitan);
        rest35.getMenu().addToList(california);
        rest35.getMenu().addToList(sicilian);
        rest35.getMenu().addToList(Hipster);
        rest35.getMenu().addToList(Sambar);

        rest36.getMenu().addToList(calzone);
        rest36.getMenu().addToList(greeke);
        rest36.getMenu().addToList(marinara);
        rest36.getMenu().addToList(chicago);
        rest36.getMenu().addToList(jalapeNoPopper);
        rest36.getMenu().addToList(michelada);
        rest36.getMenu().addToList(margherita);
        rest36.getMenu().addToList(neapolitan);
        rest36.getMenu().addToList(california);
        rest36.getMenu().addToList(sicilian);
        rest36.getMenu().addToList(Hipster);
        rest36.getMenu().addToList(Sambar);


        Item cappuccino = new Drink("cappuccino",4.50,550.00,"cappuccino",false,true);
        Item espresso = new Drink("espresso",3.50,400.00,"espresso",false,false);
        Item macchiato = new Drink("macchiato",4.20,350.00,"macchiato",false,false);
        Item latte = new Drink("Latte",3.50,250.00,"Latte",false,true);
        Item americano= new Drink("americano",4.00,300.00,"americano",false,true);
        Item mocha = new Drink("mocha",2.50,250.00,"mocha",false,false);

        rest5.getMenu().addToList(cappuccino);
        rest5.getMenu().addToList(espresso);
        rest5.getMenu().addToList(macchiato);
        rest5.getMenu().addToList(latte);
        rest5.getMenu().addToList(americano);
        rest5.getMenu().addToList(macchiato);

        rest37.getMenu().addToList(cappuccino);
        rest37.getMenu().addToList(espresso);
        rest37.getMenu().addToList(macchiato);
        rest37.getMenu().addToList(latte);
        rest37.getMenu().addToList(americano);
        rest37.getMenu().addToList(macchiato);

        rest38.getMenu().addToList(cappuccino);
        rest38.getMenu().addToList(espresso);
        rest38.getMenu().addToList(macchiato);
        rest38.getMenu().addToList(latte);
        rest38.getMenu().addToList(americano);
        rest38.getMenu().addToList(macchiato);

        rest39.getMenu().addToList(cappuccino);
        rest39.getMenu().addToList(espresso);
        rest39.getMenu().addToList(macchiato);
        rest39.getMenu().addToList(latte);
        rest39.getMenu().addToList(americano);
        rest39.getMenu().addToList(macchiato);

        rest40.getMenu().addToList(cappuccino);
        rest40.getMenu().addToList(espresso);
        rest40.getMenu().addToList(macchiato);
        rest40.getMenu().addToList(latte);
        rest40.getMenu().addToList(americano);
        rest40.getMenu().addToList(macchiato);

        Item tomatoSoap = new Food("tomatoSoap", 21.99, 600.00, "peppers and tomatoes", true);
        Item salad = new Food("Salad", 21.99, 600.00, "Fresh Salad from the field", true);
        Item tarator = new Food("Tarator", 21.99, 600.00, "Fresh Salad from the field", true);
        Item water = new Drink("Gorna Bania",0.99,1500.00,"Ph 9.65, Mineral Water From Gorna Bania", false, false);
        Item vodka = new Drink("Vodka Savoy",2.99,1500.00,"Ph 9.65, Fire Water From The Deep Balkan", false, false);
        Item vodka2 = new Drink("Vodka Smirnoff",2.99,1500.00,"Ph 9.65, Fire Water From Mother Russia", false, false);
        Item juice = new Drink("Lemon Shock",1.99,1000.00,"Squeezed lemon in a plastic bag", false, false);
        Item rabit = new Food("Rabit Stew",22.99,1000.00,"Young rabit cooked with carrots", false);


        Item chickenFajitas = new Food("Chicken Fajitas", 16.95, 900.00, "1/2 c. extra-virgin olive oil\n" +
                "1/4 c. lime juice\n" +
                "2 tsp. cumin\n" +
                "1/2 tsp. red pepper flakes\n" +
                "4 boneless, skinless chicken breast\n" +
                "Kosher salt\n" +
                "Freshly ground black pepper", false);
        rest1.getMenu().addToList(chickenFajitas);
        Item steakFajitaPowerBowls = new Food("Steak Fajita Power Bowls", 25.99, 600.00, "2 tbsp. vegetable oil, divided\n" +
                "1/2 yellow onion, sliced into half moons\n" +
                "2 bell peppers, thinly sliced\n" +
                "kosher salt\n" +
                "Freshly ground black pepper\n" +
                "1 lb. skirt steak, cut into 1/2\" slices\n" +
                "Juice of 1/2 lime\n" +
                "1/2 tsp. cumin\n" +
                "1/2 tsp. chili powder\n" +
                "4 c. cooked brown rice\n" +
                "1 c. black beans, drained and rinsed\n" +
                "1 c. frozen corn, warmed\n" +
                "1 avocado, thinly sliced\n" +
                "1 tbsp. finely chopped cilantro, for garnish\n" +
                "Sour cream, for serving", false);
        rest3.getMenu().addToList(steakFajitaPowerBowls);
        Item onionSoupBreadBowls = new Food("Onion Soup Bread Bowls", 17.95, 400.00, "2 tbsp. butter\n" +
                "2 medium onions, thinly sliced\n" +
                "2 sprigs thyme\n" +
                "kosher salt\n" +
                "Freshly ground black pepper\n" +
                "1/4 c. red wine\n" +
                "1/4 c. flour\n" +
                "2 garlic cloves, minced\n" +
                "2 c. beef broth\n" +
                "6 dinner rolls\n" +
                "6 slices swiss\n" +
                "1 c. Gruyere, shredded\n" +
                "1 tbsp. chopped parsley", false);
        rest1.getMenu().addToList(onionSoupBreadBowls);
        Item italianPastaSalad = new Food("Italian Pasta Salad", 8.95, 600.00, "16 oz. fusili pasta, cooked according to package instructions\n" +
                "8 oz. mozzarella balls, halved\n" +
                "4 oz. salami, quartered\n" +
                "2 c. baby spinach\n" +
                "1 c. cherry tomatoes, halved\n" +
                "1 c. artichoke hearts, chopped\n" +
                "1/2 c. pitted black olives, sliced", false);
        rest1.getMenu().addToList(italianPastaSalad);
        Item creamyTuscanChicken = new Food("Creamy Tuscan Chicken", 21.99, 600.00, "1 tbsp. extra-virgin olive oil\n" +
                "4 boneless skinless chicken breasts\n" +
                "Kosher salt\n" +
                "Freshly ground black pepper\n" +
                "1 tsp. dried oregano\n" +
                "3 tbsp. unsalted butter\n" +
                "3 cloves garlic, minced\n" +
                "1 1/2 c. cherry tomatoes\n" +
                "2 c. baby spinach\n" +
                "1/2 c. heavy cream\n" +
                "1/4 c. freshly grated Parmesan\n" +
                "Lemon wedges, for serving", false);
        rest1.getMenu().addToList(creamyTuscanChicken);
        Item veganPizza = new Food("Vegan Pizza", 11.99, 700.00, "1 small head cauliflower, cut into small florets\n" +
                "1 tbsp. extra-virgin olive oil\n" +
                "1 tbsp. apple cider vinegar\n" +
                "1/2 tsp. garlic powder\n" +
                "1/2 tsp. cayenne pepper\n" +
                "Kosher salt\n" +
                "Freshly ground black pepper\n" +
                "2/3 c. barbecue sauce, divided\n" +
                "1 store bought pizza dough\n" +
                "1/2 small red onion, thinly sliced\n" +
                "2 scallions, thinly sliced, for garnish", true);
        rest1.getMenu().addToList(veganPizza);
        Item slowCookerBrisket = new Food("Slow-Cooker Brisket", 21.99, 600.00, "3 lb. beef brisket\n" +
                "1 small white onion, sliced\n" +
                "2 garlic cloves, smashed and peeled\n" +
                "2 c. low sodium chicken stock\n" +
                "2 sprigs fresh thyme\n" +
                "Kosher salt\n" +
                "Freshly ground black pepper", false);
        rest2.getMenu().addToList(slowCookerBrisket);
        Item grilledShrimp = new Food("Grilled Shrimp", 21.99, 400.00, "2 lb. shrimp, peeled and deveined\n" +
                "1/4 c. extra-virgin olive oil\n" +
                "1/4 c. lime juice\n" +
                "4 garlic cloves, minced\n" +
                "3 tbsp. honey\n" +
                "2 tbsp. low-sodium soy sauce\n" +
                "1 tbsp. chili garlic sauce or sriracha\n" +
                "1/4 c. freshly chopped cilantro, for garnish\n" +
                "Lime slices, for serving", false);
        rest4.getMenu().addToList(grilledShrimp);
        Item generalTsoMeatballs = new Food("General Tso Meatballs", 44.99, 600.00, "1 lb. ground beef\n" +
                "1/2 c. panko bread crumbs\n" +
                "4 green onions, thinly sliced, divided\n" +
                "1 egg\n" +
                "2 cloves garlic, minced\n" +
                "1 tsp. ginger, minced or grated\n" +
                "1 tsp. sesame oil\n" +
                "kosher salt\n" +
                "pinch red pepper flakes\n" +
                "1/4 c. cornstarch\n" +
                "Vegetable oil, for frying\n" +
                "1/2 c. low-sodium chicken broth\n" +
                "1/4 c. soy sauce\n" +
                "2 tbsp. apple cider vinegar\n" +
                "2 tbsp. hoisin sauce\n" +
                "1 tbsp. honey\n" +
                "2 tsp. sesame seeds", false);
        rest4.getMenu().addToList(generalTsoMeatballs);
        Item mediterraneanChickpeaSalad = new Food("Mediterranean Chickpea Salad", 11.99, 600.00, "1/4 c. white wine vinegar\n" +
                "1/2 c. extra-virgin olive oil\n" +
                "1 tbsp. lemon juice\n" +
                "1 tbsp. freshly chopped parsley\n" +
                "1/4 tsp. red pepper flakes\n" +
                "Kosher salt\n" +
                "Freshly ground black pepper\n", true);
        rest5.getMenu().addToList(mediterraneanChickpeaSalad);
        Item cheesesteakSloppyJoes = new Food("Cheesesteak Sloppy Joes", 21.99, 250.00, "1 tbsp. vegetable oil\n" +
                "1 onion, chopped\n" +
                "2 bell peppers, chopped\n" +
                "1 Garlic clove, minced\n" +
                "1 lb. ground beef\n" +
                "1/2 c. beef broth\n" +
                "2 tbsp. ketchup\n" +
                "1 tbsp. Worcestershire sauce\n" +
                "1 tbsp. brown sugar\n" +
                "kosher salt\n" +
                "Freshly ground black pepper\n" +
                "4 slices provolone\n" +
                "4 Hamburger buns", false);
        rest2.getMenu().addToList(cheesesteakSloppyJoes);
        Item cauliflowerGrilledCheese = new Food("Cauliflower Grilled Cheese", 21.99, 400.00, "1 head cauliflower, (to make about 4 cups processed cauliflower)\n" +
                "2 eggs, lightly beaten\n" +
                "1/2 c. finely grated Parmesan\n" +
                "1/2 tsp. oregano\n" +
                "1 1/2 c. shredded white Cheddar", true);
        rest2.getMenu().addToList(cauliflowerGrilledCheese);
        Item primaveraCarbonara = new Food("Primavera Carbonara", 21.99, 600.00, "6 slices bacon, cut into 1\" pieces\n" +
                "1 zucchini, cut into half moons\n" +
                "1/2 red onion, thinly sliced\n" +
                "4 oz. baby bella mushrooms, sliced\n" +
                "3/4 lb. spaghetti, cooked according to package directions\n" +
                "5 egg yolks\n" +
                "1 c. heavy cream\n" +
                "1/2 c. freshly grated Parmesan, plus more for serving\n" +
                "Kosher salt\n" +
                "Freshly ground black pepper", false);
        rest1.getMenu().addToList(primaveraCarbonara);
        Item shepherdsPie = new Food("Shepherd's Pie", 199.95, 900.00, "1 tbsp. extra-virgin olive oil\n" +
                "1 large onion, chopped\n" +
                "2 Carrots, peeled and chopped\n" +
                "2 cloves garlic, minced\n" +
                "1 tsp. fresh thyme\n" +
                "1 1/2 lb. ground beef\n" +
                "1 c. frozen peas\n" +
                "1 c. frozen corn\n" +
                "2 tbsp. flour\n" +
                "2/3 c. chicken broth\n" +
                "1 tbsp. Freshly chopped parsley, for garnish", false);
        rest3.getMenu().addToList(shepherdsPie);
        Item lemonAsparagusChickenPasta = new Food("Lemon Asparagus Chicken Pasta", 151.99, 900.00, "kosher salt\n" +
                "1 lb. linguine or spaghetti\n" +
                "1 tbsp. extra-virgin olive oil\n" +
                "1 lb. boneless skinless chicken breasts\n" +
                "Freshly ground black pepper\n" +
                "2 tsp. Italian seasoning\n" +
                "2 tbsp. butter\n" +
                "1 small red onion, chopped\n" +
                "1 lb. asparagus, stalks trimmed and cut into thirds or quartered if large\n" +
                "3/4 c. heavy cream\n" +
                "1/2 c. low-sodium chicken broth\n" +
                "Juice of 1 lemon\n" +
                "3 cloves garlic, minced\n" +
                "3/4 c. shredded mozzarella\n" +
                "1/2 c. freshly grated Parmesan, plus more for garnish\n" +
                "1 lemon, sliced into half moons\n" +
                "Freshly chopped parsley, for garnish", false);
        rest5.getMenu().addToList(lemonAsparagusChickenPasta);
        Item whiskeyGlazedSteakwithShoestringPotatoes = new Food("Whiskey-Glazed Steak with Shoestring Potatoes", 201.99, 900.00, "4 russet potatoes, peeled and cut into shoestrings using a mandoline\n" +
                "2 tbsp. extra-virgin olive oil, divided\n" +
                "1/2 c. Grated Gruyère\n" +
                "2 tbsp. unsalted butter, divided\n" +
                "1 1/2 lb. skirt steak, cut into 4\" pieces\n" +
                "kosher salt\n" +
                "Freshly ground black pepper\n" +
                "1 tbsp. all-purpose flour\n" +
                "2 tbsp. whiskey\n" +
                "1 c. low-sodium beef broth\n" +
                "1 tbsp. heavy cream\n" +
                "1/4 c. chopped fresh parsley, plus more for garnish", false);
        rest3.getMenu().addToList(whiskeyGlazedSteakwithShoestringPotatoes);
        //Dessert.
        Item BananaSplitLasagna = new Food("Banana Split Lasagna", 21.99, 200.00, "8 oz. cool whip\n" +
                "1/2 c. walnuts, toasted and chopped\n" +
                "chocolate syrup, for serving\n" +
                "Rainbow sprinkles, for serving\n" +
                "Maraschino cherries, for serving", true);
        rest5.getMenu().addToList(BananaSplitLasagna);
        Item BananaSplitKebabs = new Food("Banana Split Kebabs", 21.99, 200.00, "2 bananas, cut into 1\" pieces\n" +
                "24 1\" pieces pineapple\n" +
                "12 large strawberries, rinsed, dried, and halved\n" +
                "2 c. chocolate chips\n" +
                "1/2 c. peanuts, chopped", true);
        rest1.getMenu().addToList(BananaSplitKebabs);
        Item smoresBars = new Food("S'mores Bars", 21.99, 200.00, "3 tbsp. butter\n" +
                "1 package mini marshmallows\n" +
                "7 c. Golden Grahams cereal\n" +
                "3 Hershey's milk chocolate bars, broken into pieces", true);
        rest3.getMenu().addToList(smoresBars);
        Item strawberryShortcakeTrifles = new Food("Strawberry Shortcake Trifles", 21.99, 200.00, "1 c. heavy cream\n" +
                "1 tbsp. sugar\n" +
                "1/2 tsp. pure vanilla extract\n" +
                "3 c. chopped pound cake or angel food cake\n" +
                "2 c. sliced or chopped strawberries", true);
        rest1.getMenu().addToList(strawberryShortcakeTrifles);
        Item lemonBlueberryLayerCake = new Food("Lemon Blueberry Layer Cake", 21.99, 300.00, "1 1/2 c. all-purpose flour\n" +
                "3 tbsp. cornstarch\n" +
                "1/2 tsp. baking soda\n" +
                "1/4 tsp. kosher salt\n" +
                "1 1/2 c. granulated sugar\n" +
                "1 1/2 c. unsalted butter\n" +
                "3 large eggs\n" +
                "1/2 c. sour cream\n" +
                "1 tsp. pure vanilla extract\n" +
                "8 oz. cream cheese\n" +
                "1 lb. confectioners' sugar\n" +
                "1 lemon\n" +
                "3 pt. fresh blueberries", true);
        rest5.getMenu().addToList(lemonBlueberryLayerCake);

        //Cocktails.
        Item PinaColadaSangria = new Drink("Piña Colada Sangria",15.00,350.00,"1 750-ml. bottle white wine, such as Sauvignon Blanc\n" +
                "2 c. pineapple juice\n" +
                "1 c. Seltzer\n" +
                "1 c. chopped pineapple\n" +
                "1/2 c. coconut rum\n" +
                "1/4 c. maraschino cherries",true,true);
        rest1.getMenu().addToList(PinaColadaSangria);
        Item LemonadeRumPunch = new Drink("Lemonade Rum Punch",17.99,350.00,"4 oz. lemonade\n" +
                "2 oz. pineapple juice\n" +
                "2 oz. coconut rum\n" +
                "1 oz. dark rum",true,true);
        rest3.getMenu().addToList(LemonadeRumPunch);
        Item sangriaLemonade = new Drink("Sangria Lemonade",17.99,350.00,"1/2 g. lemonade\n" +
                "1 bottle Chardonnay or other white wine (750 ml)\n" +
                "2/3 c. light rum\n" +
                "1/2 c. raspberries\n" +
                "1 Orange, Sliced\n" +
                "1 Granny Smith apple, sliced",true,true);
        rest2.getMenu().addToList(sangriaLemonade);
        Item coldBrewSangria = new Drink("Cold Brew Sangria",19.99,350.00,"32 oz. cold brew (iced coffee is okay too)\n" +
                "8 oz. tequila\n" +
                "4 oz. Cointreau (or other orange-flavored liqueur)\n" +
                "1 tbsp. simple syrup\n" +
                "1 Orange, Sliced\n" +
                "1 lime, sliced\n" +
                "1 Granny Smith apple, diced",true,true);
        rest5.getMenu().addToList(coldBrewSangria);
        Item sharkPunch = new Drink("Shark Punch",29.99,350.00,"2 strawberry fruit roll-ups\n" +
                "4 c. vanilla ice cream\n" +
                "4 c. Blue Hawaiian Punch\n" +
                "4 c. sprite\n" +
                "3 c. Vanilla Vodka\n" +
                "1 gummy shark, if desired",true,true);
        rest4.getMenu().addToList(sharkPunch);

        rest2.getMenu().addToList(tarator);
        rest3.getMenu().addToList(spinach);
        rest3.getMenu().addToList(artichokeDip);
        rest3.getMenu().addToList(quesoFundido);
        rest3.getMenu().addToList(michigan);
        rest3.getMenu().addToList(whiteBeanDip);
        rest3.getMenu().addToList(porkSlider);
        rest3.getMenu().addToList(water);
        rest4.getMenu().addToList(vodka2);
        rest4.getMenu().addToList(juice);
        rest4.getMenu().addToList(rabit);
        rest4.getMenu().addToList(AluGubi);
        rest4.getMenu().addToList(AluMatar);
        rest4.getMenu().addToList(CarrotHalwa);
        rest4.getMenu().addToList(ChaatPapri);
        rest4.getMenu().addToList(ChamCham);
        //end




        ArrayList<ISearchable> restaurantsOfType = index1.findByType(Type.valueOf(type));
        ObservableList<ISearchable> restaurantOfType = FXCollections.observableArrayList(restaurantsOfType);
        table1.setItems(restaurantOfType);
        table1.getColumns().addAll(nameColumnRestaurants, addressColumn, ratingColumn);


        VBox vBoxRestaurant = new VBox();
        Button choseButton = new Button("Choose");
        choseButton.setOnAction(e -> choseRestaurant());
        HBox hBoxRestaurant = new HBox();
        hBoxRestaurant.setPadding(new Insets(10, 10, 10, 10));
        hBoxRestaurant.setSpacing(10);
        hBoxRestaurant.getChildren().addAll(nameInputRestaurant1, choseButton);

        vBoxRestaurant.getChildren().addAll(table1, hBoxRestaurant);
        scene3 = new Scene(vBoxRestaurant);
        window.setScene(scene3);
        window.show();


    }

    private static void choseRestaurant() {
        String menu = nameInputRestaurant1.getText();
        ExceptionClass current = new ExceptionClass(index1, menu,managerCustomer);
        current.getException();

    }
}


