/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entitas;

/**
 *
 * @author lenovo
 */
public class EditMobil {
    String merek,tipe,thn,no,status;
    int harga,id;
    
    public EditMobil(int id,String merek,String tipe,String thn,String no,int harga,String status){
        this.merek = merek;
        this.tipe = tipe;
        this.thn = thn;
        this.no = no;
        this.harga = harga;
        this.status = status;
        this.id=id;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getThn() {
        return thn;
    }

    public void setThn(String thn) {
        this.thn = thn;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
