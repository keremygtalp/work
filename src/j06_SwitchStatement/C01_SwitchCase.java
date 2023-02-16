package j06_SwitchStatement;

import java.util.Scanner;

public class C01_SwitchCase {

    public static void main(String[] args) {

/*
         Switch (anahtar)-Case yapısı  if statement'e benzer action alır.
    Çok sayida if statement bloklari code okunabilirliği ve clean code olarak tavsiye edilmez.
    Bir app actionda sabit bir degeri çoklu durum ile karsilastirmak için switch-case blok kullanılır.
    Switch-case blok'da  degiskene göre bir çok durumdan değişkene uyan durum gerçeklesir.
    if statement blok ile  switch-case blok birlikte tanımlanabilir.
    çoklu koşul içeren durumlarda switch-case blok if statement'e göre app. hızı açısından daha avantajlıdır.(Best Practice)
    Switch-Case ile if statement arasında önemli bir performans farklılığı yoktur.

      ahan da CISSS TRICK-> Switch Statement'de long,double,float ve boolean asla KULLANILMAZZZ..
      Switch de sadece int, byte, short, char, String data type  kullanilabilir
      Eger 3 den fazla durum varsa switch() tercih edilir.
 */

//task -> verilen bir rakamın harf karakterleri  ile print eden kod create ediniz.

        Scanner input = new Scanner(System.in);
        System.out.println("    if çözümü     ");

        System.out.println("sayı giriniz");

                int sayi = input.nextInt();
                if (sayi== 0) {
                    System.out.println("sayı sıfır");
                }else if (sayi == 1) {
                    System.out.println("sayı bir");
                }else if (sayi == 2) {
                    System.out.println("sayı iki");
                }else if (sayi == 3) {
                    System.out.println("sayı üç");
                }else if (sayi == 4) {
                    System.out.println("sayı dört");
                }else if (sayi == 5) {
                    System.out.println("sayı beş");
                }else if (sayi == 6) {
                    System.out.println("sayı altı");
                }else if (sayi == 7) {
                    System.out.println("sayı yedi");
                }else if (sayi == 8) {
                    System.out.println("sayı sekiz");
                }else if (sayi == 9) {
                    System.out.println("sayı dokuz");}
                else System.out.println("düzgün bir sayı giriniz");

                System.out.println("*** switch   ***");

                switch (sayi) {

                    case 0:
                        System.out.println("sayı sıfır");
                        break;// bu kod bloğu bu komuttan sonra kırılır, bloktan sonraki satır run edilir
                    case 1:
                        System.out.println("sayı bir");
                        break;
                    case 2:
                        System.out.println("sayı iki");
                        break;
                    case 3:
                        System.out.println("sayı üç");
                        break;
                    case 4:
                        System.out.println("sayı dört");
                        break;
                    case 5:
                        System.out.println("sayı beş");
                        break;
                    case 6:
                        System.out.println("sayı altı");
                        break;
                    case 7:
                        System.out.println("sayı yedi");
                        break;
                    case 8:
                        System.out.println("sayı sekiz");
                        break;
                    case 9:
                        System.out.println("sayı dokuz");
                        break;
                        default: // hiç bir case çalışmazsa devreye girer switch blokta yeri farketmez
                            System.out.println("hatalı giriş");

                }
                System.out.println("kod başarılı");
















    }
}
