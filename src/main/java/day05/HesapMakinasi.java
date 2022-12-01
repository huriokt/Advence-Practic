package day05;

public class HesapMakinasi {

    public void Toplama(int... a) {
        int toplam = 0;
        for (int w : a) {
            toplam += w;
        }
        System.out.println("Toplam = " + toplam);
    }

    public void Cikarma(int a, int b) {
        System.out.println("fark = " + (a - b));
    }
    public void Carpma(int...a){
        int carpim = 1;
        for (int w :a){
            carpim *= w;

        }
        System.out.println("carpim = "+ carpim);
    }

    public void Bolme(double a , double b){
        if (b==0){
            System.out.println("bolen sayi sifir olamaz.");
        }else {
            System.out.println("bolum = "+a/b);
        }

    }

}
