package tes;
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
    private String merk;
    private int stok;
    private double harga;
    
    public Mie(){
        
    }
    
    public Mie(String merk, int stok, double harga){
        this.merk = merk;
        this.stok = stok;
        this.harga = harga;
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
    
    public double getHarga(){
        return harga;
    }
    
    public String getMerk(){
        return merk;
    }
    
    
}
