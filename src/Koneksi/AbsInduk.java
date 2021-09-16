/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public abstract class AbsInduk {
     protected ResultSet rs;
    protected Statement st;
    protected String sql;
    protected koneksi konek = new koneksi();
    protected int hasil = 0;
    
    protected Statement statem(){
        try {
            Connection kon;
            kon = (Connection) konek.BukaKon();
            st = kon.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "FAILED TO CONNECTING !");
        }
        return st;
    }
}
