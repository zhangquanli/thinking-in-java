package com.github.zhangquanli.thinkinginjava.chapter14.code;

public class SweetShop {

    public static void main(String[] args) {
        System.out.println("inside main");
        new Candy();
        System.out.println("After creating Candy");
        try {
            Class.forName("com.github.zhangquanli.thinkinginjava.chapter14.code.Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("Could not find Gum");
        }
        System.out.println("After Class.forName(\"com.github.zhangquanli.thinkinginjava.chapter14.Gum\")");
        new Cookie();
        System.out.println("After creating Cookie");
    }
}

class Candy {
    static {
        System.out.println("Loading Candy");
    }
}

class Gum {
    static {
        System.out.println("Loading Gum");
    }
}

class Cookie {
    static {
        System.out.println("Loading Cookie");
    }
}
