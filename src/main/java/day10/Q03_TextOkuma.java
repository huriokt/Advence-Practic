package day10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Q03_TextOkuma {
    public static void main(String[] args) throws IOException {
//Bir text dosyasındaki 3. satırın kelime sayısını veren bir kod yazınız.
        Object day10 = new Object();
        BufferedReader file = new BufferedReader(new FileReader("C:/Users/ASUS/IdeaProjects/YasinAdvance/src/main/java/day10/text"));
        file.readLine();
        file.readLine();
        String line3 = file.readLine();
        System.out.println(line3);

        String arr[]=line3.split(" ");

        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);


        //Son satiri okutma
        String line=null;
        while (file.readLine()!=null){

        }
        System.out.println(line);



    }
}
