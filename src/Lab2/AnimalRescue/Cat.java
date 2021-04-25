package Lab2.AnimalRescue;

public abstract class Cat extends Animal {

    private String fur;
    public String getFur() {
        return fur;
    }
    public void setFur(String fur) {
        this.fur = fur;
    }

    public abstract void purr();

    @Override
    public abstract void speak();
    @Override
    public abstract void eat();
    @Override
    public abstract void sleep();
    }

