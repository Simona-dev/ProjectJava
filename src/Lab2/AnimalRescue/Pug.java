package Lab2.AnimalRescue;

public class Pug extends Dog {
    @Override
    public void speak(){
        System.out.println("Pug says : Woof");
    }
    @Override
    public void sleep() {
        System.out.println("zzzz");
    }
    @Override
    public void eat() {
        System.out.println("Pug is eating");
    }

    @Override
    public void bark() {
        System.out.println("Pug is barking");

    }
}
