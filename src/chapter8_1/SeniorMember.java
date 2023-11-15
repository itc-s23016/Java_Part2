package chapter8_1;

import java.time.LocalDate;

public class SeniorMember extends GeneralMenber {
    private LocalDate birtday;

    public SeniorMember(long id, String name, LocalDate birtday) {
        super(id, name);
        this.birtday = birtday;
    }

    public LocalDate getBirtday() {
        return birtday;
    }

    public void setBirtday(LocalDate birtday) {
        this.birtday = birtday;
    }
}
