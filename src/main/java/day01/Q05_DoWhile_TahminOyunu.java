package day01;

import java.util.Scanner;

public class Q05_DoWhile_TahminOyunu {
    public static void main(String[] args) {
        //0 ile 100 arasında rastgele numara tahmini yapan bir kod yazın.
        //İpucu: Girdiğiniz numara rastgeleNumara'dan küçükse ==> Daha büyük bir numara giriniz.
        //       Girdiğiniz numara rastgeleNumara'dan büyükse ==> Daha küçük bir numara giriniz.
        //       Girdiğiniz numara rastgeleNumara'ya eşitse ==> Tebrikler!!!


        Scanner input = new Scanner(System.in);

        int rastgeleSayi = (int) (Math.random() * 100) + 1;
   //   System.out.println(rastgeleSayi);
        int sayi;

        do {
            System.out.println("Lutfen bir tahmini bir sayi giriniz:");
            sayi = input.nextInt();
            if (sayi == rastgeleSayi) {
                System.out.println(" Tebrikler ");
            } else if (sayi < rastgeleSayi) {
                System.out.println("Daha büyük bir sayi giriniz.");
            } else {
                System.out.println("Daha küçük bir sayi giriniz.");
            }
        } while (sayi != rastgeleSayi);


    }
}
