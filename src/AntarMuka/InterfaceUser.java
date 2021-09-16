/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AntarMuka;
import Entitas.EntitasUser;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author lenovo
 */
public interface InterfaceUser {
    DefaultTableModel cari(String user)throws Exception;
    void simpan(EntitasUser user) throws Exception;
    DefaultTableModel tampil();
    void hapus(int id) throws Exception;
    void edit(EntitasUser user,int id) throws Exception;
    
}
