/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_mie;

/**
 *
 * @author WINDOWS10
 */
public class Riwayat {
    public int kode, jumlah;
    public String nama,id,merk;
    public double total;
    
    
    public Riwayat(){
        
    }
    
    public Riwayat(SmartCard sc, int kode, int jumlah, String merk, double total){
        this.nama = sc.getNama();
        this.id = sc.getIdPembeli();
        this.kode = kode;
        this.jumlah = jumlah;
        this.merk = merk;
        this.total = total;
    }
    
    public void setKode(int kode){
        this.kode = kode;
    }
    
    public int getKode(){
        return kode;
    }
    
    public void setNama(SmartCard sc){
        this.nama = sc.getNama();
    }
    
    public void setId(SmartCard sc){
        this.id = sc.getIdPembeli();
    }
    
    public void setMerk(String merk){
        this.merk = merk;
    }
    
    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }
    
    public void setTotal(double total){
        this.total = total;
    }
}
