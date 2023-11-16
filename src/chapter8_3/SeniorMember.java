package chapter8_3;

import chapter8_1.GeneralMenber;

import java.time.LocalDate;

public class SeniorMember extends GeneralMenber {
    private LocalDate birtday;

    public SeniorMember(long id, String name, LocalDate birtday) {
        super(id, name);
        this.birtday = birtday;
    }

    @Override
    public int membershipFee() {
        return 700;
    }

    public LocalDate getBirtday() {
        return birtday;
    }

    public void setBirtday(LocalDate birtday) {
        this.birtday = birtday;
    }
}
