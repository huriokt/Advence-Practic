package day05;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Q06_Inheritance_HacimHesaplama extends Geometri {
    public static void main(String[] args) {

        //Kare prizma, silindir ve koninin hacmini hesaplayan bir kod yazınız.(Inheritance kullanınız)

        KarePrizma karePrizma = new KarePrizma();
        double karePrizmahacimHesapla = karePrizma.hacimHesapla(2, 6);//24
        System.out.println("karePrizmahacimHesapla = " + karePrizmahacimHesapla);
        
        
        Koni koni = new Koni();
       double  konihacimHesapla = koni.hacimHesapla(3,5);
        NumberFormat obje = new DecimalFormat(".00");

        System.out.println("koni hacmi = " +obje.format(konihacimHesapla));

        Silindir silindir = new Silindir();
        double silindirhacimHesapla =  silindir.hacimHesapla(3, 5);


        NumberFormat obje2=new DecimalFormat(".00");
        System.out.println("silindir hacim = " + obje2.format(silindirhacimHesapla));


    }


}
