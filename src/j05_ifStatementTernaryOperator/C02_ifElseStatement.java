package j05_ifStatementTernaryOperator;

import java.util.Scanner;



public class C02_ifElseStatement {//class basi
    public static <scanner> void main(String[] args) {//main basi

        /*
Task-> girilen yasın 18'den buyukluğunu kontrol eden code create ediniz...
        */

        Scanner scan = new Scanner (System.in);
        System.out.print("yaşınızı giriniz");
        int yas= scan.nextInt();
//        if (yas>18){
//            System.out.println("artık reşitsin");
//                }

/*
    Task-> girilen yasın 18'den buyukluğunu kontrol eden ve
     yas 18'den kucukse "agam büyüde gel :( " print eden code create ediniz
     */

if (yas>=18){
    System.out.println("artık reşitsin");
}
else System.out.println("büyü de gel");

    }//main sonu

}//class sonu
