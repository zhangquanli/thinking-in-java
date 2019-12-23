//: Java编程思想第四版第320-321页
package typeinfo;

public class WildcardClassReferences {
    public static void main(String[] args) {
        Class<?> intClass = int.class;
        intClass = double.class;
    }
}
