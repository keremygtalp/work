package j07_StringManipulation;

public class C16_UpperCaseLowerCase {

    public static void main(String[] args) {


       // uppercase; verilen stringi büyük harfe çevirir.
        // lowecase; verilen stringi KÜÇÜK harfe çevirir.
        // ignorecase verilen stringin büyük küçük harf duyarlılığını kaldırır.


        /*
        toUpperCase()-> verilen string'i tum harflerini BUYUK harfe çevirir.
       toLowerCase()-> verilen string'i tum harflerini kucuk harfe çevirir.
       ignoreCase()-> verilen string'i BUYU-kucuk harf duyarlılığını kaldırır.
         */

        String str="javaCAN'lara selam bolcana offer :)";
        System.out.println("str = " + str);//javaCAN'lara selam bolcana offer :)
        System.out.println("str.toUpperCase() = " + str.toUpperCase());// JAVACAN'LARA SELAM BOLCANA OFFER :)
        System.out.println("str.toLowerCase() = " + str.toLowerCase());//javacan'lara selam bolcana offer :)
        System.out.println("str = " + str);//javaCAN'lara selam bolcana offer :)

    }
}
