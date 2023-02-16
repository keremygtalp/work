package j06_SwitchStatement;

import java.util.Scanner;

public class C04_SwitchCase {

    public static void main(String[] args) {


        // Task girilen ay numarasına göre hangi mevsimini prınt eden kod create ediniz



        Scanner input = new Scanner(System.in);
        System.out.println("Hangi Ay");
        int aygir = input.nextInt();

        switch (aygir) {
            case 12:
            case 1:
            case 2:


                System.out.println("Girilen Ay Kış Mevsimine Ait");
                break;
            case 3:
            case 4:
            case 5:

                System.out.println("Girilen Ay İlkbahar Mevsimine Ait");
                break;
            case 6:
            case 7:
            case 8:

                System.out.println("Girilen Ay Yaz Mevsimine Ait");
                break;
            case 9:
            case 10:
            case 11:

                System.out.println("Girilen Ay Sonbahar Mevsimine Ait");
                break;

            default:// hiç bir case çalışmazsa devreye girer switch blokta yeri farketmez
                System.out.println("hatalı giriş");




        }
        System.out.println("kod başarılı");











    }





}
