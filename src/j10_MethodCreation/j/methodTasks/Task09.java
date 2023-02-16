package j10_MethodCreation.j.methodTasks;

import java.util.Scanner;

public class Task09 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile


    public static void main(String[] args) {

    /*
   Task->  Saati saniyeye çeviren  method create ediniz


    */

        //  saatiSaniyeyeCevir ();
            saatiSaniyeyeCevir2(2);
        // System.out.println(saatiSaniyeyeCevir1());


    }

    private static double saatiSaniyeyeCevir2(double saatSaniye) { // return type parametreli
       System.out.println(saatSaniye * 60 * 60);

        return saatSaniye;
    }
}

//    private static double saatiSaniyeyeCevir1() {// return PARAMETRESİZ ile yapıldı
//        System.out.println("saat giriniz");
//
//        double saat = input.nextDouble();
//        return saat*60*60;
//
//
//    }

// private static void saatiSaniyeyeCevir() { //parametresiz

//        System.out.println("saat giriniz");
//
//        double saat = input.nextDouble();
//        System.out.println("girdiğiniz saat "+saat*60*60 + " saniyedir ");
//
//    }

