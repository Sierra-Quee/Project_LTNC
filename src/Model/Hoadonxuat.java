/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author user
 */
public class Hoadonxuat {
    private static String mahoadonxuat;
    private String makhachhang;
    private Nhanvien manhanvien;
    private String donvivanchuyen;
    private String tongtien;
    private Date ngayxuat;
    private String hinhthucthanhtoan;


    public Hoadonxuat() {
    }

    public Hoadonxuat(String donvivanchuyen, String tongtien, Date ngayxuat, String hinhthucthanhtoan, String makhachhang, Nhanvien manhanvien) {
        this.donvivanchuyen = donvivanchuyen;
        this.tongtien = tongtien;
        this.ngayxuat = ngayxuat;
        this.hinhthucthanhtoan = hinhthucthanhtoan;
        this.makhachhang = makhachhang;
        this.manhanvien = manhanvien;
    }

    public static String getMahoadonxuat() {
        return mahoadonxuat;
    }

    public static void setMahoadonxuat(String mahoadonxuat) {
        Hoadonxuat.mahoadonxuat = mahoadonxuat;
    }

    public String getDonvivanchuyen() {
        return donvivanchuyen;
    }

    public void setDonvivanchuyen(String donvivanchuyen) {
        this.donvivanchuyen = donvivanchuyen;
    }

    public String getTongtien() {
        return tongtien;
    }

    public void setTongtien(String tongtien) {
        this.tongtien = tongtien;
    }

    public Date getNgayxuat() {
        return ngayxuat;
    }

    public void setNgayxuat(Date ngayxuat) {
        this.ngayxuat = ngayxuat;
    }

    public String getHinhthucthanhtoan() {
        return hinhthucthanhtoan;
    }

    public void setHinhthucthanhtoan(String hinhthucthanhtoan) {
        this.hinhthucthanhtoan = hinhthucthanhtoan;
    }

    public String getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang(String makhachhang) {
        this.makhachhang = makhachhang;
    }

    public Nhanvien getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(Nhanvien manhanvien) {
        this.manhanvien = manhanvien;
    }
    
}
