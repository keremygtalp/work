package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
		/*
		Task->
		 Kullanıcıdan bir yıl alın eğer yıl 1000’e bolunuyorsa ekrana “Milenyum"
		Eğer yıl 100’e bulunuyorsa ekrana “Yüzyıl"
		Eğer yıl 10’a bulunuyorsa ekrana “Onyıl" print eden code create ediniz.
		 */

        Scanner input = new Scanner (System.in);
        System.out.print("yıl giriniz :");
        int year = input.nextInt();


        if (year <=0) {
            System.out.print("lütfen geçerli bir yıl giriniz");
        }
        else {
            if (year % 1000 == 0) {
                System.out.println("Milenyum");
            }
            else if (year % 100 == 0) {
                System.out.println("Yüzyıl");
            } else if (year % 10 == 0) {
                System.out.println("Onyıl");
            }
        }
        System.out.println("code başarılı");


    }
}

	

