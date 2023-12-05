package chapter11;

public class Main2 {
    public static void main(String[] args) {

        Greeting g = (name) -> "Hello, " + name;
        String s = g.sayHello("Mike");
        System.out.println(s);
    }
}