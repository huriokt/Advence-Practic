package day01;

import java.util.Scanner;

public class Q02_SubString_AdSoyad {
    public static void main(String[] args) {
         /*
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       Örn: Ad: Ali
           Soyad: Can
                        */



        Scanner input = new Scanner(System.in);
        System.out.println("Ad ve soyadınızı aralarında bir boşluk olacak şekilde giriniz.");
        String adSoyad = input.nextLine();

        int bosluk  = adSoyad.indexOf(" ");
        String ad = adSoyad.substring(0,bosluk);
        String soyad = adSoyad.substring(bosluk+1);
        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
























    }
}
