package Lab2.AnimalRescue;

public class Duck extends Animal{
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
    public void sleep() {
        super.sleep();
        System.out.println("The duck is sleeping");
    }
    @Override
    public void speak(String text) {
        super.speak(text);
        System.out.println("The duck is quacking");
    }
}
