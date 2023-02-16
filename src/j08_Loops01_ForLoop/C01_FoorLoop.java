package j08_Loops01_ForLoop;

public class C01_FoorLoop {
    public static void main(String[] args) {


        /*
        Loop tekrarlayan aksiyonları tanımlamak için kullanılan kod bloklarıdır.
         */
        // Task--> 41 kere maşallah print eden kod prınt ediniz.

//        System.out.println("Maşallah");// 1 inci maşallah
//        System.out.println("Maşallah");// 2 nci maşallah
//        System.out.println("Maşallah"); // 3 nci maşallah
//        System.out.println("Maşallah"); // 4 nci maşalla
//        System.out.println("Maşallah"); //5. maşallah
//
//
//
//
//
//
//        System.out.println("Maşallah"); // 41. maşallah ---> amele kod.


        //   balangıç value     bitiş value    value değişimi
//        for (int i =1 ;         i<=41;        i++) { // i= 1 den başla i=41 e kadar 1 er artarak devam et sonuç true ise aksiyon gerçekleştir.
//            System.out.println(i + ".maşallah");
//        }

        // Task 2---> 2 basmaklı tek sayıları aynı satıra prın eden eden kod create ediniz.

        for (int i = 11 ; i<=99 ; i+=2){
            System.out.print(i+ " ");
        }


        for (int i = 0 ; i>10 ; i++) { // ---> çalışmayan loop yapmışlar. codidation daima false verir.
            System.out.println("selam");}

        for (int i = 0; i < 100; i++) {
            if (i>9 && i%2==1) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
        for (int i = 11; i < 100; i+=2) {
            System.out.print(i+" ");
        }

        for (int i = 0; i >10 ; i++) {//condition daima false ->baba akuyu calmişlar -> çalışmayan loop yapmışlar
            System.out.println("selam javaCAN");
        }


        // for (int i = 0; i >=0 ; i++) {//stop end olmayan infiti loop
        //     System.out.println("bu loop cuğarayı cüpiterten yakana kadar çalışır :) durduran aşk olsun");
        // }

        System.out.println();
        System.out.println("bizim oolan code cincix dewamkeee :)");


    }
}
