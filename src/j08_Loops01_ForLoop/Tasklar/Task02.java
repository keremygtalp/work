package j08_Loops01_ForLoop.Tasklar;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /* task-> interview question

        girilen ifadenin polindrome olmasını kontrol eden code create ediniz...
        plindrome:her iki yönde okundugunda eşit olan ifadeler :ece, ada etc.

         */

        Scanner input = new Scanner(System.in);
        System.out.print("ifade giriniz ");
        String ifade = input.nextLine();


        String str = ifade;
        String tersStr = "";

        int strLength = str.length();

        for (int i = (strLength - 1); i >=0; --i) {
            System.out.println(tersStr = tersStr + str.charAt(i));

        }

        if (str.toLowerCase().equals(tersStr.toLowerCase())) {
            System.out.println(str + " Palindrome ifade");
        }
        else {
            System.out.println(str + " Palindrome ifade değil");


    }


}}
