package j10_MethodCreation.j.methodTasks;

import java.util.Scanner;

import static j10_MethodCreation.j.C04_ATMgirisPanel.girisEkranı;

public class Task15_UcusProject01 {
    static Scanner input = new Scanner(System.in);//gunes eyledim
    /*
    A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
    Bilet tarifesi:
    km birim fiyati : 0.10$
    yolcu 12 yasindan kucukse toplam fiyata %50 indirim,
    12 ve 24 yas arasindaysa 10% indirim,
    65 yasindan buyukse 30% indirim,
    bilet gidis donus alinirrsa 20% indirim uygulayan bir app create ediniz
     */


    public static void main(String[] args) {

        biletAl();

    }


    private static void biletAl() {

        System.out.println("Hoşgeldiniz");
        System.out.println("Gitmek istediğiniz şehri seçiniz:\n B şehri için--> b\n C şehri için--> c\n D şehri için-->d ye basınız");
        String sehirSec = input.nextLine().toLowerCase();
        System.out.println("Lütfen Yaşınızı Giriniz");
        int yas = input.nextInt();
        System.out.println("Gidiş Dönüş Tercihiniz" + " E " + " H ");
        char tercih = input.next().toUpperCase().charAt(0);

        double bSehri = 500;
        double cSehri = 700;
        double dSehri = 900;

        switch (sehirSec) {

            case "b":
                if (tercih == 'E' && yas < 12) {
                    double biletFiyatı = ((bSehri * 0.10) - (((bSehri * 0.10) * 0.50) + (bSehri * 0.10) * 0.20));
                    System.out.println(biletFiyatı + "$");
                } else if (tercih == 'E' && yas > 12 && yas <= 24) {
                    double biletFiyatı = ((bSehri * 0.10) - (((bSehri * 0.10) * 0.10) + (bSehri * 0.10) * 0.20));
                    System.out.println(biletFiyatı + "$");
                } else if (tercih == 'E' && yas >= 65) {
                    double biletFiyatı = ((bSehri * 0.10) - (((bSehri * 0.10) * 0.30) + (bSehri * 0.10) * 0.20));
                    System.out.println(biletFiyatı + "$");
                } else if (tercih == 'E') {
                    double biletFiyatı = ((bSehri * 0.10) - ((bSehri * 0.10) * 0.20));
                    System.out.println(biletFiyatı + "$");
                } else if (tercih == 'H' && yas < 12) {
                    double biletFiyatı = (bSehri * 0.10) - ((bSehri * 0.10) * 0.50);
                    System.out.println(biletFiyatı + "$");
                } else if (tercih == 'H' && yas > 12 && yas <= 24) {
                    double biletFiyatı = (bSehri * 0.10) - ((bSehri * 0.10) * 0.10);
                    System.out.println(biletFiyatı + "$");
                } else if (tercih == 'H' && yas >= 65) {
                    double biletFiyatı = (bSehri * 0.10) - ((bSehri * 0.10) * 0.30);
                    System.out.println(biletFiyatı + "$");
                } else if (tercih == 'H') {
                    double biletFiyatı = (bSehri * 0.10);
                    System.out.println(biletFiyatı + "$");
                }
                System.out.println("kod başarılı");

                break;

            case "c":

                if (tercih == 'E' && yas < 12) {
                    double biletFiyatı = ((cSehri * 0.10) - (((cSehri * 0.10) * 0.50) + (cSehri * 0.10) * 0.20));
                    System.out.println(biletFiyatı + "$");
                } else if (tercih == 'E' && yas > 12 && yas <= 24) {
                    double biletFiyatı = ((cSehri * 0.10) - (((cSehri * 0.10) * 0.10) + (cSehri * 0.10) * 0.20));
                    System.out.println(biletFiyatı + "$");
                } else if (tercih == 'E' && yas >= 65) {
                    double biletFiyatı = ((cSehri * 0.10) - (((cSehri * 0.10) * 0.30) + (cSehri * 0.10) * 0.20));
                    System.out.println(biletFiyatı + "$");
                } else if (tercih == 'E') {
                    double biletFiyatı = ((cSehri * 0.10) - ((cSehri * 0.10) * 0.20));
                    System.out.println(biletFiyatı + "$");
                } else if (tercih == 'H' && yas < 12) {
                    double biletFiyatı = (cSehri * 0.10) - ((cSehri * 0.10) * 0.50);
                    System.out.println(biletFiyatı + "$");
                } else if (tercih == 'H' && yas > 12 && yas <= 24) {
                    double biletFiyatı = (cSehri * 0.10) - ((cSehri * 0.10) * 0.10);
                    System.out.println(biletFiyatı + "$");
                } else if (tercih == 'H' && yas >= 65) {
                    double biletFiyatı = (cSehri * 0.10) - ((cSehri * 0.10) * 0.30);
                    System.out.println(biletFiyatı + "$");
                } else if (tercih == 'H') {
                    double biletFiyatı = (cSehri * 0.10);
                    System.out.println(biletFiyatı + "$");
                }
                System.out.println("kod başarılı");
                break;
            case "d":
                if (tercih == 'E' && yas < 12) {
                    double biletFiyatı = ((dSehri * 0.10) - (((dSehri * 0.10) * 0.50) + (dSehri * 0.10) * 0.20));
                    System.out.println(biletFiyatı + "$");
                } else if (tercih == 'E' && yas > 12 && yas <= 24) {
                    double biletFiyatı = ((dSehri * 0.10) - (((dSehri * 0.10) * 0.10) + (dSehri * 0.10) * 0.20));
                    System.out.println(biletFiyatı + "$");
                } else if (tercih == 'E' && yas >= 65) {
                    double biletFiyatı = ((dSehri * 0.10) - (((dSehri * 0.10) * 0.30) + (dSehri * 0.10) * 0.20));
                    System.out.println(biletFiyatı + "$");
                } else if (tercih == 'E') {
                    double biletFiyatı = ((dSehri * 0.10) - ((dSehri * 0.10) * 0.20));
                    System.out.println(biletFiyatı + "$");
                } else if (tercih == 'H' && yas < 12) {
                    double biletFiyatı = (dSehri * 0.10) - ((dSehri * 0.10) * 0.50);
                    System.out.println(biletFiyatı + "$");
                } else if (tercih == 'H' && yas > 12 && yas <= 24) {
                    double biletFiyatı = (dSehri * 0.10) - ((dSehri * 0.10) * 0.10);
                    System.out.println(biletFiyatı + "$");
                } else if (tercih == 'H' && yas >= 65) {
                    double biletFiyatı = (dSehri * 0.10) - ((dSehri * 0.10) * 0.30);
                    System.out.println(biletFiyatı + "$");
                } else if (tercih == 'H') {
                    double biletFiyatı = (dSehri * 0.10);
                    System.out.println(biletFiyatı + "$");
                }
                System.out.println("kod başarılı");
                break;
            default:
                System.out.println("hatalı giriş");
        }

    }


}



