package Lab2.AnimalRescue;

public class Veterinarian extends People {
    private String specialization;


    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }
    public void speaks (){
        System.out.println("Good morning!");
    }

    @Override
    public void eat() {
        System.out.println("Yummy yummy");
    }

    @Override
    public void speak() {
        System.out.println("The veterinarian is speaking");
    }
}
