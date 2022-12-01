package day05;

public class Q05_Market_Constructor {
    public static void main(String[] args) {
        //Ürün adı, ürün fiyatı ve (varsa) son kullanma tarihlerini yazdıran bir market programı yazınız.

        Market ekmekObjesi = new Market("Ekmek", 4, 1);
        System.out.println("Urun adi : "+ekmekObjesi.urunAdi+"\t Urun fiyati : "+ekmekObjesi.UrunFiyati+"\t Son kullanma tarihi : "+ekmekObjesi.sonKullanmaTarihi);

        Market nutellaObjesi = new Market("Nutella", 45, 20);
        System.out.println("Urun adi : "+nutellaObjesi.urunAdi+"\t Urun fiyati : "+nutellaObjesi.UrunFiyati+"\t Son kullanma tarihi : "+nutellaObjesi.sonKullanmaTarihi);


   Market bardakObjesi = new Market("Bardak", 50);
        System.out.println("Urun adi : "+bardakObjesi.urunAdi+"\t Urun fiyati : "+bardakObjesi.UrunFiyati+"\t Son kullanma tarihi : "+bardakObjesi.sonKullanmaTarihi);
    }


}
