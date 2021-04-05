package Lab2.AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        Dog rex = new Dog();
        System.out.println(rex.breed);
        System.out.println(rex.weight);
        rex.eat(1);
        System.out.println(rex.weight);

        Girl emma = new Girl();
        System.out.println(emma.name);

        Food beef = new Food();
        System.out.println(beef.name);

        RecreationActivity fun = new RecreationActivity();
        System.out.println(fun.name);


    }
}
