package day02;

import java.util.Scanner;

public class Q02_For_Loop_Contuniue {
    public static void main(String[] args) {

/* TASK :
        Kullanıcıdan 5 adet sayı isteyiniz
        Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        */
        Scanner input = new Scanner(System.in);
        int counter= 0 ;
        for (int i = 0; i <5 ; i++) {
                System.out.println("Lutfen bir sayi giriniz:");
                int sayi = input.nextInt();
                if(i>5&&i<10){
                    System.out.println("Girdiginiz sayi 5 ile 10 arasinda degildir");
                   continue;

            }
            counter+=sayi;
        }
        System.out.println(counter);



    }
}
