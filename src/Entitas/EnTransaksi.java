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
public class EnTransaksi {
    String nama,Nopol,pinjam,kembali;
    int tarif,lama,total;
    
    public EnTransaksi(String nama,String Nopol,String pinjam,String kembali,int tarif,int lama,int Total){
        this.nama = nama;
        this.Nopol =Nopol;
        this.pinjam=pinjam;
        this.kembali=kembali;
        this.tarif=tarif;
        this.lama=lama;
        this.total =Total;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNopol() {
        return Nopol;
    }

    public void setNopol(String Nopol) {
        this.Nopol = Nopol;
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
