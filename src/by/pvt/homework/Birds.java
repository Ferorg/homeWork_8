package by.pvt.homework;

public class Birds extends Animals {
    private String family;
    private int maxFlightHeight;
    private static int kollBirds;

    public Birds(String family, int maxFlightHeight, String color, int maxLifespan, String foodType) {
        super(color, maxLifespan, foodType);
        this.family = family;
        this.maxFlightHeight = maxFlightHeight;
    }

    public void sings() {
        System.out.println(family + " начинает петь.");
    }

    public void sings2() {
        System.out.println(family + super.sing());
    }

    public String play() {
        String str = family + super.play();
        return str;
    }

    public void slander() {
        System.out.println(family + " начинает клевать.");
    }

    public void hatchChicks() {
        System.out.println(family + " высиживает птенцов");
    }

    public String toString() {
        String str = getNumber() + ") " + "Семейство: " + family + "; Макс. высота полета: " + maxFlightHeight + super.toString();
        return str;
    }

    public static int kolBirds(Birds[] massBirds) {
        kollBirds = 0;
        for (int i = 0; i < massBirds.length; i++)
            if (massBirds[i] != null) {
                kollBirds = i + 1;
            }
        return kollBirds;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getMaxFlightHeight() {
        return maxFlightHeight;
    }

    public void setMaxFlightHeight(int maxFlightHeight) {
        this.maxFlightHeight = maxFlightHeight;
    }
}
