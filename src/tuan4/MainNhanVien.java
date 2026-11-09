package tuan4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class MainNhanVien {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        List<NhanVien> danhSachNV = new ArrayList<>();
        
        System.out.print("Nhập số lượng nhân viên: ");
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nThông tin nhân viên " + (i + 1));
            NhanVien nv = new NhanVien();
            nv.nhap(scanner);
            danhSachNV.add(nv);
        }

        if (!danhSachNV.isEmpty()) {
            NhanVien maxSnctNv = danhSachNV.get(0);
            for (NhanVien nv : danhSachNV) {
                if (nv.getNct() > maxSnctNv.getNct()) {
                    maxSnctNv = nv;
                }
            }
            System.out.println("\n nhan vien nhieu nam cong tac: ");
            maxSnctNv.xuat();
        }

        danhSachNV.sort(new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return Double.compare(o2.tinhTienLuong(), o1.tinhTienLuong());
            }
        });

        System.out.println("\ndanh sach nhan vien");
        for (NhanVien nv : danhSachNV) {
            nv.xuat();
        }

        scanner.close();
    }
}

