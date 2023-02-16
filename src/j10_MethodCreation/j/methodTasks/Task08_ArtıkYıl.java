package j10_MethodCreation.j.methodTasks;

import java.util.Scanner;



public class Task08_ArtıkYıl {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {

    /*
    Task-> girilen bir yılın  artık yıl olmasını kontrol eden METHOD create ediniz

   input: 2023
   output:false
    */

        artıkYıl(); // method 1 // PARAMETRESİZ

       artılYıl1(1225); // PARAMETRELİ


    } // MAIN SONU

    private static int artılYıl1 (int a) { // PARAMETRELİ

        System.out.println(a % 4 == 0 && (a % 100 != 0 || a % 400 == 0) ? "ARTIK YIL" : "ARTIK YIL DEĞİL");

        return a;

    }

    private static void artıkYıl() { // PARAMETRESİZ
        System.out.println("yıl giriniz");
        int yıl = input.nextInt();
        System.out.println(yıl % 4 == 0 && (yıl % 100 != 0 || yıl % 400 == 0) ? "ARTIK YIL" : "ARTIK YIL DEĞİL");
    }


            } // CLASS SONU
