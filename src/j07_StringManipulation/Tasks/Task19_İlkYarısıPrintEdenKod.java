package j07_StringManipulation.Tasks;

import java.util.Scanner;

public class Task19_İlkYarısıPrintEdenKod {

    public static void main(String[] args) {




		/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista

		 */

        Scanner input = new Scanner(System.in);

        System.out.println("metin gir");
        String str = input.nextLine();

        if (str.length()%2==0) { // çift karakterli olma şartı
            System.out.println("metnin ilk yarısı = "+ str.substring (0, str.length()/2)); // 0 yani ilk karakteri al, 4 üncü karakteri alma demek
        } else System.out.println("girilen metnin ilk yarısı bulunamaz");




    }

}

