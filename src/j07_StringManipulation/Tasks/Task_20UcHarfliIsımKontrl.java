package j07_StringManipulation.Tasks;

import java.util.Scanner;

public class Task_20UcHarfliIsımKontrl {

    public static void main(String[] args) {




        /* TASK :
         * Girilen  isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olmasını control eden code create ediniz
         */


        Scanner input = new Scanner(System.in);

        System.out.println("3 harfli bir isim giriniz");
        String isim = input.nextLine();

//        char ch1 = isim.charAt(0);
//        char ch2 = isim.charAt(1);
//        char ch3 = isim.charAt(2);
//        System.out.println("isim.length()==3 &&(ch1!=ch2 && ch1!=ch3 && ch2!=ch3) = " + isim.length() == 3 && (ch1 != ch2 && ch1 != ch3 && ch2 != ch3));

      String sonuc =  isim.length() == 3 ? (isim.charAt(0) != isim.charAt(1) &&
                isim.charAt(0) != isim.charAt(2) &&
                isim.charAt(1) != isim.charAt(2)  ? "isim benzersiz harflrden oluşuyor" : "isim benzersiz harflerden oluşmuyor")
                : "isim 3 harf değil";
        System.out.println(sonuc);

    }


}



