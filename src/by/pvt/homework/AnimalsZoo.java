package by.pvt.homework;

public class AnimalsZoo {
    private static int kollAnimals;
    private static int kollFree;
    private static int all;

    public static Animals[] AnimalsZooInitialization() {
        Animals[] animalsInZoo = new Animals[15];
        animalsInZoo[0] = new Dogs(1, "Барсик", "Хаски", 15, "Белый", 12, "Мясо");
        animalsInZoo[1] = new Birds(2, "Воробей", 6, "Белый", 6, "Насекомые");
        animalsInZoo[2] = new Lions(3, "Джек", "красный", 15, "Мясо");
        animalsInZoo[3] = new Lions(4, "Тимон", "белый", 15, "Мясо");
        animalsInZoo[4] = new Lions(5, "Пумба", "бурый", 15, "Мясо");
        animalsInZoo[5] = new Dogs(6, "Шарик", "Дворняга", 11, "чЕрный", 14, "Мясо");
        animalsInZoo[6] = new Birds(7, "Стриж", 8, "Черный", 5, "Насекомые");
        animalsInZoo[7] = new Dogs(8, "Биба", "Корги", 10, "Рыжий", 22, "Мясо");
        animalsInZoo[8] = new Birds(9, "Орел", 9, "Черный", 15, "мясо");
        return animalsInZoo;
    }


    //Метод подсчета животных в зоопарке;
    public static int kolAnimalsinZoo(Animals[] animals) {
        for(int i=0;i<animals.length;i++)
            if (animals[i] != null) {
            kollAnimals=i+1;
                }

        return kollAnimals;
    }

    public static int kolFree(Animals[] animals, int kollAnimals) {
        kollFree = animals.length - kollAnimals;
        return kollFree;
    }

    public static int getKollAnimals() {
        return kollAnimals;
    }

    public static void setKollAnimals(int kollAnimals) {
        AnimalsZoo.kollAnimals = kollAnimals;
    }

    public static int getKollFree() {
        return kollFree;
    }

    public static void setKollFree(int kollFree) {
        AnimalsZoo.kollFree = kollFree;
    }

    public static int getAll() {
        return all;
    }

    public static void setAll(int all) {
        AnimalsZoo.all = all;
    }

}
