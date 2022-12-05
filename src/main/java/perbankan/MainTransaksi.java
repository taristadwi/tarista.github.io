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
import java.util.Scanner;
public class MainTransaksi {
    public static void main(String[] args) {
        boolean re = true;
        meth met = new meth();
        
        Rekening r1 = new Rekening("16030927 3084", "Wallace", "Chase Castro", "1-458-264-3263", "ligula.Nullam@tacitisociosqu.edu");
        Rekening r2 = new Rekening("16100617 0573", "Darius", "Julian Daniel", "1-357-843-0547", "nec@lectusjusto.org");
        Rekening r3 = new Rekening("16240401 2243","Fuller", "Finn Dunlap", "571-7062", "convallis@Vestibulumanteipsum.org");
        Rekening r4 = new Rekening("16270525 0112", "Malcolm", "Keane Floyd", "623-0234", "porttitor.tellus.non@Curabitur.ca");
        Rekening r5 = new Rekening("16971204 2416", "Geoffrey", "Stephen Pratt", "1-683-416-8323", "ut.pellentesque@luctusutpellentesque.com");
        
        met.tambahR(r1);
        met.tambahR(r2);
        met.tambahR(r3);
        met.tambahR(r4);
        met.tambahR(r5);
        
        Transaksi t1 = new Transaksi("16030927 3084", 898214, 494048, 3587, "2021-03-09 07:54:42");
        Transaksi t2 = new Transaksi("16100617 0573", 205420, 200162, 775880, "2021-06-25 10:23:00");
        Transaksi t3 = new Transaksi("16240401 2243", 838632, 350929, 328316, "2021-09-18 23:00:04");
        Transaksi t4 = new Transaksi("16270525 0112", 230659, 204434, 690503, "2022-02-02 19:10:34");
        Transaksi t5 = new Transaksi("16971204 2416", 770592, 334245, 444267, "2020-08-11 13:36:56");
        
        met.tambahT(t1);
        met.tambahT(t2);
        met.tambahT(t3);
        met.tambahT(t4);
        met.tambahT(t5);
        
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("1. Tampilkan Daftar Rekening");
        System.out.println("2. Tampilkan Daftar Transaksi");
        System.out.println("3. Tampilkan Daftar Rekening berdasarkan nama");
        System.out.println("4. Tampilkan Daftar Transaksi berdasarkan saldo");
        System.out.println("5. Cari Transaksi berdasarkan Nomor Rekening");
        System.out.println("6. Keluar");
        
        do{
        System.out.print("Masukkan pilihan(1-5): ");
        int pil = sc.nextInt();
            switch(pil){
                case 1:
                    System.out.println("No Rekening\tNama\tNama Ibu\tPhone\tEmail");
                    met.tampilRek();
                break;
                
                case 2:
                    System.out.print("No Rekening\tSaldo\tSaldo Awal\tSaldo Akhir\tTanggal Transaksi");
                    met.tampilTrans();
                break;
                
                case 3:
                    met.sortNama();
                    System.out.println("No Rekening\tNama\tNama Ibu\tPhone\tEmail");
                    met.tampilRek();
                break;
                
                case 4:
                    met.sortSaldo();
                    System.out.print("No Rekening\tSaldo\tSaldo Awal\tSaldo Akhir\tTanggal Transaksi");
                    met.tampilTrans();
                break;
                
                case 5:
                    System.out.print("Masukkan no. rekening yang ingin dicari: ");
                    String cari = sc2.nextLine();
                    int posisi = met.cariNoRek(cari);
                    met.TampilData(cari, posisi);
                break;
                
                case 6:
                    System.exit(0);
                break;
                default:
                System.out.print("menu tidak tersedia, silahkan pilih lagi(1-5");
            }
        } while(re = true);
    }
}
