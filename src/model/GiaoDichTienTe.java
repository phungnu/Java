/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author hp
 */
public class GiaoDichTienTe extends GiaoDich implements ThanhTien{
    private String loaiTien;
    private float tiGia;

    public GiaoDichTienTe() {
    }

    public GiaoDichTienTe(String loaiTien, float tiGia, String maGD, String ngayGD, float donGia, int soLuong) {
        super(maGD, ngayGD, donGia, soLuong);
        this.loaiTien = loaiTien;
        this.tiGia = tiGia;
    }

    public String getLoaiTien() {
        return loaiTien;
    }

    public void setLoaiTien(String loaiTien) {
        this.loaiTien = loaiTien;
    }

    public float getTiGia() {
        return tiGia;
    }

    public void setTiGia(float tiGia) {
        this.tiGia = tiGia;
    }

    @Override
    public float tinhTien() {
        return getSoLuong()*getDonGia()*tiGia;
    }

    @Override
    public String toString() {
        return getMaGD()+" "+getNgayGD()+" "+getLoaiTien()+" "+getDonGia()+" "+getSoLuong()+" "+getTiGia();
    }
    
    
}
