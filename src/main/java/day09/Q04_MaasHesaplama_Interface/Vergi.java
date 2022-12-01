package day09.Q04_MaasHesaplama_Interface;

public interface Vergi {
    double yillikEkstra(int calismaYili);

    double saatlikEkstra(int calismaSaati);

    double vergi(double brutMaas , int calismaYili);
}
