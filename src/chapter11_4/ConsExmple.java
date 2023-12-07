package chapter11_4;

import java.util.function.Consumer;

public class ConsExmple {
    public static void main(String[] args) {
        Consumer<String> c = System.out::println;
        c.accept("Hello");
    }
}