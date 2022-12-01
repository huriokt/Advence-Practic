package day06;

import java.util.Scanner;

public class Q02_RastgeleSifreOlusturma {
    public static void main(String[] args) {
        //Kullanıcıdan aldığınız sayi kadar karakter uzunluğuna sahip rastgele şifre üreten bir kod yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen character sayisini giriniz : ");
        int characterSayisi = input.nextInt();
        String sifre = "";
        int sayac = 0;

        String caharacterler ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int maxIndeks = caharacterler.length();

        while (sayac<characterSayisi){

         int  rastgeleIndeks =   (int)(Math.random()*maxIndeks);

         sifre += caharacterler.charAt(rastgeleIndeks);
        sayac++;



        }
        System.out.println("sifre = "+sifre);

        //2.Yol Eger sifrede 9 gelirse dur derse
  /*
        while (true){

         int  rastgeleIndeks =   (int)(Math.random()*maxIndeks);

         sifre += caharacterler.charAt(rastgeleIndeks);
        sayac++;
        if(caharacterler.charAt(rastgeleIndeks)=='9'){
            break;
          }

        }
        System.out.println("sifre = "+sifre);
       */





















    }
}
