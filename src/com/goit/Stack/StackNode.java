package com.goit.Stack;

public class StackNode<E>{

    private E Element;
    private StackNode<E> nextElement;
    private StackNode<E> prevElement;

    public StackNode(E current, StackNode<E> prev, StackNode<E> next) {
        Element = current;
        prevElement = prev;
        nextElement = next;
    }

    public E getElement() {
        return this.Element;
    }

    public void setElement(E Element) {
        this.Element = Element;
    }

    public StackNode<E> getNextElement() {
        return this.nextElement;
    }

    public void setNextElement(StackNode<E> nextElement) {
        this.nextElement = nextElement;
    }

    public StackNode<E> getPrevElement() {
        return this.prevElement;
    }

    public void setPrevElement(StackNode<E> prevElement) {
        this.prevElement = prevElement;
    }
}
