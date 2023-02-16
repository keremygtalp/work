package j08_Loops02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task06_tahmin {

    public static void main(String[] args) {
        /*
        1 ile 100    sayi arasındaki  pc'nin atadığı tamsayıyı kullanıcıya  tahmin ettirip tahmin sayısını print eden  code create ediniz.
         */

        Scanner sc = new Scanner(System.in);
        int count = 0;

        while (true) {
            System.out.println("1 ile 100 sayı giriniz : ");
            int sayi = sc.nextInt();
            count++;

            if (sayi==95) { // bu sayıyı kendim verdim.
                break;
            }
        }
        System.out.println(+count+ "." + "tahmininizde doğru tahmin yaptınız");




    }

}
