package com.goit.AnotherRealization;

public class MyHashMapRunner {
    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(10, "Ten");
        myHashMap.put(40, "Fourty");
        myHashMap.put(30, "Thirty");
        myHashMap.put(20, "Twenty");
        myHashMap.put(40, "Fourty");
        myHashMap.put(null, "ABRAKADABRA");
        myHashMap.put(50, "fifty");
        myHashMap.put(null, "KU");
        System.out.println(myHashMap);
        System.out.println("----------------------------------");

        System.out.println(myHashMap.get(50));
        System.out.println(myHashMap.get(30));
        System.out.println(myHashMap.get(10));
        System.out.println(myHashMap.get(60));

        System.out.println("----------------------------------");


        myHashMap.remove(60);

        System.out.println(myHashMap);

        System.out.println("----------------------------------");

        myHashMap.remove(20);

        System.out.println(myHashMap);

        System.out.println("----------------------------------");

        myHashMap.clear();

        System.out.println(myHashMap);

        System.out.println("----------------------------------");

        myHashMap.put(10, "TEN");

        System.out.println(myHashMap);

        System.out.println("----------------------------------");

        myHashMap.get(5);
        System.out.println(myHashMap);

    }
}
