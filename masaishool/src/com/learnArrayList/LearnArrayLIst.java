package com.learnArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class LearnArrayLIst {
    public static void main(String[] args) {
        // It store the data in the form of key value pair
        ArrayList<String> arrayList = new ArrayList<>(); //[]
        HashSet<Integer> hs = new HashSet<>(); //[] unique element
        hs.add(1);
        hs.add(2);
        hs.add(3);
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("one", 1);
        hm.put("two", 2);
        hm.put("three", 3);
        hm.put("four", 4);
        hm.put("five", 5);
        System.out.println(hm);
//        hm.putIfAbsent("six", 67);
//        System.out.println(hm);
//        for (Integer e : hs) {
//            System.out.println(e);
//        }
        //Iterate in map
//        for (Map.Entry<String, Integer> e : hm.entrySet()) {
//            System.out.println(e); //one = 1
//            System.out.println(e.getKey()); //one
//            System.out.println(e.getValue());//1
//        }

        for (String key : hm.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();
        for (Integer value : hm.values()) {
            System.out.print(value + " ");
        }
        System.out.println(hm.containsValue(3));
        System.out.println(hm.isEmpty());

    }
}
