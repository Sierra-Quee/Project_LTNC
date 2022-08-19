/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author user
 */
public class Nhacungcap {
    private String manhacungcap, tennhacungcap,sodienthoai,diachi;

    public Nhacungcap() {
    }

    public Nhacungcap(String manhacungcap, String tennhacungcap, String sodienthoai, String diachi) {
        this.manhacungcap = manhacungcap;
        this.tennhacungcap = tennhacungcap;
        this.sodienthoai = sodienthoai;
        this.diachi = diachi;
    }

    public Nhacungcap(String tennhacungcap, String sodienthoai, String diachi) {
        this.tennhacungcap = tennhacungcap;
        this.sodienthoai = sodienthoai;
        this.diachi = diachi;
    }

    public String getManhacungcap() {
        return manhacungcap;
    }

    public void setManhacungcap(String manhacungcap) {
        this.manhacungcap = manhacungcap;
    }

    public String getTennhacungcap() {
        return tennhacungcap;
    }

    public void setTennhacungcap(String tennhacungcap) {
        this.tennhacungcap = tennhacungcap;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    
    
    
}
