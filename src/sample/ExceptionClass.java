package sample;

import domain.ISearchable;
import domain.Index;

public class ExceptionClass extends FirstScene {
        private Index index2;
        private String input;

        public ExceptionClass(Index index2,String input){
            this.index2=index2;
            this.input=input;
        }
        public  void getException(){
            try{
                ISearchable currentRestaurant = index2.findByName(input);
                ForthScene.display2(currentRestaurant,"dsad");
            }catch (NullPointerException e){
                System.out.println("no");
            }
        }
    }


