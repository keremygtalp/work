package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C03_TernaryOperator {
    public static void main(String[] args) {
        /* ternary ile yapılan tüm aksiyonlar if else ile dde yapılır
        tenary blok kodun daha clean okunabilir ve anlaşılabilir olması için tercih edilir.
        ternary blok içinde karmaşık od yerine daha baasic ve doğrudan sonuç üreten kodlar bulunur.

        1) Kullanıcıdan alınan bir tamsayı 10’dan küçükse “Rakam”, 100’den küçükse “İki basamaklı sayı” değilse
“Üç basamaklı veya daha büyük sayı” print ediniz.
2) Kullanıcıdan alınan harf küçük harf ise konsola “Küçük Harf”, büyük harfse konsola ‘’Büyük Harf’’ yoksa
‘’Girdiğiniz karakter harf değil’’ print ediniz.

         */

        Scanner input = new Scanner(System.in);
//        System.out.print("sayı gir");
//        int sayi1 = input.nextInt();
//
//        String sonuc= (sayi1<10? "rakam" : "iki basamaklı");
//        System.out.println("sonuc: " + sonuc);

// girilen bir sayının tek çift olmasını kontrol ediniz


//        System.out.print("sayı gir");
//        int sayi2 = input.nextInt();
//        if (sayi2%2==0) {
//            System.out.println("sayı çift");
//        } else System.out.println("sayı tek");
//
//    String sonuc = (sayi2%2==0? "çift" : "tek");
//      //  System.out.println(sonuc);

/*
ternary operatör aksiyon sonucu true veya false sonucuna göre çıktı veriri. eger bu çıktı data type na göre bir
variable atanmazsa CTE hatası verir .çözüm olarak ya prınt komuta alınmalı ya da veriable ye atanmalı.
 */

// task girilen bir sayının pozitif negatif olmasını kontrol eden code yaz

//        System.out.print("sayı gir");
//        int sayi3 = input.nextInt();
//
//        String sonuc = ((sayi3 < 0 ? "POSITIVE" : "POSITIVE DEĞİL"));
//        System.out.println("sonuc: " + sonuc);


        // girilen iki tam sayının büyüğünü prnt eden code yaz

        System.out.println(" TASK 3 ÇÖZÜMÜ");
        System.out.println("sayı gir");
        int sayi1 = input.nextInt();
        System.out.println("bir sayı daha giriniz");
        int sayi2 = input.nextInt();

//        System.out.println("büyük sayı :" +(sayi4 < sayi5 ? sayi5 : sayi4));


        //girilen iki tam sayının işaretleri farklı ise toplamını, değilse devam yazan bir kod yazınız.

        Object deger = (((sayi1 < 0 && sayi2 > 0) || (sayi1 > 0 && sayi2 < 0) ? sayi1 + sayi2 : "devam"));
        System.out.println(deger);

        // Java classların hepsini kapsayan (parent)Object Classdır
    }


}
