package j06_SwitchStatement.Tasks;

import java.util.Scanner;

public class Task08_SeyehatProjesi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

 /*
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.

        1. Köln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro

todo İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz.
 İşlemlerde direkt bunları cağırabilirsiniz.

        todo İLK OLARAK;

        "Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM          ---         Köln : 80 KM ---
          (20 KM başına 5 euro bilet parası alınmaktadir..)    yazısı gelsin.

    1.    Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.

   todo    Frankfurt girildiyse,
        örn: girdi= Frankfurt
                case=FRANKFURT:

      Rota = Frankfurt yazdırın.
      Frankfurt km hesabı işlemi yapın.

      son olarak konsolda: Frankfurt 15 Euro         yazsın.

      todo  case: KÖLN ise

      "Rota = Köln" yazdırın.
       km hesabına göre işlemi yapınız.

       son olarak konsolda:  Köln   20 Euro             yazsın.



       2.  Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   "   sorusunu sorsun.

       case:1  ise
        " 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.)

        case:2 ise

        "2 kişilik " yazdırın
        2 kişi için bilet fiyatını hesaplayın.


        todo  Son olarak yolculugunuzu check edin;

        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.

        1.Bakiyemi belirtin.
        2.Toplam Tutarı belirtin.
        3.double paraUstu oluşturun ve hesaplayın.
        4.Double para üstünü yazdırın.


         */
        double bakıye = 100;
        double frUcret = (60 / 20) * 5;
        double klUcret = (80 / 20) * 5;
        System.out.println("Nereye yolculuk etmek istiyorsunuz?\n1. Frankfurt *** 60 km\n2. Köln***80km\n***** 20 km başına 5 euro **** bilet ücreti alınmaktadır");
        String gidilecekSehir = input.nextLine().toUpperCase();
        switch (gidilecekSehir) {
            case "FRANKFURT":
                System.out.println("***Rota Frankfurt***\nFrankfurt 15 Euro");
                System.out.println("Kaç kişilik bilet istiyorsunuz?\n (Max 2 kişilik olabilir)");
                int yolcuSayısı = input.nextInt();
                switch (yolcuSayısı) {
                    case 1:
                        System.out.println("1 kişilik");
                        System.out.println("ROTANIZ" + "FRANKFURT" + "TOPLAM TUTAR" +" " + "20 EURO"+"\nKALAN BAKİYENİZ"+(bakıye-frUcret));
                        break;
                    case 2:
                        System.out.println("2 kişilik" + ikikişilikFrankfurthesapla() + "Euro");
                        System.out.println("ROTANIZ" + "FRANKFURT" + "TOPLAM TUTAR" + " " +ikikişilikFrankfurthesapla() + "Euro"+"\nKALAN BAKİYENİZ"+(bakıye-ikikişilikFrankfurthesapla()));
                }
                break;
            case "KÖLN":
                System.out.println("***Rota Köln***\nKöln 20 Euro");
                System.out.println("Kaç kişilik bilet istiyorsunuz?\n (Max 2 kişilik olabilir");
                int yolcusayısı = input.nextInt();
                switch (yolcusayısı) {
                    case 1:
                        System.out.println("1 kişilik");
                        System.out.println("ROTANIZ KÖLN\nTOPLAM TUTAR:"+ " " +20 +"EURO\nKALAN BAKiYENiZ"+(bakıye-klUcret));
                        break;
                    case 2:
                        System.out.println("2 kişilik" + ikikişilikKölnhesapla() + "Euro");
                        System.out.println("ROTANIZ+KÖLN\nTOPLAM TUTAR" + ikikişilikKölnhesapla() + "Euro\nKALAN BAKiYENiZ"+(bakıye-ikikişilikKölnhesapla()));
                }

        }

    }


    private static double ikikişilikFrankfurthesapla() {
        return 15 * 2;
    }


    private static double ikikişilikKölnhesapla() {
        return 20 * 2;
    }
}

