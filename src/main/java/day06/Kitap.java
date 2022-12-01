package day06;

public class Kitap {

    String kitapAdi;
    String yazarAdi;
    int sayfaSayisi;
    String seriNumarasi;
    static int kitapSayisi ;

    public Kitap(String kitapAdi, String yazarAdi, int sayfaSayisi) {
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.sayfaSayisi = sayfaSayisi;
        kitapSayisi++;
        this.seriNumarasi =yazarAdi.substring(0,2)+kitapAdi.substring(0,2)+kitapSayisi;

    }
    public void kitapbilgileri(){
        System.out.println("Kitap Adi: "+kitapAdi+"\n Yazar Adi: "+yazarAdi+"\nSayfa Sayisi: "+sayfaSayisi+"\nseriNumarasi : "+seriNumarasi);
        System.out.println("**************************");
    }






}
