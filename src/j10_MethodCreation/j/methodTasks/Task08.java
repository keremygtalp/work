package j10_MethodCreation.j.methodTasks;

import java.util.Scanner;

public class Task08 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {

    /*
    Task-> girilen bir yılın  artık yıl olmasını kontrol eden METHOD create ediniz

   input: 2023
   output:false
    */

        artıkYıl();

        artıkYıl1(2020);
        System.out.println(artıkYıl2(2020));


    }

    private static int artıkYıl1 (int yıl) {
        if (yıl % 4 == 0 && yıl % 100 != 0 && yıl % 400 == 0) {
            System.out.println("ARTIK YIL");
        } else System.out.println("ARTIK YIL DEĞİL");


        return yıl;
    }

    private static void artıkYıl() {
        System.out.println("yıl giriniz");
        int year = input.nextInt();

        if (year % 4 == 0 && year % 100 != 0 && year % 400 == 0) {
            System.out.println("ARTIK YIL");
        } else System.out.println("ARTIK YIL DEĞİL");

    }


    private static String artıkYıl2(int year) { // RETURN
     

        return year % 4 == 0 && year % 100 != 0 && year % 400 == 0 ? "artık yıl" : "artık yıl değil";


       // (yıl %4==0 && (yıl %100!=0 || yıl%400==0







    }
        }
