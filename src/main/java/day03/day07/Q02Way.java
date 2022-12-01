package day03.day07;

import java.util.Scanner;

public class Q02Way {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir cumle girin");
        String cumle = input.nextLine();
        String[] arr = cumle.split(" ");

        int max = arr[0].length();

        String enuzunKelime = arr[0];

        for (String w: arr){
            if (w.length() > max){
                enuzunKelime = w;
            }
        }
        System.out.println(enuzunKelime);
    }
}
