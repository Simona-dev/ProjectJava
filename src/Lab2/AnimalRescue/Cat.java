package Lab2.AnimalRescue;

public class Cat extends Animal {
    private String fur;
    public String getFur() {
        return fur;
    }
    public void setFur(String fur) {
        this.fur = fur;
    }
    public void purr(){
        System.out.println("purring");
    }



    @Override
    public void speak(String text) {
        super.speak("Meow meow");
    }
    @Override
    public void eat() {
        super.eat();
        System.out.println("The cat is eating");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("The cat is sleeping");
    }
}
