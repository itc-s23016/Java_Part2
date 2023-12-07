package chapter11_3;
import java.util.function.Predicate;
// 引数numberの値が18以上ならtrue,それ以外はfalseと出力
public class PredExample {
    public static void main(String[] args) {
//        boolean result = pred(20, (i) -> (i >= 18));
//        System.out.println(result);
        Predicate<Integer> pr = i -> (i >= 18);
        System.out.println(pr.test(10));
    }
}

//    public static boolean pred(int number, Predicate<Integer> pr) {
//        return pr.test(number);
//    }
//}
