/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author user
 */
public class Hoadonnhap {
    private String mahoadonnhap;
    private String manhacungcap;
    private String manhanvien;
    private float tongtiennhap;

    public Hoadonnhap() {
    }

    public Hoadonnhap(String mahoadonnhap, String manhacungcap, String manhanvien, float tongtiennhap) {
        this.mahoadonnhap = mahoadonnhap;
        this.manhacungcap = manhacungcap;
        this.manhanvien = manhanvien;
        this.tongtiennhap = tongtiennhap;
    }

    public Hoadonnhap(String manhacungcap, String manhanvien, float tongtiennhap) {
        this.manhacungcap = manhacungcap;
        this.manhanvien = manhanvien;
        this.tongtiennhap = tongtiennhap;
    }

    public String getMahoadonnhap() {
        return mahoadonnhap;
    }

    public void setMahoadonnhap(String mahoadonnhap) {
        this.mahoadonnhap = mahoadonnhap;
    }

    public String getManhacungcap() {
        return manhacungcap;
    }

    public void setManhacungcap(String manhacungcap) {
        this.manhacungcap = manhacungcap;
    }

    public String getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(String manhanvien) {
        this.manhanvien = manhanvien;
    }

    public float getTongtiennhap() {
        return tongtiennhap;
    }

    public void setTongtiennhap(float tongtiennhap) {
        this.tongtiennhap = tongtiennhap;
    }
    
    
    
}
