package by.pvt.homework;

public class AnimalsList {

    private static int kollWaitingAnimals;
    private static int number;

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        AnimalsList.number = number;
    }

    public static int getKollWaitingAnimals() {
        return kollWaitingAnimals;
    }

    public static void setKollWaitingAnimals(int kollWaitingAnimals) {
        AnimalsList.kollWaitingAnimals = kollWaitingAnimals;
    }

    public static Animals[] waitingList(){
    Animals[] animalsList=new Animals[11];
    animalsList[0]=new Lions(1,"Джек", "красный",10,"Мясо");
    animalsList[1]=new Dogs(4,"DD","Хаски",12,"Белый",12,"Мясо");
    animalsList[2]=new Lions(2,"Тимон", "белый",11,"Мясо");
    animalsList[3]=new Birds(9,"Стриж",12,"Белый",5,"насекомые");
    animalsList[4]=new Lions(3,"Пумба", "бурый",12,"Мясо");
    animalsList[5]=new Dogs(5,"Джек","Дворняга",25,"Белый",12,"Мясо");
    animalsList[6]=new Birds(9,"Стриж",12,"Белый",5,"насекомые");
    animalsList[7]=new Dogs(6,"CC","Хаски",26,"Белый",12,"Мясо");
    animalsList[8]=new Dogs(7,"JJ","Хаски",24,"Белый",12,"Мясо");
    animalsList[9]=new Dogs(8,"CC","Хаски",14,"Белый",12,"Мясо");
    animalsList[10]=new Birds(9,"Стриж",12,"Белый",5,"насекомые");

    kollWaitingAnimals=11;
    return animalsList;

}
}

