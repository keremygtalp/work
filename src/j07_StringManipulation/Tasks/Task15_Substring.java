package j07_StringManipulation.Tasks;
import java.util.Scanner;
public class Task15_Substring {

    public static void main(String[] args) {



             /* Task->
        Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz..
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Adınız ve Soyadınız");
        String name = input.nextLine();
        String surName = input.nextLine();
        //System.out.println(name.charAt(0).toUpperCase()) + (surName.charAt(0).toUpperCase());

    char name1 = name.charAt(0);
    char surName1 = surName.charAt(0);
        System.out.println("surName1 = " + surName1);





  /*
        Girilen String'in son karakterini silen code create ediniz...
         */



        Scanner sc = new Scanner(System.in);

        System.out.print("bir metin giriniz : ");
        String str = sc.next();

        System.out.println(str.substring(0, str.length() - 1));





    }

}

