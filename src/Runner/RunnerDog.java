package Runner;

import org.istep.qa.pet.Dog;

public class RunnerDog {
    public static void main(String[] args) {
        Dog dogOne = new Dog();
        dogOne.colorGlaz = "Green";
        dogOne.printColorGlazToConsole();
        dogOne.chisliLap = 3;
        dogOne.printChisliLapToConsole();

        Dog dogTwo = new Dog();
        dogTwo.colorGlaz = "blec";
        dogTwo.printColorGlazToConsole();
        dogTwo.chisliLap = 6;
        dogTwo.printChisliLapToConsole();


        if (dogOne.colorGlaz==dogTwo.colorGlaz){
        System.out.println("Они родственники");
        } else {
            System.out.println("Нифига");
        }
    }
            }
