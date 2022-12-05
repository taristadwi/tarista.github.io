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
public class Mesin {
    public Mie miarray[];
    public Keranjang krjarray[];
    public Riwayat riarray[];
    private double total;
    
    public boolean cekKartu(SmartCard sc, String nomor){
        if(nomor.equals(sc.getKodeKartu())){
            return true;
        } else{
            return false;
        }
     }
    
    public void addMie(Mie mi, int idx){
            miarray[idx]=mi;
    }
    
    public void addKeranjang(Keranjang k, int idx){
            krjarray[idx]=k;
    }
    
    public void addRiwayat(Riwayat riw, int idx){
        riarray[idx]=riw;
    }
    
    public boolean cekKecukupanSaldo(SmartCard sc){
        for(int i=0; i<miarray.length;i++){
            if(sc.getSaldo()<miarray[i].getHarga()){
                System.out.println("Saldo Anda tidak cukup");
                return false;
            }
        }
        return true;
    }
    
    public double hitungTotal(Keranjang k){
        total = 0;
        for(int i=0; i<miarray.length; i++){
            if(miarray[i].getKode()==0){
                System.out.println("Kode yang Anda masukkan salah");
                break;
            }
            if(k.getKode()==miarray[i].getKode()){
                if(miarray[i].getStok()>=k.getJumlah()){
                    miarray[i].kurangiStok(k.getJumlah());
                    total += (miarray[i].getHarga()*k.getJumlah());
                    break;
                }else{
                    System.out.println("Stok tidak cukup");
                    break;
                }
            }
        }
        return total;
    }
}
