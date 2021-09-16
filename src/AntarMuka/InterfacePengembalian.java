/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AntarMuka;

import Entitas.EntitasPembayaran;

/**
 *
 * @author lenovo
 */
public interface InterfacePengembalian {
    void simpan(EntitasPembayaran pj) throws Exception;
    void hapus(int id) throws Exception ;
}
