
import java.sql.*;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class insert {
     koneksimysql koneksi = new koneksimysql(); // Pastikan class KoneksiMySQL sudah dibuat dan terkoneksi dengan database
    
    public void masukan(String NIM, String NAMA, String ALAMAT, String JENISKELAMIN) {
        // Query INSERT
        koneksi.koneksimysql2();
        String insertQuery = "INSERT INTO datamahasiswa (nim, nama, alamat, gender) VALUES (?, ?, ?, ?)";
        
        try {
         
            PreparedStatement preparedStatement = koneksi.conn.prepareStatement(insertQuery);
            // Mengisi parameter pada query
            preparedStatement.setString(1, NIM); 
            preparedStatement.setString(2, NAMA); 
            preparedStatement.setString(3, ALAMAT); 
            preparedStatement.setString(4, JENISKELAMIN); 

            // Menjalankan query INSERT
            int rowsInserted = preparedStatement.executeUpdate();

            // Menampilkan hasil
            if (rowsInserted > 0) {
                System.out.println("Data berhasil dimasukkan!");
            } else {
                System.out.println("Data gagal dimasukkan.");
            }

        } catch (SQLException e) {
            System.out.println("Terjadi kesalahan saat menginsert data: " + e.getMessage());
        }
    }
    public static void main(String[] args) throws SQLException{
        insert i = new insert();
        
    }
    
}




   
    

