package Lab2.AnimalRescue;

public abstract class Duck extends Animal{
    private String feathers;

    public String getFeathers() {
        return feathers;
    }

    public void setFeathers() {
        this.feathers = feathers;
    }
    public void quacking (){
        System.out.println("Quack..quack");
    }

    @Override
    public abstract void sleep();

    @Override
    public abstract void speak() ;

}
