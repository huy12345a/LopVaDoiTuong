package PhuongTrinhBac2;

import java.util.Scanner;

public class TinhPhuongTrinhBacHai {
    public static void main(String[] args) {
        System.out.println("giai phuong trinh bac hai : ax2 + bx + c = 0");
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap a");
        int a = sc.nextInt();
        System.out.println(" nhap b");
        int b = sc.nextInt();
        System.out.println(" nhap c");
        int c = sc.nextInt();
        PhuongTrinhBacHai pt = new PhuongTrinhBacHai(a, b, c);
        if(pt.delta()<0){
            System.out.println("phuong trinh vo nghiem");
        } else if (pt.delta()==0) {
            System.out.println("phuong trinh co 1 nghiem duy nhat : " + pt.nghiem2());
        }else {
            System.out.println("phuong trinh co 2 nghiem la : " + pt.nghiem1() + " va "+ pt.nghiem2());
        }
    }
}
