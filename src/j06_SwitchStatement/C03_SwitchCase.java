package j06_SwitchStatement;

import java.util.Scanner;

public class C03_SwitchCase {

    public static void main(String[] args) {


        // Task girilen ay numarasına göre kaç gün çektiğini prınt eden kod



        Scanner input = new Scanner(System.in);
        System.out.println("Hangi Ay");
        int ayKacGün = input.nextInt();

        switch (ayKacGün) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:

                System.out.println("Girilen Ay 31 gün");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Girilen Ay 30 gün");
                break;
            case 2:
                System.out.print ("Yıl giriniz");
                int yil = input.nextInt();
                if (yil % 4 == 0) {
                    System.out.println("girilen ayda 29 gün vardır");
                } else System.out.println("girilen ayda 28 gün vardır");
                break;

            default:// hiç bir case çalışmazsa devreye girer switch blokta yeri farketmez
                System.out.println("hatalı giriş");




        }
        System.out.println("kod başarılı");











    }





}
