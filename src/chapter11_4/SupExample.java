package chapter11_4;
import java.util.function.Supplier;

public interface SupExample {
    public static void main(String[] args) {
        Supplier<Double> randomValue = Math::random;
        System.out.println(randomValue.get());
    }
}
