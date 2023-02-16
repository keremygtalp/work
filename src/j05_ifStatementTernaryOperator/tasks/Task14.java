package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {
        /*
          TASK -> kullanıcının cinsiyeti KADIN ise 60 yasından buyuk ve prim gunu 6000 den  fazla ise emekliliğini
                kullanıcının cinsiyeti ERKEK ise 65 yasından buyuk ve prim gunu 7000 den  fazla ise emekliliğini
                kontrol edip kalan yıl ve prim gununu print eden code create ediniz...

         */

        Scanner input = new Scanner (System.in);
        System.out.print("cinsiyet giriniz: ");

        String cnsyt  = input.next();
        if (cnsyt.equals("kadın")) {// cisiyet kadın şartı
            System.out.println("yasınızı giriniz");
            int yas = input.nextInt();

            if (yas >60) {// yaş şartı
                System.out.println("prim günü giriniz");
                int prim = input.nextInt();

                if (prim >6000) {//prim günü şartı
                    System.out.println("tebrikler emekli olabilirsiniz");

                } else System.out.println("emekliliğinize  "+(6000-prim)+" prim gününüz eksik");

            } else System.out.println("emekliliğinize daha "+(60-yas)+" yılınız var");






        } else if (cnsyt.equals("erkek")){
            System.out.println("yasınızı giriniz");
            int yas = input.nextInt();

            if (yas >65) {
                System.out.println("prim günü giriniz");
                int prim = input.nextInt();

                if (prim >7000) {
                    System.out.println("tebrikler emekli olabilirsiniz");

                } else System.out.println("emekliliğinize daha "+(7000-prim)+" priminiz eksik");

            } else System.out.println("emekliliğinize daha "+(65-yas)+" yılınız var");

        }else System.out.println("geçerli bir cinsiyet gir");












    }
}
