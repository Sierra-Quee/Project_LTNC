/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author user
 */
public class Sanpham {
    private String masanpham;
    private String tensanpham;
    private float dongia;
    private String mota;
    private int soluong;
    private String hinhanh;

    
    public Sanpham() {
    }
    
    public Sanpham(String masanpham, String tensanpham, String hinhanh,
                    String mota, float dongia, int soluong) 
    {
        this.masanpham = masanpham;
        this.tensanpham = tensanpham;
        this.dongia = dongia;
        this.mota = mota;
        this.soluong = soluong;
        this.hinhanh = hinhanh;
    }

    public Sanpham(String tensanpham, float dongia, String mota,
                    int soluong, String hinhanh) 
    {
        this.tensanpham = tensanpham;
        this.dongia = dongia;
        this.mota = mota;
        this.soluong = soluong;
        this.hinhanh = hinhanh;
    }

    public String getMasanpham() {
        return masanpham;
    }

    public void setMasanpham(String masanpham) {
        this.masanpham = masanpham;
    }

    public String getTensanpham() {
        return tensanpham;
    }

    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
    }

    public float getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }
}
