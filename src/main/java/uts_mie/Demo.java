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
import java.util.Scanner;
public class Demo {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
//-------------------Deklarasi, Instansiasi, Inisialisasi-----------------------
        
        Scanner in = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        
        int kodeBrg, stok, jumlahBeli,idx,idxri=0,idxrirecent=0;
        double totalHarga=0, harga, totalTransaksi;
        String namaPembeli, idPembeli, merk,lagi,kodeKartu;
        boolean aksesTransaksi=false;
        
        User u = new User("Miko", 'l');
        Admin a = new Admin("2141720082");
        Pembeli p = new Pembeli("2141720083");
        p.setNama(u.getNama());
        SmartCard sc = new SmartCard(p,100000,"123456");
        Mesin msn = new Mesin();
        
//---------------------Nilai default dan contoh data statis---------------------
        Mie miarray[]=new Mie[20];
        Mie midefault = new Mie(0, null, 0,0);
        for(int i=0; i<miarray.length; i++){
            miarray[i] = midefault;
        }
        Mie mistatis1 = new Mie(1, "Mie Sedaap Goreng", 50, 2000);
        Mie mistatis2 = new Mie(2, "Indomie Goreng", 50, 2000);
        miarray[0]=mistatis1;
        miarray[1]=mistatis2;
        msn.miarray = miarray;
//==============================================================================


//-----------------------Nilai default array keranjang--------------------------
        Keranjang kjarray[] = new Keranjang[20];
        Keranjang kjdefault = new Keranjang(0, 1);
        for(int i=0; i<kjarray.length; i++){
            kjarray[i] = kjdefault;
        }
        msn.krjarray = kjarray;

//-------------------Nilai default array objek class riwayat--------------------
        Riwayat ri = new Riwayat();
        Riwayat riarray[] = new Riwayat[50];
        Riwayat ridefault = new Riwayat(sc, 0,0,null,0);
        for(int i=0; i<riarray.length; i++){
            riarray[i] = ridefault;
        }
        msn.riarray=riarray;
        
//==============================================================================


//---------------------------------Menu-----------------------------------------
        /*
        Masuk Sbg admin
        1. Tambah stok mie
        2. 
        3. 
        4. 
        */
        
        
        /*
        Masuk Sebagai User
        1. Mulai transaksi pembelian
        2. 
        3. 
        4. 
        */
        
//------------------------------Tampilkan Stok Mie------------------------------
System.out.println("-----------------Daftar Produk---------------\n");
for(int i=0; i<msn.miarray.length; i++){
            if(msn.miarray[i].getKode()!=0){
                System.out.println("Kode mie\t\t: "+msn.miarray[i].getKode());
                System.out.println("Merk dan Varian\t: "+msn.miarray[i].getMerk());
                System.out.println("Harga satuan\t: "+msn.miarray[i].getHarga());
                System.out.println("Stok\t\t\t: "+msn.miarray[i].getStok()+"\n");
            }
        }


//---------------------------Fitur Validasi Kartu-------------------------------
        System.out.print("Masukkan Kode Kartu: ");
        kodeKartu=in.nextLine();
        if(msn.cekKartu(sc, kodeKartu)==true){
            aksesTransaksi=true;
            System.out.println("Selamat Datang "+sc.getNama());
        } else{
            System.out.println("Kode kartu yang Anda masukkan salah");
        }
//==============================================================================
        
//--------------------------------Isi Stok Mie----------------------------------
        idx = 2; //pengisian dimulai dari index ke-2 karena pada index sebelumnya sudah ada data statis
        do{
            System.out.print("Kode Mie : ");
            kodeBrg = scan.nextInt();
            System.out.print("Merk dan Varian : ");
            merk = in.nextLine();
            System.out.print("Stok : ");
            stok = scan.nextInt();
            System.out.print("Harga Satuan : Rp.");
            harga = scan.nextDouble();
            
            Mie m1 = new Mie(kodeBrg, merk, stok, harga);
            msn.miarray = miarray;
            msn.addMie(m1, idx);
            idx+=1;
            System.out.print("Tambah lagi? :");
            lagi = in.nextLine();
        }while(lagi.equalsIgnoreCase("ya"));
//==============================================================================
        
            
//-----------------------------Fitur Transaksi----------------------------------
        //cek akses transaksi terlebih dahulu, jika false dikembalikan ke menu sebelumnya
        if(aksesTransaksi==true){
            idx = 0;
                totalTransaksi=0;
                if(idxrirecent!=0){//jika index rirecent sudah diupdate
                    idxri=idxrirecent; 
                } else{
                    idxri=0;
                }
            do{
                System.out.print("Kode mie yang ingin Anda beli :");
                kodeBrg = scan.nextInt();
                System.out.print("Jumlah mie yang ingin Anda beli :");
                jumlahBeli = scan.nextInt();
                
                //Barang masuk keranjang
                Keranjang kj = new Keranjang(kodeBrg, jumlahBeli);
                msn.krjarray = kjarray;
                msn.addKeranjang(kj, idx);
                idx+=1;
                
                //hitung total harga barang
                totalHarga=msn.hitungTotal(kj);
                if(sc.getSaldo()<totalHarga){
                    System.out.println("Saldo Anda tidak cukup");
                }else{
                    System.out.println("Total Harga : Rp."+totalHarga);
                    sc.kurangiSaldo(totalHarga);
                    System.out.print("Sisa saldo Anda: Rp."+sc.getSaldo());
                }
                
                //menambahkan transaksi ke dalam Riwayat
                for(int i=0; i<miarray.length;i++){
                    if(miarray[i].getKode()==kodeBrg){
                        merk = miarray[i].getMerk();
                    }
                }
                Riwayat riw = new Riwayat(sc, kodeBrg, jumlahBeli, merk, totalHarga);
                msn.riarray=riarray;
                idxri = idxrirecent;//mengupdate index yg akan digunakan dengan index terbaru
                msn.addRiwayat(riw, idxri);
                idxri+=1;
                idxrirecent = idxri;//idxrirecent menyimpan sementara nilai index terbaru
                
                idx++;//variabel idx digunakan sebagai index dalam method msn.addKeranjang
                System.out.print("\nPesan lagi? : ");
                lagi = in.nextLine();
            }while(lagi.equalsIgnoreCase("ya"));
            //hitung total harga dalam satu transaksi
            totalTransaksi+=totalHarga;
            System.out.println("Total Biaya transaksi: "+totalTransaksi);
            System.out.println("Terima Kasih, Silahkan Datang Kembali");
        } else{
            System.out.println("Silahkan validasi Smart Card terlebih dahulu");
        }
        
//==============================================================================
        


//----------------------Fitur Cek Riwayat Penjualan---------------------------
        System.out.println("----------------Riwayat Pembelian----------------");
        for(int i = 0; i<msn.riarray.length; i++){
            if(msn.riarray[i].getKode()!=0){
                System.out.println("ID Transaksi: "+(i+1));
                System.out.println("ID Pembeli: "+msn.riarray[i].id);
                System.out.println("Nama: "+msn.riarray[i].nama);
                System.out.println("Kode Barang: "+msn.riarray[i].kode);
                System.out.println("Merk: "+msn.riarray[i].merk);
                System.out.println("Jumlah Beli: "+msn.riarray[i].jumlah);
                System.out.println("Total Harga: "+msn.riarray[i].total+"\n");
            }
        }
    }
}
