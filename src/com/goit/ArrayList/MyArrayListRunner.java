package com.goit.ArrayList;

/**
 Написать свой класс MyArrayList как аналог классу ArrayList.

 Можно использовать 1 массив для хранения данных.

 Методы

 add(Object value) добавляет элемент в конец     +
 remove(int index) удаляет элемент под индексом  +
 clear() очищает коллекцию                       +
 size() возвращает размер коллекции              +
 get(int index) возвращает элемент под индексом  +

 */


public class MyArrayListRunner {
    public static void main(String[] args) throws MyArrayList.NoIndex {
        MyArrayList myStringArrayList = new MyArrayList();
        myStringArrayList.add("Piston");
        myStringArrayList.add("Carburetor");
        myStringArrayList.add("Clutch");
        myStringArrayList.add("Connecting rod");
        myStringArrayList.add("Gasket");
        myStringArrayList.add("Gearbox");
        myStringArrayList.add("Ignition");
        myStringArrayList.add("Shaft");
        myStringArrayList.add("Valve");
        myStringArrayList.add("Wrist pin");
        myStringArrayList.add("Thermostat");


        System.out.println("Size is " + myStringArrayList.size());
        System.out.println("----------------------------------");

        System.out.println((myStringArrayList.print()));

        myStringArrayList.remove(10);
        System.out.println((myStringArrayList.print()));

        myStringArrayList.remove(0);
        System.out.println((myStringArrayList.print()));

        myStringArrayList.remove(2);
        System.out.println((myStringArrayList.print()));

        myStringArrayList.remove(6);
        System.out.println((myStringArrayList.print()));

        System.out.println("Size is " + myStringArrayList.size());

        System.out.println("----------------------------------");

        myStringArrayList.clear();
        System.out.println((myStringArrayList.print()));

        System.out.println("Size is " + myStringArrayList.size());

        System.out.println("----------------------------------");

        myStringArrayList.add("Flywheel");
        System.out.println((myStringArrayList.print()));
        System.out.println("Size is " + myStringArrayList.size());

        System.out.println("----------------------------------");

        myStringArrayList.get(9);
        System.out.println((myStringArrayList.print()));

        System.out.println("----------------------------------");

        MyArrayList myIntArrayList = new MyArrayList();

        myIntArrayList.add(333);
        myIntArrayList.add(544);
        myIntArrayList.add(122555);
        myIntArrayList.add(999);
        myIntArrayList.add(29);

        System.out.println((myIntArrayList.print()));

        myIntArrayList.remove(5);
        System.out.println((myIntArrayList.print()));

        myIntArrayList.remove(0);
        System.out.println((myIntArrayList.print()));

        System.out.println("Size is " + myIntArrayList.size());

        System.out.println("----------------------------------");

        myIntArrayList.clear();
        System.out.println((myIntArrayList.print()));

        System.out.println("Size is " + myIntArrayList.size());
    }
}
