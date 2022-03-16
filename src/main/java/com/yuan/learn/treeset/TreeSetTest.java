package com.yuan.learn.treeset;

import java.util.TreeSet;

public class TreeSetTest {
    
    public static void main(String[] args) {
        TreeSet<Student> ts=new TreeSet<>();
        
        Student s1=new Student("sdf",80,80,80);
        Student s2=new Student("sqwdf",90,90,90);
        Student s3=new Student("ssdfdccsdfdf",100,100,100);
        
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        
        for (Student student:ts){
            System.out.println(student);
        }

        
    }
}
