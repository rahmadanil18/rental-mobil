/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implements;

import AntarMuka.InterfacePengembalian;
import java.sql.Connection;
import Koneksi.koneksi;
import Entitas.EntitasPembayaran;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author lenovo
 */

public class CrudPengembalian implements InterfacePengembalian{
     Connection kon = new koneksi().BukaKon();

   public DefaultTableModel tampil() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID PENGEMBALIAN");
        model.addColumn("NAMA");
        model.addColumn("NO POLISI");
        model.addColumn("TOTAL");
        model.addColumn("UANG");
        model.addColumn("KEMBALIAN");
        model.addColumn("KETERANGAN");
        try {
            Statement st = kon.createStatement();
            ResultSet rs = st.executeQuery("SELECT id_pengembalian,nama,no,total,uang,kembalian,ket FROM tb_pengembalian");
            while (rs.next()) {
                model.addRow(
                        new Object[]{
                            rs.getString("id_pengembalian"),
                            rs.getString("nama"),
                            rs.getString("no"),
                            rs.getString("total"),
                            rs.getString("uang"),
                            rs.getString("kembalian"),
                            rs.getString("ket")
                            
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
        model.addColumn("ID PENGEMBALIAN");
        model.addColumn("NAMA");
        model.addColumn("NO POLISI");
        model.addColumn("TOTAL");
        model.addColumn("UANG");
        model.addColumn("KEMBALIAN");
        model.addColumn("KETERANGAN");
        try {
            Statement st = kon.createStatement();
            ResultSet rs = st.executeQuery("SELECT id_pengembalian,nama,no,total,uang,kembalian,ket FROM tb_pengembalian where id_pengembalian like'%"+inp+"%' OR nama LIKE'%"+inp+"%'");
            while (rs.next()) {
                model.addRow(
                        new Object[]{
                            rs.getString("id_pengembalian"),
                            rs.getString("nama"),
                            rs.getString("no"),
                            rs.getString("total"),
                            rs.getString("uang"),
                            rs.getString("kembalian"),
                            rs.getString("ket")
                            
                        }
                );
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return model;
    }

     public void simpan(EntitasPembayaran pj) throws Exception {
        try{
            Statement sttm=(Statement) kon.createStatement();
            sttm.executeUpdate("INSERT INTO tb_pengembalian VALUES('"+0+"','"+pj.getNama()+"','"+pj.getNomor()+"','"+pj.getTotal()+"','"+pj.getUang()+"','"+pj.getSisa()+"','Lunas','"+pj.getId()+"')");
            System.out.println("Berhasil menambahkan data !");
        }catch(Exception e){
            System.out.println("Gagal menambahkan data !");
            e.printStackTrace();
        }
    }
     
    public void hapus(int id) throws Exception {
        try{
            Statement sttm=(Statement) kon.createStatement();
            sttm.executeUpdate("DELETE FROM tb_pengembalian WHERE id_pengembalian='"+id+"'");
            System.out.println("Berhasil menghapus data !");
        }catch(Exception e){
            System.out.println("Gagal menghapus data !");
            e.printStackTrace();
        }
    }
}
