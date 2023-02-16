package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
        /*
          TASK -> girilen bir karakterin harf  olup olmadığını  kontrol eden code create ediniz..

         */

        Scanner input = new Scanner (System.in);
        System.out.print("bir karakter giriniz: ");
        char ch = input.next().charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("karakter bir harftir");
        } else System.out.println("karakter bir harf DEĞİLDİR");
















    }
}
