package j08_Loops01_ForLoop.Tasklar;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {

    /*  task-> girilen Stringin tersini  (reverse String) print eden kod yaz
     */
        Scanner input = new Scanner(System.in);
        System.out.println("Bir string giriniz");
        String str = input.nextLine();

        for (int i = str.length() - 1; i >= 0; i--) {// strnin son karakterinden 0. karaktere bir tekrar tanımlandı
            System.out.print(str.charAt(i));
        }
        System.out.println("   ***   ");

        for (int i = 0; i <= str.length() - 1; i++) {// strnin son karakterinden 0. karaktere bir tekrar tanımlandı
            System.out.print(str.charAt(str.length() - 1 - i));
        }





    }
}
