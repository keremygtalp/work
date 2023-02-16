package j07_StringManipulation.Tasks;

import java.util.Scanner;

public class Task_24_sonKrkterSilenKod {

    public static void main(String[] args) {



             /* Task->
        Girilen Stringin son karakterini silen  code create ediniz..
         */

        Scanner input = new Scanner(System.in);

        System.out.println("veri gir");
        String str = input.nextLine();

        System.out.println("son karakter silinmiş str = " + str.substring(0, str.length() - 1));
    }

}

