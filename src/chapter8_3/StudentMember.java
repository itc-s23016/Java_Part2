package chapter8_3;

import chapter8_1.GeneralMenber;

import java.time.LocalDate;

public class StudentMember extends GeneralMenber {
    private LocalDate expireDate;

    public StudentMember(long id, String name, LocalDate expireDate) {
        super(id, name);
        this.expireDate = expireDate;
    }

    @Override
    public int membershipFee() {
        return 500;
    }

    public boolean isExpired() {
        LocalDate today = LocalDate.now();
        return today.isAfter(expireDate);
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }
}

