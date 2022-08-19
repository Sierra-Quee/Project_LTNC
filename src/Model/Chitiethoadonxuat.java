/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author user
 */
public class Chitiethoadonxuat {
    private Sanpham masanphamhdx;
    private Hoadonxuat mahoadonxuat;
    private float dongiahdx;
    private float tongtienhdx;
    private int soluonghdx;

    public Chitiethoadonxuat() {
    }

    public Chitiethoadonxuat(Sanpham masanphamhdx, Hoadonxuat mahoadonxuat, float dongiahdx, float tongtienhdx, int soluonghdx) {
        this.masanphamhdx = masanphamhdx;
        this.mahoadonxuat = mahoadonxuat;
        this.dongiahdx = dongiahdx;
        this.tongtienhdx = tongtienhdx;
        this.soluonghdx = soluonghdx;
    }

    public Sanpham getMasanphamhdx() {
        return masanphamhdx;
    }

    public void setMasanphamhdx(Sanpham masanphamhdx) {
        this.masanphamhdx = masanphamhdx;
    }

    public Hoadonxuat getMahoadonxuat() {
        return mahoadonxuat;
    }

    public void setMahoadonxuat(Hoadonxuat mahoadonxuat) {
        this.mahoadonxuat = mahoadonxuat;
    }

    public float getDongiahdx() {
        return dongiahdx;
    }

    public void setDongiahdx(float dongiahdx) {
        this.dongiahdx = dongiahdx;
    }

    public float getTongtienhdx() {
        return tongtienhdx;
    }

    public void setTongtienhdx(float tongtienhdx) {
        this.tongtienhdx = tongtienhdx;
    }

    public int getSoluonghdx() {
        return soluonghdx;
    }

    public void setSoluonghdx(int soluonghdx) {
        this.soluonghdx = soluonghdx;
    }

}
