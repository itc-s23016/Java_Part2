package chapter8_3;

import chapter8_1.GeneralMenber;

import java.time.LocalDate;

public class Sample2 {
    public static void main(String[] args) {
        GeneralMenber gem = new StudentMember(
                100,
                "田中宏",
                LocalDate.of(2026, 3, 31));

        System.out.println("id=" + gem.getId());
        System.out.println("name=" + gem.getName());
        System.out.println("会費=" + gem.membershipFee());
//        System.out.println("期限切れ?=" + gem.isExpired() );
//        System.out.println("期限日=" + gem.getExpireDate());
    }
}
