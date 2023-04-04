package by.pvt.homework;

public class AnimalsZoo {
    private Dogs[] massDogs;
    private Birds[] massBirds;
    private Lions[] massLions;
    private static int kollAnimals;
    private static int kollFreePlaces;
    private static int number;

    public AnimalsZoo(Dogs[] massDogs, Birds[] massBirds, Lions[] massLions) {
        this.massDogs = massDogs;
        this.massBirds = massBirds;
        this.massLions = massLions;
    }


    public static Animals[] AnimalsZooInitialization(Dogs[] massDogs, Birds[] massBirds, Lions[] massLions) {
        Animals[] animalsInZoo = new Animals[20];
        animalsInZoo[0] = massDogs[0];
        animalsInZoo[1] = massBirds[0];
        animalsInZoo[2] = massLions[0];
        Main.dellInMassDogs(massDogs, 1);
        Main.dellInMassBirds(massBirds, 1);
        Main.dellInMassLions(massLions, 1);
        return animalsInZoo;
    }

    //   Метод по добавлению животных в зоопарк из списка
    public static Animals[] addInZoo(Animals[] animals, Dogs[] massDogs, int kolDog) {
        int k = 0;
        kolAnimalsinZoo(animals);
        for (int i = kollAnimals; i < animals.length; i++) {
            if (k != kolDog) {
                animals[i] = massDogs[k];
                Main.dellInMassDogs(massDogs, kolDog);
                kolDog--;
            }

        }
        return animals;
    }

    public static Animals[] addInZoo(Animals[] animals, Birds[] massBirds, int kolBirds) {
        int k = 0;
        kolAnimalsinZoo(animals);
        for (int i = kollAnimals; i < animals.length; i++) {
            if (k != kolBirds) {
                animals[i] = massBirds[k];
                Main.dellInMassBirds(massBirds, kolBirds);
                kolBirds--;
            }

        }
        return animals;
    }

    public static Animals[] addInZoo(Animals[] animals, Lions[] massLions, int kolLions) {
        int k = 0;
        kolAnimalsinZoo(animals);
        for (int i = kollAnimals; i < animals.length; i++) {
            if (k != kolLions) {
                animals[i] = massLions[k];
                Main.dellInMassLions(massLions, kolLions);
                kolLions--;
            }
        }
        return animals;
    }

    //присвоение числа животным
    public static Animals[] assigningNumbersToAnimals(Animals[] animals) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                animals[i].setNumber(i + 1);
            } else {
                break;
            }
        }
        return animals;
    }

    public Dogs[] getMassDogs() {
        return massDogs;
    }

    public void setMassDogs(Dogs[] massDogs) {
        this.massDogs = massDogs;
    }

    public Birds[] getMassBirds() {
        return massBirds;
    }

    public void setMassBirds(Birds[] massBirds) {
        this.massBirds = massBirds;
    }

    public Lions[] getMassLions() {
        return massLions;
    }

    public void setMassLions(Lions[] massLions) {
        this.massLions = massLions;
    }


    //Метод подсчета животных в зоопарке;
    public static int kolAnimalsinZoo(Animals[] animals) {
        for (int i = 0; i < animals.length; i++)
            if (animals[i] != null) {
                kollAnimals = i + 1;
            }
        return kollAnimals;
    }

    public static int kolFreePlaces(Animals[] animals, int kollAnimals) {
        kollFreePlaces = animals.length - kollAnimals;
        return kollFreePlaces;
    }

    public static int getKollAnimals() {
        return kollAnimals;
    }

    public static void setKollAnimals(int kollAnimals) {
        AnimalsZoo.kollAnimals = kollAnimals;
    }

    public static int getKollFreePlaces() {
        return kollFreePlaces;
    }

    public static void setKollFreePlaces(int kollFreePlaces) {
        AnimalsZoo.kollFreePlaces = kollFreePlaces;
    }

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        AnimalsZoo.number = number;
    }


}
