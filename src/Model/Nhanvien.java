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
public class Nhanvien {
    private String manhanvien, sodienthoai, soCCCD;
    private String ngaythangnamsinh;
    private String tennhanvien, diachi, quequan, chucvu;

    public Nhanvien() {
    }

    public Nhanvien(String manhanvien, String tennhanvien, String ngaythangnamsinh, String sodienthoai, String soCCCD, String diachi, String quequan, String chucvu)  {
        this.manhanvien = manhanvien;
        this.sodienthoai = sodienthoai;
        this.soCCCD = soCCCD;
        this.ngaythangnamsinh = ngaythangnamsinh;
        this.tennhanvien = tennhanvien;
        this.diachi = diachi;
        this.quequan = quequan;
        this.chucvu = chucvu;
    }

    public Nhanvien(String manhanvien, String tennhanvien, String ngaythangnamsinh, String sodienthoai, String soCCCD, String diachi, String chucvu) 
    {
        this.manhanvien = manhanvien;
        this.sodienthoai = sodienthoai;
        this.soCCCD = soCCCD;
        this.ngaythangnamsinh = ngaythangnamsinh;
        this.tennhanvien = tennhanvien;
        this.diachi = diachi;
        this.chucvu = chucvu;
    }

    public String getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(String manhanvien) {
        this.manhanvien = manhanvien;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getSoCCCD() {
        return soCCCD;
    }

    public void setSoCCCD(String soCCCD) {
        this.soCCCD = soCCCD;
    }

    public String getNgaythangnamsinh() {
        return ngaythangnamsinh;
    }

    public void setNgaythangnamsinh(String ngaythangnamsinh) {
        this.ngaythangnamsinh = ngaythangnamsinh;
    }

    public String getTennhanvien() {
        return tennhanvien;
    }

    public void setTennhanvien(String tennhanvien) {
        this.tennhanvien = tennhanvien;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }
}
    

    


  
