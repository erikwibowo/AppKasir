/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author erikw
 */
public class KoneksiDB {
    public Connection getConnection() throws SQLException { //method koneksi db
        Connection cnn; //deklarasi class connection
        try {
            String server = "jdbc:mysql://localhost/appkasir"; //nama server dimana menyimpan lokasi database
            String drever = "com.mysql.jdbc.Driver"; //nama driver koneksi database mysql
            Class.forName(drever);                  //eksekusi driver koneksi
            cnn = DriverManager.getConnection(server, "root", ""); //inisialisasi/pemberian nilai cnn koneksi;
            return cnn;
        } catch (SQLException | ClassNotFoundException se) { //fungsgi catch error pada syntax try
            JOptionPane.showMessageDialog(null, "Ups! Sepertinya database belum aktif. Aktifkan database kemudian ulangi lagi");
            return null;
        }
    }
}
