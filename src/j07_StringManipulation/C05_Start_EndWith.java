package j07_StringManipulation;

import java.util.Scanner;

public class C05_Start_EndWith {

    public static void main(String[] args) {


//
//        String name = "Mustafa";
//        System.out.println(name.startsWith("m"));
//        System.out.println(name.startsWith("M"));
//        //name.startsWith('M');
//        System.out.println(name.startsWith("MU"));
//
//
//        System.out.println(name.endsWith("u"));//false
//        System.out.println(name.endsWith("U"));//
//        System.out.println(name.endsWith("a"));//true

//Task-> girilen e-mail hesabının  @gmail.com içermiyorsa  (cotains) "lütfen gmail hesabı giriniz"
        // @gmail.com ile  bitiyorsa "hesabınız onaylandı" aksi durumda "geçerli hesap giriniz print edn code creae ediniz.


        Scanner input = new Scanner(System.in);
        System.out.println("mail hesabınızı giriniz");

        String mail = input.nextLine();
        if (mail.contains("@gmail.com")) {
            System.out.println("lütfen gmail hesabı giriniz");
        }
        if (mail.endsWith("@gmail.com")) {
            System.out.println("hesabınız onaylandı");
        } else System.out.println("geçerli bir mail adresi giriniz");


////        Stirng mail1 = "mail.startsWith("@gmail.com") ? "lütfen gmail hesabı giriniz" :
////                mail.endsWith("@gmail.com") ? "hesabınız onaylandı" : " geçerli bir mail adresi giriniz";
//
//        String mail1 = mail.contains(" @gmail.com") ? "lütfen gmail hesabı giriniz" :
//                mail.endsWith("@gmail.com") ? "hesabınız onaylandı" :
//                        " geçerli bir mail adresi giriniz";



        /*
          startsWith()
          Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
          String'in basladigi characteri dogrular
          endsWith()
          Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         *

        Stringeae ediniz.
   /*
          startsWith()
          Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
          String'in basladigi characteri dogrular
          endsWith()
          Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         */
//​
//​         ********************* DERS NOTLARI *****************
//        String  name = "Mustafa";
//        System.out.println(name.startsWith("m"));//false
//        System.out.println(name.startsWith("M"));//true
//        // System.out.println(name.startsWith('M'));-> CTE  parametre char olmaz String olmalı
//        System.out.println(name.startsWith("Mu"));//true
//​
//​
//        System.out.println(name.endsWith("fa"));//true
//        System.out.println(name.endsWith("a"));//true
//        System.out.println(name.endsWith("x"));//false
//        // System.out.println(name.endsWith('a'));> CTE  parametre char olmaz String olmalı
//​
//        String str="ebikGabık";
//        System.out.println(name.startsWith(str));//false
//        System.out.println(str.endsWith(name));//false
//​
//        System.out.println(str.endsWith(str));//true
//        System.out.println(name.startsWith(name));//true
//        //Task-> girilen e-mail hesabının  @gmail.com içermiyorsa "lütfen gmail hesabı giriniz"
//        // @gmail.com ile  bitiyorsa "hesabınız onaylandı" aksi durumda "geçerli hesap giriniz print edn code creae ediniz.

    }
}
