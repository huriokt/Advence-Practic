package day03.day07;

import java.util.Scanner;

public class Q06encapculation {
    public static void main(String[] args) {

 /*    BMI hesaplama kodu yazınız. (Güvenliği göz ardı etmeyin).
    BMI(Vücut Kitle Endeksi):
    BMI, vücut kütlesinin vücut boyunun karesine bölünmesi olarak tanımlanır.
    Başlıca yetişkin BMI sınıflandırmaları, zayıf (18,5 kg/m2'nin altında), normal ağırlık (18,5 ila 25),
    fazla kilolu (25 ila 30) ve obez (30 veya daha fazla) şeklindedir.          */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kilonizu kg cinsinden giriniz : " );
        double kilo = input.nextDouble();
        System.out.println("Lutfen boyunuzu m cinsinden giriniz : " );
        double boy = input.nextDouble();

        BMI kisi1=new BMI(kilo,boy);
        kisi1.BMIHesapla();

    }






}
