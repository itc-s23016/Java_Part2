package chapter11_4;

import java.util.function.Predicate;

public class PredExample2 {
    public static void main(String[] args) {
        String words = "apple banana cherry peach";
        Predicate<String> str = words::contains;
        System.out.println(str.test("banana"));
    }
}
