package BAITAPTH_BUOI2;

import java.util.Scanner;

class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        setQuantity(quantity);
        setPricePerItem(pricePerItem);
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem < 0.0) {
            this.pricePerItem = 0.0;
        } else {
            this.pricePerItem = pricePerItem;
        }
    }

    public double getInvoiceAmount() {
        return this.quantity * this.pricePerItem;
    }
}

public class BAI1_ThucHanh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma mat hang: ");
        String partNumber = sc.nextLine();

        System.out.print("Nhap mo ta mat hang: ");
        String partDescription = sc.nextLine();

        System.out.print("Nhap so luong: ");
        int quantity = sc.nextInt();

        System.out.print("Nhap don gia: ");
        double pricePerItem = sc.nextDouble();

        Invoice inv = new Invoice(partNumber, partDescription, quantity, pricePerItem);

        System.out.println("\n--- THONG TIN HOA DON ---");
        System.out.println("Ma mat hang: " + inv.getPartNumber());
        System.out.println("Mo ta: " + inv.getPartDescription());
        System.out.println("So luong: " + inv.getQuantity());
        System.out.println("Don gia: " + inv.getPricePerItem());
        System.out.println("Tong hoa don: " + inv.getInvoiceAmount());
        
        sc.close();
    }
}