package j06_SwitchStatement;

import java.util.Scanner;

public class C02_SwitchCase {

    public static void main(String[] args) {

        //task girilen ay numarasına göre ayın ismini yazan kod


        Scanner input = new Scanner(System.in);
        System.out.println("Hangi Ay");
        int aysayi = input.nextInt();


        switch (aysayi) {
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Şubat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayıs");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Ağustos");
                break;
            case 9:
                System.out.println("Eylül");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasım");
                break;
            case 12:
                System.out.println("Aralık");
                break;

            default:// hiç bir case çalışmazsa devreye girer switch blokta yeri farketmez
                System.out.println("Hatalı girdiniz");
        }

        System.out.println("kod başarılı"); // bu komut konsolda görünürse yukarıdaki bloktan çıkmış demektir









    }

}
