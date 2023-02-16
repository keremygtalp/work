package j08_Loops03_doWhileLoop;

import java.util.Scanner;

public class C02_doWhileLoop {
    public static void main(String[] args) {

        //task girilen sayı 13 den küçük ise "olaaa kazandınız"
        // değilse sayı girişi isteyen kod create ediniz.


        Scanner scanner = new Scanner(System.in);
        int sayi = 0;

        do {
            System.out.println("sayı giriniz");
            sayi = scanner.nextInt(); // sayı değeri kullanıcıdan değeri atandı

        } while (sayi > 13);

        System.out.println(sayi + " " + "olaaa kazandınız");
    }
}
