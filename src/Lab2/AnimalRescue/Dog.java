package Lab2.AnimalRescue;

public class Dog {

    private String name;
    private String breed;
    private int age;
    private String color;
    private String health;
    private int weightInKg;
    private int heightInCm;


        public String getName(){
        return name;
        }
        public void setName(String name) {
        this.name = name;
        }
        public void setBreed(String breed){
        this.breed = breed;
        }
        public String getBreed(){
        return breed;
        }
        public int setAge (int number){
        this.age = age;
        return number;
        }
        public int getAge (){
        return age;
        }
        public void setColor(String color){
        this.color = color;
        }
        public String getColor(){
        return color;
        }
        public void setHealth (int number) {
        this.health = health;
        }
        public String getHealth (){
        return health;
        }
        public void setWeightInKg (int weightInKg) {
        this.weightInKg = weightInKg;
        }
        public int getWeightInKg () {
        return (int) weightInKg;
        }
        public void setHeightInCm(int heightInCm){
        this.heightInCm = heightInCm;
        }
        public int getHeightInCm(){
        return heightInCm;
        }


}


