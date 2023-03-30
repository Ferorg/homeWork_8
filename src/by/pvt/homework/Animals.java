package by.pvt.homework;

public class Animals {
    private String color;
    private int maxLifespan;
    private String foodType;
    private  int number=0;

    public Animals(int number,String color, int maxLifespan, String foodType) {
        this.color = color;
        this.maxLifespan = maxLifespan;
        this.foodType = foodType;
        this.number=number;
    }
    public String sing(){
        String str3 =" издает звук ";
        return str3;
    }
    public String play(){
        String str1=" играет";
return str1;
    }
    public String toString(){
        String str2="; Окрас: "+color+"; Макс. продолжительсность жизни: "+maxLifespan+"; Тип еды: "+foodType;
        return str2;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxLifespan() {
        return maxLifespan;
    }

    public void setMaxLifespan(int maxLifespan) {
        this.maxLifespan = maxLifespan;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}


