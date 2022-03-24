package com.goit.LinkedList;
/**
 Написать свой класс MyLinkedList как аналог классу LinkedList.

 Нельзя использовать массив. Каждый элемент должен быть отдельным объектом-посредником(Node - нода) который хранит ссылку на предыдущий и следующий элемент коллекции (двусвязный список).

 Методы

 add(Object value) добавляет элемент в конец    +
 remove(int index) удаляет элемент под индексом +
 clear() очищает коллекцию                      +
 size() возвращает размер коллекции             +
 get(int index) возвращает элемент под индексом +


 */



public class MyLinkedListRunner {
        public static void main(String[] args) {
            MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
            myLinkedList.add("ONE");
            myLinkedList.add("TWO");
            myLinkedList.add("THREE");

            System.out.println("Size: " + myLinkedList.size());

            System.out.println("----------------------------------");

            System.out.println("" + myLinkedList.get(2));

            System.out.println("----------------------------------");

            myLinkedList.remove(1);
            System.out.println(myLinkedList.size());

            System.out.println("----------------------------------");

            System.out.println(myLinkedList.get(1));
            myLinkedList.clear();

            System.out.println("----------------------------------");

            System.out.println(myLinkedList.size());
        }
    }


