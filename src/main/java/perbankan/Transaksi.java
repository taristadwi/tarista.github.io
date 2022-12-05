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
public class Transaksi {
    double saldo, saldoAwal, saldoAkhir;
    String noRekening,tanggalTransaksi;
    
    Transaksi(String r, double s, double saw, double sak, String tgl){
        noRekening = r;
        saldo = s;
        saldoAwal = saw;
        saldoAkhir = sak;
        tanggalTransaksi = tgl;
    }
    
    void tampil(){
        System.out.println(noRekening+"\t"+saldo+"\t"+saldoAwal+"\t"+saldoAkhir+"\t"+tanggalTransaksi);
    }
}
