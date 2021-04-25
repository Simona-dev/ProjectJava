package Lab2.AnimalRescue;

public class Labrador extends Dog{
    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void bark(){
        System.out.println("Ham ham");
    }
    @Override
    public void eat() {
        System.out.println(getWeightInKg()+1);
    }
    @Override
    public void speak() {
        System.out.println("Dog is barking");
    }
    @Override
    public void sleep() {
        System.out.println("Labrador sleeps");

    }
}
