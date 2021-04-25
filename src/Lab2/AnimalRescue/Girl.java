package Lab2.AnimalRescue;

public class Girl extends People {

    private float money;


    public void setMoney(float money) {
        this.money = money;
    }

    public float getMoney() {
        return money;
    }
    public void speaking (){
        System.out.println("Hello");
    }
    @Override
    public void eat() {
        System.out.println("Yummy yummy");
    }
    @Override
    public void speak() {
       System.out.println("The girl is speaking");
    }
}


