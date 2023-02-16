package j10_MethodCreation.j.methodTasks;

import java.util.Scanner;

public class Task14_MesaiHsplama {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile


    public static void main(String[] args) {


    /* task->
    Fazla mesaiyi hesaplayan ve toplam kazancı return eden method create ediniz


    Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve
    fazla mesaiye kalırsa kazancını kaç ile katlayacağını alalım.

    Örnek :
    saatlik çalışma ücreti : 40.0
   iş başı saati : 9.0
    paydos saati : 20.0
    fazla mesaiyi saat ücreti çarpanı: 1.8

    ucretHesapla(9.0,20.0,40.0,1.8);

    9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
    17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216

    toplam = 536.0
    */

        mesaiHesapla();


    }

    private static void mesaiHesapla() {

        System.out.println("İşe Başlama saatinizi giriniz");
        double isBasiSaati = input.nextDouble();

        System.out.println("paydos saatinizi giriniz");
        double paydosSaati = input.nextDouble();

        System.out.println("Saatlik Ücreti Giriniz");
        double saatlikUcret = input.nextDouble();
        double normalUcret = ((17 - paydosSaati) * saatlikUcret);
        double fazlaMesai = (17.0 - isBasiSaati) * (saatlikUcret) + (paydosSaati - 17.0) * (saatlikUcret) * 1.8;


        if (paydosSaati <= 17) {
            System.out.println("Normal Mesai Ücretiniz = " + normalUcret);

        } else if (paydosSaati > 17) {
            System.out.println(fazlaMesai);
        }


    }


}
//System.out.print("saatlik çalışma ücreti : ");
//        double saatlikucret = scan.nextDouble();

//        System.out.print("iş başı saati : ");
//        double baslamsaati = scan.nextDouble();

//        System.out.print("paydos saati : ");
//        double paydossaati = scan.nextDouble();

//        if (paydossaati <= 17.0) {
//        double ucret = (paydossaati - baslamsaati) * saatlikucret;
//        System.out.print("Normal Mesai Ücretiniz " + ucret);
//        } else if (paydossaati > 17.0) {
//        double fazlamesai = (17.0 - baslamsaati) * (saatlikucret) + (paydossaati - 17.0) * (saatlikucret) * 1.8;
//        System.out.print("Fazla Mesai ile Beraber ücretiniz " + fazlamesai);
//        }