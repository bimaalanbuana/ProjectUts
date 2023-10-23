/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;
/*
BIMA ALAN BUANA SAPUTA
211011400006
*/
import java.sql.Connection;
import java.sql.DriverManager;

public class configDB {
    private static Connection mysqlConfig;
    
    public static Connection koneksi(){
        try {
            String url="jdbc:mysql://localhost/akademikdb";
            String user="root";
            String pass="";
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            mysqlConfig = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.err.println("koneksi gagal"+e.getMessage());
        }return mysqlConfig;
    }
}
