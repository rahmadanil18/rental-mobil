/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implements;

import AntarMuka.InterfacePeminjam;
import Entitas.EntitasPeminjam;
import Koneksi.koneksi;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author lenovo
 */
public class CrudPeminjam implements InterfacePeminjam{
      Connection kon = new koneksi().BukaKon();
     public void simpan(EntitasPeminjam pj) throws Exception {
        try{
            Statement sttm=(Statement) kon.createStatement();
            sttm.executeUpdate("INSERT INTO tb_peminjam VALUES('"+pj.getKtp()+"','"+pj.getNama()+"','"+pj.getTelp()+"','"+pj.getAlamat()+"')");
            System.out.println("Berhasil menambahkan data !");
        }catch(Exception e){
            System.out.println("Gagal menambahkan data !");
            e.printStackTrace();
        }
    }
}
