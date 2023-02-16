package j08_Loops02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("birinci sayıyı giriniz : ");
        int sayi1 = sc.nextInt();
        System.out.print("ikinci sayı giriniz : ");
        int sayi2 = sc.nextInt();
//

//        }

        if (sayi1<sayi2) {
            while (sayi1<sayi2) {
                sayi1++;

                System.out.print(sayi1+" ");
        }
        } else
            while (sayi2<sayi1) {
            sayi2++;
            System.out.println(sayi2+" ");
        }





    }
}
