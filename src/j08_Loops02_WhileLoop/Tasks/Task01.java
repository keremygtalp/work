package j08_Loops02_WhileLoop.Tasks;
import java.util.Scanner;
public class Task01 {

    public static void main(String[] args) {

        // task-> Girilen sayıların toplamı 333'ü geçtiğinde girilen sayı adetini ve toplamını print eden code create edinz


        Scanner sc = new Scanner(System.in);
//


        int sayiToplam =0;
        int sayac =0;

        while (sayiToplam <=333) {
            System.out.print("gakgom sayi girisin : ");

            sayiToplam+=sc.nextInt();
            sayac++;
        }
        System.out.println(sayac + " kadar sayı girdin. toplamları:" + sayiToplam);








    }
}
