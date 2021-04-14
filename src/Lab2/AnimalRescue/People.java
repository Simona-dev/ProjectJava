package Lab2.AnimalRescue;

public class People {
    private String name;
    private int age;
    private float weightInKg;
    private int heightInCm;

    public void setHeightInCm(int heightInCm) {
        this.heightInCm = heightInCm;
    }

    public float getWeightInKg() {
        return weightInKg;
    }

    public void setWeightInKg(float weightInKg) {
        this.weightInKg = weightInKg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(int value){
        System.out.println("Yummy yummy");
    }
    public void speak (){
        System.out.println("");

    }
}
