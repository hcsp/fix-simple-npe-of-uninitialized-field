package com.github.hcsp.pet;

public class Cat {
    public String name;

    /** Return the name length of this cat. Return zero if it's anonymous. 返回这只猫名字的长度。如果没有名字则返回0。 */
    public int getNameLength() {
        // Fix the NullPointerException thrown in this method
        // 在本方法中，修复抛出的空指针异常（NullPointerException）
        if(name ==null){
            return 0;
        }else{
            return name.length();
        }


    }
}
