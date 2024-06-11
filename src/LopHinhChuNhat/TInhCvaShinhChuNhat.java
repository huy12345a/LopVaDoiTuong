package LopHinhChuNhat;

import java.util.Scanner;

public class TInhCvaShinhChuNhat {
    public static void main(String[] args) {
        System.out.println("nhap vao chieu dai HCN: " );
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        System.out.println("nhap vao chieu rong HCN: ");
        int height = sc.nextInt();
        HinhChuNhat HCN = new HinhChuNhat(width, height);
        System.out.println(" Dien tich hinh chu nhat la: ");
        System.out.println("S = " + HCN.area());
        System.out.println(" Chu vi hinh chu nhat la : ");
        System.out.println("C = " + HCN.perimeter());
        System.out.println("hinh anh : ");
        HCN.hienthi();
    }
}
