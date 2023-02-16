package j07_StringManipulation.Tasks;
import java.util.Scanner;

public class Task18_HarfDepo {

    public static void main(String[] args) {



             /*  TASK :
   Asagidaki String degiskenini kullanarak  konsolda isminizi print eden code create ediniz.
   String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    */

       // String  harfDepo = "12345678901234567890123456"
        String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.println(harfDepo.charAt(0) + harfDepo.charAt(12) + harfDepo.charAt(9));

        System.out.println(harfDepo.charAt(0));
        System.out.println(harfDepo.charAt(11));
        System.out.println(harfDepo.charAt(8));

        System.out.println(harfDepo.substring(0, 1) + harfDepo.substring(11, 12) + harfDepo.substring(8, 9));


        char ilkHarf = harfDepo.charAt(harfDepo.indexOf('H'));
        char ikinci = harfDepo.charAt(harfDepo.indexOf('A'));
        char ucuncu = harfDepo.charAt(harfDepo.indexOf('L'));
        char doduncu = harfDepo.charAt(harfDepo.indexOf('U'));
        char besinci = harfDepo.charAt(harfDepo.indexOf('K'));

        System.out.println(" " + (ilkHarf + ikinci + ucuncu + doduncu + besinci));

//         /*  TASK :
//   Asagidaki String degiskenini kullanarak  konsolda isminizi print eden code create ediniz.
//   String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//    */
//        String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        char birinci= harfDepo.charAt(harfDepo.indexOf('H'));//H
//        char ikinci= harfDepo.charAt(harfDepo.indexOf('A'));//A
//        char ucuncu= harfDepo.charAt(harfDepo.indexOf('L'));//L
//        char dorduncu= harfDepo.charAt(harfDepo.indexOf('U'));//U
//        char besinci= harfDepo.charAt(harfDepo.indexOf('K'));//K
//​
//        System.out.println(birinci+ikinci+ucuncu+dorduncu+besinci);//373->char ascii değer toplamı
//        System.out.println(""+birinci+ikinci+ucuncu+dorduncu+besinci);//HALUK
//        System.out.println(birinci+ikinci+ucuncu+dorduncu+besinci+""+birinci);//373H
//
//



    }

}

