package Lab2.AnimalRescue;

public class Food {
    private String foodname;
    private int price;
    private float quantityInKg;
    private String disponibility;

    public void setFoodName (String foodname){
        this.foodname = foodname;
    }
    public String getFoodname (){
        return foodname;
    }
    public void setPrice (int price){
        this.price = price;
    }
    public int getPrice (){
        return price;
    }
    public void setQuantityInKg (float quantityInKg) {
        this.quantityInKg = quantityInKg;
    }
    public float getQuantityInKg () {
        return (float) quantityInKg;
    }
    public void setDisponibility (String disponibility) {
        this.disponibility = disponibility;
    }
    public String getDisponibility(){
        return disponibility;
    }





}
