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
public class Mie {
    private int kode;
    private String merk;
    private int stok;
    private double harga;
    
    public Mie(){
        
    }
    
    public Mie(int kode, String merk, int stok, double harga){
        this.kode = kode;
        this.merk = merk;
        this.stok = stok;
        this.harga = harga;
    }
    
    public void kurangiStok(int jumlahBeli){
        stok-=jumlahBeli;
    }
    
    public void setMerk(String merk){
        this.merk = merk;
    }
    public void setStok(int stok){
        this.stok = stok;
    }
    public void setHarga(double harga){
        this.harga = harga;
    }
    
    public int getKode(){
        return kode;
    }
    
    public double getHarga(){
        return harga;
    }
    
    public int getStok(){
        return stok;
    }
    
    public String getMerk(){
        return merk;
    }
    
    
}
