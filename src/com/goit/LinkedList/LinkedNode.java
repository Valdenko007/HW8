package com.goit.LinkedList;

class LinkedNode<T> {

    private T Element;
    private LinkedNode<T> nextElement;
    private LinkedNode<T> previousElement;

    public LinkedNode(T current, LinkedNode<T> prev, LinkedNode<T> next) {
        Element = current;
        previousElement = prev;
        nextElement = next;
    }

    public T getElement() {
        return this.Element;
    }

    public void setElement(T Element) {
        this.Element = Element;
    }

    public LinkedNode<T> getNextElement() {
        return this.nextElement;
    }

    public void setNextElement(LinkedNode<T> nextElement) {
        this.nextElement = nextElement;
    }

    public LinkedNode<T> getPreviousElement() {
        return this.previousElement;
    }

    public void setPreviousElement(LinkedNode<T> prevElement) {
        this.previousElement = prevElement;
    }
}
