/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class Koneksi {
    private final String URL = "jdbc:mysql://localhost:3306/uaspbo";
    private final String USER = "root";
    private final String PASS = "";
    
    public Connection getConnection(){
        Connection con;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL,USER,PASS);
            System.out.println("Koneksi Berhasil");
            return con;
        }catch (ClassNotFoundException | SQLException ex) {
            System.err.println("Koneksi Gagal");
            return con = null;
        }
    }
    
    public static void main(String[] args) {
        Koneksi koneksi = new Koneksi();
        koneksi.getConnection();
    }
}
