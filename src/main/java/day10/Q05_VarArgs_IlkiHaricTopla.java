package day10;

public class Q05_VarArgs_IlkiHaricTopla {
    public static void main(String[] args) {

//Parametrelerinin ilki hariç  karakter sayılarını toplayan ve bu toplamı birinci
// parametrenin karakter sayısıyla çarpan bir kod yazınız.(indeks ve if statement kullanmayınız)
myMethod("Ali","Veli","Sally","Holly");

    }

    public static void myMethod(String a , String ...b){
        int toplam = 0;
        for (String w : b){
            toplam += w.length();
        }
        int sonuc =toplam*a.length();
        System.out.println("sonuc = " + sonuc);
    }
}
