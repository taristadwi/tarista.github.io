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
public class SmartCard {
    private double saldo = 0;
    private String kodeKartu;
    
    public SmartCard(){
        
    }
    
    public SmartCard(double saldo, String kodeKartu){
        this.saldo = saldo;
        this.kodeKartu = kodeKartu;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public void setKodeKartu(String kodeKartu){
        this.kodeKartu = kodeKartu;
    }
   
    public String getKodeKartu(){
        return kodeKartu;
    }
    
}
