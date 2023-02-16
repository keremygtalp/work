package j08_Loops01_ForLoop.Tasklar;

import java.util.Scanner;

public class Task26 {

    public static void main(String[] args) {

        /* task -> verilen bir tam  sayının rakamları toplamını print eden code create ediniz.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("agam bir sayi giresen : ");

        int sayi = input.nextInt();

        int rakmToplam = 0; // boş kutu tanımlandı.
                                                    // sayıdan başlayıp her tekrarda basmak sayısı 1 azalan döngü tanımlandı.
        for (int i = sayi; i > 0; i = i / 10)  { // i yi 10 böl sonucu i ye ata demek bu satır

            rakmToplam+= i % 10;

        }
        System.out.println("rakmToplam = " + rakmToplam);

//                         ************** DERS NOTLARI *******************
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("bizim oolann bi sayi gir bakennn : ");
//        int sayi = input.nextInt();
//        int rakToplami = 0;//işleme etki etmeyecek boş kutu tanımlandı
//
//        for (int i = sayi; i > 0; i = i / 10) {//sayında başlayıp her tekrarda basamka syısı bir azalan döngü tanımlandı
//            rakToplami+=i%10;
//        }
//        System.out.println("rakToplami = " + rakToplami);





    }
}
