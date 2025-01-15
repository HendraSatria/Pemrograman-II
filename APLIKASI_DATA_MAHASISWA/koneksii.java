
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class koneksii {
    static Connection koneksi;
    
    public static Connection getConnection() throws SQLException {
    // Menyiapkan parameter JDBC untuk koneksi ke database
    String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    String DB_URL = "jdbc:mysql://localhost/mahasiswa";
    String USER = "root";
    String PASS = "";
    
    if(koneksi == null) {
            koneksi = DriverManager.getConnection(DB_URL, USER, PASS);
        }
        
        return koneksi;
    }
        
}
    

