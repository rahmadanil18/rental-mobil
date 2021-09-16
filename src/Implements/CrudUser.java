/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implements;

import AntarMuka.InterfaceUser;
import Koneksi.koneksi;
import java.sql.Connection;
import Entitas.EntitasUser;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author lenovo
 */
public class CrudUser implements InterfaceUser {
    Connection kon = new koneksi().BukaKon();
    
    public DefaultTableModel cari(String user) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("NAMA");
        model.addColumn("USERNAME");
        model.addColumn("PASSWORD");
        model.addColumn("USERTYPE");
        try {
            Statement st = kon.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tb_login WHERE nama LIKE '%"+user+"%' OR username LIKE'%"+user+"%'");
            while (rs.next()){
                model.addRow(  
                        new Object[]{
                            rs.getString("id_login"),
                            rs.getString("nama"),
                            rs.getString("username"),
                            rs.getString("password"),
                            rs.getString("usertype")
                        }
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return model;
    }
    
    
     public void simpan(EntitasUser user) throws Exception {
        try{
            Statement sttm=(Statement) kon.createStatement();
            sttm.executeUpdate("INSERT INTO tb_login VALUES('"+0+"','"+user.getNama()+"','"+user.getUser()+"','"+user.getPass()+"','"+user.getType()+"')");
            System.out.println("Berhasil menambahkan data !");
        }catch(Exception e){
            System.out.println("Gagal menambahkan data !");
            e.printStackTrace();
        }
    }
     
     public DefaultTableModel tampil() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("NAMA");
        model.addColumn("USERNAME");
        model.addColumn("PASSWORD");
        model.addColumn("USERTYPE");
        try {
            Statement st = kon.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tb_login");
            while (rs.next()) {
                model.addRow(
                        new Object[]{
                            rs.getString("id_login"),
                            rs.getString("nama"),
                            rs.getString("username"),
                            rs.getString("password"),
                            rs.getString("usertype")
                        }
                );
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return model;
    }
     
       public void hapus(int id) throws Exception {
        try{
            Statement sttm=(Statement) kon.createStatement();
            sttm.executeUpdate("DELETE FROM tb_login WHERE id_login='"+id+"'");
            System.out.println("Berhasil menghapus data !");
        }catch(Exception e){
            System.out.println("Gagal menghapus data !");
            e.printStackTrace();
        }
    }
    
     public void edit(EntitasUser user,int id) throws Exception {
        try{
            Statement sttm=(Statement) kon.createStatement();
            sttm.executeUpdate("UPDATE tb_login SET nama='"+user.getNama()+"', username='"+user.getUser()+"', password='"+user.getPass()+"', usertype='"+user.getType()+"'WHERE id_login='"+id+"'");
            System.out.println("Berhasil mengubah data !");
        }catch(Exception e){
            System.out.println("Gagal mengubah data !");
            e.printStackTrace();
        }
    }   
       
}
