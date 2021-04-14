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
    public void eat(int value) {
        super.eat(value);
        System.out.println(getWeightInKg()+1);
    }
    @Override
    public void speak(String text) {
        super.speak("Dog is barking");
    }

}
