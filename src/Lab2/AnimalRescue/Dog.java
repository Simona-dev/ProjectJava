package Lab2.AnimalRescue;

public abstract class Dog extends Animal {
    private String fur;

    public String getFur() {
        return fur;
    }

    public void setFur(String fur) {
        this.fur = fur;
    }

    public abstract void bark() ;

    public void eat(int value) {
        setWeightInKg(value);
    }
    @Override
    public abstract void speak();

    @Override
    public abstract void sleep() ;


}






