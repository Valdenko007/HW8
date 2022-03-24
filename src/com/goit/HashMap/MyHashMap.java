package com.goit.HashMap;

import java.util.Objects;

    public class MyHashMap<K, V> {
        private HashNode<K, V> first;
        private HashNode<K, V> last;
        private int size = 0;

        public MyHashMap(){
            first = new HashNode<K, V>(null, null, last);
            last = new HashNode<K, V>(null, null, null);

        }

        public int size(){
            return size;
        }

        public void clear(){
            first = new HashNode<K, V>(null, null, last);
            size = 0;
        }

        public void put(K key, V value){
            HashNode<K, V> temp = first;
            if (size==0){
                HashNode<K, V> putNode = new HashNode<K, V>(key, value, last);
                first.setNext(putNode);
                size++;
            }
            else{
                boolean validation = false;
                for (int i = 0; i < size; i++) {
                    if (temp.getKey() != key){
                        temp = temp.getNext();
                        validation = true;
                    }
                    else{
                        validation = false;
                        break;
                    }
                }
                if (validation == true) {
                    HashNode<K, V> putNode = new HashNode<K, V>(key, value, last);
                    temp.setNext(putNode);
                    size++;
                }
            }
        }

        public V get(K key){
            HashNode<K, V> temp = first.getNext();
            V result = first.getValue();
            for (int i = 1; i < size; i++) {
                if (temp.getKey() == key){
                    result = temp.getValue();
                }
                else {
                    temp = temp.getNext();
                }
            }

            return result;
        }

        public void remove(K key){
            HashNode<K, V> temp = first;
            HashNode<K, V> tempNode = null;
            HashNode<K, V> tempNode1 = first;
            int index = 0;
            for (int i = 0; i < size(); i++) {
                temp = temp.getNext();
                if (temp.getKey().equals(key)){
                    index = i;
                    tempNode = temp;
                }
            }
            for (int j = 0; j < index; j++) {
                tempNode1 = tempNode1.getNext();
            }
            tempNode1.setNext(tempNode.getNext());
            size--;
        }


}
