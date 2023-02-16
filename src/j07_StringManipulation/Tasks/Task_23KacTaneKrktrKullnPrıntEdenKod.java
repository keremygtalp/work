package j07_StringManipulation.Tasks;

import java.util.Scanner;

public class Task_23KacTaneKrktrKullnPrıntEdenKod {

    public static void main(String[] args) {



        //Task->  Girilen  String'deki space haric kac tane character kullanildigini print eden code create ediniz.


        Scanner input = new Scanner(System.in);

        System.out.print("bir metin giriniz : ");
        String metin = input.nextLine(); //

        System.out.println("metin.length() = " + metin.length());

        System.out.println(metin.replaceAll("\\s", "" +
                "").length());

//  //Task->  Girilen  String'deki space haric kac tane character kullanildigini print eden code create ediniz.
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("bir metin   giriniz : ");
//        String metin = input.nextLine();// javacanlara selam olsun güzel insanlar :)
//
//        System.out.println("metin.length() = " + metin.length());
//       System.out.println(metin.replaceAll("\\s", "").length());
    }




    }



