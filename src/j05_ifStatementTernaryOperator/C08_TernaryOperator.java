package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C08_TernaryOperator {
    public static void main(String[] args) {


        //Task-> Girilen  ürün miktarını ve ürünün birim fiyatını için
        // Eğer urun miktarı 100 den fazla ise
         //       %33  indirim yapıp  ödemesi gereken toplam miktarı print eden code create ediniz.

        Scanner input = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int urunMiktar = input.nextInt();
        int fiyat = input.nextInt();

        System.out.println(urunMiktar > 100 ? (fiyat - (fiyat * 0.33)) : (urunMiktar*fiyat));


    }
}
