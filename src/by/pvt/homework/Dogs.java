package by.pvt.homework;

public class Dogs extends Animals {
    private String name;
    private String breed;
    private int averageWeight;

    public Dogs(int number,String name, String breed, int averageWeight,String color, int maxLifespan, String foodType) {
        super(number,color,maxLifespan,foodType);
        this.name = name;
        this.breed = breed;
        this.averageWeight = averageWeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAverageWeight() {
        return averageWeight;
    }

    public void setAverageWeight(int averageWeight) {
        this.averageWeight = averageWeight;
    }
    public void barking(){
        System.out.println(name+" издает громкий лай");
    }
    public void barking2(){
        System.out.println(name+" "+super.sing());
    }
    public void startBiting(){
        System.out.println(name+" начинает кусать");
    }
    public void run(){
        System.out.println(name+" начинает бегать");
    }
    public String play(){
        String str=name+" "+super.play();
        System.out.println(str);
  return str;
    }
    public String toString(){
        String str=getNumber()+") "+"Имя: "+name+"; Порода: "+breed+"; Средний вес: "+averageWeight+super.toString();
        return str;
    }
    public void jump(){
        System.out.println(name+" прыгает отрадости");
    }
}
