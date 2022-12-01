package day08;

import java.util.Scanner;

public class Q01_ForEach_SayiUcgen {
    public static void main(String[] args) {
        /*
             Alttaki şekli veren bir kod yazınız:
                  1 2 3 4 5 6
                   2 3 4 5 6
                    3 4 5 6
                     4 5 6
                      5 6
                       6
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Satir sayisi giriniz : ");
        int satir = input.nextInt();


        for (int i = 1; i <= satir; i++) {

            for (int bosluk= 1 ; bosluk < i; bosluk++) {
                System.out.print(" ");
            }
            for (int j = i; j <= satir; j++) {
                System.out.print(j+" ");

            }
            System.out.println(" ");

        }

        //2.YOL
//        for (satir = 1; satir <= 6; satir++) {//satır kontrolü
//            for (int bosluk = 1; bosluk < satir; bosluk++) {// boşluk yazdırma
//                System.out.print(" ");
//            }
//            for (int rakam = satir; rakam <= 6; rakam++) {//sutun kontrolu
//                System.out.print(rakam+" " );
//
//
//            }
//        }
    }
}