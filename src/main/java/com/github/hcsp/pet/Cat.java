package com.github.hcsp.pet;

public class Cat {
    public String name;

    /** Return the name length of this cat. Return -1 if it's anonymous. 返回这只猫名字的长度。如果没有名字则返回-1。 */
    public int getNameLength() {
        // Fix the NullPointerException thrown in this method
        // 在本方法中，修复抛出的空指针异常（NullPointerException）
        if (name != null) { //name != null 可以
        // if (name.length() >= 0) { 会提示该条件经常正确
            return name.length();
        }
        else {
            return -1; //一定要设为-1，满足题目要求
        }
    }
}
