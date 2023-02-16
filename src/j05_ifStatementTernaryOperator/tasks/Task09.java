package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {
        /*
        Task01
           girilen bir sayının negatif ve pozitifliğini kontrol eden code create ediniz..
         */

        Scanner input = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayi = input.nextInt();

        System.out.println(sayi < 0 ? "negatif" : "pozitif");


    }
}
