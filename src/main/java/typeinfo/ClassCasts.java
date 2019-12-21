//: Java编程思想第四版第322页
package typeinfo;

class Building {
}

class House extends Building {
}

public class ClassCasts {
    public static void main(String[] args) {
        Building b = new House();
        Class<House> houseType = House.class;
        House h = houseType.cast(b);
        // 实现上面代码的相同功能
        h = (House) b;
    }
}
