package j08_Loops02_WhileLoop;

import java.util.Arrays;
import java.util.Scanner;

public class C02_WhileLoop {

    public static void main(String[] args) {


        // Task  girilen tam sayının rakamları toplamını prtnt eden kod yazınız.

        Scanner sc = new Scanner(System.in);

        System.out.print("gakgom sayi girisin : ");
        int sayi = sc.nextInt();
        int rakamToplam = 0;

        while (sayi>0) {
            rakamToplam+=sayi%10;
            sayi/=10; //  sayi=sayi/10
        }

        System.out.println("rakamToplam = " + rakamToplam);











    }
}
