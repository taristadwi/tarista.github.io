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
public class meth {
        
    Rekening listRek[] = new Rekening[5];
    Transaksi listTrans[] = new Transaksi[5];
    int idx;
    int idx2;
    
    void tampilRek(){
        for(Rekening r : listRek){
            r.tampil();
        }
    }
    
    void tambahR(Rekening r){
        if(idx<listRek.length){
            listRek[idx] = r;
            idx++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }
    
    void tambahT(Transaksi t){
        if(idx2<listTrans.length){
            listTrans[idx2] = t;
            idx2++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }
    
    void tampilTrans(){
        for(Transaksi t : listTrans){
            t.tampil();
        }
    }
    
    void sortNama(){
        for(int i=0; i<listRek.length-1; i++){
            int [] num = new int[5];
            num[i]= Integer.parseInt(listRek[i].nama);
            for(int j=1; j<listRek.length-i; j++){
                if(num[j] > num[j-1]){
                    Rekening tmp = listRek[j];
                    listRek[j] = listRek[j-1];
                    listRek[j-1] = tmp;
                }
            }
        }
    }
    
    void sortSaldo(){
        for(int i=0; i<listTrans.length-1; i++){
            for(int j=1; j<listRek.length-i; j++){
                if(listTrans[j].saldo > listTrans[j-1].saldo){
                    Transaksi tmp = listTrans[j];
                    listTrans[j] = listTrans[j-1];
                    listTrans[j-1] = tmp;
                }
            }
        }
    }
    
    public int cariNoRek(String cari){
        int posisi = -1;
        for(int j=0; j<listRek.length; j++){
            if(listRek[j].noRekening.equalsIgnoreCase(cari)){
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    
    void TampilData(String x, int pos){
        if(pos!=-1){
            System.out.println(listRek[pos].noRekening+"\t"+listRek[pos].nama+"\t"+listRek[pos].namaIbu+"\t"+listRek[pos].Phone+"\t"+listRek[pos].Email);
        } else {
            System.out.println("data "+x+" tidak ditemukan");
        }
    }
    
}
