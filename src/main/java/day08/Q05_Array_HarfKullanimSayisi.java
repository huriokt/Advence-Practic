package day08;

public class Q05_Array_HarfKullanimSayisi {
    public static void main(String[] args) {
        /*Girilen String'de hangi harfin kaç kere kullanıldığını yazan bir kod yazınız.
    Input: String str = "Java is so Good";
    Output: String strOutput = "J1 a2 v1 i1 s2 o3 G1 d1";
     */


        String str = "Java is so GooOOd";
        String arr[] = str.split("");
        String cikti = "";

        int conunter = 0;

        for (String w : arr) {
            int sayac = 0;
            for (String u : arr) {
                if (w.equals(u)) {
                    sayac++;
                }
            }
                if (!cikti.contains(w)) {
                    cikti += w + sayac + " ";
                }

            }


        System.out.println(cikti);
        }




}
