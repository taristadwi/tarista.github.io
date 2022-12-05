package uts_mie;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WINDOWS 10
 */
public class Keranjang {
    private int kode;
    private String merk;
    private int jumlah;
    
    public Keranjang(int kode, int jumlah){
        this.kode = kode;
        this.jumlah = jumlah;
    }
    
    public void setMerk(String merk){
        this.merk = merk;
    }
    
    public void setJumlah(int jumlah){
        this.jumlah=jumlah;
    }
    
    public int getKode(){
        return kode;
    }
    
    public String getMerk(){
        return merk;
    }
    
    public int getJumlah(){
        return jumlah;
    }
}
