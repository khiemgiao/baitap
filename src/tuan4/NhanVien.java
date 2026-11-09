package tuan4;

import java.util.Scanner;

class NhanVien extends Nguoi {
    private int nct;
    private double heSoluong;
    
    public NhanVien() {
        super();
    }

    public NhanVien(String hoTen, int tuoi, int nct, double hsl) {
        super(hoTen, tuoi);
        this.nct = nct;
        this.heSoluong = hsl;
    }

    public int getNct() {
        return nct;
    }

    public double getHsl() {
        return heSoluong;
    }

    public double tinhTienLuong() {
        double lcb = 1_500_000;
        double phucap = 200_000 * nct;
        return lcb * heSoluong + phucap;
    }

    @Override
    public void nhap(Scanner scanner) {
        super.nhap(scanner);
        System.out.print("Nhập số năm công tác: ");
        this.nct = scanner.nextInt();
        System.out.print("Nhập hệ số lương: ");
        this.heSoluong = scanner.nextDouble();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf(", Số năm công tác: %d, Hệ số lương: %.2f, Tiền lương: %.2f VNĐ\n", 
                nct, heSoluong, tinhTienLuong());
    }
    
} 

