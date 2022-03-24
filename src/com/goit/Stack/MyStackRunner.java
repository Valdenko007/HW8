package com.goit.Stack;

/**

 Написать свой класс MyStack как аналог классу Stack, который работает по принципу LIFO (last-in-first-out).

 Можно делать либо с помощью Node либо с помощью массива.

 Методы

 push(Object value) добавляет элемент в конец
 remove(int index) удаляет элемент под индексом
 clear() очищает коллекцию
 size() возвращает размер коллекции
 peek() возвращает первый элемент в стеке (LIFO)
 pop() возвращает первый элемент в стеке и удаляет его из коллекции

 */

public class MyStackRunner {

    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<String>();
        myStack.push("ONE");
        myStack.push("TWO");
        myStack.push("THREE");

        System.out.println("Size: " + myStack.size());

        System.out.println("Pop: " + myStack.pop());

        System.out.println("Peek: " + myStack.peek());

        myStack.remove(1);
        System.out.println("Size after removing: " + myStack.size());

        myStack.clear();
        System.out.println("Size after clearing: " + myStack.size());
    }
}
