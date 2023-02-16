package j08_Loops01_ForLoop.Tasklar;

import java.util.Scanner;

public class Task16 {

    /*
     task-> Girilen sayının asal olmasını kontrol eden code create ediniz.
     * */
    public static void main(String[] args) {


        /*
     task-> Girilen sayının asal olmasını kontrol eden code create ediniz.
     * */


        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz" +
                "  : ");

        int sayi = input.nextInt();
        int bolenSayisi = 0;//boş bir int kutu tanımlandı

        for (int i = 2; i < sayi; i++) {

            if (sayi % i == 0) {
                bolenSayisi++;
            }
        }
        if (bolenSayisi == 0) {
            System.out.println("girirlen sayi ASALdır");
        } else System.out.println("girlen sayı ASAL DEĞİL ");


    }
}
