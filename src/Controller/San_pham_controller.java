/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Sanpham;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class San_pham_controller {

// Tao list san pham
    public static List<Sanpham> Danhsachsp() {
        List<Sanpham> sanphamList = new ArrayList<>();
        Statement statement = null;
        // Lay danh sach san pham
        System.out.println("Driver loaded");
        Connection connection = null;

        try {
            connection = DriverManager.getConnection
                ("jdbc:mysql://localhost:3306/treehousedb", "root", "06112000");
            System.out.println("Database connected TREEHOUSE");
            
            // Query
            String sql = " SELECT san_pham.id_sanpham, "
                        + "san_pham.tensanpham, "
                        + "san_pham.hinhanh, "
                        + "san_pham.mota, "
                        + "san_pham.dongia, "
                        + "san_pham.soluong "
                        + "FROM san_pham";
            statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()){
                Sanpham sp = new Sanpham(resultSet.getString("id_sanpham"),
                                         resultSet.getString("tensanpham"),
                                         resultSet.getString("hinhanh"),
                                         resultSet.getString("mota"),
                                         resultSet.getInt("dongia"),
                                         resultSet.getInt("soluong"));
                
                sanphamList.add(sp);
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
        return sanphamList;
    }
// Ham insert    
    public static void insert(Sanpham sp) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //Lấy tất cả danh sách sản phẩm
            connection = DriverManager.getConnection
                   ("jdbc:mysql://localhost:3306/treehousedb", "root", "06112000");
            System.out.println("Database connected TREEHOUSE");

            //query
            String sql = "INSERT INTO san_pham(id_sanpham, tensanpham, hinhanh, "
                              + "mota, dongia, soluong) VALUES(?, ?, ?, ?, ?, ?)";
            
            statement = connection.prepareCall(sql);

            statement.setString(1, sp.getMasanpham());
            statement.setString(2, sp.getTensanpham());
            statement.setString(3, sp.getHinhanh());
            statement.setString(4, sp.getMota());
            statement.setFloat(5, sp.getDongia());
            statement.setInt(6, sp.getSoluong());      


            statement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(San_pham_controller.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(San_pham_controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(San_pham_controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
// Ham update
    public static void update(Sanpham sp) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //Lấy tất cả danh sách sản phẩm
            connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/treehousedb", "root", "06112000");

            //Query
            String sql = "UPDATE san_pham SET tensanpham = ?, "
                    + "hinhanh = ?, mota = ?, dongia = ?, soluong= ? "
                    + "WHERE id_sanpham = ?";
            
            statement = connection.prepareCall(sql);
            
            statement.setString(1, sp.getTensanpham());
            statement.setString(2, sp.getHinhanh());
            statement.setString(3, sp.getMota());
            statement.setFloat(4, sp.getDongia());
            statement.setInt(5, sp.getSoluong()); 
            statement.setString(6, sp.getMasanpham());
                    
            statement.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(San_pham_controller.class.getName()).log(Level.SEVERE, null, ex);     
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(San_pham_controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(San_pham_controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
// Ham delete san pham dua vao ma san pham
    public static void delete(String masanpham) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //Lấy tất cả dah sách sinh viên
            connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/treehousedb", "root", "06112000");

            //query
            String sql = "DELETE FROM san_pham WHERE id_sanpham = ?";
            statement = connection.prepareCall(sql);

            statement.setString(1, masanpham);

            statement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(San_pham_controller.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(San_pham_controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(San_pham_controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
// Ham tim san pham theo ten san pham
    public static List<Sanpham> TimKiemTheoTen(String tensp) {
        List<Sanpham> sanphamList = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //Lấy tất cả dah sách sinh viên
            connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/treehousedb", "root", "06112000");

            //query
            String sql = " SELECT san_pham.id_sanpham, "
                        + "san_pham.tensanpham, "
                        + "san_pham.hinhanh, "
                        + "san_pham.mota, "
                        + "san_pham.dongia, "
                        + "san_pham.soluong "
                        + "FROM san_pham "
                        + "WHERE san_pham.tensanpham LIKE ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%" + tensp + "%");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Sanpham sp;
                sp = new Sanpham(resultSet.getString("id_sanpham"),
                        resultSet.getString("tensanpham"),
                        resultSet.getString("hinhanh"),
                        resultSet.getString("mota"),
                        resultSet.getFloat("dongia"),
                        resultSet.getInt("soluong"));
                sanphamList.add(sp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(San_pham_controller.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(San_pham_controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(San_pham_controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    return sanphamList;
 }

//Ham tim san pham theo ma san pham
    public static List<Sanpham> TimKiemTheoMa(String masp) {
        List<Sanpham> sanphamList = new ArrayList<>();
        
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //Lấy tất cả dah sách sinh viên
            connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/treehousedb", "root", "06112000");

            //query
            String sql = " SELECT san_pham.id_sanpham, "
                        + "san_pham.tensanpham, "
                        + "san_pham.hinhanh, "
                        + "san_pham.mota, "
                        + "san_pham.dongia, "
                        + "san_pham.soluong "
                        + "FROM san_pham "
                        + "WHERE san_pham.id_sanpham LIKE ?";
            statement = connection.prepareCall(sql);
            
            statement.setString(1, "%" + masp + "%");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Sanpham sp;
                sp = new Sanpham(resultSet.getString("id_sanpham"),
                        resultSet.getString("tensanpham"),
                        resultSet.getString("hinhanh"),
                        resultSet.getString("mota"),
                        resultSet.getFloat("dongia"),
                        resultSet.getInt("soluong"));
                sanphamList.add(sp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(San_pham_controller.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(San_pham_controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(San_pham_controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    return sanphamList;
 }
}
   