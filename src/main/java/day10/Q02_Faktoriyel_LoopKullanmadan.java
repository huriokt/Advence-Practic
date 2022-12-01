package day10;

public class Q02_Faktoriyel_LoopKullanmadan {
    public static void main(String[] args) throws Exception {
        //Faktoriyel hesaplayan bir method yazınız.(Loop kullanmayınız.)


        System.out.println(faktoriyel(5));
        System.out.println(faktoryel2(-5));

    }



    public static int faktoriyel (int sayi){
        int mutiply = 1 ;
        for (int i = 1; i <=sayi ; i++) {
            mutiply *= i;

        }return mutiply;
    }
public static int faktoryel2(int sayi) throws Exception {
        if(sayi>0){
            if(sayi==1){
                return 1;
            }else {
                return   sayi*faktoryel2(sayi-1);
            }
        }else {
            throw new Exception("Sayi sifirdan buyuk olmali");
        }



//    public static int faktoryel2(int sayi){
//            int x ;
//    if(x==0||x==1){  return 1;  } faktoriyel(x)*faktoriyel(x-1);}

}




}
