package day06;

public class C03_Simetrik_Arrays {
    public static void main(String[] args) {
        //Bir Array'in simetrik olup olmadığını kontrol eden bir method yazınız.
        int[] arr = {1, 2, 3, 3, 2, 1};
        System.out.println("simetrik mi : " + simetrik(arr));

    }
    public static boolean simetrik(int[] arr) {
        boolean sonuc = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {

                sonuc = false;
                break;

            }

        }
        return sonuc;

    }
}


