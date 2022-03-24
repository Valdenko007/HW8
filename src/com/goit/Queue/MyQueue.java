package com.goit.Queue;

public class MyQueue <E>{

    private int size;
    private QueueNode<E> first;
    private QueueNode<E> last;

    public MyQueue() {
        size = 0;
        first = new QueueNode<E>(null, null);
        last = new QueueNode<E>(null, null);
    }

    public int size(){
        return size;
    }

    public void clear(){
        first = new QueueNode<E>(null, null);
        size = 0;
    }

    public E peek(){
        return first.getNextElement().getElement();
    }

    public E poll(){
        QueueNode<E> temp = first.getNextElement();
        first.setNextElement(temp.getNextElement());
        size--;
        return temp.getElement();
    }

    public void remove(int index){
        QueueNode<E> target = first.getNextElement();
        QueueNode<E> newNode = first;
        for (int i = 0; i < index; i++) {
            target = target.getNextElement();
        }
        int count = index-1;
        for (int i = 0; i < count; i++) {
            newNode = newNode.getNextElement();
        }
        newNode.setNextElement(target.getNextElement());
        size--;
    }

    public void add(E value){
        QueueNode<E> nextElement = first;
        for (int i = 0; i < size; i++) {
            nextElement = nextElement.getNextElement();
        }
        QueueNode<E> newLastNode = new QueueNode<E>(value, last);
        nextElement.setNextElement(newLastNode);
        size++;
    }
}
