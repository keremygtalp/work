package j08_Loops02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */
  Scanner input = new Scanner(System.in);

  int count=0;
  int toplam=0;

  while(true){
      System.out.print("Sayı giriniz: ");
      int sayi = input.nextInt();
      count++;

      if(sayi==0){
          break;
      }   toplam+=sayi;




  } System.out.println("Toplam: "+toplam+ count +"adet sayı girdiniz");





    }
}
