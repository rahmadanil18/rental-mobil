/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

/**
 *
 * @author lenovo
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class koneksi {

   public Connection kon;
    public Connection BukaKon(){
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            kon =(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/db_rental","root","");
        } catch (Exception e) {
            System.out.println("Connecting failed !");
            e.printStackTrace();
        }
        return kon;
    }
}

