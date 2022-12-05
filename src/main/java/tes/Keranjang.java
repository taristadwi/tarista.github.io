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
public class Keranjang {
    private String merk;
    private double jumlah;
    
    public Keranjang(String merk, int jumlah){
        this.merk = merk;
        this.jumlah = jumlah;
    }
    
    public void setMerk(String merk){
        this.merk = merk;
    }
    
    public void setJumlah(double jumlah){
        this.jumlah=jumlah;
    }
    
    public String getMerk(){
        return merk;
    }
    
    public double getJumlah(){
        return jumlah;
    }
}
