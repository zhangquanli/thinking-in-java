package com.github.zhangquanli.thinkinginjava.chapter14.code;

public class GenericToyTest {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class<FancyToy> ftClass = FancyToy.class;
        // 将产生具体的类型
        FancyToy fancyToy = ftClass.newInstance();
        Class<? super FancyToy> up = ftClass.getSuperclass();
        // 将不能编译
        // Class<Toy> up2 = ftClass.getSuperclass();
        // 只能产生Object
        Object obj = up.newInstance();
    }
}
