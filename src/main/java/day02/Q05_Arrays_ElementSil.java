package day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q05_Arrays_ElementSil {
    public static void main(String[] args) {

 /*    Elementlerini kullanıcan alarak bir integer Array oluşturunuz.
     Kullanıcıdan bir indeks alınız ve o indeksteki elementi siliniz.    */


        Scanner input = new Scanner(System.in);
        System.out.println("Array limitini giriniz : ");
        int limit= input.nextInt() ;
        int arr[]= new  int[limit];
        for (int i = 0; i < limit; i++) {
            System.out.println("Giriniz:Index "+i);
            arr[i]= input.nextInt();


        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Silmek istediginiz indexi giriniz :");
        int removeIndex = input.nextInt();
int idx  = 0;
        int brr[]=new int[limit-1];
        for (int i = 0; i < arr.length; i++) {
            if (removeIndex!=i){
                brr[idx]=arr[i];
                idx++;
            }

        }

        System.out.println(Arrays.toString(brr));


        //2.Yol
        List<Integer> numberlist = new ArrayList<>();
        for(int w :arr){
            numberlist.add(w);
        }
        System.out.println(numberlist);
        System.out.println("Silmek istediginiz indexi giriniz :");
        int silinecekIdx=input.nextInt();
        numberlist.remove(silinecekIdx);//2.Yol numberlist.remove(numberlist.indexOf(input.nextInt()));
        System.out.println(numberlist);





    }
}
