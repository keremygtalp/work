package j07_StringManipulation;

import java.util.Scanner;

public class C06_Substring {

    public static void main(String[] args) {


/*
substring()
Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
indexi'e kadar parçayı return eder
baslangic indexi ==> inclusive/dahil
bitis indexi ==> exclusive/haric
 */


//
        String str = "Madem geldin dünyaya otur çalış javaya";
        System.out.println(str.substring(10));
        System.out.println(str.substring(10, 17));

// str deki son 10 karakteri prın eden bir kod giriniz

        System.out.println(str.substring(str.length() - 10));
        // str deki ilk 10 karakteri prın eden bir kod giriniz
//
        System.out.println(str.substring(0, 10));// 0,1,2,3 ....9 -->Madem geld
        System.out.println(str.substring(0, 1)); // 0 ->M ilk karakteri alma
        System.out.println(str.substring(str.length() - 1));// son karakteri alma

        // Task  giirilen 4 harfli kelimeyi tersten print eden code create ediniz.


        Scanner input = new Scanner (System.in);
        System.out.println("4 harfli bir kelime giriniz");
        String kelime = input.nextLine();

        char kelime4Hrf = kelime.charAt(3);
        char kelime3Hrf = kelime.charAt(2);
        char kelime2Hrf = kelime.charAt(1);
        char kelime1Hrf = kelime.charAt(0);

        System.out.println(kelime4Hrf + " " + kelime3Hrf + " " + kelime2Hrf + " " + kelime1Hrf);

        System.out.println("kelime = " + kelime.substring(0, 1));
        System.out.println("kelime = " + kelime.substring(1, 2));
        System.out.println("kelime = " + kelime.substring(2, 3));
        System.out.println("kelime = " + kelime.substring(3, 4));

        System.out.println((kelime.substring(3, 4) + kelime.substring(2, 3) + kelime.substring(1, 2) + kelime.substring(0, 1)));


        // *********************** DERS NOTLARI ************************
//
//        /*
//        substring()
//        Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
//        substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
//        substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
//        indexi'e kadar parçayı return eder
//        baslangic indexi ==> inclusive/dahil
//        bitis indexi ==> exclusive/haric
//         */
//​
//        String str = "madem geldin dünyaya otur çalış JAVA'ya :)";
//​
//        System.out.println(str.substring(10));//in dünyaya otur çalış JAVA'ya :)
//        System.out.println(str.substring(10, 17));//in düny
//​
//​
//        // str 'deki son 10 karakteri print eden code create ediniz
//        System.out.println(str.substring(str.length() - 10));//AVA'ya :)
//​
//        // str 'deki ilk 10 karakteri print eden code create ediniz
//        System.out.println(str.substring(0, 10));//0,1,2..9 ->madem geld
//​
//        // str 'deki ilk  karakteri print eden code create ediniz
//        System.out.println(str.substring(0, 1));//0->m
//        // str 'deki son karakteri print eden code create ediniz
//        System.out.println(str.substring(str.length() - 1));// )
//​
//        //task -> girilen 4 harfli kelimeyi tersten print eden code create ediniz. kale -> elak
//
//


    }




}
