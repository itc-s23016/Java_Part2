package chapter11_1;

public class Main {
//    匿名クラス
/*    Drawable d = new Drawable() {
    @Override
    public void draw() {
        System.out.println("Hello");
    }
};
    d.draw();
}
} */
//    ラムダ式
    public static void main(String[] args) {
        Drawable d = () -> {
            System.out.println("Hello");
        };
        d.draw();
    }
}