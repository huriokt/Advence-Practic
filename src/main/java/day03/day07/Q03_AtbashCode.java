package day03.day07;

import java.util.Scanner;

public class Q03_AtbashCode {
    public static void main(String[] args) {

/*      Kullanıcıdan aldığınız bir metni 'Atbash Code' yöntemi ile şifreleyen bir kod yazınız.
      Ortadoğuda kullanılan en eski şifreleme biçimlerinden biridir.
      Arami alfabesinin tersten yazılması ile oluşturulan bir kodlayıcıya sahiptir.
      Örn: A-->Z, B-->Y ...  Ornek:ali==>zor
      "abcdefghijklmnopqrstuvwxyz";
      "zyxwvutsrqponmlkjihgfedcba";            */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir string girin");
//
//
//        String str1 = "abcdefghijklmnopqrstuvwxyz";
//        String str2 = "zyxwvutsrqponmlkjihgfedcba";
//        String str3 = input.nextLine();
//
//
//        for (int i = 0; i < str3.length(); i++) {
//            for (int j = 0; j < str1.length(); j++) {
//                if (str3.charAt(i) == str1.charAt(j)) {
//                    System.out.print(str2.charAt(j));
//                }
//            }
//        }
////2.YOL//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Bir klm girin");
//        String kelime = scan.nextLine();
//        String duz = "abcdefghijklmnopqrstuvwxyz";
//        String ters = "zyxwvutsrqponmlkjihgfedcba";
//        String tersKelime = "";
//
//        for (int i = 0; i < kelime.length(); i++) {
//            char ch = kelime.charAt(i);
//
//
//            tersKelime += ters.charAt(duz.indexOf(ch));
//
//
//        }
//        System.out.println(tersKelime);
//
//        //3.Way
//        String word = "alican";
//        String newword = "";
//        String str = "abcdefghijklmnopqrstuvwxyz";
//        String strr = "zyxwvutsrqponmlkjihgfedcba";
//        for (int i = 0; i < word.length(); i++) {
//            for (int j = 0; j < str.length(); j++) {
//                if (word.charAt(i) == str.charAt(j)) {
//                    newword += strr.charAt(j);
//                }
//            }
//        }
//        System.out.println(newword);
//
//        //4.WAY
//        Scanner inputt = new Scanner(System.in);
//        System.out.println("Bir klm girin");
//        String klm = inputt.nextLine();
//        for (int i = 0; i < klm.length(); i++) {
//            System.out.print((char) (122 - ((int) klm.charAt(i) - 97)));
//        }

        //5.WAY
        Scanner inpt = new Scanner(System.in);
        System.out.println("Bir kelim girin");
        String kelm = inpt.nextLine();
        for (int i = 0; i < kelm.length(); i++) {
           int idx='z'-kelm.charAt(i);
            System.out.print((char)('a'+idx) );

        }


    }
}