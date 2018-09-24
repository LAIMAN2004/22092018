package Runner;

import org.istep.qa.pet.Cat;

import java.util.Random;

public class Runner {
    public static void main(String[] args) {
        Cat catOne = new Cat();
        catOne.countEyes = 2;
        catOne.nameCat = "Пушок";

        char firstLetter = catOne.getFirstLatterName();
        System.out.println("Первая буква" + firstLetter);
        catOne.printCatNameToConsole();
        Random random = new Random();
        int MultEyes = catOne.getMultEyes(random.nextInt(random.nextInt(100500)));

        Cat catTwo = new Cat();
        catTwo.nameCat="Сидорович";
        catTwo.countEyes=3;

        if (catOne.countEyes>=catTwo.countEyes){
            System.out.println(catOne.nameCat+ "котистее");
        }else {
            System.out.println(catOne.nameCat+ " не вау");
        }
    }
}
