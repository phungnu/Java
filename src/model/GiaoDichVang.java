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
public class GiaoDichVang extends GiaoDich implements ThanhTien{
    private String loaiVang;

    public GiaoDichVang() {
    }

    public GiaoDichVang(String loaiVang, String maGD, String ngayGD, float donGia, int soLuong) {
        super(maGD, ngayGD, donGia, soLuong);
        this.loaiVang = loaiVang;
    }

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }

    @Override
    public float tinhTien() {
        return getDonGia()*getSoLuong();
    }

    @Override
    public String toString() {
        return getMaGD()+" "+getNgayGD()+" "+getLoaiVang()+" "+getDonGia()+" "+getSoLuong();
    }
    
    
}
