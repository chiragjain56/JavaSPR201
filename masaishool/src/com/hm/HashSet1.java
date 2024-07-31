package com.hm;

import java.util.HashMap;

public class HashSet1 {
    public static void main(String[] args) {
        //hash map have key-value pair , key should be uinque
        // we have to find count of the words in the String;
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("one", 1);
        hm.put("two", 2);
        hm.put("three", 1);
        hm.put("four", 2);
        hm.put("one", hm.get("one") + 5);
        hm.put("two", hm.get("two") + 10);
        System.out.println(hm);
        System.out.println(hm.get("three"));
        System.out.println(hm.get("two"));
        System.out.println(hm.get("one"));
        System.out.println(hm.get("four"));


    }
}
