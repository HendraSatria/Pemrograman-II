/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */


    
    

    

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


// bisa juga diimpor sekaligus seperti ini:
// import java.sql.*


public  class koneksimysql  {
    
    // Menyiapkan parameter JDBC untuk koneksi ke database
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/mahasiswa";
    static final String USER = "root";
    static final String PASS = "";
    String statuskoneksi = "";

    // Menyiapkan objek yang diperlukan untuk mengelola database
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
   

    public String koneksimysql2() {
        
        
        try {
            // register driver yang akan dipakai
            Class.forName(JDBC_DRIVER);
            
            // buat koneksi ke database
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            // buat objek statement
            stmt = conn.createStatement();
            
            JOptionPane.showMessageDialog(null, "Berhasil Koneksi");
            statuskoneksi = ("Berhasil Koneksi"); 
            }
        catch (Exception e) {
            statuskoneksi=(" Gagal Koneksi Karena " + e);
        }
        return statuskoneksi;
    

    
    
}
   
}