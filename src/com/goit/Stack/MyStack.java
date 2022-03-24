package com.goit.Stack;

public class MyStack<E> {

    private StackNode<E> first;
    private StackNode<E> last;
    private int size;

    public MyStack() {
        first = new StackNode<E> (null, null, last);
        last = new StackNode<E>(null, first, null);
        size = 0;
    }

    public  void remove(int index){
        StackNode<E> temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.getNextElement();
        }
        temp.getNextElement().setPrevElement(temp.getPrevElement());
        temp.getPrevElement().setNextElement(temp.getNextElement());
        size--;
    }

    public void push(E value){
        StackNode<E> newFirst = new StackNode<E>(value, first, first.getNextElement());
        first = new StackNode<E>(null, null, newFirst);
        StackNode<E> temp = last;
        for (int i = size; i > 0; i--) {
            temp = temp.getPrevElement();
        }
        temp.setPrevElement(newFirst);
        size++;
    }

    public void clear(){
        first = new StackNode<E>(null, null,last);
        last = new StackNode<E>(null, first, null);
        size=0;
    }

    public int size(){
        return size;
    }

    public E peek(){
        return first.getNextElement().getElement();
    }

    public E pop(){
        StackNode<E> target = first.getNextElement();
        first.setNextElement(target.getNextElement());
        size--;
        return target.getElement();
    }

}
