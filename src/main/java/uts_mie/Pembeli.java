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
public class Pembeli extends User{
    private String idPembeli;
    
    public Pembeli(){
        
    }
    
    public Pembeli(String idPembeli){
        this.idPembeli = idPembeli;
        this.nama = super.nama;
    }
    
    public String getIdPembeli(){
        return idPembeli;
    }
    
    @Override
    public String getNama(){
        return super.nama;
    }
}
