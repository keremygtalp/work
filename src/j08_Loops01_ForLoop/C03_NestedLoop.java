package j08_Loops01_ForLoop;

import java.util.Scanner;

public class C03_NestedLoop {
    public static void main(String[] args) {


        /*
        1 loop body de {loop} farklı bir loop tanımlanmasıyla oluşan kod bloğuna nested loop denir
         iç loop dış loopun her stepinde tekrar çalışır. en içteki loop bitmeden dış loop bitmez.
         ilk önce en içdeki loop run oolur.

         */

        for (int apt = 1; apt <= 10; apt++) {
            for (int daire = 1; daire < 6; daire++) {
                System.out.println("apt : " + apt + " için daire : " + daire);
            }
        }


    }
}
