package chapter12_1;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<String> greetings = new ArrayList<>();
        greetings.add("おはよう");
        greetings.add("こんにちは");
        greetings.add("こんばんは");

        greetings.add(1,"ありがとう");
        for (String s : greetings) {
            System.out.println(s);
        }
        String s = greetings.get(0);

        System.out.println(s);

        if (s.equals("おはよう")) {
            System.out.println("yes");
        }

        System.out.println(s.contains("good morning"));

        if (!s.isEmpty()) {
            System.out.println(greetings.size());
        }

        System.out.println(greetings.remove(2));
    }
}
