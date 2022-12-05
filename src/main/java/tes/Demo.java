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
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Admin a = new Admin();
        SmartCard sc = new SmartCard();
        a.buatSmartCard(sc, 50000, "123456");
        Mesin m = new Mesin();
        Mie mi[]=new Mie[10];
        Mie midefault = new Mie(null, 0,0);
        for(int i=0; i<mi.length; i++){
            mi[i] = midefault;
        }
        
        
        Keranjang kjarray[] = new Keranjang[10];
        m.cekKartu(sc, "123456");
        
        Mie m1 = new Mie("Indomie",5,2000);
        Mie m2 = new Mie("Sedaap",5,2000);
        //Mie mi[] = {m1,m2};
        mi[0] = m1;
        m.m = mi;
        for(int i=0; i<mi.length; i++){
            System.out.println(mi[i].getMerk());
        }
        
        
        m.kr = kjarray;
        Keranjang kj = new Keranjang("Indomie", 2);
        m.addKeranjang(kj);
        Keranjang kr = new Keranjang("Indomie", 2);
        m.addKeranjang(kr);
        
        System.out.println("Total: "+m.hitungTotal(kj));
        System.out.println("Total: "+m.hitungTotal(kr));
        
    }
    
}
