package day03.day07;

public class Q04_Exception_Throws {
    public static void main(String[] args) throws Exception {
        /*
   randomSayi isminde bir method oluşturunuz.
   Bu method içerisinde iki int random sayı oluştursun. (0'dan 10 a kadar)
   Bu iki random sayının toplamını yazdırın.
   Eğer bu iki random sayının toplamı 12 den küçükse "Exception" versin ve mesaj olarak
   ("Sayı 12'den kucukse hata verir") yazdirin*/


      randomSayi()  ;

    }

    private static void randomSayi () throws Exception {
        int a =(int)(Math.random()*11);///VeyaRandom random = new Random();
                                       // int rastOne = random.nextInt(10);
        int b= (int)(Math.random()*11);
        System.out.println(a+"==="+b);
        System.out.println(a+b);
        if((a+b<12)){
            throw new Exception("Sayilarin toplami 12 den kucuk olursa hata verir");


        }

    }


}
