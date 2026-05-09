package BAITH_BUOI6;

public abstract class StaffMember {
    protected String name;
    protected String address;
    protected String phone;

    public StaffMember(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Tên: " + name + ", Địa chỉ: " + address + ", SĐT: " + phone;
    }

    public abstract double pay();
}