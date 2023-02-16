package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C05_TernaryOperator {
    public static void main(String[] args) {


//Task 5 = girilen bir tam sayının çiftse yarısını
// değilse "tek'in yarısı tam olmaz prınt eden kode yazınız

        Scanner input = new Scanner (System.in);
        System.out.println("sayı giriniz");
        int sayi = input.nextInt();

       // System.out.println(sayi % 2 == 0 ? sayi / 2 : "tek'in yarısı tam olmaz"); bu sout hali
        Object sonuc = (sayi % 2 == 0 ? sayi / 2 : "tek'in yarısı tam olmaz");
        System.out.println(sonuc);


    }//main sonu
}//class sonu
