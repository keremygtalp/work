package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task11_ArtıkYıl {
    public static void main(String[] args) {
        /* Task->
           girilen bir yılın artık (LEAP YEAR) (artık yıl) olmasını kontrol eden code create ediniz..
            artık yıl:
            Kural1: 4 ile bölünemeyen yıllar artık yıl değildir. yani 4 e tam bölünmeli.
            Kural2: 4 ile bölünüp 100 ile bölünemeyen yıllar artık yıldır. yani 100 e tam bölünmeyecek
            Kural3: 4’ün katı olmasına rağmen 100 ile bölünebilen yıllardan sadece  400’ün katı olan yıllar artık yıldır.
            yani 100 e bölünemeyecek eğer bölünecekse 400 ün katı olacak.

         */

        Scanner input = new Scanner (System.in);
        System.out.println("yıl değeri gir");
        int yıl = input.nextInt();

        if (yıl %4==0 && (yıl %100!=0 || yıl%400==0 )) {
            System.out.println("artık yıl");
}

















//             kural 1     kural 2       kural 3
//        if (yıl %4==0 && (yıl %100!=0 || yıl%400==0 )){
//            System.out.println("LEAP YIL");
//        }
//        else System.out.println("NOT LEAP YIL");
//
//                      if ise şart
//        String yil = ((yıl %4==0 && (yıl %100!=0 || yıl%400==0 )? "true" : "false"));
//        System.out.println(yil);
    }













    }

