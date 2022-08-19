/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author user
 */
public class Chitiethoadonnhap {
    private String mahoadonnhap, masanpham;
    private int soluong;
    private float dongia,tongtien;

    public Chitiethoadonnhap() {
    }

    public Chitiethoadonnhap(String mahoadonnhap, String masanpham, int soluong, float dongia, float tongtien) {
        this.mahoadonnhap = mahoadonnhap;
        this.masanpham = masanpham;
        this.soluong = soluong;
        this.dongia = dongia;
        this.tongtien = tongtien;
    }

    public Chitiethoadonnhap(String masanpham, int soluong, float dongia, float tongtien) {
        this.masanpham = masanpham;
        this.soluong = soluong;
        this.dongia = dongia;
        this.tongtien = tongtien;
    }

    public String getMahoadonnhap() {
        return mahoadonnhap;
    }

    public void setMahoadonnhap(String mahoadonnhap) {
        this.mahoadonnhap = mahoadonnhap;
    }

    public String getMasanpham() {
        return masanpham;
    }

    public void setMasanpham(String masanpham) {
        this.masanpham = masanpham;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public float getDongia() {
        return dongia;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }

    public float getTongtien() {
        return tongtien;
    }

    public void setTongtien(float tongtien) {
        this.tongtien = tongtien;
    }
    
    
}
