package com.goit.AnotherRealization;

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


public class MyArrayListRunner1 {
    public static void main(String[] args) {

        MyArrayList1<String> myArrayList = new MyArrayList1<>();

        myArrayList.add("ONE");
        myArrayList.add("TWO");
        myArrayList.add("THREE");
        System.out.println(myArrayList);


        System.out.println("-----------------------------------------");
        System.out.println(myArrayList.size());


        System.out.println("-----------------------------------------");
        System.out.println(myArrayList.get(2));


        System.out.println("-----------------------------------------");
        myArrayList.remove(0);
        System.out.println(myArrayList);


        System.out.println("-----------------------------------------");
        myArrayList.clear();
        System.out.println(myArrayList);


        System.out.println("-----------------------------------------");
        myArrayList.add("1");
        myArrayList.add("2");
        myArrayList.add("3");
        myArrayList.add("4");
        myArrayList.add("5");
        myArrayList.add("6");
        myArrayList.add("7");
        myArrayList.add("8");
        myArrayList.add("9");
        myArrayList.add("10");
        myArrayList.add("11");
        System.out.println(myArrayList);

    }
}

