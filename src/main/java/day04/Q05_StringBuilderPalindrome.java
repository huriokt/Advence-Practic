package day04;

public class Q05_StringBuilderPalindrome {
    public static void main(String[] args) {
//Bir String değerin Palindrome olup olmadığını kontrol eden bir kos yazınız.
//        String str = "nazan";
//        String reverseStr="";
//        for (int i = 0; i < str.length(); i++) {
//            reverseStr += str.charAt(i);
//
//
//        }
//        System.out.println(reverseStr);
//
//        if (str.equalsIgnoreCase(reverseStr)){
//            System.out.println("Palindrome");
//        }else {
//            System.out.println("Palindrome degildir");
//        }
                //2.YOL
        String str = "kabak";
        StringBuilder stb = new StringBuilder(str);
        String stbReverse =String.valueOf(stb.reverse());//ya da stb.reverse.toString
        System.out.println(stb);
        System.out.println(stbReverse);

        if (str.equals(stbReverse)) {

            System.out.println("Palindrome");
        }else {
            System.out.println("Palindrome degildir");
        }


    }
}
