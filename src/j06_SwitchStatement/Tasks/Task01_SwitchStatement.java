package j06_SwitchStatement.Tasks;

import java.util.Scanner;

public class Task01_SwitchStatement {

    public static void main(String[] args) {

        //Task->  Girilen bir tamsayının onlar basamağının harf karakteri ile  print eden code create ediniz.


        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi =");
        int sayi = oku.nextInt();

        int onlarBasamagi = (sayi / 10) % 10; // 123/10=12,3 integer bie sayı olduğundan java bize 12 yi verir. 12 nin
        // 12 nin % 10 yaptığımızda kalan sayı bize onlar basamağını verir

        switch (onlarBasamagi) {

            case 0:
                System.out.println("Onlar 0");
                break;
            case 1:
                System.out.println("Onlar 1");
                break;
            case 2:
                System.out.println("Onlar 2");
                break;
            case 3:
                System.out.println("Onlar 3");
                break;
            case 4:
                System.out.println("Onlar 4");
                break;
            case 5:
                System.out.println("Onlar 5");
                break;
            case 6:
                System.out.println("Onlar 6");
                break;
            case 7:
                System.out.println("Onlar 7");
                break;
            case 8:
                System.out.println("Onlar 8");
                break;
            case 9:
                System.out.println("Onlar 9");
                break;

            default:
                System.out.println("hatalı giriş");

        }

        System.out.println("KOD BAŞARILI");

    }
}
