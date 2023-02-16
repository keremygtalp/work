package j08_Loops01_ForLoop.Tasklar;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını print eden code create ediniz
		 */
//(Regular Expressions)
        //   \\s bosluk (
        //   \\S bosluk disindaki tum karakterler
        //   \\w harfler ve rakamlar (a z A Z, 0 9)
        //   \\W harfler ve rakamlar disindaki tum karakterler
        //   \\d rakamlar 0 9
        //   \\D rakamlar disindaki tum karakterler
//        String Text2 = Text.replaceAll("\\D", "");
//        System.out.println(Text2.length());

        Scanner input = new Scanner(System.in);
        System.out.print("ifade giriniz ");
        String Text = input.nextLine();
        int counter = 0;
        for (int i = 0; i <= Text.length() - 1; i++) {
            if (Text.charAt(i) >= '1' && Text.charAt(i) <= '9'){
                counter++;
            }
        }

            System.out.println(counter);
//
//        Scanner Input = new Scanner(System.in);
//        System.out.println("bir ifade gir'");
//        String Text = Input.nextLine();
//        int counter = 0;
//        for (int i = 0; i < Text.length(); i++) {
//            if ((Text.charAt(i) >= '1')&&(Text.charAt(i)<='9')) {
//                counter++;
//            }
//        }
//        System.out.println("girilen ifadedeki rakam sayısı" +counter+ "kadardır");
    }

}

