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
public class Mesin {
    public Mie m[];
    Keranjang kr[];
    public double total = 0;
    
    public boolean cekKartu(SmartCard sc, String nomor){
        if(nomor.equals(sc.getKodeKartu())){
            return true;
        } else{
            return false;
        }
     }
    
    public void addMie(Mie mi){
        for(int i=0; i<kr.length; i++){
             m[i]=mi;
        }
    }
    
    public void addKeranjang(Keranjang k){
        for(int i=0; i<kr.length; i++){
            kr[i]=k;
        }
    }
    
    
    
    public double hitungTotal(Keranjang k){
        for(int i=0; i<m.length; i++){
            if(k.getMerk().equals(m[i].getMerk())){
                total += (m[i].getHarga()*k.getJumlah());
            }
        }
        return total;
    }
   
    
}
