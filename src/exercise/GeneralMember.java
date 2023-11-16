package exercise;

import java.time.LocalDate;

public class GeneralMember extends Member {

    public GeneralMember(long id, String name) {
        super(id, name);
    }

    @Override
    public int fee() {
        return 1000;
    }
}
