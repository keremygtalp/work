package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
		/* Task->
		 Girilen bir sayı için
		 sayi 3 basamakli ise console ' a "3 basamakli"
		 sayi 2 basamakli ise console'a "2 basamakli"
		 sayi 3 basamakli yada 2 basamakli degilse "ikisi de degil"  print eden code create ediniz
		 */

        Scanner input = new Scanner (System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = input.nextInt();


        if (sayi >=100 && sayi<1000) {
            System.out.println("3 Basamaklı Bir Sayıdır");}

        else if (sayi >=10 && sayi<100){
            System.out.println("2 Basamaklı Bir Sayıdır");}
        else System.out.println("İkisi de değil");




//            System.out.println("Lütfen bir sayı giriniz:");
//            int sayi= scan.nextInt();
//            if(sayi > 99 &&sayi<1000){
//                System.out.println(" "+sayi+" Sayısı 3 basamaklı bir sayıdır.");
//            }else if(sayi > 9 &&sayi<100){
//                System.out.println(" "+sayi+" Sayısı 2 basamaklı bir sayıdır");
//            }else
//                System.out.println("Sayi 3 veya 2 basamaklı degildir.");










    }
}
