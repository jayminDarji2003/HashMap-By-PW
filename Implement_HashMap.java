/*
    Implement HashMap
*/

import java.util.*;

public class Implement_HashMap {

    static class HashMap<K, V> {  // k and V are Generics.
        public static final int DEFAULT_CAPACITY = 4;
        public static final double DEFAULT_LOAD_FACTOR = 0.75;

        private class Node{
            K key;
            V value;

            Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private LinkedList<Node> buckets[] ;  // array of linked list
        private int n; // no of nodes.
        private int N = buckets.length;

        @SuppressWarnings("unchecked")
        private void initBuckets(int N){  // N - capacity/size of buckets array.
            buckets = new LinkedList[N];
            for(int i=0; i<buckets.length; i++){
                buckets[i] = new LinkedList<>();  // here we are creating empty linked list
            }
        }

        public HashMap(){
            initBuckets(DEFAULT_CAPACITY);
        }

        private int hashFunction(K key){
            int hc = key.hashCode();
            return Math.abs(hc) % N;            
        }

        private int searchInBucket(LinkedList<Node> ll, K key){
            for(int i=0; i<ll.size(); i++){
                if(ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }   

        public void put(K key, V value){  // insert / update
            int bi = hashFunction(key);
            LinkedList<Node> currBucket = buckets[bi];
            int di = searchInBucket(currBucket,key);

            if(di != -1){
                Node node = new Node(key, value);
                currBucket.add(node);
                n++;
            }else{
                Node currNode = currBucket.get(di);
                currNode.value = value;
            }
        }

        // public int size(){ // return the size of Map.
        //     return n;
        // }

        // public V get(K key){  //return value of key

        // }

        // public V remove(K key){  // remove and return value of key.

        // }

    }

    public static void main(String[] args) {

    }
}
