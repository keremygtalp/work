package Tasks;

import java.util.Scanner;

public class Task06 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
/*

    Task girilen iki boyuta göre seçilen geometrik şeklin alan ve çevre değerlerini prınt eden METHOD prınt ediniz.

     */

      geometrikHesapla();




    } // main sonu

    private static void geometrikHesapla() {

        System.out.print("1. sayıyı giriniz : ");
        double sayi1 = input.nextDouble();
        System.out.print("2. sayıyı giriniz : ");
        double sayi2 = input.nextDouble();

        System.out.println("geometrik seçiminizi giriniz");

        String geoSekil = input.next().toLowerCase();

        switch (geoSekil) {

            case "kare":

                kareAlanHesapla (sayi1);
                kareCevreHesapla (sayi1);
                break;

            case "ucgen":

                ucgenAlanHesapla (sayi1);
                ucgenCevreHesapla (sayi1, sayi2);
                break;

            case "dıkdortgen":

                dıkdortgenAlanHesapla (sayi1, sayi2);
                dıkdortgenCevreHesapla (sayi1, sayi2);
                break;

            default:
                System.out.println("hatalı giriş");

        }


    }

    private static void ucgenCevreHesapla(double sayi1, double sayi2) {
        System.out.print("ucuncu kenar giriniz:");
        double kenar =  input.nextDouble();
        System.out.println("üçgenin alanı:" + (sayi1+sayi2+kenar));
    }

    private static void ucgenAlanHesapla(double sayi1) {
        System.out.print("yükseklik giriniz:");
        double yukseklik =  input.nextDouble();
        System.out.println("üçgenin alanı:" + (sayi1*yukseklik)/2);


    }

    private static void dıkdortgenCevreHesapla(double sayi1, double sayi2) {
        System.out.println("dıkdortgen çevresi:" + (sayi1+sayi2)*2);
    }

    private static void dıkdortgenAlanHesapla(double sayi1, double sayi2) {
        System.out.println("dıkdortgen alanı:" + (sayi1*sayi2));
    }

    private static void kareCevreHesapla(double sayi1) {
        System.out.println("karenin cevresi:" + (sayi1*4));

    }

    private static void kareAlanHesapla(double sayi1) {

            System.out.println("karenin alanı:" + (sayi1*sayi1));
        }

    public static class Task07 {
        static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

        public static void main(String[] args) {
            //Task-> Girilen 3  sayıdan en küçüğünü print eden METHOD  create ediniz

           // enKucukBul();
            double okulUcuncusu=enKucukBul1();
            System.out.println("okulUcuncusu = " + okulUcuncusu);


        }//main sonu

        private static double enKucukBul1() {
            System.out.print("1. sayıyı giriniz : ");
            double sayi1 = input.nextDouble();
            System.out.print("2. sayıyı giriniz : ");
            double sayi2 = input.nextDouble();
            System.out.print("3. sayıyı giriniz : ");
            double sayi3 = input.nextDouble();

         return   sayi1 < sayi2 ? (sayi1 < sayi3 ? (sayi1) : (sayi3)) : (sayi2 < sayi3 ? (sayi2) : (sayi3));
        }

      // private static void enKucukBul() {
      //     System.out.print("1. sayıyı giriniz : ");
      //     double sayi1 = input.nextDouble();
      //     System.out.print("2. sayıyı giriniz : ");
      //     double sayi2 = input.nextDouble();
      //     System.out.print("3. sayıyı giriniz : ");
      //     double sayi3 = input.nextDouble();

      //     System.out.println(sayi1 < sayi2 ? (sayi1 < sayi3 ? (sayi1) : (sayi3)) : (sayi2 < sayi3 ? (sayi2) : (sayi3)));
      // }


    }
}



