package ru.geekbrains.month3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	String[] arr = {"1","12","64","55","12","5","3","2",};
    Integer[] arrInt = {1,2,3,4,5,6,7,8,19};
	//1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
	arrMove(arrInt, 4,2);

	//2. Написать метод, который преобразует массив в ArrayList;
        arrayToArrayList(arr);
        System.out.println("\n");
//        3. Большая задача:
//        a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
//        b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
//        c. Для хранения фруктов внутри коробки можете использовать ArrayList;
//        d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
//        e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую подадут в compare в качестве параметра, true - если их веса равны, false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
//        f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку(помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами), соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
//        g. Не забываем про метод добавления фрукта в коробку.

        Box<Orange> orangeBox1 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();

//        Apple apple1 = new Apple();
//        Apple apple2 = new Apple();
//        orangeBox1.addFruit(new Apple(),22); - дает ошибку

        orangeBox1.addFruit(new Orange(),22);
        System.out.println("Добавили в orageBox1 - 22 апельсина");
        appleBox1.addFruit(new Apple(),11);
        System.out.println("Добавили в apleBox1 - 11 яблок");
        System.out.println("Коробка appleBox1 весит - " + appleBox1.getWeight() + " кг.");
        System.out.println("Коробка orageBox1 весит - " + orangeBox1.getWeight() + " кг.");
//      Сравниваем коробки
        System.out.print("Сравниваем коробки appleBox1 и orangeBox1 результат: ");
        System.out.println(appleBox1.compare(orangeBox1));
        System.out.println("Пересыпаем с appleBox1 в appleBox2");
        appleBox1.pourOverBox(appleBox2);
        System.out.println("Коробка appleBox1 весит - " + appleBox1.getWeight() + " кг.");
        System.out.println("Коробка appleBox2 весит - " + appleBox2.getWeight() + " кг.");

        System.out.println("Пересыпаем с orageBox1 в orageBox2");
        orangeBox1.pourOverBox(orangeBox2);
        System.out.println("Коробка orageBox1 весит - " + orangeBox1.getWeight() + " кг.");
        System.out.println("Коробка orageBox2 весит - " + orangeBox2.getWeight() + " кг.");
    }

    private static <T> void arrayToArrayList (T[] arr) {
        ArrayList<T> listOfArray = new ArrayList<>(Arrays.asList(arr));
        System.out.print("Сделали из массива ArrayList: ");
        System.out.println(listOfArray);
    }

    private static void arrMove (Object[] arr, int i, int i1) {
        if ( i > arr.length || i1 > arr.length || i < 0 || i1 < 0 ){
            System.out.println("Значения выходят за пределы массива");

        }
        else {


        System.out.println("Дан массив: " + Arrays.toString(arr));
        System.out.println("Меняем местами: id " + i + " на: id  " + i1);
        Object temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
        System.out.println("Получилось: " + Arrays.toString(arr) +"\n");
        }
    }
}
