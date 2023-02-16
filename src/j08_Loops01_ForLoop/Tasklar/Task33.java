package j08_Loops01_ForLoop.Tasklar;

import java.util.Scanner;

public class Task33 {
    static Scanner scan = new Scanner(System.in);
    /*
        Bir sayinin mükemmel olup olmadiğini bulan bir program yaziniz.
        Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (Mükemmel)



        */
    public static void main(String[] args) {



mukemmelSayi ();

    }

    private static void mukemmelSayi() {
        System.out.print("Lutfen bir sayi giriniz : ");
        int sayi = scan.nextInt();
        int toplam =0;
        for (int i = 1; i < sayi ; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }
            if (sayi== toplam) {
                System.out.println("mükemmel sayi");
            }
            else {
                System.out.println("mükemmel sayi DEĞİL");
            }

        }
    }



