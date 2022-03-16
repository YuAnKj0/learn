package com.yuan.learn.hashset;

import java.util.HashSet;

/**
 * 计算哈希值
 */
public class HashSetDemo2 {
    
    public static void main(String[] args) {
        /*
        Student s1=new Student("xiaozhi",23);
        Student s2=new Student("xiaoming",24);
    
        //在Object类中是根据对象的地址值计算哈希值
        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        */
    
        HashSet<Student> hs=new HashSet<>();
        Student s1=new Student("小黑",23);
        Student s2=new Student("xiaomei",22);
        Student s3=new Student("小黑",23);
        
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
    
        System.out.println(hs);
    }
    
}
