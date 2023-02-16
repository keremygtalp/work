package j09_Break_Contınue;

import java.util.Scanner;

public class C03_AsalKontrol {
    public static void main(String[] args) {

        //task-> girilen tamsayının asal olmasını kontrol eden code create ediniz
        //asal tamsayı: 1 ve kendisinden başka tam böleni olmayan sayılar->asil bölünemeyen sayı
        // İNTERVİEW SORUSU**********************************

        Scanner input = new Scanner(System.in);
        System.out.println("herhangi bir sayı giriniz");
        int sayi = input.nextInt(); // kullanıcınnın girdiği sayı.

        boolean asalMi = true;  // bayrak gibi düşün.

        for (int i = 2; i < sayi; i++) { // girilen sayı tekrarı.
            if (sayi%i==0)  { //döngüdeki herbir tekrara girilen sayıyı tam bölme şartı.

                asalMi = false; // bölen sayı bulunduğu için asallık false atandı.
                break;
            }

        }
        if (asalMi) {
            System.out.println("sayı ASAL");
        } else System.out.println("ASAL DEĞİL");

    }
}
