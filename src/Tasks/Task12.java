package Tasks;

import java.util.Scanner;

public class Task12 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {

        /*
Task-> girilen meyılın doğrulugunu aşağıdaki şartlarda  control eden METHOD create ediniz.
1- @ karakteri olmalı
2- . (nokta) karakteri olmalı
3- @ karakterinden önce mutlaka en az bir karakter olmalı.
Example:
"@gmail.com"-> false
"@gmailcom"-> false
"gmail.com"-> false
"ebıkGabık@gmail.com"-> true
         */


         mailKontrol1 ();
         mailKontrol2("ebikGabık@gmail.com");
         mailKontrol3 ();


    }

    private static String mailKontrol3() {
        System.out.println("email giriniz");
        String email = input.nextLine();

        return (email.contains("@") && email.contains(".") && email.charAt(0) != '@') ? "mail başarılı" : "BAŞARISIZ";


    }

    private static void mailKontrol2(String email) {
        System.out.println((email.contains("@") && email.contains(".") && email.charAt(0) != '@') ? "mail başarılı" : "BAŞARISIZ");

    }

    private static void mailKontrol1 () {

        System.out.println("email giriniz");
        String email = input.nextLine();

        System.out.println((email.contains("@") && email.contains(".") && email.charAt(0) != '@') ? "mail başarılı" : "BAŞARISIZ");

    }
}
