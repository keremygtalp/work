package j10_MethodCreation.j.methodTasks;

import java.util.Scanner;

public class Task17 {

    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        /*
            Task-> girilen bir tamsayıyı  tersinden print eden METHOD create ediniz
            input:1453
            output:3541

         */
tersPrıntEt ();


    }

    private static void tersPrıntEt() {

        System.out.print(" sayı giriniz : ");
        int sayi = input.nextInt();
        String str =String.valueOf(sayi);
        String tersStr=" ";

        for (int i = str.length()-1   ; i >=0  ; i--) {
           // tersStr += str.charAt(i);
            System.out.print(str.charAt(i));
        }


        }

    }



