/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perbankan;

/**
 *
 * @author WINDOWS10
 */
public class Rekening {
    String noRekening,nama,namaIbu,Phone,Email;
    
    Rekening(String nr,String n,String ni, String p, String e){
        noRekening = nr;
        nama = n;
        namaIbu = ni;
        Phone = p;
        Email = e;
    }
    
    void tampil(){
        System.out.println(noRekening+"\t"+nama+"\t"+namaIbu+"\t"+Phone+"\t"+Email);
    }
}
