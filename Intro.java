/*
    Introduction of HashMap

        Map --> Interface
         --> class of Map
                --> HashMap
                -->LinkedHashMap
                -->TreeMap


        New Learning things:-
            1. hm.getOrDefault()   --> return value if key exist otherwise return default value
            2. putIfAbsent()    --> put entry if key is not exists otherwise doesn't entry
            3. keySet()     --> get all keys
            4. values()     --> get all values of keys
            5. entrySet()   --> get all keys and values.

            for(var e : hm.entrySet()){
                e.getValue();  --> get value
                e.getKey();  --> get key
            }
*/

import java.util.*;

public class Intro {
    static void HashMapMethod() {
        // syntax
        Map<String, Integer> hm = new HashMap<>();
        
        // Adding elements
        hm.put("Akash",19);
        hm.put("Yash",16);
        hm.put("Lav",17);
        hm.put("Rishika",19);
        hm.put("Harry",21);

        // Getting value of a key from the HashMap
        System.out.println(hm.get("Yash")); // 16
        System.out.println(hm.get("Rahul")); //null

        // changing/updating value of a key in HashMap.
        hm.put("Akash",25); // Akash -> 25
        System.out.println(hm.get("Akash")); // 25

        // Removing a pair from the HashMap
        System.out.println(hm.remove("Yash")); // 16 and will be removed
        System.out.println(hm.get("Yash")); // null

        // checking if a key is in the HashMap
        System.out.println(hm.containsKey("Harry"));  // true
        System.out.println(hm.containsKey("Larry"));  // false

        // Adding a new entry only if the new key doesn't exist.
        hm.putIfAbsent("Yashika", 39);  // will enter
        hm.putIfAbsent("Lav", 99);   // will not enter
        System.out.println(hm.get("Yashika"));
        System.out.println(hm.get("Lav"));

        // get all keys in a HashMap
        System.out.println(hm.keySet());

        // get all values in a HashMap
        System.out.println(hm.values());
 
        // get all entry in a HashMap
        System.out.println(hm.entrySet());

        // Traversing all entries of a HashMap - multiple method
        System.out.println("Traversing all elements in a HashMap");

        // way 1
        System.out.println("---------- way 1 : Traverse --------------");
        for(String key : hm.keySet()){
            // System.out.println("key = " + key + ", value = "+hm.get(key));
            // or
            System.out.printf("Age of %s is %d \n",key,hm.get(key));
        }

        // way 2
        System.out.println("---------- way 2 : Traverse --------------");
        for(Map.Entry<String,Integer> e : hm.entrySet()){
            System.out.printf("Age of %s is %d \n",e.getKey(),e.getValue());
        }

        // way 3
        System.out.println("---------- way 3 : Traverse --------------");
        for(var e : hm.entrySet()){
            System.out.printf("Age of %s is %d \n",e.getKey(),e.getValue());
        }

    }   




    public static void main(String[] args) {
        HashMapMethod();
    }
}