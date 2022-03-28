package com.goit.AnotherRealization;

import java.util.Arrays;


public class MyArrayList1<E> {

    private int size;
    private static final int DEFAULT_SIZE = 10;
    private E[] element;

    public MyArrayList1() {
        this.element = (E[]) new Object[DEFAULT_SIZE];
    }

    public void add(E value) {
        if (value == null) {
            throw new NullPointerException();
        }
        if (size >= element.length) {
            ensureNewSize();
        }
        element[size++] = value;
    }

    public void ensureNewSize() {
        int newCapacity = (size * 3) / 2 + 1;
        element = Arrays.copyOf(element, newCapacity);
    }

    public E remove(int index) {
        for (int i = index; i < size; i++) {
            element[i] = element[i + 1];
        }
        element[size--] = null;
        return null;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            element[i] = null;
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    public E get(int index) {
        return element[index];
    }


    @Override
    public String toString() {
        return Arrays.toString(element);
    }
}


