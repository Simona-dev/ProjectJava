package Lab2.AnimalRescue;

public class AppMain {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.setName("Blaze");
        dog1.setHeightInCm(76);
        dog1.setBreed("Golden Retriever");
        dog1.setColor("brown");
        System.out.println("My dog name is " + dog1.getName() + " and is tall " + dog1
                .getHeightInCm() + " cm .");
        System.out.println("The breed is " + dog1.getBreed() + " and his color is " + dog1.getColor() + ".");


        Girl girl1 = new Girl();
        girl1.setName("Emma");
        girl1.setMoney(1500);
        girl1.setAge(12);
        System.out.println("The girl name is " + girl1.getName() + " and she has " + girl1.getAge() + ".") ;

        RecreationActivity act1 = new RecreationActivity();
        act1.setActivityName("play");
        act1.setRecreationName("dance");
        System.out.println("The girl loves to " + act1.setRecreationName ("dance") + "." );
        System.out.println("She wants to "  + act1.getActivityName() + " with her dog.");

        Veterinarian vet1 = new Veterinarian();
        vet1.setName("Mr. Doctor Joe");
        vet1.setSpecialization("veterinary");
        System.out.println( vet1.getName() + " is our dog doctor. He has a specialisation in " +
                vet1.getSpecialization() + ".");

        Food food1 = new Food();
        food1.setFoodName("Pedigree Junior Medium Complete - Chicken & Rice");
        food1.setQuantityInKg(20);
        food1.setPrice(60);
        System.out.println("My dog's favorite food is " +  food1.getFoodname() + ". I bought a " + food1.getQuantityInKg() +
                "kg bag at the price of " + food1.getPrice() + " ron.");





    }
}
