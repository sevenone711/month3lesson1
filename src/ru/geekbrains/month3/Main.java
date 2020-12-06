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
