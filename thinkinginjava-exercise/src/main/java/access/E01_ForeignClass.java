//: access/E01_ForeignClass.java
/****************** Exercise 1 ****************
 * Create a class in a package. Create an
 * instance of your class outside of that package.
 ***********************************************/
package access;

public class E01_ForeignClass {
    public static void main(String[] args) {
        new access.local.E01_PackagedClass();
    }
}
///:~