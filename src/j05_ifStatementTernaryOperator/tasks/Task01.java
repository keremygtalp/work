package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task01 {//class başı
    public static void main(String[] args) {// main başı
        /*
         Task->
         Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore print eden code create ediniz.
        0 - 4 => bebek
        5 - 12 => cocuk
        13 - 20 => genc
        21 - 30 => yetiskin
        Tanimlanmamis evre
         */

        Scanner input = new Scanner (System.in);
        System.out.print("Yaşınızı Giriniz");
        int yas = input.nextInt();

        if (yas>=0 && yas<=4) {
            System.out.print("bebek");
        }
        else if (yas>=5 && yas<=12) {
            System.out.print("çocuk");
        }
        else if (yas>=13 && yas<=20){
            System.out.print("genç");}

        else if (yas>=21 && yas<=30){
            System.out.print("yetişkin");}

        else System.out.print("tanımlanmamış evre");



















    }//main sonu
}// class sonu
