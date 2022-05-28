/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.GiaoDich;
import model.GiaoDichTienTe;
import model.GiaoDichVang;

/**
 *
 * @author hp
 */
public class QLGD implements ChucNang {

    List<GiaoDich> list;
    Scanner sc = new Scanner(System.in);

    public QLGD() {
        list = new ArrayList<>();
        list.add((GiaoDichVang) new GiaoDichVang("9999", "V123", "28/05/2022", 12000, 10));
        list.add((GiaoDichVang) new GiaoDichVang("SJC", "V134", "28/05/2022", 13000, 15));
        list.add((GiaoDichTienTe) new GiaoDichTienTe("VN", 1, "T123", "29/05/2022", 13000, 30));
        list.add((GiaoDichTienTe) new GiaoDichTienTe("USD", 23000, "T134", "29/05/2022", 19000, 60));
    }

    public GiaoDich nhapGiaoDich() {
        GiaoDich s = new GiaoDich();
        System.out.println("Nhap Ma Giao Dich: ");
        String maGD = sc.nextLine();
        System.out.println("Nhap Ngay Giao Dich: ");
        String ngay = sc.nextLine();
        System.out.println("Nhap Don Gia: ");
        float dg = Float.parseFloat(sc.nextLine());
        System.out.println("Nhap So Luong: ");
        int sl = Integer.parseInt(sc.nextLine());
        s = new GiaoDich(maGD, ngay, dg, sl);
        return s;
    }

    @Override
    public void ThemGiaoDichVang() {
        GiaoDich s = nhapGiaoDich();
        System.out.println("Nhap Loai Vang: ");
        String lv = sc.nextLine();
        GiaoDichVang gdv = new GiaoDichVang(lv, s.getMaGD(), s.getNgayGD(), s.getDonGia(), s.getSoLuong());
        list.add(gdv);
    }

    @Override
    public void ThemGiaoDichTienTe() {
        GiaoDich s = nhapGiaoDich();
        System.out.println("Nhap Loai Tien: ");
        String lt = sc.nextLine();
        System.out.println("Nhap Ti Gia: ");
        float tg = Float.parseFloat(sc.nextLine());
        GiaoDichTienTe gdt = new GiaoDichTienTe(lt, tg, s.getMaGD(), s.getNgayGD(), s.getDonGia(), s.getSoLuong());
        list.add(gdt);
    }

    @Override
    public void HienThiDSGD() {
        System.out.println("DS GD Vang: ");
        for (GiaoDich i : list) {
            if (i instanceof GiaoDichVang) {
                System.out.println(i.toString());
            }
        }
        System.out.println("DS GD Tien: ");
        for (GiaoDich i : list) {
            if (i instanceof GiaoDichTienTe) {
                System.out.println(i.toString());
            }
        }
    }
    
    private int getVitriTheoMa(String ma) {
        for ( int i = 0; i < list.size(); i++) {
            if ( list.get(i).getMaGD().equals(ma) )
                return i;
        }
        return -1;
    }
    
    @Override
    public void SuaGDTheoMaGD(String maGD) {
        for (GiaoDich i : list) {
            if (i.getMaGD().equals(maGD)) {
                System.out.println("sua ngay : ");
                String ngay = sc.nextLine();
                System.out.println("don gia: ");
                float donGia = Float.parseFloat(sc.nextLine());
                System.out.println("so luong : ");
                int sl = Integer.parseInt(sc.nextLine());
                i.setNgayGD(ngay);
                i.setDonGia(donGia);
                i.setSoLuong(sl);
                if (i instanceof GiaoDichVang) {
                    System.out.println("loai vang : ");
                    String lv = sc.nextLine();
                    ((GiaoDichVang) i).setLoaiVang(lv);
                } else if (i instanceof GiaoDichTienTe) {
                    System.out.println("loai tien : ");
                    String lt = sc.nextLine();
                    System.out.println("ti gia : ");
                    float tg = Float.parseFloat(sc.nextLine());
                    ((GiaoDichTienTe) i).setLoaiTien(lt);
                    ((GiaoDichTienTe) i).setTiGia(tg);
                }
            }
        }
    }

    @Override
    public void XoaGDTheoMaGD(String maGD) {
        int index = getVitriTheoMa(maGD);
        list.remove(index);
    }

    @Override
    public void XemTongSoLuongCuaCacGD() {
        int sum = 0;
        for (GiaoDich i : list) {
            sum += i.getSoLuong();
        }
        System.out.println("So Luong La: " + sum);
    }

    @Override
    public void DSGDTheoNgay(String ngay) {
        System.out.println("DS GD Vang theo ngay: ");
        for (GiaoDich i : list) {
            if (i instanceof GiaoDichVang) {
                if (i.getNgayGD().equals(ngay)) {
                    System.out.println(i.toString());
                }
            }
        }
        System.out.println("DS GD Tien theo ngay: ");
        for (GiaoDich i : list) {
            if (i instanceof GiaoDichTienTe) {
                if (i.getNgayGD().equals(ngay)) {
                    System.out.println(i.toString());
                }
            }
        }
    }

    @Override
    public void DSGDTheoNam(String namBD, String namKT) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
