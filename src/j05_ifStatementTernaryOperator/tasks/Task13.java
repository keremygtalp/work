package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        /*
          TASK -> girilen iki sayiyi seçilen dört işlemden birine uygulayıp sonucu print eden code crate ediniz

         */

        Scanner input = new Scanner (System.in);
        System.out.print ("Sayı giriniz: ");
        int a = input.nextInt();
        System.out.print ("Sayı giriniz: ");
        int b = input.nextInt();
        System.out.println("Yapmak istediğiniz işlemi seçiniz");
        //System.out.println ("Toplama için"+ " " + "1" + " " +   "Çıkarma İçin" + " " + "2" + " " + "Çarpma için" + " " +"3" + " " + "Bölme için" + " " + "4");
        System.out.println (" Toplama için 1\n çıkarma için 2\n çarpma için 3\n bölme için 4");
        int c = input.nextInt();
        if (c == 1) {
            System.out.println("Toplama işleminin sonucu :" +(a+b));}
        else if (c == 2) {
            System.out.println("Çıkarma işleminin sonucu :" + (a-b));}
        else if (c == 3) {
            System.out.println("Çarpma işleminin sonucu :" + (a*b));
        }
        else if (c == 4) {
            System.out.println("Çarpma işleminin sonucu :" + (a/b));
        } else System.out.println("geçerli bir işlem numarası giriniz");

    }
}






