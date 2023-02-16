package j08_Loops02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task10teksayıprint {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  olan tek sayıları print eden code create ediniz.


         Scanner input = new Scanner(System.in);
         int sayı=input.nextInt();
         int başla=0;
         while(başla<sayı){
             if(başla%2==1){
                 System.out.println(başla +" ");
             } başla++;




    }
}}
