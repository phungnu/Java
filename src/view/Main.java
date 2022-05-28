/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.QLGD;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Main {

    public static void main(String[] args) {
        QLGD q = new QLGD();
        while (true) {
            System.out.println("1. Nhap giao dich vang");
            System.out.println("2. Nhap giao dich tien");
            System.out.println("3. Hien thi danh sach");
            System.out.println("4. Sua giao dich theo ma giao dich");
            System.out.println("5. Xoa giao dich theo ma giao dich");
            System.out.println("6. Tong so luong giao dich");
            System.out.println("7. Danh sach giao dich theo ngay");
            System.out.println("0. thoat chuong trinh");
            System.out.print(" your choice : ");
            Scanner sc = new Scanner(System.in);
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 :
                    q.ThemGiaoDichVang();
                    break;
                case 2:
                    q.ThemGiaoDichTienTe();
                    break;
                case 3:
                    q.HienThiDSGD();
                    break;
                case 4:
                    System.out.println("nhap ma giao dich de sua : ");
                    String maGD = sc.nextLine();
                    q.SuaGDTheoMaGD(maGD);
                    break;
                case 5:
                    System.out.println("nhap ma giao dich de xoa : ");
                    String maGDxoa = sc.nextLine();
                    q.XoaGDTheoMaGD(maGDxoa);
                    break;
                case 6:
                    q.XemTongSoLuongCuaCacGD();
                    break;
                case 7:
                    System.out.println("nhap ngay: ");
                    String ngay = sc.nextLine();
                    q.DSGDTheoNgay(ngay);
                    break;
                case 0:
                    System.exit(0);
            }
        }

    }
}
