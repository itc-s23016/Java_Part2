package exercise;

import chapter7_2.Joining;

public class E721_1 {
    public static void main(String[] args) {
        Joining J = new Joining("-");
        J.add("apple");
        J.add("banana");
        J.add("peach");
        System.out.println(J.getCsv());
    }
}
