//: Java编程思想第四版第320页
package typeinfo;

public class GenericClassReferences {
    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class;
        // int.class 和 Integer.class 是同样的
        genericIntClass = Integer.class;
        intClass = double.class;
        // 非法的赋值
        // genericIntClass = double.class;
    }
}
