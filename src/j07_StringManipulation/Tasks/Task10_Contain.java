package j07_StringManipulation.Tasks;

import java.util.Scanner;

public class Task10_Contain {

    public static void main(String[] args) {






        // Task->  Girilen  bir stringde boşluk karakterinin olup olmadığını kontrol eden code create ediniz


        Scanner input = new Scanner (System.in);
        System.out.println("Bir Metin Giriniz");
        String metin = input.nextLine();
        System.out.println(metin.contains(" "));


    }

}

