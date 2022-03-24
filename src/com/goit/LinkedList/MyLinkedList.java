package com.goit.LinkedList;

public class MyLinkedList<T>{
    private LinkedNode <T> firstNode;
    private LinkedNode <T> lastNode;
    private int size = 0;

    public MyLinkedList(){
        firstNode = new LinkedNode<T> (null, null, lastNode);
        lastNode = new LinkedNode<T> (null, firstNode, null);
    }

    public void add (T element){
        LinkedNode<T> previous = lastNode;
        previous.setElement(element);
        lastNode = new LinkedNode<T>(null, previous, null);
        previous.setNextElement(lastNode);
        LinkedNode<T> nextElement = firstNode;

        for (int i = 0; i < size; i++) {
            nextElement = nextElement.getNextElement();
        }

        LinkedNode<T> newLastNode = new LinkedNode<T>(element, nextElement, lastNode);
        nextElement.setNextElement(newLastNode);
        size++;
    }

    public void clear(){
        firstNode = new LinkedNode<T> (null, null, lastNode);
        lastNode = new LinkedNode<T> (null, firstNode, null);
        size=0;
    }

    public void remove(int index){
        LinkedNode<T> target = firstNode;

        for (int i = 0; i <= index; i++) {
            target = target.getNextElement();
        }

        target.getPreviousElement().setNextElement(target.getNextElement());
        target.getNextElement().setPreviousElement(target.getPreviousElement());
        size--;
    }

    public T get(int index){
        LinkedNode<T> target = firstNode.getNextElement();

        for (int i = 0; i < index; i++) {
            target = target.getNextElement();
        }

        return target.getElement();
    }

    public int size(){
        return size;
    }
}
