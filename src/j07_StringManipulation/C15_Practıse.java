package j07_StringManipulation;

import java.util.Scanner;

public class C15_Practıse {
    public static void main(String[] args) {


//TAsk girilen bir password için aşağıdaki şartları sağlarsa gayet başarılı

    /*
    en az 8 karakter olmalı
    ilk harf büyük,  olmalı
    son harf küçük
    boşluk içermemeli
    sayı içermeli
    özel karakter olmalı
     */


        // sağlamazsa çok başarısız:( yeni password giriniz

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Password");

        String password = input.nextLine();

        if (password.length() >= 8 &&
                !password.contains(" ") &&
                Character.isUpperCase(password.charAt(0)) &&
        Character.isLowerCase(password.length()-1)) {
            System.out.println("gayet başarılı");

        } else System.out.println("tekrar dene");


//        if ((password.charAt(0) >= 'A' && password.charAt(0) <= 'Z')
//                && (password.charAt(password.length() - 1) >= 'a') && password.charAt(password.length() - 1) <= 'z'
//                && password.length() >= 8) {
//            System.out.println("Geçerli Password");
//        } else System.out.println("tekrar deneyiniz");






//        package j07_StringManipulation;
//​
//import java.util.Scanner;
//​
//        public class C15_Practice {
//            public static void main(String[] args) {
//        /*
//        Task->  girilen bir password için aşagıdaki şartları sağlarsa "gayet başarılı DEWAMKEEE :)"
//        sağlamazsa "Çok başarısız :( agam yeni paaword giresen" print eden code create ediniz.
//        1-en az 8 karakter uzunlugunda,
//        2-ilk harf buyuk,
//        3-son harf kucuk,
//        4-boşluk içermemeli
//         */
//​
//​
//                Scanner input = new Scanner(System.in);
//                System.out.print("Agam password giresen : ");
//                String password = input.nextLine();
//​
//                if (password.length() >= 8 &&//password 8 karakterden buyuk ve eşit olma şartı
//                        !password.contains(" ") && //password " " içermeme şartı
//                        Character.isUpperCase(password.charAt(0)) &&//password ilk harf buyuk olma şartı
//                        Character.isLowerCase(password.charAt(password.length() - 1)) //password son harf kucuk olma şartı
//                ) {
//                    System.out.println("gayet başarılı DEWAMKEEE :)");
//                } else System.out.println("Çok başarısız :( agam yeni password giresen");
//​
//            }
//​
//        ​
//        }
//        Collapse
//
//


    }
}
