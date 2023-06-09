package by.pvt.homework;

public class Lions extends Animals {
    private final String nam = "Лев";
    private String nickName;
    private static int kollLions;

    public Lions(String nickName, String color, int maxLifespan, String foodType) {
        super(color, maxLifespan, foodType);
        this.nickName = nickName;
    }

    public String toString() {
        String str = getNumber() + ") " + "Кличка льва: " + nickName + super.toString();
        return str;
    }

    public String getNam() {
        return nam;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String play() {
        String str = nam + " по кличке " + nickName + super.play();
        return str;
    }

    public String sing() {
        String str = nam + " по кличке " + nickName + super.sing();
        return str;
    }

    public static int kolLions(Lions[] massLions) {
        kollLions = 0;
        for (int i = 0; i < massLions.length; i++)
            if (massLions[i] != null) {
                kollLions = i + 1;
            }
        return kollLions;
    }

}
