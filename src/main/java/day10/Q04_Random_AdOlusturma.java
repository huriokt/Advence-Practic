package day10;

import java.util.Random;

public class Q04_Random_AdOlusturma {
    public static void main(String[] args) {
        //Rastgele alınan harfleri bir Stringe ekleyerek adınızı oluşturan ve bunu
        // kaç deneme ile yaptığını yazdıran bir kod yazınız.



            String alfabe = "ABCDEFGHIJKLMNOPQRSTUVWXYZ^+%&/abcdefghijklmnopqrstuvwxyz";
            int maxIdx = alfabe.length();
            String isim = "Can";
            String yeniIsim = "";
            int sayac = 0;
            for(int i=0;i<isim.length();i++){
                while (true){
                    char rastgeleKarakter = alfabe.charAt((int)(Math.random()*maxIdx));
                    sayac++;
                    if(isim.charAt(i)==rastgeleKarakter){
                        yeniIsim += rastgeleKarakter;
                        System.out.println("yeniIsim = " + yeniIsim);
                        break;
                    }
                }
            }
            System.out.println("yeniIsim = " + yeniIsim);
            System.out.println("sayac = " + sayac);
        }

///2,YOL//
// String isim = "Ali";
//String yeniIsim = "";
//int sayac = 0;
//Random rastgele = new Random();
//for(int i=0; i<isim.length(); i++){
//    while(true){
//        char rastgeleKarakter = (char) (ThreadLocalRandom.current().nextInt(65, 122 + 1));
//        sayac++;
//        if(isim.charAt(i) == rastgeleKarakter){
//            yeniIsim += rastgeleKarakter;
//            break;
//        }
//    }
//}
//System.out.println("Yeni isim: " + yeniIsim);
//System.out.println("Sayaç: " + sayac);

}
