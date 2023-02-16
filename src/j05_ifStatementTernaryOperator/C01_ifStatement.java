package j05_ifStatementTernaryOperator;

public class C01_ifStatement {//class başı
    // if statement blok belli durumlar ve aksiyonları belirli şarta bağlı olarak çalıştırmak için kullanılır.
    public static void main(String[] args) {//main başı
        // System.out.println("hello world");

        int abdiYas= 33;// integer data tipinde (type de) abdiyas adında değeri 33 olan variable create edildi. atama yapıldı.
        int mustafaYas = 41;
        if (abdiYas==mustafaYas){ //yaş eşitliği kontrol edildi.
            System.out.println("akran arkadaşlar");
            System.out.println("kardeşmisiniz");
        }
        if (mustafaYas>=40){// yaşın 40 eşit ve büyüklüğü kontrol edildi.
            System.out.println("40 yas dırt yas");
        }

        //bağımsız iif blokları sadece kendi scope (kapsam) eder.
        //birden fazla if blok if body çalışabilecegi gibi şart sağlanmazsa hiç biri de çalışmayabilir.



        if (abdiYas+mustafaYas>10){
            System.out.println("devam");

            System.out.println(" code sorunsuz run oldu");}









    }//main sonu
}//class sonu
