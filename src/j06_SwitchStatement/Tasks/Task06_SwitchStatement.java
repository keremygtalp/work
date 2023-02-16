package j06_SwitchStatement.Tasks;

import java.util.Scanner;

public class Task06_SwitchStatement {

    public static void main(String[] args) {

//Task-> Girilen  VIP (Very Important Person) kisaltmasindaki harflerin anlamini print eden code create ediniz


        Scanner input = new Scanner(System.in);
        System.out.println("VIP HARFLERİNİ GİRİNİZ");
        char harf = input.next().charAt(0);

        switch (harf) {
            case 'V':
            case 'v':
                System.out.println("Very");

                break;
            case 'I':
            case 'ı':
                System.out.println("Important");

                break;
            case 'P':
            case 'p':
                System.out.println("Person");
                break;

            default:
                System.out.println("hatalı giriş");
                break;
        }
        System.out.println("KOD BAŞARILI"); // break leri kaldırırsan hepsini bir defada verir.


    } // main sonu
} //class //sonu
