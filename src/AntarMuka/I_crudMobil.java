/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AntarMuka;

import Entitas.TambahMobil;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author lenovo
 */
public interface I_crudMobil {
    void simpan(TambahMobil mobil)throws Exception;
    void hapus(int id)throws Exception;
    void editStatus(String no)throws Exception;
    void editStatus2(String no)throws Exception;
    DefaultTableModel cari(String inp)throws Exception;
    DefaultTableModel tampil();
}
