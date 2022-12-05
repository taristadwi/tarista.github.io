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
public class SmartCard {
    private double saldo = 0;
    private String idPembeli, nama, kodeKartu;
    
    public SmartCard(){
        
    }
    
    public SmartCard(Pembeli p, double saldo, String kodeKartu){
        this.idPembeli = p.getIdPembeli();
        this.nama = p.getNama();
        this.saldo = saldo;
        this.kodeKartu = kodeKartu;
    }
    
    public void kurangiSaldo(double total){
        saldo-=total;
    }
    
    public void setIdPembeli(String idPembeli){
        this.idPembeli = idPembeli;
    }
    
    public String getIdPembeli(){
        return idPembeli;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setKodeKartu(String kodeKartu){
        this.kodeKartu = kodeKartu;
    }
   
    public String getKodeKartu(){
        return kodeKartu;
    }
    
}
