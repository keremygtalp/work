package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		/*
		Task->
		Kullanıcıdan bir üçgenin  üç kenar uzunluğunu alın eğer üç kenar uzunluğu birbirine eşit ise ekrana
		“Eşkenar üçgen" yazdırın. Sadece iki kenar uzunluğu birbirine eşit ise ekrana “Ikizkenar üçgen"
		yazdırın. Tüm kenar uzunlukları birbirinden farklı ise “Çeşitkenar üçgen" print eden code create ediniz.
		 
		 */

		Scanner input = new Scanner (System.in);
		System.out.println("ABC Üçgeninin Kenar Uzunluklarını Giriniz");
		System.out.print("A Kenar Uzunluğu : ");
		int A = input.nextInt();
		System.out.print("B Kenar Uzunluğu : ");
		int B = input.nextInt();
		System.out.print("C Kenar Uzunluğu :");
        int C = input.nextInt();

		if (A==B && A==C && B==C){
			System.out.println("Eşkener Üçgen");}

		else if (A==B || A==C || B==C) {
			System.out.println("İkizkenar Üçgen");

		}else {
			System.out.println("Çeşitkenar Üçgen");}


	}

}
