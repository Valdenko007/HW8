package com.goit.Queue;

public class QueueNode<E> {
    private E Element;
    private QueueNode<E> nextElement;

    public QueueNode(E current, QueueNode<E> next) {
        Element = current;
        nextElement = next;
    }

    public E getElement() {
        return this.Element;
    }

    public void setElement(E Element) {
        this.Element = Element;
    }

    public QueueNode<E> getNextElement() {
        return this.nextElement;
    }

    public void setNextElement(QueueNode<E> nextElement) {
        this.nextElement = nextElement;
    }

}
