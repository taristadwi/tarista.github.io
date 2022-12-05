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
public class Admin {
    String idAdmin;
    
    public Admin(){
        
    }
    
     public Admin(String idAdmin){
        this.idAdmin = idAdmin;
    }
     
    public void buatSmartCard(SmartCard sc, double saldo, String kode){
        sc.setSaldo(saldo);
        sc.setKodeKartu(kode);
    }
}
