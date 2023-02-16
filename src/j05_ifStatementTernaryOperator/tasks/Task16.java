package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        /* Task->
         Girilen bir sayı için

		 Eger sayi pozitif ise; 10dan buyuk olup olmadigini kontrol edin
		 Eger 10 dan buyuk ise "Buyuksun!" yazdirin
		 Eger 10 dan kucuk ise "Normalsin!" yazdirin

		 Eger sayi pozitif degil ise; -10dan buyuk olup olmadigini kontrol edin
		 Eger -10 dan buyuk ise "Negatifsin!" yazdirin
		 Eger -10 dan kucuk ise "Cok Negatifsin!" yazdirin
         */

        Scanner input = new Scanner (System.in);
        System.out.println("enter a number");
        int num = input.nextInt();

        if (num>=0) {
            if (num>10) {
                System.out.println("buyuksun!");}
            else {
                System.out.println("normalsin");}
        } if (num<0 && num>-10) {
            System.out.println("negatifsin");}
        else if (num<-10) {
            System.out.println("cok negatifsin");
        }

        }


//        System.out.println("enter a number");
//        int num = input.nextInt();
//        if (num >= 0) {
//            if (num > 10) {
//                System.out.println("buyuksun");
//            } else {
//                System.out.println("normalsin");
//            }
//        } else {
//            if (num > -10) {
//                System.out.println("negatifsin");
//            } else {
//                System.out.println("Cok negatifsin");



    }




