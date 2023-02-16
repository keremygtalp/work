package j08_Loops03_doWhileLoop;

public class C01_doWhileLoop {
    public static void main(String[] args) {

/*
While loop-> önce sart konrol edilir eğer  sart sonucu true alınırsa body action çalışır
do-While loop-> önce body action çalışır sonra şart kontrol edilir.Sart true ise döngü devam eder.
sart false ise döngü lırılır ve döngüden sonraki ilk satır çalışır.
do-While loop->  game app. de daha çok kullanılır.
Trick: while loop sart sağlanmazsa hiç çaılşmayabilir ama do-while sart sağalasın sağlamasın
en az bir kez çalışır..

 */

        int yas = 41;

        while (yas>40) {
            System.out.println(":) yaşınız : " + yas + " gayet başarılı"); //:) yaşınız : 41 gayet başarılı
            yas--;
        }

        do {
            System.out.println(":) yaşınız : " + yas + " gayet başarılı"); //:) yaşınız : 40 gayet başarılı
            yas--;
        } while (yas>40) ;


    }
}
