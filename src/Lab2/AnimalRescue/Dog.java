package Lab2.AnimalRescue;

public class Dog extends Animal {
    private String fur;

    public String getFur() {
        return fur;
    }

    public void setFur(String fur) {
        this.fur = fur;
    }

    public void sleep() {
        System.out.println("ZzzZZzz ");
    }

    public void bark() {
        System.out.println("Woof");
    }

    public void eat(int value) {
        setWeightInKg(value);

    }
}






