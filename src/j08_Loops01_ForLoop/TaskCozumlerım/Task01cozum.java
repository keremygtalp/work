package j08_Loops01_ForLoop.TaskCozumlerım;

import java.util.Scanner;

public class Task01cozum {
    public static void main(String[] args) {
/*
       Interview Question

               Girilen  100’den kucuk bir tamsayi için
               1’den baslayarak girilen sayiya kadar tum sayilari
       		- Sayi 3’un kati ise sayi yerine “Java”
       		- Sayi 5’in kati ise sayi yerine “CAN'dır”
       		- Sayi hem 3’un hem 5’in kati ise sayi yerine “JavaCAN” print eden code create ediniz

*/
        Scanner input = new Scanner(System.in);
        System.out.print("sayı giriniz ");
        int sayi = input.nextInt();

        if (sayi >= 100) {
            System.out.println("Hatalı Giriş");
        } else {
            for (int i = 1; i < sayi; i++) {
                if (sayi % 3 == 0 && sayi % 5 == 0) {
                    System.out.println("\"JavaCAN\"");
                }
                else if (sayi % 3 == 0) {
                    System.out.print("\"Java\"");
                }  else if (sayi % 5 == 0) {
                    System.out.println("\"CAN'dır\"");
                }

            }
            System.out.println ();
        }


        }

    }

