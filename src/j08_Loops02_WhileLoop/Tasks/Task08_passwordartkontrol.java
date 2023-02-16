package j08_Loops02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task08_passwordartkontrol {
    public static void main(String[] args) {
        // task-> girilen şifrenin asagidaki sartlari kontrol edin
        // ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" print edin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali

        System.out.print("Şifrenizi giriniz: ");
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();
        char ilkharf = password.charAt(0);
        char sonharf = password.charAt(password.length() - 1);


        while ((!((ilkharf >= 'a') && (ilkharf <= 'z')))
                || (!((sonharf >= '0') && (sonharf <= '9'))) ||
                ((password.contains(" "))) || ((password.length() < 10))) {


            if (!((ilkharf >= 'a') && (ilkharf <= 'z'))) {
                System.out.println("İlk karakter küçük harf olmalı");
            }
            if (!((sonharf >= '0') && (sonharf <= '9'))) {
                System.out.println("Son karakteriniz sayı  olmalı");
            }
            if (password.contains(" ")) {
                System.out.println("Şifreniz  bosluk icermemeli");
            }
            if (password.length() < 10) {
                System.out.println("Şifrenizin  en az 10 karakter olmalı");
            }
            System.out.print("Şifrenizi tekrar giriniz: ");
            password = input.nextLine();
            ilkharf = password.charAt(0);
            sonharf = password.charAt(password.length() - 1);

        }
        System.out.println("Şifre basariyla kaydedildi");


    }

}




