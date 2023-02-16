package j09_Break_Contınue;

import java.util.Scanner;

public class C02_Cotinue {
    public static void main(String[] args) {


        /*
Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
atlar ve loop'un bir sonraki değerinden devam eder.

 */

// Task-> girilen bir mail hesabındaki ' ' karakterlerini handle ederek print eden code cerate ediniz.

        Scanner input = new Scanner(System.in);
        System.out.println("herhangi bir şeyler giriniz");
        String str = input.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                continue; // bu komut run olduğunda sonraki komuta geçmeden loop bir sonraki tekraradan devam eder.
                // ticari bekleme devam et.

            }
            System.out.print(str.charAt(i));

        }


    }
}
