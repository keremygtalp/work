package j08_Loops01_ForLoop.Tasklar;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {

    /*  task-> bir string içindeki tüm karakterleri enn fazla bir kere print eden create ediniz.
    test data:
    input: "aabbbcccccddddaaaa"
    output: abcd
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir string giriniz");
        String str = input.nextLine(); // "aabbbcccccddddaaaa"
        String cıktı  = ""; // işleme etki etmeyecek boş kutu tanımlandı.


        for (int i = 0; i <= str.length()-1; i++) {
            if (!cıktı.contains(str.substring(i, i+1))) { //str den ardışık parça  çıktıda yoksa şartı.
               // cıktı+=str.substring(i); // kutuda olmayan eleman kutuya eklendi.
                cıktı+=str.charAt(i); // kutuda olmayan eleman kutuya eklendi.
            }
        }
        System.out.println("cıktı = " + cıktı);


    }
}
