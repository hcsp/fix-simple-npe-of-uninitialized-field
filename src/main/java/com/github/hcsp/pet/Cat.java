package com.github.hcsp.pet;

import java.util.Objects;

public class Cat {
    public String name;     // 成员变量

    /**
     * Return the name length of this cat. Return -1 if it's anonymous. 返回这只猫名字的长度。如果没有名字则返回-1。
     */
    public int getNameLength() {
        if (Objects.equals(null, name))
        {
            return -1;
        }
        else{
            // Fix the NullPointerException thrown in this method
            // 在本方法中，修复抛出的空指针异常（NullPointerException）
            return name.length();
        }
    }
}