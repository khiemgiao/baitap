package tuan4;

import java.util.Scanner;

class Nguoi {
    protected String hoTen;
    protected int tuoi;

    public Nguoi() {
    }

    public Nguoi(String hoTen, int tuoi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }

    public void nhap(Scanner scanner) {
        scanner.nextLine();
        System.out.print("Nhập họ tên: ");
        this.hoTen = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        this.tuoi = scanner.nextInt();
    }

    public void xuat() {
        System.out.print("Họ tên: " + hoTen + ", Tuổi: " + tuoi);
    }
} 
