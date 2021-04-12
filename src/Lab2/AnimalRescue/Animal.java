package Lab2.AnimalRescue;

public class Animal<sout> {
    private String name;
    private int age;
    private String color;
    private String health;
    private float weightInKg;
    private int heightInCm;
    private boolean male;


    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public int getHeightInCm() {
        return heightInCm;
    }

    public void setHeightInCm(int heightInCm) {
        this.heightInCm = heightInCm;
    }

    public float getWeightInKg() {
        return weightInKg;
    }

    public void setWeightInKg(int value) {
        this.weightInKg = value;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    }
