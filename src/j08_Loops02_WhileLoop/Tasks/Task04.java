package j08_Loops02_WhileLoop.Tasks;

public class Task04 {

    public static void main(String[] args) {
		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.

		 */


        int sayac = 0;
        int baslangıc = 999;
//        while (baslangıc > 99) {
//            if (baslangıc % 4 == 0 && baslangıc % 6 == 0) {
//                System.out.println(baslangıc);
//                sayac++;
//
//            }
//            baslangıc--;
//
//
//        }System.out.println("sayac = " + sayac);


        for (int i = baslangıc; i >=100; i--) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.println(i + "");
                sayac++;
            }


        }
        System.out.println(sayac);


    }
}