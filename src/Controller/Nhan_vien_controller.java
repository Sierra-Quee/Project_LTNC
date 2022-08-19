/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import java.sql.*;
import Model.Nhanvien;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author user
 */
public class Nhan_vien_controller {

// Tao list nhan vien
    public static List<Nhanvien> Danhsachnv(){
        List<Nhanvien> nhanvienList = new ArrayList<>();
        Statement statement = null;
        // Lay danh sach nhan vien
        System.out.println("Driver loaded");
        Connection connection = null;

        try {
            connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/treehousedb", "root", "06112000");
            System.out.println("Database connected TREEHOUSE");
            
            // Query
            String sql = " SELECT nhan_vien.id_nhanvien, "
                        + "nhan_vien.tennhanvien, "
                        + "nhan_vien.ngaythangnamsinh, "
                        + "nhan_vien.CCCD, "
                        + "nhan_vien.sodienthoai, "
                        + "nhan_vien.diachi, "
                        + "nhan_vien.chucvu "
                        + "FROM nhan_vien";
            statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()){
                Nhanvien sp = new  Nhanvien(resultSet.getString("id_nhanvien"),
                                         resultSet.getString("tennhanvien"),
                                         resultSet.getString("ngaythangnamsinh"),
                                         resultSet.getString("sodienthoai"),
                                         resultSet.getString("CCCD"),        
                                         resultSet.getString("diachi"),
                                         resultSet.getString("chucvu"));
                
                nhanvienList.add(sp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Nhan_vien_controller.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Nhan_vien_controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return nhanvienList;
    }
// Ham insert    
    public static void insert(Nhanvien nv) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //Lấy tất cả danh sách nhân viên
            connection = DriverManager.getConnection
                   ("jdbc:mysql://localhost:3306/treehousedb", "root", "06112000");

            //query
            String sql = "INSERT INTO nhan_vien(id_nhanvien, tennhanvien,"
                    + "ngaythangnamsinh, CCCD,sodienthoai,"
                    + "diachi, quequan,chucvu) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
            
            statement = connection.prepareCall(sql);

            statement.setString(1, nv.getManhanvien());
            statement.setString(2, nv.getTennhanvien());
            statement.setString(3, nv.getNgaythangnamsinh());
            statement.setString(4, nv.getSoCCCD());
            statement.setString(5, nv.getSodienthoai());
            statement.setString(6, nv.getDiachi());
            statement.setString(7, nv.getQuequan());
            statement.setString(8, nv.getChucvu());



            statement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(Nhan_vien_controller.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Nhan_vien_controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Nhan_vien_controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
// Ham update
    public static void update(Nhanvien nv) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //Lấy tất cả danh sách nhân viên
            connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/treehousedb", "root", "06112000");

            //Query
            String sql = "UPDATE nhan_vien SET tennhanvien = ?, "
                    + "diachi = ?, sodienthoai = ?, chucvu = ? "
                    + "WHERE id_nhanvien = ?";
            
            statement = connection.prepareCall(sql);
            
            statement.setString(1, nv.getTennhanvien());
            statement.setString(2, nv.getDiachi());
            statement.setString(3, nv.getSodienthoai());
            statement.setString(4, nv.getChucvu());
            statement.setString(5, nv.getManhanvien());
 
                    
            statement.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(Nhan_vien_controller.class.getName()).log(Level.SEVERE, null, ex);     
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Nhan_vien_controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Nhan_vien_controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    } 
    
// Ham tim nhan vien theo ten nhan vien
    public static List<Nhanvien> TimKiemTheoTenNV(String tennhanvien) {
        List<Nhanvien> nhanvienList = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //Lấy tất cả dah sách sinh viên
            connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/treehousedb", "root", "06112000");

            //query
            String sql = " SELECT nhan_vien.id_nhanvien, "
                        + "nhan_vien.tennhanvien, "
                        + "nhan_vien.ngaythangnamsinh, "
                        + "nhan_vien.CCCD, "
                        + "nhan_vien.sodienthoai, "
                        + "nhan_vien.diachi, "
                        + "nhan_vien.quequan,"
                        + "nhan_vien.chucvu "
                        + "FROM nhan_vien "
                        + "WHERE nhan_vien.tennhanvien LIKE ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%" + tennhanvien + "%");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Nhanvien nv;
                nv = new Nhanvien(resultSet.getString("id_nhanvien"),
                        resultSet.getString("tennhanvien"),
                        resultSet.getString("ngaythangnamsinh"),
                         resultSet.getString("sodienthoai"),
                        resultSet.getString("CCCD"),
                        resultSet.getString("diachi"),
                        resultSet.getString("chucvu"));
                nhanvienList.add(nv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Nhan_vien_controller.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Nhan_vien_controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Nhan_vien_controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    return nhanvienList;
    }
    
//Ham tim nhan vien theo ma nhan vien
    public static List<Nhanvien> TimKiemTheoMaNV(String manhanvien) {
        List<Nhanvien> nhanvienList = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //Lấy tất cả dah sách sinh viên
            connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/treehousedb", "root", "06112000");

            //query
            String sql = " SELECT nhan_vien.id_nhanvien, "
                        + "nhan_vien.tennhanvien, "
                        + "nhan_vien.ngaythangnamsinh, "
                        + "nhan_vien.CCCD, "
                        + "nhan_vien.sodienthoai, "
                        + "nhan_vien.diachi, "
                        + "nhan_vien.quequan,"
                        + "nhan_vien.chucvu "
                        + "FROM nhan_vien "
                        + "WHERE nhan_vien.id_nhanvien LIKE ?";
            
            statement = connection.prepareCall(sql);
            statement.setString(1,"%"+ manhanvien + "%");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Nhanvien nv;
                nv = new Nhanvien(resultSet.getString("id_nhanvien"),
                        resultSet.getString("tennhanvien"),
                        resultSet.getString("ngaythangnamsinh"),
                        resultSet.getString("sodienthoai"),
                        resultSet.getString("CCCD"),
                        resultSet.getString("diachi"),
                        resultSet.getString("chucvu"));
                
                nhanvienList.add(nv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Nhan_vien_controller.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Nhan_vien_controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Nhan_vien_controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    return nhanvienList;
    }
}
    
