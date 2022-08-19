/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author user
 */
public class Khachhang {
    private String makhachhang, sodienthoai;
    private String ngaythangnamsinh;
    private String tenkhachhang, diachi;

    public Khachhang() {
    }

    public Khachhang(String sodienthoai, String ngaythangnamsinh, String tenkhachhang, String diachi) {
        this.sodienthoai = sodienthoai;
        this.ngaythangnamsinh = ngaythangnamsinh;
        this.tenkhachhang = tenkhachhang;
        this.diachi = diachi;
    }

    public Khachhang(String makhachhang, String tenkhachhang, String ngaythangnamsinh,String sodienthoai, String diachi) {
        this.makhachhang = makhachhang;
        this.sodienthoai = sodienthoai;
        this.ngaythangnamsinh = ngaythangnamsinh;
        this.tenkhachhang = tenkhachhang;
        this.diachi = diachi;
    }


    public String getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang(String makhachhang) {
        this.makhachhang = makhachhang;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getNgaythangnamsinh() {
        return ngaythangnamsinh;
    }

    public void setNgaythangnamsinh(String ngaythangnamsinh) {
        this.ngaythangnamsinh = ngaythangnamsinh;
    }

    public String getTenkhachhang() {
        return tenkhachhang;
    }

    public void setTenkhachhang(String tenkhachhang) {
        this.tenkhachhang = tenkhachhang;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

}
