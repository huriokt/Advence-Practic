package day04;

import java.util.ArrayList;
import java.util.List;

public class Q04_Arrays_OrtakElemanlar {
    public static void main(String[] args) {
        /*
         * İki Array'de ortak bulunan elementleri yazdırınız.
         * (case sensitivity olmadan)

         * Input1 : {John,Brad,Angel,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}

         * Output : [brad,sofia,emily]      */



        String arr1[] = {"John","Brad","Angel","Sofia","Emily"};
        String arr2[] = {"sofia","brad","grace","emily","hazel"};

        List<String> list = new ArrayList();

        for (String w:arr1){
            for (String u :arr2){
                if (w.equalsIgnoreCase(u)){
                    list.add(w);
                }
            }
        }

        System.out.println("Ortak elementler= " + list);



    }
}
