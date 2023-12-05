package chapter9_1;

import java.time.LocalDate;

public class Sample3 {
    public static void main(String[] args) {
        Member m1 = new StudenfMember(
                200, "木村一郎",
                LocalDate.of(2026, 3, 31)
        );

       /* Member m1 = new SeniorMember(
                150, "鈴木浩二",
                LocalDate.of(1960, 3, 31)
        );
        */

//        m1.isExpired();    Member に　isExpired() が未定義なのでダメ
//        StudenfMember sm = (StudenfMember) m1;
//        System.out.println("期限切れ?=" + sm.isExpired());
        if (m1 instanceof StudenfMember) {
            StudenfMember sm = (StudenfMember) m1;
            System.out.println("期限日=" + sm.getExpireDate());
        }
        if (m1 instanceof StudenfMember stm) {
            System.out.println("期限日=" + stm.getExpireDate());
        }
        Object o = new GeneralMember(200, "木村一郎");

        if (o instanceof Member m2) {
            System.out.println("名前=" + m2.getName());
        }
    }
}
