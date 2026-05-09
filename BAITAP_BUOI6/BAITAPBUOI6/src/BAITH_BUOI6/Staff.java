package BAITH_BUOI6;

import java.util.ArrayList;

public class Staff {
    private ArrayList<StaffMember> staffList;

    public Staff() {
        staffList = new ArrayList<>();
    }

    public void addNewStaff(StaffMember sm) {
        staffList.add(sm);
    }

    public void payday() {
        for (StaffMember sm : staffList) {
            System.out.println(sm.toString());
            System.out.println("Lương nhận được: " + sm.pay());
            System.out.println("------------------------------");
        }
    }
}