package j08_Loops02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz

		 */

        Scanner sc = new Scanner(System.in);
        System.out.println("adınızı ve soyadınızı giriniz");
        String nameSurname = sc.nextLine();
        int index = 0;
        while (index < nameSurname.length()) {

            System.out.print(nameSurname.charAt(index) + " ");
            index++;

        }


//        for (int i = 0; i < nameSurname.length(); i++) {
//            System.out.print(nameSurname.charAt(i) + " ");

//        }


    }

}
