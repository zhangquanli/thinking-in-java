//: enumerated/E05_VowelsAndConsonants2.java
// ****************** Exercise 5 *************************
// * Modify control/VowelsAndConsonants.java so that     *
// * it uses three enum types: VOWEL, SOMETIMES_A_VOWEL, *
// * and CONSONANT. The enum constructor should take     *
// * the various letters that describe that particular   *
// * category. Hint: Use varargs, and remember that      *
// * varargs automatically creates an array for you.     *
// *******************************************************
package enumerated;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import static net.mindview.util.Print.print;

enum CharacterCategory {
    VOWEL('a', 'e', 'i', 'o', 'u') {
        @Override
        public String toString() {
            return "vowel";
        }
    },
    SOMETIMES_A_VOWEL('y', 'w') {
        @Override
        public String toString() {
            return "Sometimes a vowel";
        }
    },
    CONSONANT() {
        @Override
        public String toString() {
            return "consonant";
        }
    };

    private Set<Character> chars = new HashSet<>();

    private CharacterCategory(Character... chars) {
        if (chars != null) {
            this.chars.addAll(Arrays.asList(chars));
        }
    }

    public static CharacterCategory getCategory(Character c) {
        if (VOWEL.chars.contains(c)) {
            return VOWEL;
        } else if (SOMETIMES_A_VOWEL.chars.contains(c)) {
            return SOMETIMES_A_VOWEL;
        } else {
            return CONSONANT;
        }
    }
}


public class E05_VowelsAndConsonants2 {
    public static void main(String[] args) {
        Random rand = new Random(47);
        for (int i = 0; i < 100; i++) {
            int c = rand.nextInt(26) + 'a';
            print((char) c + ", " + c + ": " + CharacterCategory.getCategory((char) c));
        }
    }
} /* Output:
y, 121: Sometimes a vowel
n, 110: consonant
z, 122: consonant
b, 98: consonant
r, 114: consonant
n, 110: consonant
y, 121: Sometimes a vowel
g, 103: consonant
c, 99: consonant
f, 102: consonant
o, 111: vowel
w, 119: Sometimes a vowel
z, 122: consonant
...
*///:~
// The getCategory( ) factory method returns the appropriate enum constant
// (based on the character provided): VOWEL, SOMETIMES_A_VOWEL, or
// CONSONANT. Each enum has a custom toString( ) method to return the
// appropriate text for that enum. (More can be found in the Constant-specific
// methods section in TIJ4.)
