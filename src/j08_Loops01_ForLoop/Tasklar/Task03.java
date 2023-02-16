package j08_Loops01_ForLoop.Tasklar;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        //            ************* interwiev sorusu ***********
        // girilen sayını faktöriyelini print eden kod yazınız.
        // falanfaktoriyel = 1 den falana kadar tamsayıların çarpımı.>1*2*3*......* falan

        Scanner input = new Scanner(System.in);
        System.out.print("sayı giriniz ");
        int sayi = input.nextInt();
        int factorial = 1; // int type valiable tanımlandı.

        for (int i = 1; i <= sayi; i++) {
           factorial *=i;
        }
        System.out.println("girdiğin sayının factoriyeli : "+factorial);


    }
}
