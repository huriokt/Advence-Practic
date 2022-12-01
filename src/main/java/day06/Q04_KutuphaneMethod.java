package day06;

public class Q04_KutuphaneMethod {
    //Kütüphaneye eklemek istediğiniz kitapları, adı, yazar adı, sayfa sayısı, seri numarası ile yazdıran bir kod yazınız.
    public static void main(String[] args) {
        Kitap kitap1 = new Kitap("Harry Potter", " j k rowling", 500);

        kitap1.kitapbilgileri();


        new Kitap("1984", "George Orwell", 352).kitapbilgileri();
        //2. yol//
        Kitap kitap2 =new Kitap("1984", "George Orwell", 352);
        kitap2.kitapbilgileri();

    }
}
