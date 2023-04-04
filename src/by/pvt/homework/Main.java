package by.pvt.homework;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Dogs[] dogsList = AnimalsList.createAnArrayOfDogs();
        Birds[] birdsList = AnimalsList.createAnArrayOfBirds();
        Lions[] lionsList = AnimalsList.createAnArrayOfLions();
        Animals[] animals = AnimalsZoo.AnimalsZooInitialization(dogsList, birdsList, lionsList);
        getMenu(animals, dogsList, birdsList, lionsList);

    }

    //Метод вывода информации о каждом звере в зоопарке
    public static Animals[] outputInformationAboutAnimalsinZoo(Animals[] animals) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                System.out.println(animals[i].toString());
            } else {
                break;
            }
        }
        return animals;
    }

    //Метод по удалению животного из зоопарка по номеру
    public static Animals[] dellAnimalsinZooByNumber(Animals[] animals, int number) {
        int k = animals[number - 1].getNumber();
        if (number != AnimalsZoo.kolAnimalsinZoo(animals)) {
            for (int i = number; i < AnimalsZoo.kolAnimalsinZoo(animals); i++) {
                Animals temp = animals[i - 1];
                animals[i - 1] = animals[i];
                animals[i - 1].setNumber(k);
                animals[i] = temp;
                k++;
            }
        }
        animals[AnimalsZoo.kolAnimalsinZoo(animals) - 1] = null;
        return animals;
    }

    public static Dogs[] dellInMassDogs(Dogs[] dogsList, int number) {
        int k = number;
        if (k != 0) {
            for (int i = 1; i < Dogs.kolDogs(dogsList); i++) {
                Dogs temp = dogsList[i - 1];
                dogsList[i - 1] = dogsList[i];
                dogsList[i] = temp;
            }
            dogsList[AnimalsZoo.kolAnimalsinZoo(dogsList) - 1] = null;

        }
        return dogsList;
    }

    public static Birds[] dellInMassBirds(Birds[] birdslist, int number) {
        int k = number;
        if (k != 0) {
            for (int i = 1; i < Birds.kolBirds(birdslist); i++) {
                Birds temp = birdslist[i - 1];
                birdslist[i - 1] = birdslist[i];
                birdslist[i] = temp;
            }
            birdslist[AnimalsZoo.kolAnimalsinZoo(birdslist) - 1] = null;

        }
        return birdslist;
    }

    public static Lions[] dellInMassLions(Lions[] lionslist, int number) {
        int k = number;
        if (k != 0) {
            for (int i = 1; i < Lions.kolLions(lionslist); i++) {
                Lions temp = lionslist[i - 1];
                lionslist[i - 1] = lionslist[i];
                lionslist[i] = temp;
            }
            lionslist[AnimalsZoo.kolAnimalsinZoo(lionslist) - 1] = null;

        }
        return lionslist;
    }

    //метод для демонстрации собак и птиц
    public static void demonstrationOfTheBehaviorOfDogsAndBirds(Dogs[] dogsList, Birds[] birdsList) {
        System.out.println("Собаки");
        dogsList[1].run();
        dogsList[2].jump();
        dogsList[3].barking();
        dogsList[3].play();
        dogsList[0].barking2();
        System.out.println("Птицы");
        birdsList[0].slander();
        birdsList[1].sings2();
        System.out.println(birdsList[1].play());
        birdsList[0].sings();
    }

    private static void getMenu(Animals[] animals, Dogs[] dogsList, Birds[] birdsList, Lions[] lionsList) {
        boolean inProgam = true;
        while (inProgam) {
            System.out.println("Достпуные возможности: \n1)Продемонстрировать поведение собак и птиц. " +
                    "\n2)Вывести информацию про собак и птиц. \n3)Добавить собак  в зоопарк. \n4)Добавить птиц  в зоопарк." +
                    "\n5)Добавить львов  в зоопарк.\n6)Продемонстрировать поведение львов." +
                    "\n7)Показать количество зверей в зоопарке и количество свободных мест. \n8)Вывести информацию по всем животным в зоопарке" +
                    "\n9)Удалить животное из зоопарка по номеру. \n10)Выйти из программы");
            System.out.print("Выберите номер пункта: ");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    Main.demonstrationOfTheBehaviorOfDogsAndBirds(dogsList, birdsList);
                    break;
                case 2:
                    System.out.println(dogsList[1].toString());
                    System.out.println(birdsList[0].toString());
                    break;
                case 3:
                    System.out.println("Вы можете добавить " + Dogs.kolDogs(dogsList) + " собаки!");
                    System.out.print("Сколько хотите добавить?: ");
                    int kolDog = in.nextInt();
                    AnimalsZoo.addInZoo(animals, dogsList, kolDog);
                    AnimalsZoo.assigningNumbersToAnimals(animals);
                    outputInformationAboutAnimalsinZoo(animals);
                    break;
                case 4:
                    System.out.println("Вы можете добавить " + Birds.kolBirds(birdsList) + " птиц!");
                    System.out.print("Сколько хотите добавить?: ");
                    int kolBirds = in.nextInt();
                    AnimalsZoo.addInZoo(animals, birdsList, kolBirds);
                    AnimalsZoo.assigningNumbersToAnimals(animals);
                    outputInformationAboutAnimalsinZoo(animals);
                    break;
                case 5:
                    System.out.println("Вы можете добавить " + Lions.kolLions(lionsList) + " льва!");
                    System.out.print("Сколько хотите добавить?: ");
                    int kolLions = in.nextInt();
                    AnimalsZoo.addInZoo(animals, lionsList, kolLions);
                    AnimalsZoo.assigningNumbersToAnimals(animals);
                    outputInformationAboutAnimalsinZoo(animals);
                    break;
                case 6:
                    System.out.println("Львы");
                    System.out.println(lionsList[0].sing());
                    System.out.println(lionsList[1].play());
                    break;
                case 7:
                    System.out.println("Количество зверей в зоопарке: " + AnimalsZoo.kolAnimalsinZoo(animals));
                    System.out.println("Количество свободного места: " + AnimalsZoo.kolFreePlaces(animals, AnimalsZoo.getKollAnimals()));
                    outputInformationAboutAnimalsinZoo(animals);
                    break;
                case 8:
                    AnimalsZoo.assigningNumbersToAnimals(animals);
                    outputInformationAboutAnimalsinZoo(animals);
                    break;
                case 9:
                    AnimalsZoo.assigningNumbersToAnimals(animals);
                    outputInformationAboutAnimalsinZoo(animals);
                    System.out.print("Введите номер животного которое хотите удалить: ");
                    int number = in.nextInt();
                    System.out.println("Вы удалили животное под номер " + number);
                    dellAnimalsinZooByNumber(animals, number);
                    outputInformationAboutAnimalsinZoo(animals);
                    break;
                case 10:
                    System.out.println("Всего хорошего");
                    inProgam = false;
                    break;
                default:
                    System.out.println("Введет неверный пункт");
                    break;

            }
            String ch = in.nextLine();
            System.out.print("Нажмите Enter чтобы продолжить");
            String ch1 = in.nextLine();

        }
    }
}

