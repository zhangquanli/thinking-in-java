package enumerated;

public class E07 {
    // EnumSet is an abstract class with two private implementation classes:
    // JumboEnumSet for types with more than 64 elements, and
    // RegularEnumSet for types with up to 64 elements. The main factory method
    // (entry point) of the EnumSet class is noneOf( ), which the other static
    // methods also call. The design comes from Patterns for Encapsulating Class
    // Trees. (See http://www.riehle.org/computer-science/research/1995/plop-1995-
    // trading.html.)
    // TIJ4 describes EnumSet’s very efficient bit vector representation, whereby
    // JumboEnumSet uses an array of longs, while RegularEnumSet uses a
    // single long.
}
