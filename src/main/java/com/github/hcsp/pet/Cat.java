package com.github.hcsp.pet;

public class Cat {         //Cat类
    public String name;    //cat的成员变量

    /**
     * Return the name length of this cat. Return -1 if it's anonymous. 返回这只猫名字的长度。如果没有名字则返回-1。
     */
    public int getNameLength() {
        if (name != null) {
            return name.length();
        }
        else {
            return -1;
        }
    }
}
