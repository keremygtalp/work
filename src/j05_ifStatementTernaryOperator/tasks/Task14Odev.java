package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task14Odev {

    public static void main(String[] args) {
        /*
          TASK -> kullanıcının cinsiyeti KADIN ise 60 yasından buyuk ve prim gunu 6000 den  fazla ise emekliliğini
                kullanıcının cinsiyeti ERKEK ise 65 yasından buyuk ve prim gunu 7000 den  fazla ise emekliliğini
                kontrol edip kalan yıl ve prim gununu print eden code create ediniz...

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz");

        String cinsiyet = input.next();
        if (cinsiyet.equals("kadın")) {
            System.out.println("Yaşınızı giriniz");
            int yas = input.nextInt();

            if (yas > 60) {
                System.out.println("Prim gününüzü giriniz");
               int primGunu = input.nextInt();

                if (primGunu > 6000) {
                    System.out.println("EMEKLİ OLABİLİRSİNİZ");
                } else System.out.println("Emekliliğinize " + (6000 - primGunu) + " gününüz var ");
            } else System.out.println("Emekliliğinize " + (60 - yas ) + " yılınız var ");

        }


        if (cinsiyet.equals("erkek")) {
            System.out.println("Yaşınızı giriniz");
            int yas = input.nextInt();

            if (yas > 60) {
                System.out.println("Prim gününüzü giriniz");
                int primGunu = input.nextInt();

                if (primGunu > 6000) {
                    System.out.println("EMEKLİ OLABİLİRSİNİZ");
                } else System.out.println("Emekliliğinize " + (6000 - primGunu) + " gününüz var ");
            } else System.out.println("Emekliliğinize " + (60 - yas ) + " yılınız var ");

        }

    }
}
