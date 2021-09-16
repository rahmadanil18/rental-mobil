/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implements;

import AntarMuka.I_crudMobil;
import Entitas.EditMobil;
import Entitas.TambahMobil;
import Koneksi.koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author lenovo
 */
public class ImCrudMobil implements I_crudMobil {
    Connection kon = new koneksi().BukaKon();
     public DefaultTableModel tampil() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID MOBIL");
        model.addColumn("MEREK");
        model.addColumn("TIPE");
        model.addColumn("TAHUN");
        model.addColumn("NO POLISI");
        model.addColumn("HARGA");
        model.addColumn("STATUS");
        try {
            Statement st = kon.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tb_mobil");
            while (rs.next()) {
                model.addRow(
                        new Object[]{
                            rs.getString("id_mobil"),
                            rs.getString("merek"),
                            rs.getString("tipe"),
                            rs.getString("tahun"),
                            rs.getString("no"),
                            rs.getString("harga"),
                            rs.getString("status")
                        }
                );
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return model;
    }
    
     public DefaultTableModel cari(String inp) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID MOBIL");
        model.addColumn("MEREK");
        model.addColumn("TIPE");
        model.addColumn("TAHUN");
        model.addColumn("NO POLISI");
        model.addColumn("HARGA");
        model.addColumn("STATUS");
        try {
            Statement st = kon.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tb_mobil WHERE no LIKE '%"+inp+"%' OR merek LIKE'%"+inp+"%'");
            while (rs.next()){
                model.addRow(  
                        new Object[]{
                            rs.getString("id_mobil"),
                            rs.getString("merek"),
                            rs.getString("tipe"),
                            rs.getString("tahun"),
                            rs.getString("no"),
                            rs.getString("harga"),
                            rs.getString("status")
                        }
                );
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return model;
    }
     
    public void simpan(TambahMobil mobil) throws Exception {
        try{
            Statement sttm=(Statement) kon.createStatement();
            sttm.executeUpdate("INSERT INTO tb_mobil VALUES('"+0+"','"+mobil.getMerek()+"','"+mobil.getTipe()+"','"+mobil.getThn()+"','"+mobil.getNo()+"','"+mobil.getHarga()+"','"+mobil.getStatus()+"')");
            System.out.println("Berhasil menambahkan data !");
        }catch(Exception e){
            System.out.println("Gagal menambahkan data !");
            e.printStackTrace();
        }
    }
 
    public void editStatus(String no){
        try{
            Statement sttm=(Statement) kon.createStatement();
            sttm.executeUpdate("UPDATE tb_mobil SET status='Keluar' WHERE no='"+no+"'");
            System.out.println("Berhasil mengubah data !");
        }catch(Exception e){
            System.out.println("Gagal mengubah data !");
            e.printStackTrace();
        }
    }
    
    public void editStatus2(String no){
        try{
            Statement sttm=(Statement) kon.createStatement();
            sttm.executeUpdate("UPDATE tb_mobil SET status='Tersedia' WHERE no='"+no+"'");
            System.out.println("Berhasil mengubah data !");
        }catch(Exception e){
            System.out.println("Gagal mengubah data !");
            e.printStackTrace();
        }
    }
    
    
    public void edit(EditMobil mobil) throws Exception {
        try{
            Statement sttm=(Statement) kon.createStatement();
            sttm.executeUpdate("UPDATE tb_mobil SET merek='"+mobil.getMerek()+"', tipe='"+mobil.getTipe()+"', tahun='"+mobil.getThn()+"', no='"+mobil.getNo()+"', harga='"+mobil.getHarga()+"', status='"+mobil.getStatus()+"'WHERE id_mobil='"+mobil.getId()+"'");
            System.out.println("Berhasil mengubah data !");
        }catch(Exception e){
            System.out.println("Gagal mengubah data !");
            e.printStackTrace();
        }
    }
    
        public void hapus(int id) throws Exception {
        try{
            Statement sttm=(Statement) kon.createStatement();
            sttm.executeUpdate("DELETE FROM tb_mobil WHERE id_mobil='"+id+"'");
            System.out.println("Berhasil menghapus data !");
        }catch(Exception e){
            System.out.println("Gagal menghapus data !");
            e.printStackTrace();
        }
    }
    
}
