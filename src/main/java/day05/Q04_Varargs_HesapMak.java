package day05;

public class Q04_Varargs_HesapMak {
    public static void main(String[] args) {
        //Temel 4 matematik işlemi yapan bir kod yazınız.

        HesapMakinasi hesapMakinasi = new HesapMakinasi();

        hesapMakinasi.Toplama(2,6,8,9,7);
        hesapMakinasi.Cikarma(59,25);
        hesapMakinasi.Carpma(2,6,5,8,7,9,3,4);
        hesapMakinasi.Bolme(75,0);
    }

}
