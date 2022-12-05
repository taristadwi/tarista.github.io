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
public class Pembeli extends User{
    String idPembeli;
    SmartCard sc;
    
    public Pembeli(){
        
    }
    
     public Pembeli(String idPembeli, SmartCard sc){
        this.idPembeli = idPembeli;
        this.sc = sc;
    }
    
    
}
