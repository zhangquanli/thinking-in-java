//: interfaces/E08_FastFood.java
/****************** Exercise 8 ******************
 * Create an interface called FastFood (with
 * appropriate methods) in
 * polymorphism.Sandwich.java, and change Sandwich
 * so it also implements FastFood.
 ***********************************************/
package interfaces;

import static net.mindview.util.Print.print;

class Meal {
    Meal() {
        print("Meal()");
    }
}

class Bread {
    Bread() {
        print("Bread()");
    }
}

class Cheese {
    Cheese() {
        print("Cheese()");
    }
}

class Lettuce {
    Lettuce() {
        print("Lettuce()");
    }
}

class Lunch extends Meal {
    Lunch() {
        print("Lunch()");
    }
}

class PortableLunch extends Lunch {
    PortableLunch() {
        print("PortableLunch()");
    }
}

class Sandwich extends PortableLunch {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();

    public Sandwich() {
        print("Sandwich()");
    }
}

interface FastFood {
    void rushOrder();

    void gobble();
}

class FastSandwich extends Sandwich implements FastFood {
    public void rushOrder() {
        print("Rushing your sandwich order");
    }

    public void gobble() {
        print("Chomp! Snort! Gobble!");
    }
}

public class E08_FastFood {
    public static void main(String args[]) {
        FastSandwich burger = new FastSandwich();
        print("Fries with that?");
        print("Super Size?");
        burger.rushOrder();
        burger.gobble();
    }
}
/* Output:
Meal()
Lunch()
PortableLunch()
Bread()
Cheese()
Lettuce()
Sandwich()
Fries with that?
Super Size?
Rushing your sandwich order
Chomp! Snort! Gobble!
*///:~
