package BAITH_BUOI6;

public class Employee extends StaffMember {
    protected String socialSecurityNumber;
    protected double payRate;

    public Employee(String name, String address, String phone, String socialSecurityNumber, double payRate) {
        super(name, address, phone);
        this.socialSecurityNumber = socialSecurityNumber;
        this.payRate = payRate;
    }

    @Override
    public String toString() {
        return super.toString() + ", SSN: " + socialSecurityNumber + ", Lương cơ bản: " + payRate;
    }

    @Override
    public double pay() {
        return payRate;
    }
}