package Tasks;

import java.util.Scanner;

public class Task23_benım {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
           /*
           Task-> vucüt kitleendexini print eden METHOD create ediniz
           vki->kg(mt*mt)
        18,5 kg/m2 ve daha düşük değerler = Zayıf.
        18,5 ve 24,9 kg/m2 arasındaki değerler = Normal ağırlıkta.
        25,0 ve 29,9 kg/m2 arasındaki değerler = Kilolu.
        30,0 ve üstü =  obezite.

            */


        vucutKitleEndeksiHesapla ();


    }

    private static void vucutKitleEndeksiHesapla() {

        System.out.print("kilonuzu kg olarak giriniz");
        double kilo = input.nextDouble();
        System.out.print("boyunuzu metre olarak giriniz");
        double boy = input.nextDouble();

        double vki = kilo /(boy*boy);
        System.out.println("vki = " + vki);

        if (vki < 18.5) {
            System.out.println("ZAYIFSIN");

        } else if (vki <=24.9) {
            System.out.println("NORMAL");
        } else if (vki <=29.9){
            System.out.println("OBEZ");
        }
        else System.out.println("1 nci derece OBEZ");


    }
}
