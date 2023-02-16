package Tasks;
import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {

//task-> girilen AD VE SOYADIN İLK HARFLERİ BÜYÜK DİĞER HARFKERİ KÜÇÜK PRINT EDEN METHOD CREATE EDİNİZ.

        Scanner input = new Scanner(System.in);
        System.out.print("Adınız ");
        String ad =input.nextLine();
        System.out.print("Soyadınız ");
        String soyad =input.nextLine();



        adSoyadHarfKOntrol (ad, soyad);

    }

    private static void adSoyadHarfKOntrol(String ad, String soyad) {


        System.out.println(ad.substring(0, 1).toUpperCase() + ad.substring(1).toLowerCase());
        System.out.println(soyad.substring(0, 1).toUpperCase() + soyad.substring(1).toLowerCase());

    }




}
