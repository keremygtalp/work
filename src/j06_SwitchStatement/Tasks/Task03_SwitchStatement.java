package j06_SwitchStatement.Tasks;
import java.util.Scanner;

public class Task03_SwitchStatement {

    public static void main(String[] args) {

        // Task-> Girilen hafta gün sayısına karşılık gelen gün adını print eden code create ediniz.
        // 1.gün Pazartesi olsun

        Scanner oku = new Scanner(System.in);
        System.out.println("Pazartesi: 1\nSalı : 2\nÇarşamba: 3\nPerşembe: 4\nCuma: 5\nCumartesi: " +
                "6\nPazar: 7\n lÜTFEN BİR SAYI GİRİNİZ ");
        int gun = oku.nextInt();

        switch (gun) {
            case 1:
                System.out.println("Gün Pazartesi");
                break;
            case 2:
                System.out.println("Gün Salı");
                break;
            case 3:
                System.out.println("Gün Carşamba");
                break;
            case 4:
                System.out.println("Gün Perşembe");
                break;
            case 5:
                System.out.println("Gün Cuma");
                break;
            case 6:
                System.out.println("Gün Cumartesi");
                break;
            case 7:
                System.out.println("Gün Pazar");
                break;
            default:
                System.out.println("1 ile 7 arası bir gün giriniz");
        }

        System.out.println("KOD BAŞARILI");

    }
}
