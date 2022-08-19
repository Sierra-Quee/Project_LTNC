/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Khachhang;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Khach_hang_controller {

//Tao list khachhang
    public static List<Khachhang> Danhsachkh() {
        List<Khachhang> khachhangList = new ArrayList<>();
        Statement statement = null;
        // Lay danh sach khach hang
        System.out.println("Driver loaded");
        Connection connection = null;

        try {
            connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/treehousedb", "root", "06112000");
            System.out.println("Database connected TREEHOUSE");
            
            // Query
            String sql = " SELECT khach_hang.id_khachhang, "
                        + "khach_hang.tenkhachhang, "
                        + "khach_hang.ngaythangnamsinh, "
                        + "khach_hang.sodienthoai, "
                        + "khach_hang.diachi "
                        + "FROM khach_hang";
            statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()){
                Khachhang kh = new Khachhang (resultSet.getString("id_khachhang"),
                                         resultSet.getString("tenkhachhang"),
                                         resultSet.getString("ngaythangnamsinh"),
                                         resultSet.getString("sodienthoai"),
                                         resultSet.getString("diachi"));

                khachhangList.add(kh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(San_pham_controller.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(San_pham_controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return khachhangList;
    }
 
// Tìm kiếm khách hàng theo tên
    public static List<Khachhang> TimKiemTheoTen(String tenkh) {
        List<Khachhang> khachhangList = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //Lấy tất cả danh sach khach hang
            connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/treehousedb", "root", "06112000");

            //query
            String sql = " SELECT khach_hang.id_khach_hang, "
                        + "khach_hang.tenkhachhang, "
                        + "khach_hang.ngaythangnamsinh, "
                        + "khach_hang.sodienthoai, "
                        + "khach_hang.diachi "
                        + "FROM khach_hang "
                        + "WHERE khach_hang.tenkhachhang LIKE ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%" + tenkh + "%");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Khachhang kh;
                kh = new Khachhang(resultSet.getString("id_khachhang"),
                        resultSet.getString("tenkhachhang"),
                        resultSet.getString("ngaythangnamsinh"),
                        resultSet.getString("sodienthoai"),
                        resultSet.getString("diachi"));
                khachhangList.add(kh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Khach_hang_controller.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Khach_hang_controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Khach_hang_controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    return khachhangList;
 }   
// Tìm kiếm khách hàng theo mã 
    public static List<Khachhang> TimKiemTheoMa(String makh) {
        List<Khachhang> khachhangList = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //Lấy tất cả danh sach khach hang
            connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/treehousedb", "root", "06112000");

            //query
            String sql = " SELECT khach_hang.id_khachhang, "
                        + "khach_hang.tenkhachhang, "
                        + "khach_hang.ngaythangnamsinh, "
                        + "khach_hang.sodienthoai, "
                        + "khach_hang.diachi "
                        + "FROM khach_hang "
                        + "WHERE khach_hang.id_khachhang LIKE ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%" + makh + "%");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Khachhang kh;
                kh = new Khachhang(resultSet.getString("id_khachhang"),
                        resultSet.getString("tenkhachhang"),
                        resultSet.getString("ngaythangnamsinh"),
                        resultSet.getString("sodienthoai"),
                        resultSet.getString("diachi"));
                khachhangList.add(kh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Khach_hang_controller.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Khach_hang_controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Khach_hang_controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    return khachhangList;
    }
}
