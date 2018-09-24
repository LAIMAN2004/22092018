package org.istep.qa.pet;

public class Cat { // обявили класс
    public String nameCat; //обявление полей класса
    public int countEyes; //обявление полей класса

    public char getFirstLatterName(){ //в названии метода сокращенно пишестся его задача  обявление методов выдающий первую буквц имени кота
        char[] letteers = nameCat.toCharArray();
        return letteers[0]; // нужно указать какую ячейку массива нужно вывести
    }

    public void printCatNameToConsole () { //void метод который говорит что выводить ничего ненужно
        System.out.println(nameCat);
    }

    public int getMultEyes(int i){
        System.out.println(countEyes*i);
        return countEyes*i;

    }
}
