/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author hp
 */
public interface ChucNang {
    void ThemGiaoDichVang();
    void ThemGiaoDichTienTe();
    void HienThiDSGD();
    void SuaGDTheoMaGD(String maGD);
    void XoaGDTheoMaGD(String maGD);
    void XemTongSoLuongCuaCacGD();
    void DSGDTheoNgay(String ngay);
    void DSGDTheoNam(String namBD, String namKT);
}
