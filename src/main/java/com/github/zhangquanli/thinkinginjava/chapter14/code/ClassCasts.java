package com.github.zhangquanli.thinkinginjava.chapter14.code;

public class ClassCasts {

    public static void main(String[] args) {
        Building b = new House();
        Class<House> houseType = House.class;
        House h = houseType.cast(b);
        // 实现上面代码的相同功能
        h = (House) b;
    }
}

class Building {
}

class House extends Building {
}
