package day05;

public class Q03_Method_HacimBulma {
    public static void main(String[] args) {
        //Küp, kare prizma ve dikdörtgen prizmanın hacmini hesaplayan bir method oluşturunuz.(Method overloading kullanınız)

 Hacim hacim = new Hacim();//Obje olusturduk


 hacim.HacimHesapla(5);//Void ile

        int karePrizma =hacim.HacimHesapla(5,6)+50;//atama yaparak***Matematiksel islem yapilamaz


        System.out.println("karePrizma = "+karePrizma);//atama yaparak***Matematiksel islem yapilabilir


        System.out.println("dikdortgenPrizma = "+hacim.HacimHesapla(4,5,6));//direkt icinde yazdirdik***Matematiksel islem yapilabilir







    }
}
