package com.github.zhangquanli.thinkinginjava.chapter14.exercise;

/**
 * 去除默认构建器后，调用Class.newInstance()将会产生IllegalAccessException。
 * 故，Class.newInstance()实际上是调用的类的默认构造器。
 *
 * @author zhangquanli
 */
public class ToyTest1 {

    private static void printInfo(Class cc) {
        System.out.println("Class name: " + cc.getName() + " is interface? [" + cc.isInterface() + "]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name: " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("com.github.zhangquanli.thinkinginjava.chapter14.code.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("Can not find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for (Class face : c.getInterfaces()) {
            printInfo(face);
        }
        Class up = c.getSuperclass();
        Object obj = null;
        try {
            // 需要默认构造器
            obj = up.newInstance();
        } catch (InstantiationException e) {
            System.out.println("Can not instantiate");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.out.println("Can not access");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
}

interface HasBatteries {
}

interface Waterproof {
}

interface Shoots {
}

class Toy {
    // 去除默认构造器
//    Toy() {
//    }

    Toy(int i) {
    }
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
    FancyToy() {
        super(1);
    }
}
