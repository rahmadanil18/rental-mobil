/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AntarMuka;

import Entitas.EditTransaksi;
import Entitas.EnTransaksi;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lenovo
 */
public interface InterfaceTransaksi {
    DefaultTableModel tampil();
    DefaultTableModel cari(String inp);
    void hapus(int id) throws Exception;
    void simpan(EnTransaksi trans) throws Exception;
    void edit(EditTransaksi trans,int id) throws Exception;
    
}
