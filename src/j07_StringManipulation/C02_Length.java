package j07_StringManipulation;

public class C02_Length {

    public static void main(String[] args) {


        /*
length() methodu girilrn string'in uzunluğunu:içinde buluna karakter sayısını return eder
butun karakterleri(boşluk vs) sayıp adedini verir
 */

        String str ="Madem Geldin Dünyaya Otur Çalış Javaya :)";
        System.out.println(str.length());
        int krkterSayisi = str.length();
        System.out.println("krkterSayisi = " + krkterSayisi);

String str1=" ";
        System.out.println("str1 = " + str1.length());
String str2="";
        System.out.println("str2 = " + str2.length());

String str3=null;
        System.out.println("str3 = " + str3.length()); // run time exception hatası verir.

/*
 null atanan stringler herhangi bir bir metot call etmez. çalışmaz..
 null--> case sensitive dir. yani büyük küçük harf duyarlıdır. yani null ile NULL farklıdır.
 null--> bir değer değil . sadece hiçliği ifade eder.
 */


        String name; // declare edilmiş ama atanmamış bir String type

///*        *********** DERS NOTLARI ************
//

//        length() methodu girilrn string'in uzunluğunu:içinde buluna karakter sayısını return eder
//        butun karakterleri(boşluk vs) sayıp adedini verir
//         */
//
//        String str="madem geldin dünyaya otur çalış JAVA'ya :) ";
//        System.out.println(str.length());//43
//        int karktrSayisi=str.length();//str'ni length'i int type bir variable atandı
//        System.out.println("karktrSayisi = " + karktrSayisi);//43
//
//        String str1=" ";
//        System.out.println("str1 = " + str1.length());//1
//
//        String str2="";
//        System.out.println("str2 = " + str2.length());//0
//
//        String str3=null;//cte vermez
//        //  System.out.println(str3.concat(str1));//RTE
//
//        //  System.out.println("str3 = " + str3.length());//rte-run timem exception
//        /*
//        Trick-> null atanan String'ler herhangi bir method call etmez çalışmaz
//    null -> case sensitive Null NULL !=null
//    null-> bir değer değil(dutluk) sadece hiçliği gösteren bir bir pointer(işaretçi)
//         */
//
//        String name;//declera edilmiş ama atanmamış bir String type variable
//
//        //name.concat(str1);//atanmamış(initilaze edilmemiş) string method call etmez.CTE verir
//        System.out.println("agam code cincik dewamkeee");
//
//
//







    }

}
