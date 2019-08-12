package com.github.hcsp;

import com.github.hcsp.pet.Cat;

public class Home {
    public static void main(String[] args) {
        Cat tom = new Cat();
        tom.name = "Tom";
        // Tom's name length is 3
        // 名叫Tom的猫名字的长度是3个字母
        System.out.println("name length: " + tom.getNameLength());

        // An anonymous cat's name length should be -1, but we get an exception here
        // Try to fix the bug in Cat.getNameLength() method
        // 一只没有名字的猫的名字长度本来应该是-1，但是现在抛出了一个异常
        // 请在Cat.getNameLength()方法中修复此问题
        Cat anonymousCat = new Cat();
        System.out.println("name length: " + anonymousCat.getNameLength());
    }
}
