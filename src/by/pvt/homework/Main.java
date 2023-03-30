package by.pvt.homework;
import java.util.Scanner;

import static by.pvt.homework.AnimalsZoo.*;

public class Main {
    public static void main(String[] args) {
        Animals[] animals = AnimalsZoo.AnimalsZooInitialization();
        Animals[] waitingAnimals = AnimalsList.waitingList();
        Scanner in=new Scanner(System.in);
        System.out.println("Добро пожаловать в Зоопарк");
       boolean inProgam=true;
       while(inProgam){
           System.out.println("Достпуные возможности: \n1)Продемонстрировать поведение собак и птиц. " +
                   "\n2)Вывести информацию про собак и птиц. \n3)Добавить животных в зоопарк. \n4)Продемонстрировать поведение львов." +
                   "\n5)Показать количество зверей в зоопарке и количество свободных мест. \n6)Вывести информацию по всем животным в зоопарке" +
                   "\n7)Удалить животное из зоопарка по номеру. \n8)Выйти из программы");
           System.out.print("Выберите номер пункта: ");
           int choice=in.nextInt();
           switch (choice){
               case 1:
                   demonstrationOfTheBehaviorOfDogsAndBirds();
                   break;
               case 2:
                   System.out.println(animals[1].toString());
                   System.out.println(animals[0].toString());
                   break;
               case 3:
                   addInZoo(animals,waitingAnimals);
                   outputInformationAboutAnimalsinZoo(animals);
                   System.out.println("Вы можете добавить еще "+kolFree(animals,getKollAnimals())+" животных");
                   break;
               case 4:
                   System.out.println("Львы");
                   System.out.println(waitingAnimals[0].sing());
                   System.out.println(waitingAnimals[2].play());
                   break;
               case 5:
                   System.out.println("Количество зверей в зоопарке: "+kolAnimalsinZoo(animals));
                   System.out.println("Количество свободного места: "+kolFree(animals,getKollAnimals()));
                   outputInformationAboutAnimalsinZoo(animals);
                   break;
               case 6:
                   outputInformationAboutAnimalsinZoo(animals);
                   break;
               case 7:
                   outputInformationAboutAnimalsinZoo(animals);
                   System.out.print("Введите номер животного которое хотите удалить: ");
                   int number = in.nextInt();
                   System.out.println("Вы удалили животное под номер "+number);
                   dellAnimalsinZooByNumber(animals,number);
                   outputInformationAboutAnimalsinZoo(animals);
                   break;
               case 8:
                   System.out.println("Всего хорошего");
                   inProgam=false;
                   break;
               default:
                   System.out.println("Введет неверный пункт");
                   break;

           }
       }
    }
//Метод вывода информации о каждом звере в зоопарке
    public static Animals[] outputInformationAboutAnimalsinZoo(Animals[] animals){
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                System.out.println(animals[i].toString());
            }
        }
        return animals;
    }
    //    Метод по добавлению животных в зоопарк из списка
    public static Animals[] addInZoo(Animals[] animals, Animals[] waitingAnimals) {
        int k=AnimalsZoo.kolAnimalsinZoo(animals);
        int j =AnimalsList.getNumber();
        if ( AnimalsZoo.kolFree(animals,getKollAnimals()) != 0) {
            animals[k] = waitingAnimals[j];
            animals[k].setNumber(k+1);
            k++;
            AnimalsZoo.setKollAnimals(k);
            j++;
            AnimalsList.setNumber(j);
        }
        return animals;
    }
    //Метод по удалению животного из зоопарка по номеру
    public static Animals[] dellAnimalsinZooByNumber(Animals[] animals, int number){
        int k=animals[number-1].getNumber();
        if(number!=kolAnimalsinZoo(animals)){
        for(int i=number;i<kolAnimalsinZoo(animals);i++){
            Animals temp=animals[i-1];
            animals[i-1]=animals[i];
           animals[i-1].setNumber(k);
            animals[i]=temp;
            k++;
        }
        }
        animals[kolAnimalsinZoo(animals)-1]=null;
        return animals;
    }
//метод для демонстрации собак и птиц
    public static void demonstrationOfTheBehaviorOfDogsAndBirds(){
        System.out.println("Собаки");
        Dogs dog1=new Dogs(1, "Барсик", "Хаски", 15, "Белый", 12, "Мясо");
        Dogs dog2=new Dogs(8, "Биба", "Корги", 10, "Рыжий", 22, "Мясо");
        dog1.run();
        dog1.jump();
        dog1.barking();
        dog2.play();
        dog2.barking2();
        System.out.println("Птицы");
        Birds birds1 = new Birds(2, "Воробей", 6, "Белый", 6, "Насекомые");
        Birds birds2 = new Birds(2, "Стриж", 6, "Белый", 6, "Насекомые");
        birds1.slander();
        birds1.sings2();
        System.out.println(birds2.play());
        birds2.sings();
    }

}

