package chapter11_4;

import java.util.function.Function;

public class FunExample {
    public static void main(String[] args) {
//        Function<String, Integer> a = String::length;
//        System.out.println(a.apply("Hello"));

        Function<Integer, Double> num = i -> i / 2.0;
        System.out.println(num.apply(3));
    }
}
