package day10;

import java.util.Scanner;

public class Q07_ConvertThreeDigitNumberToWords {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.print("Enter a three digit number: ");
            int number = input.nextInt();
            int hundreds = number / 100;
            int tens = (number / 10) % 10;
            int ones = number % 10;
            if (hundreds == 0){
                System.out.println("Enter a three digit numbers");
            } else {
                switch (hundreds){
                    case 1:     System.out.print("One"); break;
                    case 2:     System.out.print("Two"); break;
                    case 3:     System.out.print("Three"); break;
                    case 4:     System.out.print("Four"); break;
                    case 5:     System.out.print("Five"); break;
                    case 6:     System.out.print("Six"); break;
                    case 7:     System.out.print("Seven"); break;
                    case 8:     System.out.print("Eight"); break;
                    case 9:     System.out.print("Nine"); break;
                }
                System.out.print(" Hundred ");
                if (tens==1){
                    switch (ones){
                        case 0:     System.out.print("Ten"); break;
                        case 1:     System.out.print("Eleven"); break;
                        case 2:     System.out.print("Twelve"); break;
                        case 3:     System.out.print("Thirteen"); break;
                        case 4:     System.out.print("Fourteen"); break;
                        case 5:     System.out.print("Fifteen"); break;
                        case 6:     System.out.print("Sixteen"); break;
                        case 7:     System.out.print("Seventeen"); break;
                        case 8:     System.out.print("Eightteen"); break;
                        case 9:     System.out.print("Nineteen"); break;
                    }
                } else {
                    switch (tens){
                        case 2:     System.out.print("Twenty"); break;
                        case 3:     System.out.print("Thirty"); break;
                        case 4:     System.out.print("Fourty"); break;
                        case 5:     System.out.print("Fifty"); break;
                        case 6:     System.out.print("Sixty"); break;
                        case 7:     System.out.print("Seventy"); break;
                        case 8:     System.out.print("Eightty"); break;
                        case 9:     System.out.print("Ninety"); break;
                    }
                }
                switch (ones){
                    case 1:     System.out.print(" One"); break;
                    case 2:     System.out.print(" Two"); break;
                    case 3:     System.out.print(" Three"); break;
                    case 4:     System.out.print(" Four"); break;
                    case 5:     System.out.print(" Five"); break;
                    case 6:     System.out.print(" Six"); break;
                    case 7:     System.out.print(" Seven"); break;
                    case 8:     System.out.print(" Eight"); break;
                    case 9:     System.out.print(" Nine"); break;
                }
            }
        }
}
