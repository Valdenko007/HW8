package com.goit.Queue;

/**

 Написать свой класс MyQueue как аналог классу Queue, который будет работать по принципу FIFO (first-in-first-out).

 Можно делать либо с помощью Node либо с помощью массива.

 Методы

 add(Object value) добавляет элемент в конец                            +
 remove(int index) удаляет элемент под индексом                         +
 clear() очищает коллекцию                                              +
 size() возвращает размер коллекции                                     +
 peek() возвращает первый элемент в очереди (FIFO)                      +
 poll() возвращает первый элемент в очереди и удаляет его из коллекции  +


 */

public class MyQueueRunner {
    public static void main(String[] args) {
        MyQueue<String> myQueue = new MyQueue<String>();
        myQueue.add("ONE");
        myQueue.add("TWO");
        myQueue.add("THREE");


        System.out.println("Size: " + myQueue.size());
        System.out.println("----------------------------------");

        System.out.println("Peek:" + myQueue.peek());
        System.out.println("----------------------------------");

        System.out.println("Poll: " + myQueue.poll());

        System.out.println("----------------------------------");

        System.out.println("Size after poll: " + myQueue.size());

        System.out.println("----------------------------------");
        myQueue.remove(1);
        System.out.println("Size after remove: " + myQueue.size());

        System.out.println("----------------------------------");
        myQueue.clear();
        System.out.println("Size after clear: " + myQueue.size());
    }
}
