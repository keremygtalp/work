package j07_StringManipulation.Tasks;

public class Task04_LowerCase_UpperCase {

    public static void main(String[] args) {

  /* OraNge olan bir String oluşturun.
           String'i küçük harfe çevirin ve yazdırın.
           örn: APPLE > apple  */

        //Kodu aşağıya yazınız.


        String str = "OraNge ";
        System.out.println("str = " + str.toLowerCase()); //orange lowercase bütün harfleri küçük yapar


 /*  New Jersey olan bir String oluşturun.
        String'i büyük harfe çevirin ve yazdırın  */

        //Kodu aşağıya yazınız.

        String str2 =" New Jersey";
        System.out.println("str2 = " + str2.toUpperCase()); // str2 =  NEW JERSEY toUpperCase bütün harfleri büyük yapar.


         /*  New York olan bir String oluşturun.
            String'i küçük harfe çevirin ve yazdırın.  */

        //Kodu aşağıya yazınız.

        String str3 = "New York";
        System.out.println("str3 = " + str3.toLowerCase()); // str3 = new york

         /*  PADDLE olan bir String oluşturun.
            String'i küçük harfe çevirin ve yazdırın.  */

        //Kodu aşağıya yazınız.

        String str4 = "PADDLE"; //kürek demek
        System.out.println("str4 = " + str4.toLowerCase() + " " + "\"Türkçesi anlamı kürektir\"");

        String str9 = "PADDLE"; //kürek demek
        System.out.println("str9 = " + str9.toLowerCase()); //+ " " + "\"Türkçesi anlamı kürektir\"");

         /*  apple  olan  bir String oluşturun.
            String'in apple'a eşit olup olmadığını doğrulayın.
            Büyük harf veya küçük harf önemli değildir.    */

        //Kodu aşağıya yazınız.

        String str5 = "apple";
        String str6 = "Apple";
        System.out.println("str5.equalsIgnoreCase(str6) = " + str5.equalsIgnoreCase(str6));


        if (str5.equalsIgnoreCase(str6)) {
    System.out.println("eşit");
} else System.out.println("eşit değil");


        /* OraNge olan bir String oluşturun.
           String'i küçük harfe çevirin ve yazdırın.
           örn: APPLE > apple  */
        //Kodu aşağıya yazınız.


        String str7 = "OraNge ";
        System.out.println("str7 = " + str7.toLowerCase());


 /*  apple olan bir String oluşturun.
            String'i büyük harfe çevirin ve yazdırın.  */

        //Kodu aşağıya yazınız.

        String str8 = "apple";
        System.out.println("str8 = " + str8.toUpperCase());


    }
}
