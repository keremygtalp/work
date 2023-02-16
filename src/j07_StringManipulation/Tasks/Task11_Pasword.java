package j07_StringManipulation.Tasks;

import java.util.Scanner;

public class Task11_Pasword {

    public static void main(String[] args) {

        /*  Task->
		 	Girilen passwordun aşagıdaki şartları sağlamasını kontrol eden coden create ediniz
		 	 a)Ilk karakteri buyuk harf olmalı
		 	 b)Son karakteri sayi olamlı
		 	 c)en az 6 karakter uzunlugunda olmalı

		 */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Password");

        String password = input.nextLine();

        if ((password.charAt(0)>='A' && password.charAt(0)<='Z') && (password.charAt(password.length()-1)>='0') && password.charAt(password.length()-1)<='9'
                && password.length()>=6) {
            System.out.println("Geçerli Password");
        } else System.out.println("tekrar deneyiniz");



//        System.out.println("kod başarılı"); yukarıdaki kod hep aynı sonuçları veriyor neden?

//
//        public static void main(String[] args) {
//
           // Scanner input = new Scanner(System.in);


        }
    }








