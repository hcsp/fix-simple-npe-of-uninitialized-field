package com.github.hcsp.pet;

public class Cat {
    public String name;

    /** Return the name length of this cat. Return -1 if it's anonymous. 返回这只猫名字的长度。如果没有名字则返回-1。 */
    public int getNameLength() {
        if (this.name == null){
            return -1;
        } else {
            return this.name.length();
        }
    }
}
