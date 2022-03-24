package com.goit.AnotherRealization;

public class HashNode <K, V>{
    private HashNode  previous;
    private HashNode next;
    private K key;
    private V value;

    public HashNode (HashNode previous, HashNode next, K key, V value) {
        this.previous = previous;
        this.next = next;
        this.key = key;
        this.value = value;
    }

    public HashNode getPrevious() {

        return  previous;
    }

    public void setPrevious(HashNode previous) {

        this.previous = previous;
    }

    public HashNode getNext() {

        return next;
    }

    public void setNext(HashNode next) {

        this.next = next;
    }

    public K getKey() {

        return key;
    }

    public void setKey(K key) {

        this.key = key;
    }

    public V getValue() {

        return value;
    }

    public void setValue(V value) {

        this.value = value;
    }

    public String print() {
        if (this == null) {
            return "null";
        }
        String s = "Node{" +
                "previous=" + previous +
                ", next=" + next +
                ", key=" + key +
                ", value=" + value +
                '}';
        return s;
    }
}
