package com.goit.AnotherRealization;

import java.util.Objects;

public class MyHashMap<K, V> {
    private int size = 0;
    private HashNode firstNode = new HashNode(null, null, null, null);
    private HashNode lastNode = new HashNode(null, null, null, null);

    public void setFirstNode(HashNode firstNode) {

        this.firstNode = firstNode;
    }

    public void setLastNode(HashNode lastNode) {

        this.lastNode = lastNode;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public HashNode getFirstNode() {
        return firstNode;
    }

    public HashNode getLastNode() {
        return lastNode;
    }

    public void put(K key, V value) {
        if (size == 0) {
            HashNode newNode = new HashNode(null, null, key, value);
            firstNode = newNode;
            lastNode = firstNode;
            size++;
            return;
        }
        HashNode node = firstNode;
        for (int i = 0; i < size; i++) {
            if (Objects.equals(node.getKey(), key)) {
                node.setKey(key);
                node.setValue(value);
                return;
            }
            node = node.getNext();
        }
        HashNode newNode = new HashNode(lastNode, null, key, value);
        lastNode.setNext(newNode);
        lastNode = newNode;
        size++;
    }

    public boolean remove(K key) {
        if (size == 0) {
            return false;
        }
        HashNode node = firstNode;
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (Objects.equals(node.getKey(), key)) {
                flag = true;
                if (i == 0) {
                    node.getNext().setPrevious(null);
                    firstNode = node.getNext();
                } else if (i == size - 1) {
                    node.getPrevious().setNext(null);
                    lastNode = node.getPrevious();
                } else {
                    node.getPrevious().setNext(node.getNext());
                    node.getNext().setPrevious(node.getPrevious());
                }
                size--;
            }
            node = node.getNext();
        }
        if (flag == true) {
            return true;
        } else {
            return false;
        }
    }

    public void clear() {
        firstNode.setNext(null);
        firstNode.setKey(null);
        firstNode.setValue(null);
        lastNode = firstNode;
        size = 0;
    }

    public int size() {
        return size;
    }

    public V get(K key) {
        HashNode node = firstNode;
        for (int i = 0; i < size; i++) {
            if (Objects.equals(node.getKey(), key)) {
                return (V) node.getValue();
            }
            ;
            node = node.getNext();
        }
        return null;
    }

    public String toString() {
        HashNode node = firstNode;
        String result = new String();
        for (int i = 0; i < size; i++) {
            result += node.print() + "\n";
            node = node.getNext();
        }
        return result;
    }


}
