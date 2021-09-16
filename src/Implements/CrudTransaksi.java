/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implements;

import AntarMuka.InterfaceTransaksi;
import Entitas.EnTransaksi;
import Entitas.EditTransaksi;
import Koneksi.koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lenovo
 */
public class CrudTransaksi implements InterfaceTransaksi {
    Connection kon = new koneksi().BukaKon();    
    
     public DefaultTableModel tampil() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID TRANSAKSI");
        model.addColumn("NAMA");
        model.addColumn("NO POLISI");
        model.addColumn("TANGGAL PINJAM");
        model.addColumn("TANGGAL KEMBALI");
        model.addColumn("HARGA");
        model.addColumn("LAMA HARI");
        model.addColumn("TOTAL");
        try {
            Statement st = kon.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM transaksi");
            while (rs.next()) {
                model.addRow(
                        new Object[]{
                            rs.getString("id"),
                            rs.getString("nama"),
                            rs.getString("no"),
                            rs.getString("pinjam"),
                            rs.getString("kembali"),
                            rs.getString("harga"),
                            rs.getString("lama"),
                            rs.getString("total")
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
        model.addColumn("ID TRANSAKSI");
        model.addColumn("NAMA");
        model.addColumn("NO POLISI");
        model.addColumn("TANGGAL PINJAM");
        model.addColumn("TANGGAL KEMBALI");
        model.addColumn("HARGA");
        model.addColumn("LAMA HARI");
        model.addColumn("TOTAL");
        try {
            Statement st = kon.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM transaksi where nama like'%"+inp+"%'");
            while (rs.next()) {
                model.addRow(
                        new Object[]{
                            rs.getString("id"),
                            rs.getString("nama"),
                            rs.getString("no"),
                            rs.getString("pinjam"),
                            rs.getString("kembali"),
                            rs.getString("harga"),
                            rs.getString("lama"),
                            rs.getString("total")
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
            sttm.executeUpdate("DELETE FROM transaksi WHERE id='"+id+"'");
            System.out.println("Berhasil menghapus data !");
        }catch(Exception e){
            System.out.println("Gagal menghapus data !");
            e.printStackTrace();
        }
    }
    
    public void simpan(EnTransaksi trans) throws Exception {
        try{
            Statement sttm=(Statement) kon.createStatement();
            sttm.executeUpdate("INSERT INTO transaksi VALUES('"+0+"','"+trans.getNama()+"','"+trans.getNopol()+"','"+trans.getPinjam()+"','"+trans.getKembali()+"','"+trans.getTarif()+"','"+trans.getLama()+"','"+trans.getTotal()+"')");
            System.out.println("Berhasil menambahkan data !");
        }catch(Exception e){
            System.out.println("Gagal menambahkan data !");
            e.printStackTrace();
        }
    }
    
    public void edit(EditTransaksi trans,int id) throws Exception {
        try{
            Statement sttm=(Statement) kon.createStatement();
            sttm.executeUpdate("UPDATE transaksi SET nama='"+trans.getNama()+"', pinjam='"+trans.getPinjam()+"', kembali='"+trans.getKembali()+"', harga='"+trans.getTarif()+"',lama='"+trans.getLama()+"',total='"+trans.getTotal()+"'WHERE id='"+id+"'");
            System.out.println("Berhasil mengubah data !");
        }catch(Exception e){
            System.out.println("Gagal mengubah data !");
            e.printStackTrace();
        }
    }   
 
    
}
