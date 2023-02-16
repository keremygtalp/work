package j10_MethodCreation.j.methodTasks;

import java.util.Scanner;

public class Task24_Fibonacci_ {
    public static void main(String[] args) {

/*
       task-> girilen sayıya kadar olan Fİbonacci dizisi elemalarını print eden METHOD create ediniz.
       Fibonacci dizisi :1, 1, 2, 3, 5, 8, 13, 21, 34
*/

        FibonacciDizisiPrıntEt();


    }

    private static void FibonacciDizisiPrıntEt() {

        Scanner input = new Scanner(System.in);
        System.out.print("sayı giriniz ");
        int sayi = input.nextInt();
        int a = 1;
        int b = 1;
        int fib = 0;

        for (int i = 1; i <= sayi; i++) {
            a = b;
            b = fib;
            fib = a + b;
            System.out.print(fib + " ");

        }

    }
}
