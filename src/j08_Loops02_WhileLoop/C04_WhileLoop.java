package j08_Loops02_WhileLoop;

import java.util.Scanner;

public class C04_WhileLoop {

    public static void main(String[] args) {


        // task->  3 basmaklı  4 e tam bölünen sayıarı prtın eden kod create ediniz.

//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("gakgom sayi girisin : ");
//        int biSayi = sc.nextInt();


        int basla=100;//3 basamaklı baslangıc sayısı
        while (basla<=999){

            if (basla%4==0){
                System.out.print(basla+" ");
            }

            basla++;
        }

    }
}
