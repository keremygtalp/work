package j08_Loops02_WhileLoop;

import java.util.Scanner;

public class C03_WhileLoop {

    public static void main(String[] args) {


        // task-> girilen tamsayını pozitif tam bolen sayısını print eden code create ediniz...
        // 20 -> 1,2,4,5,10,20: 20'nin 6 tane tam böleni var
        // 30 -> 1,2,3,5,6,10,15,30: 30'nin 8 tane tam böleni var

        Scanner sc = new Scanner(System.in);

        System.out.print("gakgom sayi girisin : ");
        int biSayi = sc.nextInt();
        int tamBolenSayı =1;
        int sayac =0;

        while (tamBolenSayı<=biSayi) {
            if (biSayi%tamBolenSayı==0) {
                sayac++;
            }

            tamBolenSayı++;
        }
        System.out.println("girilen tamsayı :" +biSayi+" nın "+sayac+" kadar böleni var..");















    }
}
