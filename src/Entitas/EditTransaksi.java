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
public class EditTransaksi {
    String nama,pinjam,kembali;
    int tarif,lama,total;
    
    public EditTransaksi(String nama,String pinjam,String kembali,int tarif,int lama,int total){
        this.nama=nama;
        this.pinjam=pinjam;
        this.kembali=kembali;
        this.tarif=tarif;
        this.lama=lama;
        this.total=total;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPinjam() {
        return pinjam;
    }

    public void setPinjam(String pinjam) {
        this.pinjam = pinjam;
    }

    public String getKembali() {
        return kembali;
    }

    public void setKembali(String kembali) {
        this.kembali = kembali;
    }

    public int getTarif() {
        return tarif;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }

    public int getLama() {
        return lama;
    }

    public void setLama(int lama) {
        this.lama = lama;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
}
