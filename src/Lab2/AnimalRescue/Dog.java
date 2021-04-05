package Lab2.AnimalRescue;

public class Dog {

        String name = "Blaze";
        String breed = "Golden Retriever";
        int age = 2;
        String color = "yellow/brown";
        String health ;
        float weight = 33.11f;
        int heightInCm = 72;

        public void bark(){
            System.out.println("Woof!");
        }

        public void eat(int value){
            weight +=value;
        }

        public void sleep(){
            System.out.println("ZzzZZzz snores");
        }

        }
