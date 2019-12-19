package com.github.zhangquanli.thinkinginjava.chapter14.code;

import java.util.Random;

public class ClassInitialization {

    public static Random rand = new Random(47);

    public static void main(String[] args) throws ClassNotFoundException {
        Class initable = Initable.class;
        System.out.println("After creating Initable ref");
        // 没有触发初始化
        System.out.println(Initable.staticFinal);
        // 触发初始化
        System.out.println(Initable.staticFinal2);
        // 触发初始化
        System.out.println(Initable2.staticNonFinal);
        Class initable3 = Class.forName("com.github.zhangquanli.thinkinginjava.chapter14.code.Initable3");
        System.out.println("After creating Initable3 ref");
        System.out.println(Initable3.staticNonFinal);
    }
}

class Initable {
    static final int staticFinal = 47;
    static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);

    static {
        System.out.println("Initializing Initable");
    }
}

class Initable2 {
    static int staticNonFinal = 147;

    static {
        System.out.println("Initializing Initable2");
    }
}

class Initable3 {
    static int staticNonFinal = 74;

    static {
        System.out.println("Initializing Initable3");
    }
}
