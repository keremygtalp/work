package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {
        /*
          TASK -> Kullanıcının ehliyetinin varlığını kontrol ediniz.
          Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve üzeri ise kontak anahtarını veriniz
          aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create ediniz


         */

        Scanner input = new Scanner (System.in);

        System.out.print("Ehliyetiniz Varsa E, Yoksa H giriniz");
        char ehlyt = input.nextLine().charAt(0);

        if (ehlyt == 'E' || ehlyt== 'e') {
            System.out.println("kaç yıllık şöförsün");
            int tecrb = input.nextInt();
            if (tecrb>=7) {
                System.out.println("Kaç km sürdünüz");
                int km = input.nextInt();
                if (km>=100000) {
                    System.out.println("kontak alabilirsin");
                }
                    else System.out.println("kullanmak için  "+(100000-km)+" yolunuz var"); }

                    else System.out.println("kullanmak için  "+(7-tecrb)+" yılınız var"); }

            else if (ehlyt == 'H' || ehlyt== 'h'){
                System.out.println("ARAÇ KULLANAMAZSIN");
            }
            else System.out.println("karakter yanlış");

    }
}

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("agam ehliyetin var ise E yoğğğ ise H giresen : ");
//        //System.out.println("agam ehliyetin var ise 1 yoğğğ ise 0 giresen : ");
//        char ehliyet = input.nextLine().charAt(1);
//        // int ehlyt=input.nextInt();
//
//        if (ehliyet == 'E' || ehliyet == 'e') { //ehliyet var olma şartı
//            System.out.println("agam kac yıllık süfersin :");
//            int tcrbYil = input.nextInt();
//
//            if (tcrbYil >= 7) {//tecrb yil 7 ve üstü şartı
//
//                System.out.println("agam kac km'lik süfersin :");
//                int km = input.nextInt();
//
//                if (km >= 100000) {//km 100000 ve üzeri şartı
//                    System.out.println("agam ayagına daş değmesin KONTAK hayırlı olsun");
//                } else System.out.println("agam kontak alman için daha " + (100000 - km) + " mesafe eksiğin var");
//
//            } else System.out.println("agam kontak alman için daha " + (7 - tcrbYil) + " yıl eksiğin var");
//
//        } else if (ehliyet == 'H' || ehliyet == 'h') {//ehliyet  olmama şartı
//            System.out.println("Alamazsın anağğdarı MAYK :( alırım anahtarını");
//        } else System.out.println("agam gelmiyim ora adam gibi E H gir ");
//
//    }
//}