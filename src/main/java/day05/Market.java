package day05;

import java.time.LocalDate;

public class Market {

    String urunAdi;
    double UrunFiyati;
    String sonKullanmaTarihi ;

    Market(String urunIsmi,double fiyat,int aySonra){
        urunAdi=urunIsmi;
        sonKullanmaTarihi= LocalDate.now().plusMonths(aySonra).toString();
        UrunFiyati=fiyat;
    }
    Market(String urunIsmi,double fiyat){
        urunAdi=urunIsmi;
        sonKullanmaTarihi="Bu urunun skt yoktur";
        UrunFiyati=fiyat;
        System.out.println("Iki parametreli constructor calisti");
    }




}
