package j10_MethodCreation.j.methodTasks;

import java.util.Scanner;

public class Task25_factoriel {
    public static void main(String[] args) {

    //task-> girilen sayını faktoriyelini print eden METHOD create ediniz

        factorialHesapla();


    }

    private static void factorialHesapla() {

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
