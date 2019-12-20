package com.github.zhangquanli.thinkinginjava.chapter14.code;

public class WildcardClassReferences {

    public static void main(String[] args) {
        Class<?> intClass = int.class;
        intClass = double.class;
    }
}
