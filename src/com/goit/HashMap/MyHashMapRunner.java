package com.goit.HashMap;

/**

 Написать свой класс MyHashMap как аналог классу HashMap.

 Нужно делать с помощью односвязной Node.

 Не может хранить две ноды с одинаковых ключами одновременно.

 Методы

 put(Object key, Object value) добавляет пару ключ + значение    +
 remove(Object key) удаляет пару по ключу                        +
 clear() очищает коллекцию                                       +
 size() возвращает размер коллекции                              +
 get(Object key) возвращает значение(Object value) по ключу      +

 */

public class MyHashMapRunner {
    public static void main(String[] args) {
        MyHashMap<Integer, String> myHashMap = new MyHashMap<Integer, String>();
        myHashMap.put(1, "One");
        myHashMap.put(2, "Two");
        myHashMap.put(3, "Three");


        System.out.println("Size: " + myHashMap.size());

        System.out.println("----------------------------------");


        System.out.println("Get element: " + myHashMap.get(2));

        System.out.println("----------------------------------");

        myHashMap.remove(2);
        System.out.println("Get element after remove: " + myHashMap.get(2));

        System.out.println("----------------------------------");


        System.out.println("Size after remove: " + myHashMap.size());

        System.out.println("----------------------------------");

        myHashMap.clear();
        System.out.println("Size after clearing: " + myHashMap.size());
    }

}
