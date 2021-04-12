package Lab2.AnimalRescue;

public class Cat extends Animal {
    public String getFur() {
        return fur;
    }

    public void setFur(String fur) {
        this.fur = fur;
    }

    private String fur;



    public void purr(){
        System.out.println("purring");
    }
}
