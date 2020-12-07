package ru.geekbrains.month3;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> box = new ArrayList<>();


    public void addFruit (T fruit, int count) {
        for (int i = 0; i < count; i++) {
            box.add(fruit);

        }
    }

    public float  getWeight () {
        float sum = 0;
        for (T friut:box) {
            sum += friut.getWeight();

        }
        return sum;
    }

    public boolean compare (Box temp) {
       if (this.getWeight() == temp.getWeight()){
           return true;
       }else {
           return false;
       }

    }

    public void pourOverBox (Box<T> tempBox) {
        tempBox.box.addAll(box);
        box.clear();
    }
}
