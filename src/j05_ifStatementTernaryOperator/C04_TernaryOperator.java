package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C04_TernaryOperator {
    public static void main(String[] args) {



        // Task -> girilen bir tamsayının 2 veya daha fazla basamaklı olmasını kontrol eden code create ediniz.


        Scanner input = new Scanner (System.in);
        System.out.println("sayı giriniz");
        int sayi = input.nextInt();

        System.out.println((sayi < 10 && sayi > -10) ? "tek basamaklı" : "en az iki basamaklı");


    }
}
