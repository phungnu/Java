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
public class GiaoDich {
    private String maGD, ngayGD;
    private float donGia;
    private int soLuong;

    public GiaoDich() {
    }

    public GiaoDich(String maGD, String ngayGD, float donGia, int soLuong) {
        this.maGD = maGD;
        this.ngayGD = ngayGD;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public String getMaGD() {
        return maGD;
    }

    public void setMaGD(String maGD) {
        this.maGD = maGD;
    }

    public String getNgayGD() {
        return ngayGD;
    }

    public void setNgayGD(String ngayGD) {
        this.ngayGD = ngayGD;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    
    
}
