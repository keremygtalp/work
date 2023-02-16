package j08_Loops02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
		/*
		 task->girilen bir metinde harf rakam ve özel karakter sayısını print eden code create ediniz.
		do-While loop
		 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("metin giriniz");

        String str = scanner.nextLine().toLowerCase(); // girilen str değeri küçük harfe atandı.

        int harfSay = 0;
        int rakamSay = 0;
        int karakterSay = 0;
        int strIndeks = 0;
        do {
            if (str.length() == 0) { // "" boş karakterli str giriş şartı.
                System.out.println("adma gibi metin gir");
            } else if (str.charAt(strIndeks) >= 'a' && str.charAt(strIndeks) <= 'z') { //str nin ideksindeki karakterin harf olma şartı.
                harfSay++;
            } else if (str.charAt(strIndeks) >= '0' && str.charAt(strIndeks) <= '9') { //str nin ideksindeki karakterin RAKAM olma şartı.
                rakamSay++;
            }  else karakterSay++; //str nin ideksindeki karakterin ÖZEL KARAKTER  olma şartı.


                strIndeks++; // her loop tekrarında str nin bir sonraki indeksini verir.
            }
            while (strIndeks < str.length())
                ; // loop strindeks str nin boyutundan küçük olduğu sürece body action alır.

        System.out.println("girdiğiniz metinde "+ harfSay + " tane harf var");
        System.out.println("girdiğiniz metinde "+ rakamSay + " tane rakam var");
        System.out.println("girdiğiniz metinde "+ karakterSay + " tane özel karakter var");
        }

    }
