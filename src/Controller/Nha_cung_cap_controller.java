/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Nhacungcap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Nha_cung_cap_controller {
    
// Tao list nha cung cap
    public static List<Nhacungcap> Danhsachncc(){
        List<Nhacungcap> nhaccList = new ArrayList<>();
        Statement statement = null;
        
        System.out.println("Driver loaded");
        Connection connection = null;
        
         try {
            connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/treehousedb", "root", "06112000");
            System.out.println("Database connected TREEHOUSE");
            
            // Query
            String sql = "SELECT nha_cung_cap.id_nhacungcap, "
                         + "nha_cung_cap.tennhacungcap, "
                         + "nha_cung_cap.sodienthoai, "
                         + "nha_cung_cap.diachi "
                         + "FROM nha_cung_cap ";
                         
            statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()){
                Nhacungcap ncc = new Nhacungcap (resultSet.getString("id_nhacungcap"),
                                         resultSet.getString("tennhacungcap"),
                                         resultSet.getString("sodienthoai"),
                                         resultSet.getString("diachi"));

                nhaccList.add(ncc);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Nha_cung_cap_controller.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Nha_cung_cap_controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return nhaccList;
    }

// Ham insert 
    
// Ham delete theo ma nha cung cap
// Ham tim kiem nha cung cap theo ten
// Ham tim kiem nha cung cap theo ma
        

}
