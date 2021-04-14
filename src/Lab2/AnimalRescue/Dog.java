package Lab2.AnimalRescue;

public class Dog extends Animal {
    private String fur;

    public String getFur() {
        return fur;
    }

    public void setFur(String fur) {
        this.fur = fur;
    }
    public void bark() {
        System.out.println("Woof");
    }

    public void eat(int value) {
        setWeightInKg(value);
    }
    @Override
    public void speak(String text) {
        super.speak("Dog is barking");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("The dog is sleeping");
    }
}






