//: Java编程思想第四版第315-316页
package typeinfo;

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

public class SweetShop {
    public static void main(String[] args) {
        System.out.println("inside main");
        new Candy();
        System.out.println("After creating Candy");
        try {
            Class.forName("typeinfo.Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("Could not find Gum");
        }
        System.out.println("After Class.forName(\"typeinfo.Gum\")");
        new Cookie();
        System.out.println("After creating Cookie");
    }
}
