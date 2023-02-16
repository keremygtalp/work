package j08_Loops01_ForLoop.Tasklar;

public class Task09 {
    public static void main(String[] args) {
           /*
        task-> girilen boyutta aşağıdaki şekli  print eden code create ediniz
          Örnek Ekran çıktısı
      *
      * *
      * * *
      * * * *

         */


        int satır = 4;
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }


        int harf=6;
        for (int kat = 0; kat < 6; kat++) {

            for (int daire = 0; daire <=kat ; daire++) {

                System.out.print("*");
            }
            System.out.println();//HZ. dumy
        }












    }
}
