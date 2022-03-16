package com.yuan.learn.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add("Hello");
        hs.add("Java");
        hs.add("Hello");
        hs.add("Java");
        hs.add("Hello");
        hs.add("Java");
        Iterator<String> iterator = hs.iterator();
        while (iterator.hasNext()){
            String s= iterator.next();
            System.out.println(s);
        }
        System.out.println("========================");
    
        for (String h : hs) {
            System.out.println(h);
        }
    }
}
