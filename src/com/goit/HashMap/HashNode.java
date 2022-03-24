package com.goit.HashMap;

public class HashNode <K, V>{
    private HashNode<K, V> next;
    private V value;
    private K key;

    public HashNode(K key, V value, HashNode<K, V> next) {
        this.value = value;
        this.key = key;
        this.next = next;
    }

    public HashNode<K, V> getNext() {
        return next;
    }

    public void setNext(HashNode<K, V> next) {
        this.next = next;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }
}
