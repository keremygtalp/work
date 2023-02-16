package j10_MethodCreation.j.methodTasks;

import java.util.Scanner;

public class Task21 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {


        /*
    task-> girilen bir tamsayının basamak sayısını print eden METHOD create ediniz.
    */


        basamakSayısıPrtınEt();

    }

    private static void basamakSayısıPrtınEt() {

        System.out.print(" sayı giriniz : ");
        int count = 0;
        Integer sayi2 = input.nextInt();

        for (int i = 0; i <sayi2.toString().length()-1 ; i++) {

            count++;

        }
        System.out.println(" sayı " + count + " basamaklıdır ");
    }
}
