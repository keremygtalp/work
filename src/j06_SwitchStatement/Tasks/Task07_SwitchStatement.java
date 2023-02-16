package j06_SwitchStatement.Tasks;

import java.util.Scanner;

public class Task07_SwitchStatement {

    public static void main(String[] args) {

// Task-> Girilen 3 basamaklı bir sayıyı hardf karakteri ile print eden code create ediniz.


        Scanner input = new Scanner(System.in);
        System.out.println("3 basamaklı bir sayı giriniz");
        int number = input.nextInt();

        int birler = (number % 10);
        int onlar = (number / 10) % 10;
        int yuzler = (number / 100) % 10;

        if (number >=100 && number<1000)  {
        switch (yuzler) {
            case 1:
                System.out.println("yüz");
                break;
            case 2:
                System.out.println("ikiyüz");
                break;
            case 3:
                System.out.println("üçyüz");
                break;
            case 4:
                System.out.println("dörtyüz");
                break;
            case 5:
                System.out.println("beşyüz");
                break;
            case 6:
                System.out.println("altıyüz");
                break;
            case 7:
                System.out.println("yediyüz");
                break;
            case 8:
                System.out.println("sekizyüz");
                break;
            case 9:
                System.out.println("dokuzyüz");
                break;
            default:
                System.out.println("yanlış sayı girdiniz");
        }
        switch (onlar) {
            case 1:
                System.out.println("on");
                break;
            case 2:
                System.out.println("yirmi");
                break;
            case 3:
                System.out.println("otuz");
                break;
            case 4:
                System.out.println("kırk");
                break;
            case 5:
                System.out.println("elli");
                break;
            case 6:
                System.out.println("altmış");
                break;
            case 7:
                System.out.println("yetmiş");
                break;
            case 8:
                System.out.println("seksen");
                break;
            case 9:
                System.out.println("doksan");
                break;
            case 0:
                System.out.println("sıfır");
                break;
            default:
                System.out.println("yanlış sayı onlar");
        }
        switch (birler) {
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("üç");
                break;
            case 4:
                System.out.println("dört");
                break;
            case 5:
                System.out.println("beş");
                break;
            case 6:
                System.out.println("altı");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;
            case 0:
                System.out.println("sıfır");
                break;
            default:
                System.out.println("yanlış sayı birler");

        }


    } else System.out.println("sayınız üç basamaklı değil");

    } }




