package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C06_NestedTernaryOperator {

    public static void main(String[] args) {

         /*
 TASK :
Girilen sayi 0 dan buyuk esit ise 10 dan kucukluğunu kontrol ediniz.
10 dan kucuk ise  "Rakam" degilse "Pozitif Sayi" ,
Sayi 0'dan kucuk ise  "Negatif Sayi" print eden code create ediniz
 */

        Scanner input = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayi = input.nextInt();

        System.out.println(sayi >= 0 ? (sayi < 10 ? "Rakam" : "Pozitif Sayı") : "Negatif Sayi");



        // ne kadar ? varsa o kadar : olmak zorunda
        // JAVA da nested bloklar app. run edildiğnde yavaşlatır uygulamayı. dolayısıyla nested bloklar
        //çok tercih edlmez.

        /*
    show business Trick-> Java'da "nested" blok'lar app. run edildiğinde app. yavaşlatır
    (Time Complexity), dolayısyle "nested" blok'lar mecbur kalmadıkça tercih edilmez.
        */

        /*
      TASK :
       Girilen bir pozitif tamsayı  4 basamaklı ise  "4 Basamaklı"
      degilse çift olup olmadigini kontrol edip. Çift ise "4 basamaklı olmayan çift sayı"
      degilse "4 basamaklı olmayan tek sayı"  print eden code create ediniz.

       */









    }
}
