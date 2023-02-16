package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		/* Task->
		 Kullanıcıdan cinsiyetini girmesini isteyin.
Erkek ise yaşını kontrol edin. Yaşı 18 den küçük ise ekrana “Erkek çocuk” yazdırın.
Yaşı 18 den büyük eşit ise ekrana “Adam” yazdırın.
Kadin ise yasini kontrol edin. Yaşı 18 den küçük ise ekrana “Kız çocuk” yazdırın.
Yaşı 18 den büyük eşit ise ekrana “Kadın” yazdırın.
		 */

		Scanner input = new Scanner (System.in);
		System.out.println("cinsiyetinizi giriniz");
		String cnsyt = input.next();
		System.out.println("yasınızı giriniz");
		int yas = input.nextInt();
		if (cnsyt.equals("erkek")) {
			if (yas >= 18) {
                System.out.println("adam");
            } else {
                System.out.println("erkek çocuk");
            }
		}
		if (cnsyt.equals("kadın")) {
			 {
				if (yas >= 18) {
                    System.out.println("kadın");
                } else {
                    System.out.println("kız çocuk");
			}
		}






	}}



	}


//	Scanner scan= new Scanner(System.in);
//		System.out.println("cinsiyet");
//				String cinsiyet=scan.next();
//				System.out.println("yas");
//				int yas= scan.nextInt();
//				if(cinsiyet.equals("erkek")){ // cinsiyet erkek olma sartı
//				if(yas<18){
//		System.out.println("erkek cocuk");
//		}else System.out.println("adam");
//		}
//		else if(cinsiyet.equals("kadın")){ // cinsiyet kadın olma sartı
//		if(yas<18){
//		System.out.println("kız cocuk");
//		}else System.out.println("kadın");
//		}

//		}
//		}



