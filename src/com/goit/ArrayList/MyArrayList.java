package com.goit.ArrayList;

import java.util.Arrays;


    public class MyArrayList {
        private final int mySize = 10;
        private Object[] myArray = new Object[mySize];
        private int size = mySize;

        private int marker = 0;

        public void add(Object value) {
            if (marker == size) {
                size = size + 1;
                myArray = Arrays.copyOf(myArray, size);
            }
            myArray[marker] = value;
            marker++;
        }

        public boolean remove(int index) {
            if (index >= marker | size == 0) {
                return false;
            }
            for (int i = index + 1; i < marker; i++) {
                myArray[i - 1] = myArray[i];
            }
            myArray[marker - 1] = null;
            size--;
            marker--;
            if (size > mySize) {
                myArray = Arrays.copyOf(myArray, size);
            }
            return true;
        }

        public void clear() {
            myArray = Arrays.copyOf(myArray, mySize);
            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = null;
            }
            size = mySize;
            marker = 0;
        }

        public int size() {
            return marker;
        }

        public Object get(int index) throws NoIndex {
            if (index >= myArray.length || index < 0) {
                throw new NoIndex(size(), index);
            }
            return myArray[index];
        }

        static class NoIndex extends Exception {
            NoIndex(int size, int index) {
                super("Element with index " + index + " \n" +
                        "missing from the collection");
            }


        }
        public String print() {
            return Arrays.toString(myArray);
        }
    }


