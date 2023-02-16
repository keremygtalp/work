package j06_SwitchStatement.Tasks;

import java.util.Scanner;

public class Task04_SwitchStatement {

    public static void main(String[] args) {
/*
        Task-> Girilen ay simine göre   ayin kac cektigini print eden code create ediniz.
                */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir ay ismi giriniz");
        String ay = scan.next().toLowerCase();

        switch (ay) {

            case "ocak":
            case "mart":
            case "mayıs":
            case "temmuz":
            case "ağustos":
            case "ekim":
            case "aralık":
                System.out.println("Girilen ayda 31 gün vardır");
                break;
            case "nisan":

            case "haziran":
            case "eylül":
            case "kasım":
                System.out.println("Girilen ayda 30 gün vardır");
                break;
            case "şubat":
                System.out.println("Hangi Yıl");
                int yil = scan.nextInt();
                if (yil % 4 == 0) {
                    System.out.println("Girilen ayda 29 gün vardır");
                } else System.out.println("Girilen ayda 28 gün vardır");
                break;
            default:
                System.out.println("hatalı  bir ay ismi girdiniz!!!");
        }
            {

            }
        }
    }





