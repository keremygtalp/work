package j08_Loops02_WhileLoop.Tasks;
import java.util.Scanner;

public class Task7_enBüyükSayıYazdırma {

    public static void main(String[] args) {

        // girilen 7 sayının en büyüğünü prınt eden kod create ediniz


Scanner sc = new Scanner(System.in);
//

        int bykSayi = 0;
        int kckSayi = 0;

        int sayacFurkan = 1;

        while (sayacFurkan <= 7) {

            System.out.print(sayacFurkan + ". sayi giriniz : ");

            // int girilenSayi = sc.nextInt();
            //   bykSayi = (bykSayi > girilenSayi ? bykSayi : girilenSayi);

            bykSayi = Math.max(sc.nextInt(), bykSayi);//hangi sayı maximumise o sayıbykSayi olarak atanır

            sayacFurkan++;
        }
        System.out.println("bykSayi = " + bykSayi);










    }
}
