package Tasks;
import java.util.Scanner;
public class Task01 {

    public static void main(String[] args) {

//task-> girilen iki sayının eşitliğini control eden METHOD create ediniz
        Scanner input = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz : ");
        int num1 = input.nextInt();

        System.out.print("2. sayıyı giriniz : ");
        int num2 = input.nextInt();
        System.out.println("esitMi() = " + esitMi(num1,num2));

    }

    public static boolean esitMi(int num1, int num2) {
        boolean esit = true;

        if (num1 == num2) {

        } else esit = false;

        return esit;
    }

    public static void esitControl (int a, int b) {
         if (a ==b) {
             System.out.println("sayılar eşit");
         } else System.out.println("EŞİT DEĞİL");

    }

}
